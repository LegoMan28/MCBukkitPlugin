package com.(email hoster, e.x: gmail).(emailname);

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Youtube extends JavaPlugin{
	public static Logger logger = Logger.getLogger("Minecraft");
	public static Youtube plugin;
	
	@Override
	public void onDisable() {
			PluginDescriptionFile pdffile = this.getDescription();
			this.logger.info(pdffile.getName() + " Has Been Disabled!");
	}
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdffile = this.getDescription();
		this.logger.info(pdffile.getName() + " Version" + pdffile.getVersion() + " Has Been Enabled"
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("<commandhere>")){
			player.sendMessage(ChatColor.GOLD + "<messagebacktoplayer>");
		}
	}
		
	
	

