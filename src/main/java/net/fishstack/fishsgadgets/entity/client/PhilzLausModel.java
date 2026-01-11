package net.fishstack.fishsgadgets.entity.client;// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fishstack.fishsgadgets.entity.animations.ModAnimationDefinitions;
import net.fishstack.fishsgadgets.entity.custom.PhilzLausEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class PhilzLausModel<T extends Entity> extends HierarchicalModel<T> {
        private final ModelPart philzlaus;
        private final ModelPart headgroup;
        private final ModelPart hat;
        private final ModelPart outer;
        private final ModelPart outer2;
        private final ModelPart inner;
        private final ModelPart mouth1;
        private final ModelPart mouth2;
        private final ModelPart rear;
        private final ModelPart body;
        private final ModelPart legs;
        private final ModelPart leftlegs;
        private final ModelPart leg2;
        private final ModelPart leg3;
        private final ModelPart leg5;
        private final ModelPart rightlegs;
        private final ModelPart leg4;
        private final ModelPart leg6;
        private final ModelPart leg7;

        public PhilzLausModel(ModelPart root) {
            this.philzlaus = root.getChild("philzlaus");
            this.headgroup = this.philzlaus.getChild("headgroup");
            this.hat = this.headgroup.getChild("hat");
            this.outer = this.hat.getChild("outer");
            this.outer2 = this.hat.getChild("outer2");
            this.inner = this.hat.getChild("inner");
            this.mouth1 = this.headgroup.getChild("mouth1");
            this.mouth2 = this.headgroup.getChild("mouth2");
            this.rear = this.philzlaus.getChild("rear");
            this.body = this.philzlaus.getChild("body");
            this.legs = this.philzlaus.getChild("legs");
            this.leftlegs = this.legs.getChild("leftlegs");
            this.leg2 = this.leftlegs.getChild("leg2");
            this.leg3 = this.leftlegs.getChild("leg3");
            this.leg5 = this.leftlegs.getChild("leg5");
            this.rightlegs = this.legs.getChild("rightlegs");
            this.leg4 = this.rightlegs.getChild("leg4");
            this.leg6 = this.rightlegs.getChild("leg6");
            this.leg7 = this.rightlegs.getChild("leg7");
        }

        public static LayerDefinition createBodyLayer() {
            MeshDefinition meshdefinition = new MeshDefinition();
            PartDefinition partdefinition = meshdefinition.getRoot();

            PartDefinition philzlaus = partdefinition.addOrReplaceChild("philzlaus", CubeListBuilder.create(), PartPose.offset(-0.4F, 19.3F, -6.1F));

            PartDefinition headgroup = philzlaus.addOrReplaceChild("headgroup", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -0.1F, -1.4F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

            PartDefinition hat = headgroup.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1396F, 0.0F, 0.0F));

            PartDefinition outer = hat.addOrReplaceChild("outer", CubeListBuilder.create().texOffs(16, 2).mirror().addBox(-1.3F, -1.6F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                    .texOffs(16, 2).addBox(-1.4F, -1.3F, -0.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(16, 2).addBox(-1.5F, -1.6F, -0.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(16, 2).mirror().addBox(-1.2F, -1.3F, -0.8F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.6F, -0.9F, -0.2269F, 0.0F, 0.0F));

            PartDefinition outer2 = hat.addOrReplaceChild("outer2", CubeListBuilder.create().texOffs(16, 2).mirror().addBox(-1.3F, -0.2F, -1.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
                    .texOffs(16, 2).addBox(-1.6F, -0.2F, -1.6F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(16, 2).addBox(-1.7F, -0.2F, -1.2F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                    .texOffs(16, 2).mirror().addBox(-1.4F, -0.2F, -1.6F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.2F, -0.1396F, 0.0F, 0.0F));

            PartDefinition inner = hat.addOrReplaceChild("inner", CubeListBuilder.create().texOffs(19, 1).addBox(-0.6F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(19, 1).addBox(-1.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(19, 1).addBox(-2.0F, -1.0F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(19, 1).addBox(-0.6F, -1.0F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(19, 1).addBox(-1.5F, -1.0F, -0.4F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(19, 1).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9F, -0.2F, -0.5F, -0.1571F, 0.0F, 0.0F));

            PartDefinition mouth1 = headgroup.addOrReplaceChild("mouth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 3.3F, -1.2F, -1.7065F, -0.4354F, 0.1999F));

            PartDefinition cube_r1 = mouth1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 7).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.65F, 0.0F, 0.0F, 0.5236F, 0.0F));

            PartDefinition cube_r2 = mouth1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 7).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.15F, 0.0F, 0.2174F, 0.4802F, 0.4461F));

            PartDefinition cube_r3 = mouth1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(5, 7).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.15F, 0.1F, 0.4733F, 0.233F, 1.1473F));

            PartDefinition mouth2 = headgroup.addOrReplaceChild("mouth2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 3.4F, 0.6F, -1.7065F, 0.4354F, -0.1999F));

            PartDefinition cube_r4 = mouth2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(11, 7).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6372F, 2.9653F, -0.0045F, 0.0F, -0.5236F, 0.0F));

            PartDefinition cube_r5 = mouth2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 7).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7372F, 2.4653F, -0.0045F, 0.2174F, -0.4802F, -0.4461F));

            PartDefinition cube_r6 = mouth2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(6, 7).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9372F, 2.1653F, 0.0955F, 0.4733F, -0.233F, -1.1473F));

            PartDefinition rear = philzlaus.addOrReplaceChild("rear", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 2.5F, 7.1F, 0.0873F, 0.0F, 0.0F));

            PartDefinition cube_r7 = rear.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 10).addBox(-5.0F, 0.0F, -1.0F, 10.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                    .texOffs(23, 32).addBox(-4.5F, 0.0F, 2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(23, 32).addBox(-1.5F, 0.0F, 2.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(36, 49).addBox(-4.0F, 0.0F, -1.0F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

            PartDefinition cube_r8 = rear.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(48, 4).addBox(-1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                    .texOffs(48, 4).addBox(-2.8F, 0.0F, 2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.6F, 1.8F, -0.1484F, 0.0F, 0.0F));

            PartDefinition cube_r9 = rear.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(41, 37).addBox(0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 1.5F, 4.2F, 0.0611F, 0.0F, 0.0F));

            PartDefinition cube_r10 = rear.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(26, 37).addBox(-1.0F, 0.0F, 2.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3F, 1.0F, 3.1F, -0.096F, 0.0F, 0.0F));

            PartDefinition cube_r11 = rear.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 40).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -0.4F, -0.5F, -0.2182F, 0.0F, 0.0F));

            PartDefinition cube_r12 = rear.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.4F, -0.7F, -0.2182F, 0.0F, 0.0F));

            PartDefinition cube_r13 = rear.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(44, 58).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, -0.2182F, 0.0F, 0.0F));

            PartDefinition cube_r14 = rear.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, 0.0F, -1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.2182F, 0.0F, 0.0F));

            PartDefinition body = philzlaus.addOrReplaceChild("body", CubeListBuilder.create().texOffs(38, 27).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.6F, 4.7F, 6.1F));

            PartDefinition cube_r15 = body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-1.0F, -5.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
                    .texOffs(0, 8).addBox(1.3F, -5.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7F, -2.8F, -0.7F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r16 = body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(5, 9).mirror().addBox(-1.0F, -5.0F, -2.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.6F, -3.0F, 0.5F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r17 = body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(25, 7).addBox(-3.0F, -5.0F, -2.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -3.6F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition cube_r18 = body.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 9).addBox(-3.0F, -6.0F, -2.0F, 5.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.9F, 0.0F, 1.5708F, 0.0F, 0.0F));

            PartDefinition legs = philzlaus.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(2.5F, 11.0F, 6.1F));

            PartDefinition leftlegs = legs.addOrReplaceChild("leftlegs", CubeListBuilder.create(), PartPose.offset(-0.1F, -8.1F, -3.5F));

            PartDefinition leg2 = leftlegs.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 1.45F, 3.05F, 0.0F, 0.3054F, 0.0F));

            PartDefinition cube_r19 = leg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.85F, 0.0F, 0.0F, -0.5236F, 0.0F));

            PartDefinition cube_r20 = leg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.15F, 0.0F, 0.2174F, -0.4802F, -0.4461F));

            PartDefinition cube_r21 = leg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.25F, 0.0F, 0.5116F, -0.117F, -1.3658F));

            PartDefinition leg3 = leftlegs.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.1F, 1.7F, -0.5F, 0.0F, 1.0996F, 0.0F));

            PartDefinition cube_r22 = leg3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 0.65F, 0.0F, 0.0F, -0.5236F, 0.0F));

            PartDefinition cube_r23 = leg3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.15F, 0.0F, 0.2174F, -0.4802F, -0.4461F));

            PartDefinition cube_r24 = leg3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.15F, 0.1F, 0.4733F, -0.233F, -1.1473F));

            PartDefinition leg5 = leftlegs.addOrReplaceChild("leg5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 1.55F, 1.25F, 0.0F, 0.672F, 0.0F));

            PartDefinition cube_r25 = leg5.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.85F, 0.0F, 0.0F, -0.5236F, 0.0F));

            PartDefinition cube_r26 = leg5.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.15F, 0.0F, 0.2174F, -0.4802F, -0.4461F));

            PartDefinition cube_r27 = leg5.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(6, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.25F, 0.0F, 0.5116F, -0.117F, -1.3658F));

            PartDefinition rightlegs = legs.addOrReplaceChild("rightlegs", CubeListBuilder.create(), PartPose.offset(-5.2F, -8.7F, -3.9F));

            PartDefinition leg4 = rightlegs.addOrReplaceChild("leg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2372F, 1.4314F, 3.6062F, 0.0F, -0.3054F, 0.0F));

            PartDefinition cube_r28 = leg4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(5, 43).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.85F, 0.0F, 0.0F, 0.5236F, 0.0F));

            PartDefinition cube_r29 = leg4.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(34, 10).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.15F, 0.0F, 0.2174F, 0.4802F, 0.4461F));

            PartDefinition cube_r30 = leg4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(7, 43).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.25F, 0.0F, 0.5116F, 0.117F, 1.3658F));

            PartDefinition leg6 = rightlegs.addOrReplaceChild("leg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5628F, 1.6814F, 0.0562F, 0.0F, -1.0996F, 0.0F));

            PartDefinition cube_r31 = leg6.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 44).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 0.65F, 0.0F, 0.0F, 0.5236F, 0.0F));

            PartDefinition cube_r32 = leg6.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(7, 44).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.15F, 0.0F, 0.2174F, 0.4802F, 0.4461F));

            PartDefinition cube_r33 = leg6.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(6, 41).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.15F, 0.1F, 0.4733F, 0.233F, 1.1473F));

            PartDefinition leg7 = rightlegs.addOrReplaceChild("leg7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4628F, 1.5314F, 1.8062F, 0.0F, -0.672F, 0.0F));

            PartDefinition cube_r34 = leg7.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(11, 11).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.85F, 0.0F, 0.0F, 0.5236F, 0.0F));

            PartDefinition cube_r35 = leg7.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(11, 11).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 0.15F, 0.0F, 0.2174F, 0.4802F, 0.4461F));

            PartDefinition cube_r36 = leg7.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(6, 11).mirror().addBox(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6F, -0.25F, 0.0F, 0.5116F, 0.117F, 1.3658F));

            return LayerDefinition.create(meshdefinition, 64, 64);
        }


    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);


        this.animateWalk(ModAnimationDefinitions.PHILZLAUS_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((PhilzLausEntity) entity).idleAnimationState, ModAnimationDefinitions.PHILZLAUS_IDLE, ageInTicks, 1f);
    }


    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.headgroup.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.headgroup.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }


    @Override
        public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
            philzlaus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        }

        @Override
        public ModelPart root() {
            return philzlaus;
        }
    }