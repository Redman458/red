package net.redman.sorcererking.data;

import net.minecraft.data.*;
import net.redman.sorcererking.setup.ModBlocks;
import net.redman.sorcererking.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer){
        ShapelessRecipeBuilder.shapeless(ModItems.MONSTER_CORE.get(),9 )
                .requires(ModBlocks.MONSTER_CORE_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.MONSTER_CORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.MONSTER_CORE_BLOCK.get())
                .define('#', ModItems.MONSTER_CORE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.MONSTER_CORE.get()))
                .save(consumer);

    }
}
