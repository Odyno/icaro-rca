package net.staniscia.rca.services;


// TODO: Auto-generated Javadoc

import net.staniscia.rca.status.CommonStatusBarContent;
import net.staniscia.rca.IStatusBarZone;

/**
 * Gestore della Status Bar.
 *
 * @author c4i
 */
@Deprecated
public interface IStatusBarService {
	
	/**
	 * Adds the estra zone.
	 *
	 * @param sbr the sbr
	 */
	@Deprecated
	/**
	 * Aggiunge la custom zone nella status bar del sistema
	 */
	void addEstraZone(IStatusBarZone sbr);
	
	/**
	 * Gets the common zone.
	 *
	 * @return the common zone
	 */
	@Deprecated
	/**
	 * Ritorna il Bean che pilota il contenuto della status bar.
	 * 
	 * @return
	 */
    CommonStatusBarContent getCommonZone();

}
