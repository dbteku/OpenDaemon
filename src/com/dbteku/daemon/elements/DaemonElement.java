package com.dbteku.daemon.elements;

import com.dbteku.daemon.interfaces.IService;

import javafx.scene.layout.HBox;

public class DaemonElement extends HBox{

//	private static final String RED = "com/extronics/daemon/resources/red.png";
//	private static final String GREEN = "com/extronics/daemon/resources/green.png";
//	private static final String YELLOW = "com/extronics/daemon/resources/yellow.png";
//	private static final double PIC_SIZE = 15;
//	private static final float RESTART_TIME = 3.0f;
	private final IService SERVICE;
//	private Label name;
//	private Image statusIndicator;
//	private boolean restarting;

	public DaemonElement(IService service) {
		this.SERVICE = service;
//		this.SERVICE.subscribe(this);
//		this.name = new Label(service.getId());
//		restarting = false;
//		updateUI(RED);
	}

	public void start(){
//		if(SERVICE.isAvailable()){
//
//		}else{
//			updateUI(YELLOW);
//			SERVICE.start();
//		}
	}

	public void stop(){
//		if(SERVICE.isAvailable()){
//			SERVICE.stop();
//		}else{
//		}
	}

	public void restart(){
//		if(SERVICE.isAvailable()){
//			if(!restarting){
//				restarting = true;
//				stop();
//				updateUI(YELLOW);
//				Notifications.sendNotification(DaemonStrings.PROGRAM_NAME, "Restarting Daemon: " + SERVICE.getId(), MessageType.INFO);
//				Pulsator pulsator = new Pulsator(RESTART_TIME);
//				pulsator.subscribe(pulseEvent->{
//					Platform.runLater(()->{
//						start();
//						restarting = false;
//					});
//				});
//				pulsator.runOnce();
//			}
//		}
	}

//	private void updateUI(String imageUrl){
//		Platform.runLater(()->{
//			this.statusIndicator = new Image(imageUrl);
//			getChildren().clear();
//			ImageView view = new ImageView(statusIndicator);
//			view.setFitWidth(PIC_SIZE);
//			view.setFitHeight(PIC_SIZE);
//			getChildren().addAll(name, view);
//		});
//	}

//	@Override
//	public void onStatusChange(IService service) {
//		if(service.isAvailable()){
//			updateUI(GREEN);
//		}else{
//			updateUI(RED);
//		}
//	}

	public void onDelete() {
//		SERVICE.unsubscribe(this);
	}

	public IService getService() {
		return SERVICE;
	}

	public void config() {
//		SERVICE.config();
	}
}