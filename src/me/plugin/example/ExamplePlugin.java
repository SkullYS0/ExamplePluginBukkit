package me.plugin.example;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin 
{

	Logger log = getLogger();

	public void onEnable()
	{
		log.info("ExamplePlugin enabled!"); // ����� ��������� ��� ���������
	}

	public void onDisable()
	{
		log.info("ExamplePlugin disable."); // ����� ��������� ��� ����������
	}
}