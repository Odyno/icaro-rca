package net.staniscia.rca;

import javax.swing.JComponent;

// TODO: Auto-generated Javadoc
/**
 * The Interface IStatusBarZone.
 */
@Deprecated
public interface IStatusBarZone {
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Deprecated
	/**
	 * Identificavio Univoco  della zona dello statusBar
	 * @return
	 */
	String getId();
	
	/**
	 * Gets the component.
	 *
	 * @return the component
	 */
	@Deprecated
	/**
	 * Componente contenuto nella zona
	 * @return
	 */
	JComponent getComponent();
	
	/**
	 * Gets the prefered size.
	 *
	 * @return the prefered size
	 */
	@Deprecated
	/**
	 * Dimensione preferita espressa in % rispetto a tutta la barra 
	 * oppure in pixel
	 * 
	 * @return
	 */
	String getPreferedSize();

}
