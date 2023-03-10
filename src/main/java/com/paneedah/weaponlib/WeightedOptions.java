package com.paneedah.weaponlib;

import io.netty.buffer.ByteBuf;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class WeightedOptions<Category, T> {
    
    private static class Option<Category, T> {
        T item;
        Category category;
        float weight;
        float rangeStart;
    }
    
    private static class OptionsByCategory<Category, T> {
        NavigableSet<Option<Category, T>> options = new TreeSet<>(
                (o1, o2) -> ((Float)o1.rangeStart).compareTo(o2.rangeStart));
        float totalWeight;
    }
    
    public static class Builder<Category, T> {
        
        private List<Option<Category, T>> options = new ArrayList<>();
        
        public Builder<Category, T> withOption(T item, Category category, float weight) {
            Option<Category, T> o = new Option<>();
            o.item = item;
            o.category = category;
            o.weight = weight;
            options.add(o);
            return this;
        }
        
        public WeightedOptions<Category, T> build() {
            Map<Category, OptionsByCategory<Category, T>> optionsByCategory = new HashMap<>();
            
            for(Option<Category, T> option: options) {
                OptionsByCategory<Category, T> optionsForSingleCategory = optionsByCategory.computeIfAbsent(
                        option.category, d -> new OptionsByCategory<>());
                option.rangeStart = optionsForSingleCategory.totalWeight;
                optionsForSingleCategory.totalWeight += option.weight;
                optionsForSingleCategory.options.add(option);
            }
            return new WeightedOptions<>(optionsByCategory);
        }
    }
    
    private Map<Category, OptionsByCategory<Category, T>> optionsByCategory;
    private Random random = new Random();

    private WeightedOptions(Map<Category, OptionsByCategory<Category, T>> optionsByCategory) {
        this.optionsByCategory = optionsByCategory;
    }
    
    public WeightedOptions() {
        this.optionsByCategory = new HashMap<>();
    }
    
    public T pick(Category category) {
        T item = null;
        OptionsByCategory<Category, T> options = optionsByCategory.get(category);
        
        if(options != null) {
            Option<Category, T> marker = new Option<>();
            marker.rangeStart = random.nextFloat() * options.totalWeight;
            Option<Category, T> result = options.options.floor(marker);
            if(result != null) {
                item = result.item;
            }
        }
        return item;
    }
    
    public void serialize(ByteBuf buf, BiConsumer<T, ByteBuf> itemWriter, BiConsumer<Category, ByteBuf> categoryWriter) {
        int total = optionsByCategory.entrySet().stream().flatMap(e -> e.getValue().options.stream()).mapToInt(e -> 1).sum();
        buf.writeInt(total);
        for(OptionsByCategory<Category, T> options: optionsByCategory.values()) {
            for(Option<Category, T> option: options.options) {
                categoryWriter.accept(option.category, buf);
                itemWriter.accept(option.item, buf);
                buf.writeFloat(option.weight);
            }
        }
    }
    
    public void deserialize(ByteBuf buf, Function<ByteBuf, T> itemReader, Function<ByteBuf, Category> categoryReader) {
        int total = buf.readInt();
        for(int i = 0; i < total; i++) {
            Option<Category, T> option = new Option<>();
            option.category = categoryReader.apply(buf);
            option.item = itemReader.apply(buf);
            option.weight = buf.readFloat();
            
            OptionsByCategory<Category, T> optionsForSingleCategory = optionsByCategory.computeIfAbsent(
                    option.category, d -> new OptionsByCategory<>());
            option.rangeStart = optionsForSingleCategory.totalWeight;
            optionsForSingleCategory.totalWeight += option.weight;
            optionsForSingleCategory.options.add(option);
        }
    }
}
