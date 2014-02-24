package net.staniscia.rca.status;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


// TODO: Auto-generated Javadoc
/**
 * Classe che gestisce i campo della status bar del sistema.
 *
 * @author Staniscia
 */
public class CommonStatusBarContent {
	
	/** The Constant LONG_TIP_UPDATE. */
	public static final String LONG_TIP_UPDATE = "LONG_TIP_UPDATE";

	/** The Constant SHORT_TIP_UPDATE. */
	public static final String SHORT_TIP_UPDATE = "SHORT_TIP_UPDATE";

	/** The short tip. */
	private String shortTip;
	
	/** The long tip. */
	private String longTip;
	
	/** The pps. */
	private PropertyChangeSupport pps;
	
	

	/**
	 * Instantiates a new common status bar content.
	 */
	public CommonStatusBarContent() {
		this("TRS spa","TRS - Tecnologie nelle Reti e Nei Sistemi");
		
	}
	
	/**
	 * Instantiates a new common status bar content.
	 *
	 * @param shortTip the short tip
	 * @param longTip the long tip
	 */
	public CommonStatusBarContent(String shortTip, String longTip) {
		super();
		pps=new PropertyChangeSupport(this);
		this.shortTip = shortTip;
		this.longTip = longTip;
	}

	/**
	 * Gets the short tip.
	 *
	 * @return the short tip
	 */
	public final String getShortTip() {
		return shortTip;
	}

	
	/**
	 * Sets the short tip.
	 *
	 * @param shortTip the new short tip
	 */
	public final void setShortTip(String shortTip) {
		pps.firePropertyChange(SHORT_TIP_UPDATE, this.shortTip, shortTip);
		this.shortTip = shortTip;
	}

	/**
	 * Gets the long tip.
	 *
	 * @return the long tip
	 */
	public final String getLongTip() {
		return longTip;
	}

	/**
	 * Sets the long tip.
	 *
	 * @param longTip the new long tip
	 */
	public final void setLongTip(String longTip) {
		pps.firePropertyChange(LONG_TIP_UPDATE, this.longTip, longTip);
		this.longTip = longTip;
	}

	/**
	 * Adds the property change listener.
	 *
	 * @param listener the listener
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		pps.addPropertyChangeListener(listener);
	}

	/**
	 * Removes the property change listener.
	 *
	 * @param listener the listener
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		pps.removePropertyChangeListener(listener);
	}
}
