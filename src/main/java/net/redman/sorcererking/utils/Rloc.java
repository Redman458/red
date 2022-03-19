package net.redman.sorcererking.utils;

import net.minecraft.util.ResourceLocation;
import net.redman.sorcererking.SorcererKing;

public class Rloc {
    public static  ResourceLocation create(String name){
        return new ResourceLocation(SorcererKing.MODID, name);
    }
}
