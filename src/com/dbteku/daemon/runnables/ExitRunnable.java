package com.dbteku.daemon.runnables;

public class ExitRunnable implements Runnable{

	public ExitRunnable() {
	}

	@Override
	public void run() {
		stopDaemons();
		saveServices();
		System.exit(0);
	}
	
	private void saveServices(){
//		Services services = Services.getInstance();
//		services.save();
	}
	
	private void stopDaemons(){
//		Services services = Services.getInstance();
//		Set<String> servicesKeys = services.getServiceKeys();
//		for (String key : servicesKeys) {
//			IService service = services.getService(key);
//			service.stop();
//		}
	}
}