package net.redman.sorcererking.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.redman.sorcererking.SorcererKing;
import net.redman.sorcererking.data.client.ModBlockStateProvider;
import net.redman.sorcererking.data.client.ModItemProvider;


@Mod.EventBusSubscriber(modid = SorcererKing.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();

        generator.addProvider(new ModBlockStateProvider(generator, event.getExistingFileHelper()));
        generator.addProvider(new ModItemProvider(generator, event.getExistingFileHelper()));
        generator.addProvider(new ModLootTableProvider(generator));
        generator.addProvider(new ModRecipeProvider(generator));
    }
}
