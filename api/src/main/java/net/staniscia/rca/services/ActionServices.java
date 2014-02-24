package net.staniscia.rca.services;

// TODO: Auto-generated Javadoc

import net.staniscia.rca.AbstractAction;

/**
 * The Interface ActionServices.
 */
public interface ActionServices {

	/** The Constant FILE_GROUP. */
	String FILE_GROUP = "File";

	/** The Constant EDIT_GROUP. */
	String EDIT_GROUP = "Edit";

	/** The Constant WINDOW_GROUP. */
	String WINDOW_GROUP = "Window";

	/** The Constant HELP_GROUP. */
	String HELP_GROUP = "Help";

	/**
	 * Adds the.
	 *
	 * @param action the action
	 * @return true, if successful
	 */
	boolean add(AbstractAction action);

	/**
	 * Removes the.
	 * 
	 * @param action
	 *            the action
	 * @return true, if successful
	 */
	boolean remove(AbstractAction action);

}