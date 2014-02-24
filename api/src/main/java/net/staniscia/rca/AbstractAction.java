package net.staniscia.rca;

import net.staniscia.rca.icons.IconFactory;
import net.staniscia.rca.icons.MissingIcon;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Locale;

import javax.swing.Icon;

// TODO: Auto-generated Javadoc
/**
 * The Class Action.
 */
public abstract class AbstractAction extends javax.swing.AbstractAction implements Extension{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8956982764873950568L;

	/** The Constant DEFAULT_LABEL_GROUP. */
	protected static final String DEFAULT_LABEL_GROUP = "Extra";

	/** The menu item. */
	private boolean menuItem;

	/** The bar item. */
	private boolean barItem;

	/** The menu group. */
	private String menuGroup;

	/** The bar group. */
	private String barGroup;

	/** The id. */
	private String id;

	/** The shortcut key. */
	private String shortcutKey;
	
	/** original Immage **/
	private Image imageIcon;

	/**
	 * Instantiates a new action.
	 * 
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param icon
	 *            the icon
	 * @param menuGroup
	 *            the menu group
	 * @param barGroup
	 *            the bar group
	 */
	public AbstractAction(String id, String name, Icon icon, String menuGroup,
                          String barGroup) {
		super();
		this.id = id;
		this.menuItem = true;
		this.barItem = true;
		this.menuGroup = menuGroup;
		this.barGroup = barGroup;
		putValue(NAME, name);
		putValue(SMALL_ICON, icon);
	}

	/**
	 * Instantiates a new action.
	 * 
	 * @param uniqueId
	 *            the unique id
	 */
	public AbstractAction(String uniqueId) {
		this(uniqueId, "None", null, DEFAULT_LABEL_GROUP, DEFAULT_LABEL_GROUP);
	}

	/**
	 * Instantiates a new action.
	 * 
	 * @param uniqueId
	 *            the unique id
	 * @param name
	 *            the name
	 */
	public AbstractAction(String uniqueId, String name) {
		this(uniqueId, name, null, DEFAULT_LABEL_GROUP, DEFAULT_LABEL_GROUP);
	}



    /**
	 * Sets the shortcut key.
	 * 
	 * @param keyChar
	 *            the key char
	 * @param altPressedprivate Image iconToImage(Icon icon)
{
    if(icon instanceof ImageIcon)
    {
        return ((ImageIcon) icon).getImage();
    }
    else
    {
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        icon.paintIcon(null, image.getGraphics(), 0, 0);
        return image;
    }
}
	 *            the alt pressed
	 * @param shiftPressed
	 *            the shift pressed
	 */
	public void setShortcutKey(char keyChar, boolean altPressed,
			boolean shiftPressed) {

		this.shortcutKey = Character.toString(keyChar).toUpperCase(
				Locale.getDefault());
		if (altPressed) {
			this.shortcutKey += "+" + Toolkit.getProperty("AWT.alt", "Alt");
		}
		if (shiftPressed) {
			this.shortcutKey += "+" + Toolkit.getProperty("AWT.shift", "Shift");
		}
		this.setName(this.getValue(NAME) + " [" + this.shortcutKey + "]");

	}

	/**
	 * Checks if is menu item.
	 * 
	 * @return true, if is menu item
	 */
	public final boolean isMenuItem() {
		return menuItem;
	}

	/**
	 * Sets the menu item.
	 * 
	 * @param menuItem
	 *            the new menu item
	 */
	public final void setMenuItem(boolean menuItem) {
		this.menuItem = menuItem;
	}

	/**
	 * Checks if is bar item.
	 * 
	 * @return true, if is bar item
	 */
	public final boolean isBarItem() {
		return barItem;
	}

	/**
	 * Sets the bar item.
	 * 
	 * @param barItem
	 *            the new bar item
	 */
	public final void setBarItem(boolean barItem) {
		this.barItem = barItem;
	}

	/**
	 * Gets the menu group.
	 * 
	 * @return the menu group
	 */
	public final String getMenuGroup() {
		return menuGroup;
	}

	/**
	 * Sets the menu group.
	 * 
	 * @param menuGroup
	 *            the new menu groupthis.setIcon(icon);
	 */
	public final void setMenuGroup(String menuGroup) {
		this.menuGroup = menuGroup;
	}

	/**
	 * Gets the bar group.
	 * 
	 * @return the bar group
	 */
	public final String getBarGroup() {
		return barGroup;
	}

	/**
	 * Sets the bar group.
	 * 
	 * @param barGroup
	 *            the new bar group
	 */
	public final void setBarGroup(String barGroup) {
		this.barGroup = barGroup;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	@Override
	public final String getId() {
		return id;
	}

	/**
	 * Sets the icon.
	 * 
	 * @param icon
	 *            the new icon
	 */
	public void setIcon(Icon icon) {
		if (icon == null){
			icon=new MissingIcon();
		}
		imageIcon=IconFactory.iconToImage(icon);
		putValue(SMALL_ICON, IconFactory.resizeIcon16x16(imageIcon));
		putValue(LARGE_ICON_KEY, IconFactory.resizeIcon32x32(imageIcon));
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		putValue(NAME, name);
	}

	/**
	 * Gets the shortcut key.
	 * 
	 * @return the shortcut key
	 */
	public String getShortcutKey() {
		return this.shortcutKey;
	}
	


}
