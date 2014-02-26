package net.staniscia.rca.swing;

import net.staniscia.rca.services.ContentServices;
import net.staniscia.rca.services.ViewServices;
import net.staniscia.rca.swing.common.windows.DummyContent;
import net.staniscia.rca.swing.common.windows.MemoryView;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RCATest {

    @Test
    public void testShow() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            rca.getViewService().add(new MemoryView());
            rca.shutdownComponents();
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }


    @Test
    public void testGetViewService() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            assertNotNull(rca.getViewService());
            rca.shutdownComponents();
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }

    @Test
    public void testGetContentService() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            assertNotNull(rca.getContentService());
            rca.shutdownComponents();
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }

    @Test
    public void testGetActionService() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            assertNotNull(rca.getActionService());
            rca.shutdownComponents();
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }

    @Test
    public void testGetStatusBarService() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            assertNotNull(rca.getStatusBarService());
            rca.shutdownComponents();
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }


    @Test
    public void testViewMULTIPLEaddEndRemove() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            ViewServices viewM = rca.getViewService();


            for (int i = 0; i < 3; i++) {
                MemoryView dummy = new MemoryView();
                System.out.print("PASSAGGIO i:" + i);
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
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }


    @Test
    public void testContentMULTIPLEaddEndRemove() {
        try {
            RCA rca = new RCA();
            rca.show("Test");
            ContentServices viewM = rca.getContentService();


            for (int i = 0; i < 3; i++) {
                DummyContent dummy = new DummyContent();
                System.out.print("PASSAGGIO i:" + i);
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
        } catch (HeadlessException e) {
            assertTrue("No GUI AVAILABLE", true);
        }
    }

}
