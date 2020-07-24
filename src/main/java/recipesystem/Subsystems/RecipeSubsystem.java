package recipesystem.Subsystems;

import recipesystem.Main;
import recipesystem.Objects.SteelIngot;

public class RecipeSubsystem {

    Main main = null;

    public RecipeSubsystem(Main plugin) {
        main = plugin;
    }

    public void registerRecipes() {

        SteelIngot steelIngot = new SteelIngot(main);
        steelIngot.registerRecipe();

    }

}
