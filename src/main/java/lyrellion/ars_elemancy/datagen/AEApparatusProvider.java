package lyrellion.ars_elemancy.datagen;

import lyrellion.ars_elemancy.ArsElemancy;
import lyrellion.ars_elemancy.common.items.armor.ArmorSet;
import lyrellion.ars_elemancy.recipe.ElemancyArmorRecipe;
import lyrellion.ars_elemancy.registry.ModItems;
import com.hollingsworth.arsnouveau.common.crafting.recipes.EnchantingApparatusRecipe;
import com.hollingsworth.arsnouveau.common.datagen.ApparatusRecipeBuilder;
import com.hollingsworth.arsnouveau.common.datagen.ApparatusRecipeProvider;
import com.hollingsworth.arsnouveau.common.datagen.RecipeDatagen;
import com.hollingsworth.arsnouveau.setup.registry.ItemsRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static alexthw.ars_elemental.registry.ModItems.MARK_OF_MASTERY;

public class AEApparatusProvider extends ApparatusRecipeProvider {

    public AEApparatusProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    public void collectJsons(CachedOutput cache) {


        recipes.add(builder()
                .withResult(ModItems.ENCHANTER_BANGLE.get())
                .withReagent(ItemsRegistry.RING_OF_POTENTIAL)
                .withPedestalItem(RecipeDatagen.SOURCE_GEM_BLOCK)
                .withPedestalItem(Items.GOLD_BLOCK)
                .withPedestalItem(Items.GOLD_BLOCK)
                .withPedestalItem(Items.END_CRYSTAL)
                .build()
        );


        //focus upgrade

        recipes.add(builder()
                .withResult(ModItems.CINDER_FOCUS.get())
                .withReagent((ItemLike) ModItems.CINDER_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.FIRE_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.AIR_FOCUS)
                .build()
        );
        recipes.add(builder()
                .withResult(ModItems.LAVA_FOCUS.get())
                .withReagent((ItemLike) ModItems.LAVA_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.FIRE_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.EARTH_FOCUS)
                .build()
        );
        recipes.add(builder()
                .withResult(ModItems.VAPOR_FOCUS.get())
                .withReagent((ItemLike) ModItems.VAPOR_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.FIRE_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.WATER_FOCUS)
                .build()
        );
        recipes.add(builder()
                .withResult(ModItems.SILT_FOCUS.get())
                .withReagent((ItemLike) ModItems.SILT_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.EARTH_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.AIR_FOCUS)
                .build()
        );
        recipes.add(builder()
                .withResult(ModItems.MIRE_FOCUS.get())
                .withReagent((ItemLike) ModItems.MIRE_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.EARTH_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.WATER_FOCUS)
                .build()
        );
        recipes.add(builder()
                .withResult(ModItems.TEMPEST_FOCUS.get())
                .withReagent((ItemLike) ModItems.TEMPEST_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.WATER_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.AIR_FOCUS)
                .build()
        );
        recipes.add(builder()
                .withResult(ModItems.ELEMANCER_FOCUS.get())
                .withReagent((ItemLike) ModItems.ELEMANCER_ESSENCE)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.FIRE_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.AIR_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.EARTH_FOCUS)
                .withPedestalItem((ItemLike) alexthw.ars_elemental.registry.ModItems.WATER_FOCUS)
                .build()
        );

        // Elemancy armors
        addArmorRecipes(ModItems.TEMPEST_ARMOR, (ItemLike) ModItems.TEMPEST_ESSENCE, alexthw.ars_elemental.registry.ModItems.AIR_ARMOR, alexthw.ars_elemental.registry.ModItems.WATER_ARMOR);
        addArmorRecipes(ModItems.CINDER_ARMOR, (ItemLike) ModItems.CINDER_ESSENCE, alexthw.ars_elemental.registry.ModItems.AIR_ARMOR, alexthw.ars_elemental.registry.ModItems.FIRE_ARMOR);
        addArmorRecipes(ModItems.SILT_ARMOR, (ItemLike) ModItems.SILT_ESSENCE, alexthw.ars_elemental.registry.ModItems.AIR_ARMOR, alexthw.ars_elemental.registry.ModItems.EARTH_ARMOR);
        addArmorRecipes(ModItems.MIRE_ARMOR, (ItemLike) ModItems.MIRE_ESSENCE, alexthw.ars_elemental.registry.ModItems.EARTH_ARMOR, alexthw.ars_elemental.registry.ModItems.WATER_ARMOR);
        addArmorRecipes(ModItems.VAPOR_ARMOR, (ItemLike) ModItems.VAPOR_ESSENCE, alexthw.ars_elemental.registry.ModItems.FIRE_ARMOR, alexthw.ars_elemental.registry.ModItems.WATER_ARMOR);
        addArmorRecipes(ModItems.LAVA_ARMOR, (ItemLike) ModItems.LAVA_ESSENCE, alexthw.ars_elemental.registry.ModItems.FIRE_ARMOR, alexthw.ars_elemental.registry.ModItems.EARTH_ARMOR);
        addArmorRecipes(ModItems.ELEMANCER_ARMOR, (ItemLike) ModItems.ELEMANCER_ESSENCE, alexthw.ars_elemental.registry.ModItems.AIR_ARMOR, alexthw.ars_elemental.registry.ModItems.FIRE_ARMOR, alexthw.ars_elemental.registry.ModItems.WATER_ARMOR, alexthw.ars_elemental.registry.ModItems.EARTH_ARMOR);

        Path output = this.generator.getPackOutput().getOutputFolder();
        for (ApparatusRecipeBuilder.RecipeWrapper<? extends EnchantingApparatusRecipe> g : recipes) {
            if (g != null) {
                Path path = getRecipePath(output, g.id().getPath());
                saveStable(cache, g.serialize(), path);
            }
        }

    }

    protected void addArmorRecipes(ArmorSet armorSet, ItemLike essence, alexthw.ars_elemental.common.items.armor.ArmorSet... bases) {
        if (bases.length < 2) {
            throw new IllegalArgumentException("needs at least 2 armor bases");
        }

        ArrayList<Item>[] pieceTypes = new ArrayList[4];
        for (int i = 0; i < 4; i++) {
            pieceTypes[i] = new ArrayList<>();
        }

        pieceTypes[0].add(armorSet.getHat());
        pieceTypes[1].add(armorSet.getChest());
        pieceTypes[2].add(armorSet.getLegs());
        pieceTypes[3].add(armorSet.getBoots());

        for (var base : bases) {
            pieceTypes[0].add(base.getHat());
            pieceTypes[1].add(base.getChest());
            pieceTypes[2].add(base.getLegs());
            pieceTypes[3].add(base.getBoots());
        }

        for (int i = 0; i < 4; i++) {
            List<Item> pieces = pieceTypes[i];
            Item piece = pieces.getFirst();
            for (int j = 1; j < pieces.size(); j++) {
                var inner = pieces.get(j);

                var builder = Abuilder()
                        .withResult(piece)
                        .withReagent(inner)
                        .withPedestalItem(MARK_OF_MASTERY);

                for (int k = 1; k < pieces.size(); k++) {
                    if (j != k) {
                        builder = builder.withPedestalItem(pieces.get(k));
                    }
                }

                recipes.add(
                        builder
                                .withPedestalItem(2, essence)
                                .withSourceCost(7000)
                                .keepNbtOfReagent(true)
                                .withId(ArsElemancy.prefix(BuiltInRegistries.ITEM.getKey(piece.asItem()).getPath() + "_" + j))
                                .build()
                );
            }
        }
    }

    protected static Path getRecipePath(Path pathIn, String str) {
        return pathIn.resolve("data/ars_elemancy/recipe/" + str + ".json");
    }

    @Override
    public String getName() {
        return "Ars Elemancy Apparatus";
    }

    ArmorBuilder Abuilder() {
        return new ArmorBuilder();
    }

    public static class ArmorBuilder extends ApparatusRecipeBuilder {

        @Override
        public RecipeWrapper<EnchantingApparatusRecipe> build() {
            var wrapper = super.build();
            return new RecipeWrapper<>(wrapper.id(), new ElemancyArmorRecipe(wrapper.recipe().reagent(), wrapper.recipe().result(), wrapper.recipe().pedestalItems(), wrapper.recipe().sourceCost()), ElemancyArmorRecipe.CODEC);
        }
    }

}
