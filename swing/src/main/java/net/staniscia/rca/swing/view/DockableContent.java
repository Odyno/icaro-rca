package net.staniscia.rca.swing.view;

import net.staniscia.rca.Content;

public class DockableContent {
	
	private Content content;
	private org.noos.xing.mydoggy.Content ui;
	
	public DockableContent(Content content, org.noos.xing.mydoggy.Content ui) {
		super();
		this.content = content;
		this.ui = ui;
	}

	public org.noos.xing.mydoggy.Content getUI() {
		return ui;
	}
	
	public Content getModel(){
		return this.content;
	}
	

}
