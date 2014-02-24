package net.staniscia.rca.swing.view.widget;

import net.staniscia.rca.IStatusBarZone;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;


public class LogoStatusBarZone implements IStatusBarZone {


	public String getId() {
   	   return "LOGO-TRS-2397954-"+this.toString();
	}


	public JComponent getComponent() {
		JLabel mylbl=new JLabel();
		mylbl.setBorder(BorderFactory.createLoweredBevelBorder());
		Image img = null;
		try {
			URL url = LogoStatusBarZone.class.getResource("/it/staniscia/commons/rca/services/icons/logo/logotrs.gif");
   		   img = ImageIO.read(url);
   		   Image myImg = img.getScaledInstance(18,18,java.awt.Image.SCALE_SMOOTH );
   		   mylbl.setIcon(new ImageIcon(myImg));
		} catch (IOException e) { e.printStackTrace();}
		return mylbl;
	}


	public String getPreferedSize() {
		return "48";
	}


}
