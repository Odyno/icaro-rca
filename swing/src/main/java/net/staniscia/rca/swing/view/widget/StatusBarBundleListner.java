package net.staniscia.rca.swing.view.widget;

import net.staniscia.rca.IStatusBarZone;

import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JLabel;

import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;




public class StatusBarBundleListner implements IStatusBarZone,BundleListener {
	private JLabel ui=new JLabel();

	public String getId() {
		return "Statusbar.listner"+System.currentTimeMillis();
	}

	public JComponent getComponent() {
		return ui;
	}

	public String getPreferedSize() {
		return "*";
	}

	public void bundleChanged(BundleEvent event) {

		ui.setText(""+(new Date()).toString()+" Bundle event");

		
	}

}
