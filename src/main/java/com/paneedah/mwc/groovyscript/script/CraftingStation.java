package com.paneedah.mwc.groovyscript.script;

import com.cleanroommc.groovyscript.api.GroovyLog;
import com.cleanroommc.groovyscript.api.IIngredient;
import com.cleanroommc.groovyscript.helper.recipe.AbstractRecipeBuilder;
import com.cleanroommc.groovyscript.registry.VirtualizedRegistry;
import com.paneedah.mwc.groovyscript.MWCContainer;
import com.paneedah.mwc.groovyscript.recipes.GSCrafting;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

import static com.paneedah.weaponlib.crafting.CraftingGroup.*;
import static com.paneedah.weaponlib.crafting.CraftingRegistry.*;

public class CraftingStation extends VirtualizedRegistry<GSCrafting> {

    @Override
    public void onReload() {
        this.removeScripted().forEach(CraftingRegistry::deleteRecipeRegistry);
        this.restoreFromBackup().forEach(CraftingRegistry::registerRecipe);
    }


    //Nuke ALL recipes. no matter the category.

    public void removeAll(){
        clearRegistry();
    }

    //Remove Recipe that outputs given Ingredient.

    public void remove(IIngredient ingredient){
        for(ArrayList<IModernCrafting> list:craftingMap.values()){
            for(IModernCrafting recipe: list){
                if(ingredient.test(new ItemStack(recipe.getItem()))){
                    deleteRecipeRegistry(recipe);
                }
            }
        }
    }

    //Nuke ALL recipes of Given Category.

    public void removeAllinGroup(CraftingGroup group){
        clearGroup(group);
    }

    public void removeAllinGroup(String group){
        clearGroup(CraftingGroup.valueOf(group));
    }

    public void removeinGroup(IIngredient ingredient, CraftingGroup group) {
        for (IModernCrafting recipe : craftingMap.get(group)) {
            if (ingredient.test(new ItemStack(recipe.getItem()))) {
                deleteRecipeRegistry(recipe);
            }
        }
    }

    public void removeinGroup(IIngredient ingredient, String group) {
        removeinGroup(ingredient, CraftingGroup.valueOf(group));
    }

    public void addRecipe(IModernCrafting crafting){
        registerRecipe(crafting);
    }

    //Start Recipe Builder

    public RecipeBuilder recipeBuilder(){
        return new RecipeBuilder();
    }

    public static class RecipeBuilder extends AbstractRecipeBuilder<GSCrafting>{

        @Override
        public String getErrorMsg() {
            return "Error adding Workbench Recipe";
        }

        private final ArrayList<CraftingEntry> entries = new ArrayList<>();
        private CraftingGroup group = GUN;

        //Add Ingredient of recipe With ItemStack

        public RecipeBuilder addEntry(ItemStack stack){
            return addEntry(stack, 1);
        }

        //Add Ingredient of recipe With Ore Dictionary Value

        public RecipeBuilder addOredict(String entry, int count){
            return addOredict(entry, count, 1);
        }

        //Add Ingredient of recipe With given ItemStack and yield(0.0~1.0)

        public RecipeBuilder addEntry(ItemStack stack, double yield){
            this.entries.add(new CraftingEntry(stack.getItem(), stack.getCount(), yield));
            return this;
        }

        //Add Ingredient of recipe With given Ore Dictionary Entry and yield(0.0~1.0)


        public RecipeBuilder addOredict(String entry, int count, double yield){
            this.entries.add(new CraftingEntry(OreDictionary.getOres(entry).get(0).getItem(),entry, count, yield));
            return this;
        }

        //Set Category of Recipe
        public RecipeBuilder group(String group){
            this.group = CraftingGroup.valueOf(group);
            return this;
        }

        public RecipeBuilder groupGun(){
            this.group = GUN;
            return this;
        }

        public RecipeBuilder groupNormalAttachment(){
            this.group = ATTACHMENT_NORMAL;
            return this;
        }

        public RecipeBuilder groupModificationAttachment(){
            this.group = ATTACHMENT_MODIFICATION;
            return this;
        }

        public RecipeBuilder groupBullet(){
            this.group = BULLET;
            return this;
        }

        public RecipeBuilder groupMagazine(){
            this.group = MAGAZINE;
            return this;
        }

        public RecipeBuilder groupGranade(){
            this.group = GRENADE;
            return this;
        }

        public RecipeBuilder groupGear(){
            this.group = GEAR;
            return this;
        }

        @Override
        public void validate(GroovyLog.Msg msg) {
            validateItems(msg, 0,0,1,1);
            msg.add(this.entries.isEmpty() ,"Ingredient for Crafting Recipe can not be empty.");
        }

        //and we finalize the recipe and register it!

        @Override
        public GSCrafting register() {
            if(!this.validate()){
                return null;
            }
            GSCrafting recipe = new GSCrafting(this.output.get(0).getItem(), this.group, this.entries.toArray(new CraftingEntry[0]));
            MWCContainer.MWC.get().STATION.addRecipe(recipe);
            return recipe;
        }
    }

}
