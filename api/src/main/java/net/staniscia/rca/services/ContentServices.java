package net.staniscia.rca.services;


import net.staniscia.rca.Content;

import java.util.Collection;


/**
 * The Interface ContentServices.
 */
public interface ContentServices {
	

	/**
	 * Adds the content.
	 *
	 * @param extension the extension
	 */
	void add(final Content extension);
	
	/**
	 * Removes the content id.
	 *
	 * @param extensionId the extension id
	 */
	void remove(final String extensionId);
	

	/**
	 * Adds the contents.
	 *
	 * @param extension the extension
	 */
	void addContents(final Collection<Content> extension) ;

	/**
	 * Removes the contents id.
	 *
	 * @param extensionIds the extension ids
	 */
	void removeContents(final Collection<String> extensionIds) ;

}
