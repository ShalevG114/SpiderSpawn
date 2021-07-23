package me.shalev.SpiderSpawn;



import org.bukkit.plugin.java.JavaPlugin;

import me.shalev.SpiderSpawn.commands.SpiderCommand;


public class Main extends JavaPlugin {

		@Override
		public void onEnable() {
			new SpiderCommand(this);
		}
}
	