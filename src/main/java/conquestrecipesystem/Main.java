package conquestrecipesystem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import conquestrecipesystem.Subsystems.CommandSubsystem;
import conquestrecipesystem.Subsystems.ItemStackSubsystem;
import conquestrecipesystem.Subsystems.RecipeSubsystem;

public final class Main extends JavaPlugin {

    public static String version = "v0.5";

    // subsystems
    public CommandSubsystem commands = new CommandSubsystem(this);
    public ItemStackSubsystem itemstacks = new ItemStackSubsystem(this);
    public RecipeSubsystem recipes = new RecipeSubsystem(this);

    @Override
    public void onEnable() {
        recipes.registerRecipes();
    }

    @Override
    public void onDisable() {

    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        CommandSubsystem commandInterpreter = new CommandSubsystem(this);
        return commandInterpreter.interpretCommand(sender, label, args);
    }
}
