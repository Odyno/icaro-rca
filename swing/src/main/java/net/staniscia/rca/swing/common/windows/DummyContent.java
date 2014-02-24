package net.staniscia.rca.swing.common.windows;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JPanel;

import net.staniscia.rca.Content;
import net.staniscia.rca.icons.MissingIcon;

public class DummyContent extends JPanel implements Content {
	private static final Dimension d = new Dimension(200,200);
	
	public DummyContent(){
		this.setPreferredSize(d);
		this.setSize(d);
	}

	public String getId() {
		return "23980";
	}

	public Component getContentPane() {
		return this;
	}

	public String getTitle() {
		return "Content Panel";
	}

	public Icon getIcon() {
		return new MissingIcon();
	}

	public String getToolTip() {
		return "ContentTooltip";
	}

	public boolean isOpen() {
		return true;
	}

}
