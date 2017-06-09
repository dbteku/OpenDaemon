package com.dbteku.daemon.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.dbteku.daemon.runnables.ExitRunnable;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class DaemonController implements Initializable {
	@FXML
	Button btnStartProcess;
	@FXML
	Button btnStopProcess;
	@FXML
	Button btnRestartProcess;
	@FXML
	Button btnGenConfig;
//	@FXML
//	ListView<DaemonElement> servicesList;

	public DaemonController(){
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		Services.getInstance().subscribe(this);
//		ObservableList<DaemonElement> elements = FXCollections.observableArrayList();
//		Iterator<IService> iterator = Services.getInstance().getServices();
//		while(iterator.hasNext()){
//			IService service = iterator.next();
//			elements.add(new DaemonElement(service));
//		}
//		servicesList.setItems(elements);
//		startStartupServices();
	}

	public void startProcess(){
//		DaemonElement element = servicesList.getSelectionModel().getSelectedItem();
//		if(element != null){
//			element.start();
//		}
	}
	public void stopProcess(){
//		DaemonElement element = servicesList.getSelectionModel().getSelectedItem();
//		if(element != null){
//			element.stop();
//		}
	}
	public void restartProcess(){
//		DaemonElement element = servicesList.getSelectionModel().getSelectedItem();
//		if(element != null){
//			element.restart();
//		}
	}

	public void configure(){
//		DaemonElement element = servicesList.getSelectionModel().getSelectedItem();
//		if(element != null){
//			element.config();
//		}
	}

	public void onNewDaemon(){
//		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DaemonDialog.fxml"));
//		try {
//			Parent root = (Parent) fxmlLoader.load();
//            Stage stage = new Stage();
//			DaemonDialogController controller = (DaemonDialogController) fxmlLoader.getController();
//			controller.onStageUpdate(stage);
//            stage.initModality(Modality.APPLICATION_MODAL);
//            stage.initStyle(StageStyle.UNDECORATED);
//            stage.setTitle("Create a daemon.");
//            stage.setScene(new Scene(root));  
//            stage.show();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	
	public void onEditDaemon(){
		// Get Services Settings
		// Open a new EditDialog and fill it with settings you just got.
		// Update the service in Services.
	}

	public void onRemoveDaemon(){
//		DaemonElement toRemove = servicesList.getSelectionModel().getSelectedItem();
//		toRemove.stop();
//		toRemove.onDelete();
//		servicesList.getItems().remove(toRemove);
//		Services.getInstance().remove(toRemove.getService().getId());
	}

	public void onExit(){
		Runnable exit = new ExitRunnable();
		exit.run(); 
	}

//	@Override
//	public void onNewService(IService service) {
//		servicesList.getItems().add(new DaemonElement(service));
//	}
	
//	private void startStartupServices(){
//		ObservableList<DaemonElement> all = servicesList.getItems();
//		for (DaemonElement daemonElement : all) {
//			ProcessService service = (ProcessService) daemonElement.getService();
//			if(service.runOnStartup()){
//				daemonElement.start();
//			}
//		}
//	}
}