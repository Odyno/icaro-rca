package net.staniscia.rca.swing;

import static org.junit.Assert.*;

import net.staniscia.rca.services.ContentServices;
import net.staniscia.rca.services.ViewServices;
import net.staniscia.rca.swing.common.windows.DummyContent;
import net.staniscia.rca.swing.common.windows.MemoryView;

import org.junit.Test;

public class RCATest {

	@Test
	public void testShow() {
		RCA rca= new RCA();
		rca.show("Test");
		rca.getViewService().add(new MemoryView());
		rca.shutdownComponents();
	}


	@Test
	public void testGetViewService() {
		RCA rca= new RCA();
		rca.show("Test");
		assertNotNull(rca.getViewService());
		rca.shutdownComponents();
	}

	@Test
	public void testGetContentService() {
		RCA rca= new RCA();
		rca.show("Test");
		assertNotNull(rca.getContentService());
		rca.shutdownComponents();
	}

	@Test
	public void testGetActionService() {
		RCA rca= new RCA();
		rca.show("Test");
		assertNotNull(rca.getActionService());
		rca.shutdownComponents();
	}

	@Test
	public void testGetStatusBarService() {
		RCA rca= new RCA();
		rca.show("Test");
		assertNotNull(rca.getStatusBarService());
		rca.shutdownComponents();
	}
	

	@Test
	public void testViewMULTIPLEaddEndRemove() {
		RCA rca= new RCA();
		rca.show("Test");
		ViewServices viewM = rca.getViewService();
		
		
		
		for (int i=0; i< 3; i++){
			MemoryView dummy=new MemoryView();
			System.out.print("PASSAGGIO i:"+i);
			viewM.add(dummy);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			viewM.remove(dummy.getId());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		rca.shutdownComponents();
	}
	
	

	@Test
	public void testContentMULTIPLEaddEndRemove() {
		RCA rca= new RCA();
		rca.show("Test");
		ContentServices viewM = rca.getContentService();
		
		
		
		for (int i=0; i< 3; i++){
			DummyContent dummy=new DummyContent();
			System.out.print("PASSAGGIO i:"+i);
			viewM.add(dummy);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			viewM.remove(dummy.getId());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		rca.shutdownComponents();
	}

}
