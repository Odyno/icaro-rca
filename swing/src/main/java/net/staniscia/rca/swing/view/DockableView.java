package net.staniscia.rca.swing.view;

import net.staniscia.rca.View;

import org.noos.xing.mydoggy.ToolWindow;
import org.noos.xing.mydoggy.ToolWindowType;

public class DockableView {
	private View view;
	private ToolWindow ui;

	public DockableView(View view,ToolWindow ui) {
         this.view=view;
         this.ui=ui;
	}
	
	public void revalide(){
		revalideType();
		ui.setActive(view.isOpen());
	}
	
	
	private void revalideType(){
		ToolWindowType type;
		try {
			type = ToolWindowType.valueOf(view.getDefaultType().toString());
		} catch (Exception e) {
			type = ToolWindowType.DOCKED;
		}
		ui.setType(type);
	}
	
	public ToolWindow getUI(){
		return  this.ui;
	}
	
	public View getModel(){
		return this.view;
	}
	
	

}
