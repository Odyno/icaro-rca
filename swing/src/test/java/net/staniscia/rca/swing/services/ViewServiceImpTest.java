package net.staniscia.rca.swing.services;

import static org.mockito.Mockito.*;


import java.util.ArrayList;
import java.util.Collection;

import net.staniscia.rca.AbstractAction;
import net.staniscia.rca.View;
import net.staniscia.rca.icons.MissingIcon;
import net.staniscia.rca.swing.view.DockableView;

import org.junit.Before;
import org.junit.Test;
import org.noos.xing.mydoggy.ToolWindow;

public class ViewServiceImpTest {
	
	private ViewServiceImp classToTest;

	@Before	public void setUp() throws Exception {
        classToTest=new ViewServiceImp();
        
		DockingContentCtrl dockingContentManager = mock(DockingContentCtrl.class);
		
		DockableView doc=mock(DockableView.class);
		ToolWindow tw=mock(ToolWindow.class);
		View v= mock(View.class);
		
		when(tw.getId()).thenReturn("1234");
		when(v.getId()).thenReturn("1234");
		when(v.getIcon()).thenReturn(new MissingIcon());
		
		when(doc.getUI()).thenReturn(tw);
		when(doc.getModel()).thenReturn(v);
		
		when(dockingContentManager.registerView(any(View.class))).thenReturn(doc);
		when(dockingContentManager.getDockableView(anyString())).thenReturn(doc);
		
		classToTest.setDockingContentManager(dockingContentManager );
		ActionServiceImp actionService = mock(ActionServiceImp.class);
		when(actionService.getAction(anyString())).thenReturn(mock(AbstractAction.class));
		
		classToTest.setActionServiceImp(actionService);
	}

	@Test
	public void testAddContents() {
		View content = mock(View.class);
		when(content.getId()).thenReturn("1");
		View content1 = mock(View.class);
		when(content1.getId()).thenReturn("2");
		View content2 = mock(View.class);
		when(content2.getId()).thenReturn("3");
		
		Collection<View> extension= new ArrayList<View>();
		extension.add(content);
		extension.add(content1);
		extension.add(content2);
		classToTest.addViews(extension);
		
		
		Collection<String> extensionIds= new ArrayList<String>();
		extensionIds.add("1");
		extensionIds.add("2");
		extensionIds.add("3");
		classToTest.removeViews(extensionIds);
		
	}

	@Test
	public void testAddRemoveOK() {
		View content = mock(View.class);
		when(content.getId()).thenReturn("123");
		classToTest.add(content );
		classToTest.remove("123");
	}
	
	@Test
	public void testAddRemoveKO() {
		classToTest.remove("123");
	}

	@Test(expected=IllegalArgumentException.class) public void testSetDockingContentManager() {
		classToTest.setDockingContentManager(null);
	}

}
