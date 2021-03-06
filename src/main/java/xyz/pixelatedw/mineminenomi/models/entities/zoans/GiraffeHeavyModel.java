package xyz.pixelatedw.mineminenomi.models.entities.zoans;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class GiraffeHeavyModel extends ZoanMorphModel
{
	public RendererModel leftleg4;
	public RendererModel leftleg3;
	public RendererModel leftleg2;
	public RendererModel leftleg1;
	public RendererModel lefthull3;
	public RendererModel lefthull4;
	public RendererModel neck;
	public RendererModel body1;
	public RendererModel rightarm1;
	public RendererModel leftarm1;
	public RendererModel rightleg4;
	public RendererModel tail1;
	public RendererModel neck2;
	public RendererModel mane2;
	public RendererModel head1;
	public RendererModel mane;
	public RendererModel horn1;
	public RendererModel horn2;
	public RendererModel rightear;
	public RendererModel leftear;
	public RendererModel head2;
	public RendererModel body2;
	public RendererModel body3;
	public RendererModel rightarm2;
	public RendererModel righthull1;
	public RendererModel righthull2;
	public RendererModel leftarm2;
	public RendererModel lefthull1;
	public RendererModel lefthull2;
	public RendererModel rightleg3;
	public RendererModel rightleg2;
	public RendererModel rightleg1;
	public RendererModel righthull3;
	public RendererModel righthull4;
	public RendererModel tail2;
	public RendererModel tail3;

	public GiraffeHeavyModel()
	{
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.horn2 = new RendererModel(this, 60, 20);
		this.horn2.setRotationPoint(-1.5F, -6.0F, -0.5F);
		this.horn2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.body2 = new RendererModel(this, 47, 0);
        this.body2.mirror = true;
        this.body2.setRotationPoint(-0.5F, 7.5F, -1.9F);
        this.body2.addBox(0.0F, 0.0F, 0.0F, 9, 7, 5, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.0F, -0.9599310885968813F);
		this.lefthull4 = new RendererModel(this, 65, 20);
		this.lefthull4.setRotationPoint(-1.0F, 0.0F, -2.5F);
		this.lefthull4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lefthull4, -0.12112585008840647F, -0.4883431247080134F, -0.03944444109507184F);
		this.rightleg4 = new RendererModel(this, 10, 30);
		this.rightleg4.setRotationPoint(-2.0F, 11.600000381469727F, 1.0F);
		this.rightleg4.addBox(-2.0F, 0.0F, -2.0F, 3, 7, 3, 0.0F);
		this.setRotateAngle(rightleg4, -0.34906584024429316F, -0.0F, 0.0F);
		this.neck2 = new RendererModel(this, 79, 14);
		this.neck2.setRotationPoint(0.5F, -7.0F, -0.5F);
		this.neck2.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
		this.setRotateAngle(neck2, 0.13962634015954636F, -0.0F, 0.0F);
		this.leftleg3 = new RendererModel(this, 10, 41);
		this.leftleg3.setRotationPoint(0.5F, 5.0F, 0.0F);
		this.leftleg3.addBox(-2.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(leftleg3, 1.7453292519943295F, -0.0F, 0.0F);
        this.rightarm2 = new RendererModel(this, 23, 39);
        this.rightarm2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.rightarm2.addBox(0.0F, 0.0F, 0.1F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rightarm2, 0.0F, -0.0F, -0.41887902047863906F);
		this.rightleg2 = new RendererModel(this, 0, 30);
		this.rightleg2.setRotationPoint(0.0F, 5.8F, -0.5F);
		this.rightleg2.addBox(-2.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(rightleg2, -1.9198621771937625F, -0.0F, 0.0F);
		this.head1 = new RendererModel(this, 32, 18);
		this.head1.setRotationPoint(2.0F, 0.5F, 1.5F);
		this.head1.addBox(-2.0F, -4.0F, -6.0F, 4, 3, 8, 0.0F);
		this.setRotateAngle(head1, -0.3141592653589793F, -0.0F, 0.0F);
		this.leftleg1 = new RendererModel(this, 0, 41);
		this.leftleg1.setRotationPoint(0.0F, 5.0F, -0.5F);
		this.leftleg1.addBox(-2.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(leftleg1, 0.5235987755982988F, -0.0F, 0.0F);
		this.rightear = new RendererModel(this, 32, 0);
		this.rightear.setRotationPoint(-2.0F, -3.5F, 0.0F);
		this.rightear.addBox(-3.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F);
		this.setRotateAngle(rightear, 0.0F, -0.0F, -0.2617993877991494F);
		this.righthull2 = new RendererModel(this, 65, 20);
		this.righthull2.setRotationPoint(1.0F, 6.1F, 0.8F);
		this.righthull2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(righthull2, 0.17453292519943295F, -0.0F, -0.9599310885968813F);
        this.head2 = new RendererModel(this, 31, 29);
        this.head2.setRotationPoint(-2.0F, -1.0F, 0.5F);
        this.head2.addBox(0.01F, 0.0F, -4.0F, 4, 2, 5, 0.0F);
		this.lefthull1 = new RendererModel(this, 65, 24);
		this.lefthull1.setRotationPoint(0.0F, 5.5F, 0.5F);
		this.lefthull1.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(lefthull1, 0.17453292519943295F, -0.0F, -0.13962634015954636F);
		this.mane = new RendererModel(this, 76, 0);
		this.mane.setRotationPoint(2.0F, -2.0F, 3.5F);
		this.mane.addBox(0.0F, 0.0F, 0.0F, 0, 10, 1, 0.0F);
		this.setRotateAngle(mane, 0.03490658503988659F, -0.0F, 0.0F);
		this.rightleg1 = new RendererModel(this, 0, 41);
		this.rightleg1.setRotationPoint(0.0F, 5.0F, -0.5F);
		this.rightleg1.addBox(-2.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rightleg1, 0.5235987755982988F, -0.0F, 0.0F);
		this.body1 = new RendererModel(this, 0, 0);
		this.body1.setRotationPoint(-0.5F, -4.0F, 0.0F);
		this.body1.addBox(-4.0F, 0.0F, -2.0F, 10, 16, 5, 0.0F);
		this.horn1 = new RendererModel(this, 60, 20);
		this.horn1.setRotationPoint(0.5F, -6.0F, -0.5F);
		this.horn1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.lefthull3 = new RendererModel(this, 65, 20);
		this.lefthull3.setRotationPoint(-2.0F, 0.0F, -2.0F);
		this.lefthull3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lefthull3, -0.12112585008840647F, 0.4883431247080134F, 0.03944444109507184F);
		this.leftear = new RendererModel(this, 32, 0);
		this.leftear.mirror = true;
		this.leftear.setRotationPoint(2.0F, -3.5F, 0.0F);
		this.leftear.addBox(0.0F, 0.0F, 0.0F, 3, 2, 0, 0.0F);
		this.setRotateAngle(leftear, 0.0F, -0.0F, 0.2617993877991494F);
		this.tail3 = new RendererModel(this, 60, 13);
		this.tail3.setRotationPoint(-0.5F, -0.5F, 3.5F);
		this.tail3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(tail3, 0.20943951023931953F, -0.0F, 0.0F);
        this.body3 = new RendererModel(this, 47, 0);
        this.body3.setRotationPoint(2.5F, 7.4F, -1.91F);
        this.body3.addBox(0.0F, -7.5F, 0.0F, 9, 7, 5, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.0F, -2.2689280275926285F);
		this.lefthull2 = new RendererModel(this, 65, 20);
		this.lefthull2.setRotationPoint(-1.1F, 6.1F, 0.8F);
		this.lefthull2.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lefthull2, 0.17453292519943295F, -0.0F, 0.9599310885968813F);
		this.rightarm1 = new RendererModel(this, 23, 30);
		this.rightarm1.setRotationPoint(-8.0F, 1.0F, -1.0F);
		this.rightarm1.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(rightarm1, 0.0F, -0.0F, 0.27925267815589905F);
        this.leftarm2 = new RendererModel(this, 23, 39);
        this.leftarm2.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.leftarm2.addBox(-2.0F, 0.0F, 0.1F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leftarm2, 0.0F, -0.0F, 0.41887902047863906F);
		this.righthull4 = new RendererModel(this, 65, 20);
		this.righthull4.setRotationPoint(-1.0F, 0.0F, -2.5F);
		this.righthull4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(righthull4, -0.12112585008840647F, -0.4883431247080134F, -0.03944444109507184F);
		this.neck = new RendererModel(this, 79, 0);
		this.neck.setRotationPoint(-2.0F, -11.0F, -3.5F);
		this.neck.addBox(0.0F, 0.0F, 0.0F, 5, 8, 5, 0.0F);
		this.setRotateAngle(neck, 0.17453292012214658F, -0.0F, 0.0F);
		this.leftarm1 = new RendererModel(this, 23, 30);
		this.leftarm1.setRotationPoint(9.0F, 1.0F, -1.0F);
		this.leftarm1.addBox(-2.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(leftarm1, 0.0F, -0.0F, -0.27925267815589905F);
		this.tail1 = new RendererModel(this, 31, 3);
		this.tail1.setRotationPoint(0.0F, 10.0F, 3.0F);
		this.tail1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail1, -0.7330383062362671F, -0.0F, 0.0F);
		this.mane2 = new RendererModel(this, 76, 0);
		this.mane2.setRotationPoint(2.5F, 0.0F, 4.6F);
		this.mane2.addBox(0.0F, 0.0F, 0.0F, 0, 8, 1, 0.0F);
		this.setRotateAngle(mane2, 0.017453292519943295F, -0.0F, 0.0F);
		this.tail2 = new RendererModel(this, 31, 10);
		this.tail2.setRotationPoint(0.0F, 0.0F, 4.5F);
		this.tail2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotateAngle(tail2, 0.47123889803846897F, -0.0F, 0.0F);
		this.leftleg2 = new RendererModel(this, 0, 30);
		this.leftleg2.setRotationPoint(0.0F, 5.8F, -0.5F);
		this.leftleg2.addBox(-2.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F);
		this.setRotateAngle(leftleg2, -1.9198621771937625F, -0.0F, 0.0F);
		this.leftleg4 = new RendererModel(this, 10, 30);
		this.leftleg4.setRotationPoint(4.0F, 11.6F, 1.0F);
		this.leftleg4.addBox(-2.0F, 0.0F, -2.0F, 3, 7, 3, 0.0F);
		this.setRotateAngle(leftleg4, -0.3490658503988659F, -0.0F, 0.0F);
		this.rightleg3 = new RendererModel(this, 10, 41);
		this.rightleg3.setRotationPoint(0.5F, 5.0F, 0.0F);
		this.rightleg3.addBox(-2.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(rightleg3, 1.7453292519943295F, -0.0F, 0.0F);
		this.righthull3 = new RendererModel(this, 65, 20);
		this.righthull3.setRotationPoint(-2.0F, 0.0F, -2.0F);
		this.righthull3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(righthull3, -0.12112585008840647F, 0.4883431247080134F, 0.03944444109507184F);
		this.righthull1 = new RendererModel(this, 65, 24);
		this.righthull1.setRotationPoint(0.0F, 5.5F, 0.5F);
		this.righthull1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(righthull1, 0.17453292519943295F, -0.0F, 0.13962634015954636F);
		this.head1.addChild(this.horn2);
		this.body1.addChild(this.body2);
		this.leftleg1.addChild(this.lefthull4);
		this.neck.addChild(this.neck2);
		this.leftleg4.addChild(this.leftleg3);
		this.rightarm1.addChild(this.rightarm2);
		this.rightleg3.addChild(this.rightleg2);
		this.neck2.addChild(this.head1);
		this.leftleg2.addChild(this.leftleg1);
		this.head1.addChild(this.rightear);
		this.rightarm2.addChild(this.righthull2);
		this.head1.addChild(this.head2);
		this.leftarm2.addChild(this.lefthull1);
		this.neck2.addChild(this.mane);
		this.rightleg2.addChild(this.rightleg1);
		this.head1.addChild(this.horn1);
		this.leftleg1.addChild(this.lefthull3);
		this.head1.addChild(this.leftear);
		this.tail2.addChild(this.tail3);
		this.body1.addChild(this.body3);
		this.leftarm2.addChild(this.lefthull2);
		this.leftarm1.addChild(this.leftarm2);
		this.rightleg1.addChild(this.righthull4);
		this.neck.addChild(this.mane2);
		this.tail1.addChild(this.tail2);
		this.leftleg3.addChild(this.leftleg2);
		this.rightleg4.addChild(this.rightleg3);
		this.rightleg1.addChild(this.righthull3);
		this.rightarm2.addChild(this.righthull1);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		this.rightleg4.render(f5);
		this.body1.render(f5);
		this.rightarm1.render(f5);
		this.neck.render(f5);
		this.leftarm1.render(f5);
		this.tail1.render(f5);
		this.leftleg4.render(f5);
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float headYaw, float headPitch, float scaleFactor, Entity ent)
	{
		LivingEntity entity = ((LivingEntity) ent);

		this.head1.rotateAngleY = headYaw / (270F / (float) Math.PI);
		this.head1.rotateAngleX = headPitch / (360F / (float) Math.PI);

		this.leftleg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
		this.rightleg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount;

		this.rightarm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.4F * limbSwingAmount;
		this.leftarm1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.4F * limbSwingAmount;

		if (entity.isSwingInProgress)
		{
			this.rightarm1.rotateAngleX = MathHelper.sin(entity.swingProgress * 3.0F + (float) Math.PI) * 1.2F;
			this.rightarm1.rotateAngleY = MathHelper.sin(entity.swingProgress * 3.0F + (float) Math.PI) * -0.2F;
			this.rightarm1.rotateAngleZ = -MathHelper.cos(entity.swingProgress * 4.0F + (float) Math.PI) * 0.5F;
		}

		if (MathHelper.sqrt(ent.getDistanceSq(ent.prevPosX, ent.prevPosY, ent.prevPosZ)) <= 0.05F && !entity.isSwingInProgress)
		{
			this.rightarm1.rotateAngleX = 0;
			this.rightarm1.rotateAngleY = 0;
			this.rightarm1.rotateAngleZ = 0.209F;
		}
		else if (!entity.isSwingInProgress && MathHelper.sqrt(ent.getDistanceSq(ent.prevPosX, ent.prevPosY, ent.prevPosZ)) > 0)
		{
			this.rightarm1.rotateAngleY = 0;
			this.rightarm1.rotateAngleZ = 0.209F;
		}

	}
	
	public void setRotateAngle(RendererModel RendererModel, float x, float y, float z)
	{
		RendererModel.rotateAngleX = x;
		RendererModel.rotateAngleY = y;
		RendererModel.rotateAngleZ = z;
	}

	@Override
	public RendererModel getHandRenderer()
	{
		GL11.glScaled(1.2, 1.2, 1);
		GL11.glTranslated(-0.1, -0.1, 0.05);
		GL11.glRotated(-7, 1, 0, 0);
		GL11.glRotated(7, 0, 0, 1);
		return this.rightarm2;
	}

	@Override
	public RendererModel getArmRenderer()
	{
		return this.rightarm1;
	}
}
