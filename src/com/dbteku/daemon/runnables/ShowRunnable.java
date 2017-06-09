package com.dbteku.daemon.runnables;

import javafx.application.Platform;
import javafx.stage.Stage;

public class ShowRunnable implements Runnable{

	private final Stage STAGE;
	
	public ShowRunnable(Stage stage) {
		this.STAGE = stage;
	}

	@Override
	public void run() {
		Platform.runLater(()-> STAGE.show());
	}
	
}
