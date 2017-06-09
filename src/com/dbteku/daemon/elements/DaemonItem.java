package com.dbteku.daemon.elements;

import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaemonItem {

	private final String LABEL;
	private final Runnable ACTION;

	public DaemonItem(String label, Runnable action) {
		this.LABEL = label;
		this.ACTION = action;
	}

	public MenuItem getMenuItem() {
		MenuItem item = new MenuItem(LABEL);
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ACTION != null){
					ACTION.run();
				}
			}
		});
		return item;
	}
}