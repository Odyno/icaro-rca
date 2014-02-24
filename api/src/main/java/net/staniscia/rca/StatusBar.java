package net.staniscia.rca;

import javax.swing.JComponent;

// TODO: Auto-generated Javadoc
/**
 * The Interface StatusBar.
 */
public interface StatusBar extends Extension{
	

	/**
	 * Componente contenuto nella zona.
	 *
	 * @return the component
	 */
	JComponent getComponent();
	
	
	/**
	 * Dimensione preferita espressa in % rispetto a tutta la barra
	 * oppure in pixel.
	 *
	 * @return the prefered size
	 */
	String getPreferedSize();

}
