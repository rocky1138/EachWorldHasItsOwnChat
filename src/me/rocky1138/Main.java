package me.rocky1138;

import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin {

	@Override
	public void onDisable() {
		
		
	}
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new ChatListener(), this);
	}
	
	
}
