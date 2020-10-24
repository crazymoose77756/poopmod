package com.crazymoose.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PoopBlock extends Block {

    public PoopBlock() {
        super(Block.Properties.create(Material.CLAY)
                .hardnessAndResistance(0.6f, 0.6f)
                .sound(SoundType.SLIME)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL));
    }
}
