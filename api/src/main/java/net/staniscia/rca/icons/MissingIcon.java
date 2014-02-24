package net.staniscia.rca.icons;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

// TODO: Auto-generated Javadoc
/**
 * The Class MissingIcon.
 */
public class MissingIcon implements Icon {

	
	private static final int DEFAULT_HEIGHT = 32;

	public static final int DEFAULT_WIDTH = 32;

	/** The width. */
	private int width = DEFAULT_WIDTH;
	
	/** The height. */
	private int height = DEFAULT_HEIGHT;

	/** The stroke. */
	private BasicStroke stroke = new BasicStroke(4);
	
	/**
	 * Instantiates a new missing icon.
	 */
	public MissingIcon() {
		this(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}

	/**
	 * Instantiates a new missing icon.
	 *
	 * @param width the width
	 * @param height the height
	 */
	public MissingIcon(final int width,final  int height) {
		super();
		this.width = width;
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics, int, int)
	 */
	@Override
	public void paintIcon(final Component ccomponent, final Graphics grapth, final int xPosition, final int yPosition) {
		final Graphics2D g2d = (Graphics2D) grapth.create();

		g2d.setColor(Color.WHITE);
		g2d.fillRect(xPosition + 1, yPosition + 1, width - 2, height - 2);

		g2d.setColor(Color.BLACK);
		g2d.drawRect(xPosition + 1, yPosition + 1, width - 2, height - 2);

		g2d.setColor(Color.RED);

		g2d.setStroke(stroke);
		g2d.drawLine(xPosition + 10, yPosition + 10, xPosition + width - 10, yPosition + height - 10);
		g2d.drawLine(xPosition + 10, yPosition + height - 10, xPosition + width - 10, yPosition + 10);

		g2d.dispose();
	}

	/* (non-Javadoc)
	 * @see javax.swing.Icon#getIconWidth()
	 */
	@Override
	public int getIconWidth() {
		return width;
	}

	/* (non-Javadoc)
	 * @see javax.swing.Icon#getIconHeight()
	 */
	@Override
	public int getIconHeight() {
		return height;
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public Image getImage() {
		final GraphicsEnvironment graphEnv = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		final GraphicsDevice gd = graphEnv.getDefaultScreenDevice();
		final GraphicsConfiguration gc = gd.getDefaultConfiguration();
		final BufferedImage image = gc.createCompatibleImage(width, height);
		final Graphics2D g = image.createGraphics();
		paintIcon(null, g, 0, 0);
		g.dispose();
		return image;
	}
	
	/**
	 * Gets the buffered image.
	 *
	 * @return the buffered image
	 */
	public BufferedImage getBufferedImage() {
	    Image image=getImage();
	    // This code ensures that all the pixels in the image are loaded
	    image = new ImageIcon(image).getImage();

	    // Determine if the image has transparent pixels; for this method's
	    // implementation, see Determining If an Image Has Transparent Pixels
	    final  boolean hasAlpha = false;

	    // Create a buffered image with a format that's compatible with the screen
	    BufferedImage bimage = null;
	    final  GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    try {
	        // Determine the type of transparency of the new buffered image
	        int transparency = Transparency.OPAQUE;
	        if (hasAlpha) {
	            transparency = Transparency.BITMASK;
	        }

	        // Create the buffered image
	        final GraphicsDevice gs = ge.getDefaultScreenDevice();
	        final  GraphicsConfiguration gc = gs.getDefaultConfiguration();
	        bimage = gc.createCompatibleImage(
	            image.getWidth(null), image.getHeight(null), transparency);
	    } catch (HeadlessException e) {
	        // The system does not have a screen
	    }

	    if (bimage == null) {
	        // Create a buffered image using the default color model
	        int type = BufferedImage.TYPE_INT_RGB;
	        if (hasAlpha) {
	            type = BufferedImage.TYPE_INT_ARGB;
	        }
	        bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
	    }

	    // Copy image to buffered image
	    final Graphics g = bimage.createGraphics();

	    // Paint the image onto the buffered image
	    g.drawImage(image, 0, 0, null);
	    g.dispose();

	    return bimage;
	}
}