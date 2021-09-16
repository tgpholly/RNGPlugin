package ml.scrumpygames.rng;

import java.util.Random;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RNGPlugin extends JavaPlugin
{
	public static Random rand;
	public static Server serverInstance;
	
	// Fired when plugin is first enabled
    @Override
    public void onEnable()
    {
    	rand = new Random();
    	serverInstance = getServer();
    	getCommand("rngsb").setExecutor(new CommandRNG());
    	
    }
    
    // Fired when plugin is disabled
    @Override
    public void onDisable()
    {
    }
    
    public class CommandRNG implements CommandExecutor
    {
		@Override
		public boolean onCommand(CommandSender commandSender, Command arg1, String arg2, String[] args)
		{
			try
			{
				if (args.length != 4) {
					if (args.length < 4)
					{
						commandSender.sendMessage("You are missing arguments, use /help rngsb to check usage.");
					}
					else
					{
						commandSender.sendMessage("Too many arguments! Use /help rngsb to check usage.");
					}
					return false;
				}
				
				int min = Integer.parseInt(args[0]);
				int max = Integer.parseInt(args[1]) + 1;
				
				serverInstance.dispatchCommand(
					commandSender,
					"scoreboard players set " + args[2] + " " + args[3] + " " + (rand.nextInt(max - min) + min)
				);
			}
			catch (Exception e)
			{
				commandSender.sendMessage((new StringBuilder()).append("There was an error executing this command: ").append(e.toString()).toString());
			}
			
			return true;
		}
    }
}
