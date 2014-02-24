/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.staniscia.rca.example;

import net.staniscia.rca.example.component.CalcContent;
import net.staniscia.rca.example.component.ChatView;
import net.staniscia.rca.example.component.AboutActions;
import net.staniscia.rca.services.ActionServices;
import net.staniscia.rca.services.ContentServices;
import net.staniscia.rca.services.ViewServices;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 *
 */
public class OSGIUsage implements BundleActivator {

    private BundleContext __context;

    public void start(BundleContext context) throws Exception {
        this.__context = context;
        contentInjection();
        viewInjection();
        actionInjection();
    }

    public void stop(BundleContext context) throws Exception {
        //TODO add deactivation code here
    }

    private void contentInjection() {
        ServiceReference<?> reference = getContext().getServiceReference(ContentServices.class.getName());
        ContentServices contentService = (ContentServices) getContext().getService(reference);
        contentService.add(new CalcContent());
    }


    private void actionInjection() {
        ServiceReference<?> reference2 = getContext().getServiceReference(ActionServices.class.getName());
        ActionServices service = (ActionServices) getContext().getService(reference2);
        service.add(new AboutActions());
    }

    private void viewInjection() {
        ServiceReference<?> reference2 = getContext().getServiceReference(ViewServices.class.getName());
        ViewServices viewService = (ViewServices) getContext().getService(reference2);
        viewService.add(new ChatView());
    }
    
    
    private BundleContext getContext() {
        return __context;
    }
}
