/*
 * 
 */
package net.staniscia.rca.swing;

import net.staniscia.rca.services.ActionServices;
import net.staniscia.rca.services.ContentServices;
import net.staniscia.rca.services.StatusBarService;
import net.staniscia.rca.services.ViewServices;



import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

// TODO: Auto-generated Javadoc
/**
 * The Class OSGIActivation.
 */
public final class OSGIActivation implements BundleActivator {

    /**
     * The context.
     */
    private BundleContext context;
    /**
     * The rca.
     */
    private RCA rca;

    /* (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext bundleContext) throws Exception {
        this.context = bundleContext;
        startUP();
    }

    /* (non-Javadoc)
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext bundleContext) throws Exception {
        rca.shutdownComponents();
    }

    /**
     * Gets the context.
     *
     * @return the context
     */
    private BundleContext getContext() {
        return context;
    }

    /**
     * Start up.
     */
    private void startUP() {
        String title = getContext().getProperty("org.osgi.rca.title");
        if (title == null) {
            title = "Rich Client Application";
        }
        rca = new RCA();
        getContext().registerService(ContentServices.class.getName(), rca.getContentService(), null);
        getContext().registerService(ViewServices.class.getName(), rca.getViewService(), null);
        getContext().registerService(ActionServices.class.getName(), rca.getActionService(), null);
        getContext().registerService(StatusBarService.class.getName(), rca.getStatusBarService(), null);
        rca.show(title);
    }
}
