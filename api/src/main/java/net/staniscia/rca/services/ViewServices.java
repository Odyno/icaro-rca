package net.staniscia.rca.services;

import net.staniscia.rca.View;

import java.util.Collection;

/**
 * Aggiunge view al sistema.
 */
public interface ViewServices {

	/**
	 * Adds the rca views.
	 *
	 * @param viewExtensionPoint the view extension point
	 */
	 void addViews(final Collection<View> view);

	/**
	 * Adds the rca view.
	 *
	 * @param view the view
	 */
	 void add(final View view);

	/**
	 * Remove rca views.
	 *
	 * @param viewExtensionPointId the view extension point id
	 */
	 void removeViews(final Collection<String> viewId);

	/**
	 * Remove rca view.
	 *
	 * @param viewId the view id
	 */
	 void remove(final String viewId);

}
