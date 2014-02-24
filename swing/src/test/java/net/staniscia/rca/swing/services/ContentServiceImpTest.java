package net.staniscia.rca.swing.services;

import net.staniscia.rca.Content;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ContentServiceImpTest {
	
	private ContentServiceImp classToTest;

	@Before	public void setUp() throws Exception {
        classToTest=new ContentServiceImp();
		DockingContentCtrl dockingContentManager = mock(DockingContentCtrl.class);
        //when(dockingContentManager.registerContent(any(Content.class))).thenReturn(mock(DockableContent.class));
		classToTest.setDockingContentManager(dockingContentManager );
		ActionServiceImp actionService = mock(ActionServiceImp.class);
		classToTest.setActionServiceImp(actionService);

	}

	@Test
	public void testAddContents() {
		Content content = mock(Content.class);
		when(content.getId()).thenReturn("1");
		Content content1 = mock(Content.class);
		when(content.getId()).thenReturn("2");
		Content content2 = mock(Content.class);
		when(content.getId()).thenReturn("3");
		
		Collection<Content> extension= new ArrayList<Content>();
		extension.add(content);
		extension.add(content1);
		extension.add(content2);
		classToTest.addContents(extension);
		
		
		Collection<String> extensionIds= new ArrayList<String>();
		extensionIds.add("1");
		extensionIds.add("2");
		extensionIds.add("3");
		classToTest.removeContents(extensionIds);
		
	}

	

	@Test
	public void testAddRemoveOK() {
		Content content = mock(Content.class);
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
