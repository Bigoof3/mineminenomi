package xyz.pixelatedw.mineminenomi.models;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.LivingEntity;

public class CaptainCapeModel extends BipedModel 
{
    public RendererModel capeback;
    public RendererModel caperight;
    public RendererModel caperightsholder;
    public RendererModel caperightarm;
    public RendererModel caperightsholderpad1;
    public RendererModel caperightsholderpad2;
    public RendererModel capeleft;
    public RendererModel capeleftsholder;
    public RendererModel capeleftarm;
    public RendererModel capeleftsholderpad1;
    public RendererModel capeleftsholderpad2;
    public RendererModel capefrontright;
    public RendererModel capefrontleft;
    public RendererModel capeleftcollar1;
    public RendererModel capeleftcollar2;
    public RendererModel caperightcollar1;
    public RendererModel caperightcollar2;

    public CaptainCapeModel() 
    {
		super(0, 0, 128, 128);
		this.bipedHeadwear.showModel = false;
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.capeleftsholderpad1 = new RendererModel(this, 5, 98);
        this.capeleftsholderpad1.setRotationPoint(6.0F, -0.75F, -3.0F);
        this.capeleftsholderpad1.addBox(0.0F, 0.0F, 1.9000000000000006F, 5, 1, 6, 0.0F);
        this.setRotateAngle(capeleftsholderpad1, 0.0F, 0.0F, 0.17453292012214658F);
        this.caperightcollar2 = new RendererModel(this, 51, 90);
        this.caperightcollar2.setRotationPoint(-5.199999809265137F, -3.0F, -2.299999952316284F);
        this.caperightcollar2.addBox(0.0F, 0.0F, 1.9000000000000006F, 0, 2, 5, 0.0F);
        this.setRotateAngle(caperightcollar2, 0.020315480286447005F, 0.1909214923392362F, 0.106665067667416F);
        this.capeleftsholderpad2 = new RendererModel(this, 5, 106);
        this.capeleftsholderpad2.setRotationPoint(5.900000095367432F, 0.20000000298023224F, -3.0F);
        this.capeleftsholderpad2.addBox(0.0F, 0.0F, 1.9000000000000006F, 5, 3, 6, 0.0F);
        this.capefrontright = new RendererModel(this, 28, 98);
        this.capefrontright.setRotationPoint(-8.5F, 0.0F, -2.5F);
        this.capefrontright.addBox(0.0F, 0.0F, 1.9000000000000006F, 3, 22, 0, 0.0F);
        this.caperightarm = new RendererModel(this, 35, 98);
        this.caperightarm.setRotationPoint(-8.5F, 1.0F, -2.0F);
        this.caperightarm.addBox(-2.0F, 0.0F, 1.9000000000000006F, 2, 12, 4, 0.0F);
        this.capeleftsholder = new RendererModel(this, 51, 75);
        this.capeleftsholder.setRotationPoint(3.5F, -0.009999999776482582F, -2.5F);
        this.capeleftsholder.addBox(0.0F, 0.0F, 1.9000000000000006F, 6, 0, 5, 0.0F);
        this.capeleftcollar1 = new RendererModel(this, 51, 81);
        this.capeleftcollar1.setRotationPoint(5.199999809265137F, -3.0F, -2.299999952316284F);
        this.capeleftcollar1.addBox(0.0F, 0.0F, 1.9000000000000006F, 0, 3, 5, 0.0F);
        this.setRotateAngle(capeleftcollar1, -0.016939739261814083F, -0.19124659547468556F, 0.08889128756736413F);
        this.capeleftcollar2 = new RendererModel(this, 51, 90);
        this.capeleftcollar2.setRotationPoint(5.199999809265137F, -3.0F, -2.299999952316284F);
        this.capeleftcollar2.addBox(0.0F, 0.0F, 1.9000000000000006F, 0, 2, 5, 0.0F);
        this.setRotateAngle(capeleftcollar2, 0.020315480286447005F, -0.1909214923392362F, -0.106665067667416F);
        this.caperightsholderpad1 = new RendererModel(this, 5, 98);
        this.caperightsholderpad1.setRotationPoint(-6.0F, -0.75F, -3.0F);
        this.caperightsholderpad1.addBox(-5.0F, 0.0F, 1.9000000000000006F, 5, 1, 6, 0.0F);
        this.setRotateAngle(caperightsholderpad1, 0.0F, 0.0F, -0.17453292012214658F);
        this.capeback = new RendererModel(this, 5, 75);
        this.capeback.setRotationPoint(-8.5F, 0.0F, 2.5F);
        this.capeback.addBox(0.0F, 0.0F, 1.9000000000000006F, 17, 22, 0, 0.0F);
        this.capefrontleft = new RendererModel(this, 28, 98);
        this.capefrontleft.setRotationPoint(8.5F, 0.0F, -2.5F);
        this.capefrontleft.addBox(-3.0F, 0.0F, 1.9000000000000006F, 3, 22, 0, 0.0F);
        this.caperightcollar1 = new RendererModel(this, 51, 81);
        this.caperightcollar1.setRotationPoint(-5.199999809265137F, -3.0F, -2.299999952316284F);
        this.caperightcollar1.addBox(0.0F, 0.0F, 1.9000000000000006F, 0, 3, 5, 0.0F);
        this.setRotateAngle(caperightcollar1, -0.016939739261814083F, 0.19124659547468556F, -0.08889128756736413F);
        this.caperightsholder = new RendererModel(this, 51, 75);
        this.caperightsholder.setRotationPoint(-3.5F, -0.009999999776482582F, -2.5F);
        this.caperightsholder.addBox(-6.0F, 0.0F, 1.9000000000000006F, 6, 0, 5, 0.0F);
        this.caperight = new RendererModel(this, 40, 70);
        this.caperight.setRotationPoint(-8.5F, 0.0F, -2.5F);
        this.caperight.addBox(0.0F, 0.0F, 1.9000000000000006F, 0, 22, 5, 0.0F);
        this.caperightsholderpad2 = new RendererModel(this, 5, 106);
        this.caperightsholderpad2.setRotationPoint(-5.900000095367432F, 0.15000000596046448F, -3.0F);
        this.caperightsholderpad2.addBox(-5.0F, 0.0F, 1.9000000000000006F, 5, 3, 6, 0.0F);
        this.capeleft = new RendererModel(this, 40, 70);
        this.capeleft.setRotationPoint(8.5F, 0.0F, -2.5F);
        this.capeleft.addBox(0.0F, 0.0F, 1.9000000000000006F, 0, 22, 5, 0.0F);
        this.capeleftarm = new RendererModel(this, 35, 98);
        this.capeleftarm.setRotationPoint(8.5F, 1.0F, -2.0F);
        this.capeleftarm.addBox(0.0F, 0.0F, 1.9000000000000006F, 2, 12, 4, 0.0F);
    }

    @Override
	public void render(LivingEntity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.setRotationAngles(entity, f1, f2, f3, f4, f5, f);
    	
		this.capeleftsholderpad1.render(f5);
        this.caperightcollar2.render(f5);
        this.capeleftsholderpad2.render(f5);
        this.capefrontright.render(f5);
        this.caperightarm.render(f5);
        this.capeleftsholder.render(f5);
        this.capeleftcollar1.render(f5);
        this.capeleftcollar2.render(f5);
        this.caperightsholderpad1.render(f5);
        this.capeback.render(f5);
        this.capefrontleft.render(f5);
        this.caperightcollar1.render(f5);
        this.caperightsholder.render(f5);
        this.caperight.render(f5);
        this.caperightsholderpad2.render(f5);
        this.capeleft.render(f5);
        this.capeleftarm.render(f5);
    }

    public void setRotateAngle(RendererModel RendererModel, float x, float y, float z) 
    {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}
