package net.wildbill22.draco.items.weapons;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;
import net.wildbill22.draco.Creative_Tab;
import net.wildbill22.draco.lib.REFERENCE;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemLongSword extends ItemSword {	
	public static final String name = "longSword";
	private final ToolMaterial material;

	public ItemLongSword(ToolMaterial material)
	{
		super(material);
		this.material = material;
		this.setCreativeTab(Creative_Tab.TabDraco_Animus);
		this.setUnlocalizedName(REFERENCE.Unlocalized_Path + name);
		this.setTextureName(REFERENCE.Texture_Path + name);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		list.add(StatCollector.translateToLocal("weapon.wildbill22_draco.longSword"));
		list.add(StatCollector.translateToLocalFormatted("weapon.wildbill22_draco.hitsRemaining", stack.getMaxDamage() - stack.getItemDamage()));
		list.add(StatCollector.translateToLocalFormatted("sword.wildbill22_draco.attackDamage", material.getDamageVsEntity() + 4.0F));
//		list.add(StatCollector.translateToLocal("weapon.wildbill22_draco.causesHitDamage"));
	}
}
