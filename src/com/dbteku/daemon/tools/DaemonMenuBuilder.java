package com.dbteku.daemon.tools;

import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.List;

import com.dbteku.daemon.elements.DaemonItem;

public class DaemonMenuBuilder {

	private PopupMenu menu;
	private List<DaemonItem> items;

	public DaemonMenuBuilder(String menuName) {
		this.menu = new PopupMenu(menuName);
		this.items = new ArrayList<>();
	}

	public DaemonMenuBuilder() {
		this("Menu");
	}

	public void addDaemonItem(DaemonItem item){
		if(!items.contains(item)){
			items.add(item);
		}
	}

	public void removeDaemonItem(DaemonItem item){
		items.remove(item);
	}
	
	public PopupMenu build(){
		for (DaemonItem daemonItem : items) {
			menu.add(daemonItem.getMenuItem());
		}
		return menu;
	}
}