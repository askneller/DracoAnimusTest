package net.wildbill22.draco.render.dragons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.wildbill22.draco.entities.dragons.DragonRegistry.IDragonRendererCreationHandler;
import net.wildbill22.draco.entities.dragons.EntityDracoAquila;
import net.wildbill22.draco.lib.REFERENCE;

public class RenderDracoAquila extends RendererLivingEntity  implements IDragonRendererCreationHandler {
	protected ResourceLocation dragonTexture;
	
	public RenderDracoAquila(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		this.renderManager = RenderManager.instance;
		setEntityTexture();
	}

	private void setEntityTexture() {
		dragonTexture = new ResourceLocation(REFERENCE.MODID + ":textures/models/dracoAquila.png");
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity)
	{
		return dragonTexture;
	}

	@Override
	public String getKey() {
		return EntityDracoAquila.name;
	}
}