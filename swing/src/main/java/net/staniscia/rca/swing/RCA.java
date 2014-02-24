/*
 * 
 */
package net.staniscia.rca.swing;

import net.staniscia.rca.services.ActionServices;
import net.staniscia.rca.services.ContentServices;
import net.staniscia.rca.services.StatusBarService;
import net.staniscia.rca.services.ViewServices;
import net.staniscia.rca.swing.common.windows.DummyContent;
import net.staniscia.rca.swing.common.windows.MemoryView;
import net.staniscia.rca.swing.services.ActionServiceImp;
import net.staniscia.rca.swing.services.ContentServiceImp;
import net.staniscia.rca.swing.services.StatusBarServiceImp;
import net.staniscia.rca.swing.services.ViewServiceImp;
import net.staniscia.rca.swing.services.WindowCtrl;
import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class RCA.
 */
public final class RCA {

    /**
     * The Constant log.
     */
    private static final Logger log = Logger.getLogger(RCA.class.getName());
    /**
     * The gui controller.
     */
    private WindowCtrl guiController;
    /**
     * The view service.
     */
    private ViewServiceImp viewService;
    /**
     * The content service.
     */
    private ContentServiceImp contentService;
    /**
     * The action service.
     */
    private ActionServiceImp actionService;
    /**
     * The status bar service.
     */
    private StatusBarServiceImp statusBarService;

    /**
     * Instantiates a new rca.
     */
    public RCA() {
        contentService = new ContentServiceImp();
        viewService = new ViewServiceImp();
        actionService = new ActionServiceImp();
        statusBarService = new StatusBarServiceImp();
        guiController = new WindowCtrl();
        contentService.setDockingContentManager(guiController.getDockingContentManager());
        contentService.setActionServiceImp(actionService);
        viewService.setDockingContentManager(guiController.getDockingContentManager());
        viewService.setActionServiceImp(actionService);
        actionService.setRcaSwing(guiController);
        statusBarService.setRcaSwing(guiController);
    }

    /**
     * Show.
     *
     * @param title the title
     */
    public void show(String title) {
        guiController.doShow(title);
    }

    /**
     * Shutdown components.
     */
    public void shutdownComponents() {
        guiController.doStop();
    }

    /**
     * Gets the view service.
     *
     * @return the view service
     */
    public ViewServices getViewService() {
        return viewService;
    }

    /**
     * Gets the content service.
     *
     * @return the content service
     */
    public ContentServices getContentService() {
        return contentService;
    }

    /**
     * Gets the action service.
     *
     * @return the action service
     */
    public ActionServices getActionService() {
        return actionService;
    }

    /**
     * Gets the status bar service.
     *
     * @return the status bar service
     */
    public StatusBarService getStatusBarService() {
        return statusBarService;
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        RCA rca = new RCA();
        rca.show("Test");
        rca.getViewService().add(new MemoryView());
        rca.getContentService().add(new DummyContent());
    }
}
