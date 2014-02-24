package net.staniscia.rca.swing.action.basic;


import net.staniscia.rca.AbstractAction;
import net.staniscia.rca.icons.IconFactory;
import net.staniscia.rca.services.ActionServices;
import net.staniscia.rca.swing.view.DockableView;

import java.awt.event.ActionEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class ShowViewAction.
 */
public class ShowViewAction extends AbstractAction {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2974695564476408516L;
	
	/** The tw. */
	private DockableView tw;
	
	/**
	 * Instantiates a new show view action.
	 *
	 * @param group the group
	 * @param tw the tw
	 */
	public ShowViewAction(String group, DockableView tw) {
		super(tw.getModel().getId(),tw.getUI().getTitle());
		this.tw=tw;

		setIcon(tw.getModel().getIcon());
        setMenuGroup(group);
        setBarGroup(group);
  	    putValue(LARGE_ICON_KEY,IconFactory.resizeIcon16x16(tw.getModel().getIcon()));
	    putValue(SMALL_ICON,IconFactory.resizeIcon16x16(tw.getModel().getIcon()));

	}
	
	/**
	 * Instantiates a new show view action.
	 *
	 * @param tw the tw
	 */
	public ShowViewAction( DockableView tw) {
		this(ActionServices.WINDOW_GROUP, tw);
	}


	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e) {
		if (tw.getUI().isActive()){
			tw.getUI().setFlashing(1000);
		}else{
			tw.getUI().setActive(true);
		}
	}

}
