package net.staniscia.rca;

import java.awt.Component;

import javax.swing.Icon;

public interface Content extends Extension{

	/**
	 * ritorna il componente da visualizzare.
	 *
	 * @return the content pane
	 */
	Component getContentPane();

	/**
	 * Nome della finestra.
	 *
	 * @return the title
	 */
	String getTitle();

	/**
	 * Icona del componente da visualizzare.
	 *
	 * @return the icon
	 */
	 Icon getIcon();

	/**
	 * ToolTips del componente.
	 *
	 * @return the tool tip
	 */
	String getToolTip();
	
	/**
	 * Checks if is opened.
	 * 
	 * @return true, if is opened
	 */
	boolean isOpen();

}