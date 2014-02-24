/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.staniscia.rca.icons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Icon objects.
 */
public class IconFactory {

	/** The Constant DIM_16X16. */
	public static final int DIM_16X16 = 0;

	/** The Constant DIM_32X32. */
	public static final int DIM_32X32 = 1;

	/** The Constant DIM_48X48. */
	public static final int DIM_48X48 = 2;

	/** The defaultpath. */
	private URL defaultpath = IconFactory.class.getClassLoader().getResource(System.getProperty("icon.theme.basedir","themes/icons")+"/48x48");

	/** The default extension. */
	private String defaultExtension = "png";

	/**
	 * Gets the defaultpath.
	 * 
	 * @return the defaultpath
	 */
	public final URL getDefaultpath() {
		if (defaultpath == null ) {
			defaultpath = IconFactory.class.getResource("themes/icons/48x48");
		}

		return defaultpath;
	}

	/**
	 * Sets the defaultpath.
	 * 
	 * @param defaultpath
	 *            the new defaultpath
	 */
	public final void setDefaultpath(URL defaultpath) {
		this.defaultpath = defaultpath;
	}

	/**
	 * Gets the default extension.
	 * 
	 * @return the default extension
	 */
	public final String getDefaultExtension() {
		return defaultExtension;
	}

	/**
	 * Sets the default extension.
	 * 
	 * @param defaultExtension
	 *            the new default extension
	 */
	public final void setDefaultExtension(String defaultExtension) {
		this.defaultExtension = defaultExtension;
	}

	/**
	 * The Class Contenitore.
	 */
	private static class Contenitore {

		/** The Constant ISTANZA. */
		private final static IconFactory ISTANZA = new IconFactory();

	}

	/**
	 * Gets the single instance of IconFactory.
	 * 
	 * @return single instance of IconFactory
	 */
	public static IconFactory getInstance() {
		return Contenitore.ISTANZA;
	}

	/**
	 * Gets the icon by url.
	 * 
	 * @param newUrl
	 *            the new url
	 * @param dimension
	 *            the dimension
	 * @return the icon by url
	 */
	public static Icon getIconByUrl(URL newUrl, int dimension) {
		BufferedImage img = null;
		try {

			img = ImageIO.read(newUrl);
		} catch (Exception e) {
            Logger.getLogger(IconFactory.class.getName()).log(Level.SEVERE,"NO IMAGE FOUND!",e);
        }

		if (img == null) {
			img = (new MissingIcon()).getBufferedImage();
		}

		ImageIcon iconOut;
		switch (dimension) {
		case 0:
			if (img.getWidth() != 16) {
				iconOut = new ImageIcon(img.getScaledInstance(16, 16,
						Image.SCALE_SMOOTH));
			} else {
				iconOut = new ImageIcon(img);
			}
			break;
		case 1:
			if (img.getWidth() != 32) {
				iconOut = new ImageIcon(img.getScaledInstance(32, 32,
						Image.SCALE_SMOOTH));
			} else {
				iconOut = new ImageIcon(img);
			}
			break;
		default:
			if (img.getWidth() != 48) {
				iconOut = new ImageIcon(img.getScaledInstance(48, 48,
						Image.SCALE_SMOOTH));
			} else {
				iconOut = new ImageIcon(img);
			}
			break;
		}

		return iconOut;
	}

	/**
	 * Gets the icon.
	 * 
	 * @param category
	 *            the category
	 * @param id
	 *            the id
	 * @param dimension
	 *            the dimension
	 * @return the icon
	 */
	public Icon getIcon(String category, String id, int dimension) {
		return getIcon(category, id, dimension, false);
	}

	/**
	 * Gets the icon.
	 * 
	 * @param category
	 *            the category
	 * @param id
	 *            the id
	 * @param dimension
	 *            the dimension
	 * @param force
	 *            the force
	 * @return the icon
	 */
	public Icon getIcon(String category, String id, int dimension, boolean force) {
		Icon iconOut = null;
		BufferedImage img = null;
		String newurl = getDefaultpath().toString() + "/" + category + "/" + id
				+ "." + defaultExtension;
		try {
			URL newUrl = new URL(newurl);
			img = ImageIO.read(newUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (img == null) {
			if (force) {
				img = (new MissingIcon()).getBufferedImage();
			} else {
				return null;
			}
		}

		switch (dimension) {
		case 0:
			if (img.getWidth() != 16) {
				iconOut = new ImageIcon(img.getScaledInstance(16, 16,
						Image.SCALE_SMOOTH));
			} else {
				iconOut = new ImageIcon(img);
			}
			break;
		case 1:
			if (img.getWidth() != 32) {
				iconOut = new ImageIcon(img.getScaledInstance(32, 32,
						Image.SCALE_SMOOTH));
			} else {
				iconOut = new ImageIcon(img);
			}
			break;
		default:
			if (img.getWidth() != 48) {
				iconOut = new ImageIcon(img.getScaledInstance(48, 48,
						Image.SCALE_SMOOTH));
			} else {
				iconOut = new ImageIcon(img);
			}
			break;
		}

		return iconOut;
	}

	public static Icon resizeIcon16x16(Icon i, int x, int y) {
		return resizeIcon16x16(iconToImage(i),x,y);
	}
	public static Icon resizeIcon16x16(Image img, int x, int y) {
		Image a = img.getScaledInstance(x, y, Image.SCALE_SMOOTH);
		return new ImageIcon(a);
	}

	public static Icon resizeIcon16x16(Icon i) {
		return resizeIcon16x16(i, 16, 16);
	}

	public static Icon resizeIcon32x32(Icon i) {
		return resizeIcon16x16(i, 32, 32);
	}

	public static Icon resizeIcon48x48(Icon i) {
		return resizeIcon16x16(i, 48, 48);
	}

	public static Icon resizeIcon64x64(Icon i) {
		return resizeIcon16x16(i, 64, 64);
	}
	
	public static Icon resizeIcon16x16(Image i) {
		return resizeIcon16x16(i, 16, 16);
	}

	public static Icon resizeIcon32x32(Image i) {
		return resizeIcon16x16(i, 32, 32);
	}

	public static Icon resizeIcon48x48(Image i) {
		return resizeIcon16x16(i, 48, 48);
	}

	public static Icon resizeIcon64x64(Image i) {
		return resizeIcon16x16(i, 64, 64);
	}

	public static Image iconToImage(Icon icon) {
		if (icon instanceof ImageIcon) {
			return ((ImageIcon) icon).getImage();
		} else {
			BufferedImage image = new BufferedImage(icon.getIconWidth(),
					icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
			icon.paintIcon(null, image.getGraphics(), 0, 0);
			return image;
		}
	}

}
