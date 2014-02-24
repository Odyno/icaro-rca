/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.swing.services;



import net.staniscia.rca.swing.view.WindowUI;

import java.awt.BorderLayout;
import java.util.logging.Logger;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe Controllore della parte HMI del plugin
 */
public class WindowCtrl{


	private static final long serialVersionUID = 7617773384716702859L;
	private static final Logger log = Logger.getLogger(WindowCtrl.class.getName());
    private  DockingContentCtrl dockingContentManager;
	private WindowUI ui = new WindowUI();

    public WindowCtrl() {
		super();
		ui= new WindowUI();
		dockingContentManager=new DockingContentCtrl();
		ui.getContentPane().add(dockingContentManager.getContentPanel(), BorderLayout.CENTER);
	}


	/**
     * Mostra la maschera
     */
    public void doShow(final String title) {
    	
    	try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
    	WindowUI.start(title, ui);
    }

    /**
     * Ferma tutto
     */
    public void doStop() {
    	ui.dispose();
    }


	public DockingContentCtrl getDockingContentManager() {
		return dockingContentManager;
	}


	public WindowUI getUi() {
		return ui;
	}
	
	
}
