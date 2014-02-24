package net.staniscia.rca.swing.services;

import net.staniscia.rca.StatusBar;
import net.staniscia.rca.services.StatusBarService;
import net.staniscia.rca.status.CommonStatusBarContent;
import net.staniscia.rca.swing.view.widget.StatusBarPanel;

public class StatusBarServiceImp implements StatusBarService {
	private StatusBarPanel sbc;
	private WindowCtrl guicontroller;

	public void add(StatusBar statusBar) {
	}

	public void remove(String statusBarId) {
	}

	public CommonStatusBarContent getCommonZone() {
		return null;
	}

	public void setRcaSwing(WindowCtrl guiController) {
         this.guicontroller=guiController;
         guiController.getUi().addStatusBar(sbc);
		
	}

}
