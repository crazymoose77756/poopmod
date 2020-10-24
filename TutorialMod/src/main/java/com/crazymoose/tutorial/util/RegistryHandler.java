package com.crazymoose.tutorial.util;

import com.crazymoose.tutorial.Tutorial;
import com.crazymoose.tutorial.blocks.BlockItemBase;
import com.crazymoose.tutorial.blocks.PoopBlock;
import com.crazymoose.tutorial.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> POOP = ITEMS.register("poop", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> POOP_BLOCK = BLOCKS.register("poop_block", PoopBlock::new);

    // Block Items
    public static final RegistryObject<Item> POOP_BLOCK_ITEM = ITEMS.register("poop_block", () -> new BlockItemBase(POOP_BLOCK.get()));
}
