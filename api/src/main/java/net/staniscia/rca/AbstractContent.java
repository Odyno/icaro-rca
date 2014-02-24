/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca;


import net.staniscia.rca.icons.ApplicationIconsNaming;
import net.staniscia.rca.icons.IconFactory;

import javax.swing.Icon;




/**
 * Contenuti Utilizzabile.
 */
public abstract class AbstractContent extends AbstractExtension implements Content{

    public static final String NO_TITLE = "-NO TITLE-";

    /* (non-Javadoc)
             * @see net.staniscia.rca.Content#getTitle()
             */
    @Override
	public String getTitle() {
        return NO_TITLE;
    }

    /* (non-Javadoc)
	 * @see net.staniscia.rca.Content#getIcon()
	 */
    @Override
	public Icon getIcon() {
        return IconFactory.getInstance().getIcon(ApplicationIconsNaming.CONTEXT,ApplicationIconsNaming.document_new,IconFactory.DIM_16X16);
    }

    /* (non-Javadoc)
	 * @see net.staniscia.rca.Content#getToolTip()
	 */
    @Override
	public String getToolTip() {
        return "No tip";
    }
	/* (non-Javadoc)
	 * @see net.staniscia.rca.View#isOpened()
	 */
	@Override
	public boolean isOpen() {
		return false;
	}
}
