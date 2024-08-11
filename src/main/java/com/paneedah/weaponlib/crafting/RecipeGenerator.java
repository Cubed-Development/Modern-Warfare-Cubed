package com.paneedah.weaponlib.crafting;

import com.paneedah.weaponlib.crafting.OptionsMetadata.OptionMetadata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

final class RecipeGenerator {

    private static final int SLOT_COUNT = 9;

    private SequenceGenerator sequenceGenerator = new SequenceGenerator(SLOT_COUNT);

    public List<Object> createShapedRecipe(String name, OptionsMetadata metadata) {
        List<Object> sequence = sequenceGenerator.generate(name, createSeed(name, metadata), metadata);
        LinkedHashMap<Object, Character> encodingMap = new LinkedHashMap<>();
        char startFrom = 65;
        for (OptionMetadata optionMetadata : metadata.getMetadata()) {
            char code;
            if (optionMetadata.getOption() == OptionsMetadata.EMPTY_OPTION) {
                code = ' ';
            } else {
                code = startFrom++;
            }
            encodingMap.put(optionMetadata.getOption(), code);
        }

        List<Object> output = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int i = 0;
        for (Object t : sequence) {
            builder.append(encodingMap.get(t));
            if (++i % 3 == 0) {
                output.add(builder.toString());
                builder.setLength(0);
            }
        }
        encodingMap.entrySet().stream().filter(e -> e.getKey() != OptionsMetadata.EMPTY_OPTION)
                .forEach(e -> {
                    output.add(e.getValue());
                    output.add(e.getKey());
                });

        return output;
    }

    private byte[] createSeed(String name, OptionsMetadata metadata) {
        return (name + metadata.getMetadata().length).getBytes();
    }
}
