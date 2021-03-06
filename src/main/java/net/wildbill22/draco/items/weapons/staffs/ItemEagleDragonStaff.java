package net.wildbill22.draco.items.weapons.staffs;

import net.wildbill22.draco.entities.dragons.EntityDracoAquila;
import net.wildbill22.draco.items.dragoneggs.ItemEagleDragonEgg;

public class ItemEagleDragonStaff extends ItemDragonStaff {	
	public static final String name = "eagleDragonStaff";
	
	public ItemEagleDragonStaff(ToolMaterial material) {
		super(material, name);
//		abilities.addChangeForm(EntityDracoAquila.name, "Eagle dragon");
		abilities.addChangeForm(EntityDracoAquila.name, "Draco Aquila");
		abilities.addSoundWaveEntities();
		abilities.addPickUpMobs();
	}
	
	// Used to find if egg is in hoard
	@Override
	public String getEggName() {
		return ItemEagleDragonEgg.name;
	}
}