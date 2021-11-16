package me.plugin.example;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin 
{

	Logger log = getLogger();

	public void onEnable()
	{
		log.info("ExamplePlugin enabled!"); // Вывод сообщения при включении
	}

	public void onDisable()
	{
		log.info("ExamplePlugin disable."); // Вывод сообщения при выключении
	}
}