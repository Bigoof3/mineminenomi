package xyz.pixelatedw.mineminenomi.models.entities.projectiles;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;

public class CrossModel extends EntityModel
{
  //fields
    RendererModel Shape1;
    RendererModel Shape2;
  
  public CrossModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new RendererModel(this, 0, 0);
      Shape1.addBox(-1.5F, -7F, 0F, 2, 14, 2);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0.785F, 0F, 0F);
      
      Shape2 = new RendererModel(this, 0, 0);
      Shape2.addBox(-1.5F, -8F, 0F, 2, 14, 2);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, -0.785F, 0F, 0F);
  }
  
  @Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
  }
  
  private void setRotation(RendererModel model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(null, f1, f2, f3, f4, f5, f);
  }

}
