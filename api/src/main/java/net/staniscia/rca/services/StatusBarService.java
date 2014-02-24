package net.staniscia.rca.services;

import net.staniscia.rca.StatusBar;
import net.staniscia.rca.status.CommonStatusBarContent;


// TODO: Auto-generated Javadoc
/**
 * The Interface StatusBarService.
 */
public interface StatusBarService {
	
	/**
	 * Adds the.
	 *
	 * @param sbr the statusBar
	 */
	void add(StatusBar statusBar);
	
	/**
	 * Removes the.
	 *
	 * @param sbrId the statusBar id
	 */
	void remove(String statusBarId);
	
	/**
	 * Gets the common zone.
	 *
	 * @return the common zone
	 */
	CommonStatusBarContent getCommonZone();

}
