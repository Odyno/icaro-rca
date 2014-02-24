package net.staniscia.rca.swing.common.windows;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JPanel;

import net.staniscia.rca.View;
import net.staniscia.rca.icons.MissingIcon;

public class MemoryView extends JPanel implements View {

	public Component getContentPane() {
		return this;
	}

	public String getTitle() {
		return "Memory Of System";
	}

	public Icon getIcon() {
  	   return new MissingIcon();
	}

	public String getToolTip() {
		return "this is a tooltips";
	}

	public boolean isOpen() {
		return true;
	}

	public String getId() {
		return "23979";
	}

	public VIEW_ANCHOR getDefaultPosition() {
		return VIEW_ANCHOR.BOTTOM;
	}

	public VIEW_TYPE getDefaultType() {
		return VIEW_TYPE.DOCKED;
	}

}
