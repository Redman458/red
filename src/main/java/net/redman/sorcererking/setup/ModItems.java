package net.redman.sorcererking.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> MONSTER_CORE = Registration.ITEMS.register("monster_core",()->
            new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    static void register(){

    }
}
