package com.dbteku.daemon.main;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.io.File;

import com.dbteku.daemon.elements.DaemonItem;
import com.dbteku.daemon.lang.DaemonStrings;
import com.dbteku.daemon.runnables.ExitRunnable;
import com.dbteku.daemon.runnables.ShowRunnable;
import com.dbteku.daemon.tools.DaemonMenuBuilder;
import com.dbteku.daemon.tools.Notifications;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class DaemonManager extends Application {

	private static final String ICON = "com/dbteku/daemon/resources/DaemonLogo.png";
	private static final String FXML = "MainWindow.fxml";
	private static final String SHOW_TEXT = "Show Daemons";
	private static final String CLOSE_TEXT = "Quit";
	private static final int SIZE = 400;
	
	public DaemonManager() {
		
	}
	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	checkAndCreateFolder(DaemonStrings.DAEMON_FOLDER_NAME);
    	checkAndCreateFolder(DaemonStrings.CONFIG_FOLDER_NAME);
    	loadConfiguration();
        Parent root = FXMLLoader.load(getClass().getResource(FXML));
        Platform.setImplicitExit(false);
        primaryStage.getIcons().add(new Image(ICON));
        primaryStage.setTitle(DaemonStrings.PROGRAM_NAME);
        primaryStage.setMinHeight(SIZE);
        primaryStage.setMinWidth(SIZE);
        primaryStage.setScene(new Scene(root, SIZE, SIZE));
        primaryStage.setResizable(false);
        createTrayIcon(primaryStage);
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
            	if(SystemTray.isSupported()){
            		we.consume();
            		primaryStage.hide();
            	}else{
            		Platform.exit();
            	}
            }
        });   
        primaryStage.hide();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    private void createTrayIcon(final Stage stage) {
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            Toolkit kit = Toolkit.getDefaultToolkit();
            DaemonMenuBuilder builder = new DaemonMenuBuilder();
            builder.addDaemonItem(new DaemonItem(SHOW_TEXT, new ShowRunnable(stage)));
            builder.addDaemonItem(new DaemonItem(CLOSE_TEXT, new ExitRunnable()));
            TrayIcon trayIcon = new TrayIcon(kit.getImage(this.getClass().getClassLoader().getResource(ICON)), DaemonStrings.PROGRAM_NAME, builder.build());
            trayIcon.setImageAutoSize(true);
            try {
				tray.add(trayIcon);
				Notifications.setTray(trayIcon);
			} catch (AWTException e) {
				e.printStackTrace();
			}
            Notifications.sendNotification(DaemonStrings.PROGRAM_NAME, DaemonStrings.START_MESSAGE, MessageType.INFO);
        }
    }
    
    private void loadConfiguration(){
//    	Services.getInstance().load();
    }
    
    private void checkAndCreateFolder(String folderName){
    	File folder = new File(folderName);
    	if(folder.exists() && folder.isDirectory()){
    	}else{
    		folder.mkdir();
    	}
    }
    
}