package net.staniscia.rca.swing.services;

//Use static imports to 
//have direct access to these methods
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import net.staniscia.rca.AbstractAction;
import net.staniscia.rca.swing.view.WindowUI;

import org.junit.Before;
import org.junit.Test;


public class ActionServiceImpTest {
	
	 
	private ActionServiceImp classToTest;

	@Before	public void setUp() throws Exception {
		classToTest=new ActionServiceImp();
		
		WindowCtrl guiController=mock(WindowCtrl.class);
		when(guiController.getUi()).thenReturn(mock(WindowUI.class));
		
		classToTest.setRcaSwing(guiController);
	}

	@Test public void testAdd() {
		AbstractAction action= mock(AbstractAction.class);
		classToTest.add(action);
		classToTest.remove(action);
	}

	@Test public void testGetMenuBar() {
		assertNotNull(classToTest.getMenuBar());
	}

	@Test public void testGetToolBar() {
		assertNotNull(classToTest.getToolBar());
	}

}
