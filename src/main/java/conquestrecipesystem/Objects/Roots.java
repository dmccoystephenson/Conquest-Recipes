package conquestrecipesystem.Objects;

import conquestrecipesystem.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

import static org.bukkit.Material.*;

public class Roots {

    Main main = null;

    public Roots(Main plugin) {
        main = plugin;
    }

    public ItemStack getItemStack(int amount) {
        return main.itemstacks.createItemStack(amount, DEAD_BUSH, "Roots", "The roots from a small plant.");
    }

    public void registerRecipe() {
        NamespacedKey key1 = new NamespacedKey(main, "conquest_recipes_roots");
        ShapedRecipe recipe1 = new ShapedRecipe(key1, getItemStack(2));
        recipe1.shape("000", "0I0", "000");
        recipe1.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(OAK_SAPLING)));
        Bukkit.addRecipe(recipe1);
        NamespacedKey key2 = new NamespacedKey(main, "conquest_recipes_roots");
        ShapedRecipe recipe2 = new ShapedRecipe(key2, getItemStack(2));
        recipe2.shape("000", "0I0", "000");
        recipe2.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(BIRCH_SAPLING)));
        Bukkit.addRecipe(recipe2);
        NamespacedKey key3 = new NamespacedKey(main, "conquest_recipes_roots");
        ShapedRecipe recipe3 = new ShapedRecipe(key3, getItemStack(2));
        recipe3.shape("000", "0I0", "000");
        recipe3.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(JUNGLE_SAPLING)));
        Bukkit.addRecipe(recipe3);
        NamespacedKey key4 = new NamespacedKey(main, "conquest_recipes_roots");
        ShapedRecipe recipe4 = new ShapedRecipe(key4, getItemStack(2));
        recipe4.shape("000", "0I0", "000");
        recipe4.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(ACACIA_SAPLING)));
        Bukkit.addRecipe(recipe4);
        NamespacedKey key5 = new NamespacedKey(main, "conquest_recipes_roots");
        ShapedRecipe recipe5 = new ShapedRecipe(key5, getItemStack(2));
        recipe5.shape("000", "0I0", "000");
        recipe5.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(DARK_OAK_SAPLING)));
        Bukkit.addRecipe(recipe5);
        NamespacedKey key6 = new NamespacedKey(main, "conquest_recipes_roots");
        ShapedRecipe recipe6 = new ShapedRecipe(key6, getItemStack(2));
        recipe6.shape("000", "0I0", "000");
        recipe6.setIngredient('I', new RecipeChoice.ExactChoice(new ItemStack(SPRUCE_SAPLING)));
        Bukkit.addRecipe(recipe6);
    }
}
