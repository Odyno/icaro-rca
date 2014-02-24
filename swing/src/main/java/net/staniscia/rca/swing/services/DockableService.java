package net.staniscia.rca.swing.services;

public class DockableService {

	protected DockingContentCtrl dockingContentCTRL;
	protected ActionServiceImp actionService;

	public DockableService() {
		super();
	}

	public void setDockingContentManager(DockingContentCtrl dockingContentManager) {
		if (dockingContentManager != null){
		dockingContentCTRL = dockingContentManager;
		}else {
			throw new IllegalArgumentException(); 
		}
		
	}
	
	public void setActionServiceImp(final ActionServiceImp actionService) {
		if (actionService != null){
			this.actionService = actionService;
			}else {
				throw new IllegalArgumentException(); 
			}
	}

}