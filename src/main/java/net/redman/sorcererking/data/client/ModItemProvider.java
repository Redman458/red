package net.redman.sorcererking.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.redman.sorcererking.SorcererKing;

public class ModItemProvider extends ItemModelProvider {
    public ModItemProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, SorcererKing.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("monster_core_block", modLoc("block/monster_core_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        getBuilder("monster_core").parent(itemGenerated).texture("layer0", "item/monster_core");

    }
}
