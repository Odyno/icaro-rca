package net.staniscia.rca.swing.services;

import net.staniscia.rca.AbstractAction;
import net.staniscia.rca.icons.IconFactory;
import net.staniscia.rca.icons.MissingIcon;
import net.staniscia.rca.services.ActionServices;
import net.staniscia.rca.swing.action.basic.CloseSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.NoSuchElementException;


public class ActionServiceImp implements ActionServices {
	
	private class ActionRes{
		 AbstractAction ar;
		 JMenuItem menu;
		 JButton button;
	}
	
	private HashMap<String, ActionRes> actionRepository=new HashMap<String, ActionRes>();
	private HashMap<String, JMenu> menuRepository = new HashMap<String,JMenu>();
	private final KeyToRcaDispatcher keyDispatcher = new KeyToRcaDispatcher();
	private JMenuBar menuBar;
	private JToolBar toolBar;
	
	private WindowCtrl guiController;

	
	
	public ActionServiceImp() {
		super();
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(this.keyDispatcher);
		initMenuBar();
		initToolBar();
		
	}

	
	

	public AbstractAction getAction(String id) throws NoSuchElementException{
		if (id == null || !actionRepository.containsKey(id) ){
			throw new NoSuchElementException();
		}
		return actionRepository.get(id).ar;
	}
	
    public boolean add(AbstractAction action){
		boolean out=false;
		if (action!= null && !actionRepository.containsKey(action.getId()) ){
			ActionRes res= new ActionRes();
			res.ar=action;
			if (action.getShortcutKey() != null) {
				this.keyDispatcher.addKeyEvent(action.getShortcutKey(), action);
			}
			
			if (action.isBarItem()){
				res.button=addButtonOnToolBar(action);
			}
			if  (action.isMenuItem()){
				res.menu=addMenuItem(action);
			}
			
			actionRepository.put(action.getId(), res);
			out=true;
		}
		return out;
		
	}

	public boolean remove(AbstractAction action){
		if (action== null || !actionRepository.containsKey(action.getId()) ){
			throw new IllegalArgumentException();
		}
		
		ActionRes res = actionRepository.remove(action.getId());
		
		if (res.ar.isBarItem()){
			removeButtonOnToolBar(res);
		}
		if  (res.ar.isMenuItem()){
			removeMenuItem(res);
		}
		
		return true;
	}
	
	
	public JMenuBar getMenuBar(){
		return menuBar;
	}

	public JToolBar getToolBar(){
		return toolBar;
	}

	
	
	private void initMenuBar() {
        menuBar = new JMenuBar();
        
    }
	
	private void initToolBar() {
        toolBar = new JToolBar();
    }
	
	
	private JButton addButtonOnToolBar(AbstractAction action){
		if (action.getValue(AbstractAction.SMALL_ICON)==null){
			action.setIcon(new MissingIcon());
		}
		JButton button=new JButton(action);
		button.setToolTipText(button.getText());
		button.setText("");
        button.setIcon(IconFactory.resizeIcon16x16((ImageIcon) action.getValue(AbstractAction.SMALL_ICON)));
		toolBar.add(button);
		return button;
	}



	private void removeButtonOnToolBar(ActionRes res) {
		toolBar.remove(res.button);
		toolBar.revalidate();

	}
	
	private JMenuItem addMenuItem(AbstractAction action){
		JMenu menu=getMenu(action.getMenuGroup());
		JMenuItem mi = new JMenuItem(action);
        menu.add(mi);
        return mi;
	}
	
	
	private void removeMenuItem(ActionRes res) {
		JMenu menu=getMenu(res.ar.getMenuGroup());
		menu.remove(res.menu);
		menu.revalidate();
	}


	private JMenu getMenu(String menuGroup) {
		JMenu dummy = null;
		if (menuRepository.containsKey(menuGroup)){
			dummy=menuRepository.get(menuGroup);
		}
	
		if (dummy==null){
			dummy=new JMenu(menuGroup);
			menuBar.add(dummy);
			menuRepository.put(menuGroup, dummy);
		}
		return dummy;
	}
	
	private class KeyToRcaDispatcher implements KeyEventDispatcher {

		private HashMap<String, AbstractAction> dispatchTable;
		
		public KeyToRcaDispatcher() {			
			this.dispatchTable = new HashMap<String, AbstractAction>();
		}
		
		public void addKeyEvent(final String keyEvent, final AbstractAction action) {
			this.dispatchTable.put(keyEvent, action);			
		}
		
		public boolean hasNoActions() {
			return this.dispatchTable.isEmpty();
		}
		
		
    	public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
            
    		if (keyEvent.getID() == KeyEvent.KEY_PRESSED) {
    			String shortcut = Character.toString(keyEvent.getKeyChar())
    						.toUpperCase(Locale.getDefault());
    			if (keyEvent.getModifiers() > 0) {
    				shortcut += "+" + KeyEvent.getKeyModifiersText(keyEvent.getModifiers());
    			}
                AbstractAction action = this.dispatchTable.get(shortcut);
    			if (action != null) {
    				System.out.println("Shortcut used: " + shortcut);
    				action.actionPerformed(null);
    			}
            }
            return false;            
        }
    	
    }


	public void setRcaSwing(WindowCtrl guiController) {
        this.guiController=guiController;
        guiController.getUi().addBars(menuBar, toolBar);
        add(new CloseSystem(guiController));
	}

	
}
