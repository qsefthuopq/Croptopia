package me.thonk.croptopia.mixin;

import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {
/*
    @Inject(method = "addPlainsFeatures", at = @At("TAIL"))
    private static void addPlainsFeatures(GenerationSettings.Builder builder, CallbackInfo info) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.APPLE_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.ORANGE_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.PEACH_TREE_CONFIGURED);
    }*/

   /* @Inject(method = "addJungleTrees", at = @At("TAIL"))
    private static void addJungleTrees(GenerationSettings.Builder builder, CallbackInfo info) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.DATE_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.DRAGON_FRUIT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.MANGO_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.NUTMEG_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.COCONUT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.KUMQUAT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.GRAPEFRUIT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.BANANA_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.GRAPEFRUIT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.FIG_TREE_CONFIGURED);

    }
*/
    /*@Inject(method = "addForestTrees", at = @At("TAIL"))
    private static void addForestTrees(GenerationSettings.Builder builder, CallbackInfo info) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.LIME_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.PEAR_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.APRICOT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.AVOCADO_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.STAR_FRUIT_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.LEMON_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.CHERRY_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.PLUM_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.PERSIMMON_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.ORANGE_TREE_CONFIGURED);
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION,
                GeneratorRegistry.NECTARINE_TREE_CONFIGURED);
    }*/
}
