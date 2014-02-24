package net.staniscia.rca.swing.view;

import net.staniscia.rca.swing.view.widget.StatusBarPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class WindowUI extends JFrame {


	//private JMenuBar menuBar;


	/**
	 * 
	 */
	private static final long serialVersionUID = -8474019862854025706L;

	public WindowUI() {
		initStandatdGui();
	}


	private void initStandatdGui() {
		getContentPane().setLayout(new BorderLayout());
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenDimension = toolkit.getScreenSize();
		Dimension dimension = new Dimension(
				(int) (screenDimension.width * 0.8),
				(int) (screenDimension.height * 0.8));
		setSize(dimension);
		setPreferredSize(dimension);
		setResizable(true);
		setBackground(Color.blue);

	}
	


	public void addBars(JMenuBar jmb, JToolBar jtb) {
		if (jmb != null){
		this.setJMenuBar(jmb);
		}
		if (jtb != null){
		this.add(jtb, BorderLayout.PAGE_START);
		}
		
	}
	
	public void addStatusBar(StatusBarPanel sbc){
		if (sbc != null){
		this.getContentPane().add(sbc, BorderLayout.PAGE_END);
		}
	}

	public static JFrame start(final String appName, final JFrame frame) {
        try {
        	
            frame.setTitle(appName);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            java.awt.EventQueue.invokeLater(new Runnable() {

                public void run() {
                    frame.setVisible(true);
                }
            });
            
            return frame;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	
	

}
