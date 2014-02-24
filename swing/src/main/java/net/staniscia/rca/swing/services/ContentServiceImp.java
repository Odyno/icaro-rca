package net.staniscia.rca.swing.services;

import net.staniscia.rca.Content;
import net.staniscia.rca.services.ContentServices;
import net.staniscia.rca.swing.action.basic.ShowContentAction;
import net.staniscia.rca.swing.view.DockableContent;

import java.util.Collection;
import java.util.Iterator;

public class ContentServiceImp extends DockableService implements ContentServices {


    public void addContents(Collection<Content> extension) {
        for (Iterator iterator = extension.iterator(); iterator.hasNext(); ) {
            Content content = (Content) iterator.next();
            add(content);
        }
    }

    public void removeContents(Collection<String> extensionIds) {
        for (Iterator iterator = extensionIds.iterator(); iterator.hasNext(); ) {
            String string = (String) iterator.next();
            remove(string);
        }
    }

    public void add(Content extension) {
        DockableContent dc = dockingContentCTRL.registerContent(extension);
        if (dc != null) {
            actionService.add(new ShowContentAction(dc));
        }
    }

    public void remove(String extensionId) {
        dockingContentCTRL.unRegisterContent(dockingContentCTRL.getDockableContent(extensionId));
    }


}
