package net.staniscia.rca.swing.action.basic;


import net.staniscia.rca.AbstractAction;
import net.staniscia.rca.services.ActionServices;
import net.staniscia.rca.icons.ApplicationIconsNaming;
import net.staniscia.rca.icons.IconFactory;
import net.staniscia.rca.swing.services.WindowCtrl;

import java.awt.event.ActionEvent;


// TODO: Auto-generated Javadoc
/**
 * The Class CloseSystem.
 */
public class CloseSystem extends AbstractAction {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 986098275363410098L;
	
	/** The Constant CLOSE_ACTION. */
	public static final String CLOSE_ACTION = "CLOSE-Action";
	
	/** The rca swing. */
	public WindowCtrl rcaSwing;

	/**
	 * Instantiates a new close system.
	 *
	 * @param rcaSwing the rca swing
	 */
	public CloseSystem(WindowCtrl rcaSwing) {
		super(CLOSE_ACTION);
		if (rcaSwing == null){
			throw new IllegalArgumentException();
		}
        setMenuGroup(ActionServices.FILE_GROUP);
        setBarGroup(ActionServices.FILE_GROUP);
        putValue(NAME, "Exit");
        putValue(LARGE_ICON_KEY, IconFactory.getInstance().getIcon(ApplicationIconsNaming.CONTEXT,ApplicationIconsNaming.application_exit, IconFactory.DIM_16X16));
        putValue(SMALL_ICON, IconFactory.getInstance().getIcon(ApplicationIconsNaming.CONTEXT,ApplicationIconsNaming.application_exit, IconFactory.DIM_16X16));
        this.setShortcutKey('x', true, true);
        this.rcaSwing=rcaSwing;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		rcaSwing.doStop();
        System.exit(0);
	}

}
