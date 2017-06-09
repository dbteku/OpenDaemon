package com.dbteku.daemon.tools;

import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

public class Notifications {

	private static TrayIcon tray;
	
	public static void setTray(TrayIcon icon){
		tray = icon;
	}
	
	public static void sendNotification(String title, String message, MessageType type){
		if(tray != null){
			tray.displayMessage(title, message, type);
		}
	}
	
}
