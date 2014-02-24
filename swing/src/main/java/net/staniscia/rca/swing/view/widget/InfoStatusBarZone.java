package net.staniscia.rca.swing.view.widget;

import net.staniscia.rca.status.CommonStatusBarContent;
import net.staniscia.rca.IStatusBarZone;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JComponent;
import javax.swing.JLabel;


public class InfoStatusBarZone implements IStatusBarZone,
		PropertyChangeListener {
	


	private JLabel mycontent;

	public InfoStatusBarZone(CommonStatusBarContent csbc) {
		super();
		this.mycontent = new JLabel("ABX");
		csbc.addPropertyChangeListener(this);
		firstSync(csbc);
	}
	


	public InfoStatusBarZone() {
		this(null);
	}


	public String getId() {
		return "InfoStatusBar" + System.currentTimeMillis();
	}


	public JComponent getComponent() {
		return mycontent;
	}

	
	public String getPreferedSize() {
		return "*";
	}


	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(
				CommonStatusBarContent.SHORT_TIP_UPDATE)) {
			mycontent.setText("" + evt.getNewValue());
		} else if (evt.getPropertyName().equals(
				CommonStatusBarContent.LONG_TIP_UPDATE)) {
			mycontent.setToolTipText("" + evt.getNewValue());
		}
	}
	private void firstSync(CommonStatusBarContent csbc) {
		mycontent.setText("" + csbc.getShortTip());
		mycontent.setToolTipText("" + csbc.getLongTip());
		
		
	}
}
