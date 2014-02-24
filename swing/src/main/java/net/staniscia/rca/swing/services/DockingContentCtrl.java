package net.staniscia.rca.swing.services;

import net.staniscia.rca.View;
import net.staniscia.rca.View.VIEW_ANCHOR;
import net.staniscia.rca.View.VIEW_TYPE;
import net.staniscia.rca.swing.view.DockableContent;
import net.staniscia.rca.swing.view.DockableView;

import java.awt.Component;
import java.util.HashMap;
import java.util.NoSuchElementException;

import javax.swing.Icon;
import javax.swing.JPanel;

import org.noos.xing.mydoggy.Content;
import org.noos.xing.mydoggy.ContentManager;
import org.noos.xing.mydoggy.ToolWindow;
import org.noos.xing.mydoggy.ToolWindowAnchor;
import org.noos.xing.mydoggy.ToolWindowType;
import org.noos.xing.mydoggy.plaf.MyDoggyToolWindowManager;
import org.noos.xing.mydoggy.plaf.ui.content.MyDoggyDesktopContentManagerUI;

/**
 * The Class DockingContentManager.
 */
public class DockingContentCtrl {

    /**
     * The conten manager ui.
     */
    private MyDoggyDesktopContentManagerUI contenManagerUI;
    /**
     * The tool window manager.
     */
    private MyDoggyToolWindowManager toolWindowManager;
    /**
     * The content manager.
     */
    private ContentManager contentManager;
    /**
     * The dockable contents.
     */
    private HashMap<String, DockableContent> dockableContents;
    /**
     * The dockable views.
     */
    private HashMap<String, DockableView> dockableViews;
    private final ClassLoader osgiClassLoader;
    private final ClassLoader threadClassLoader;

    /**
     * Instantiates a new docking content manager.
     */
    public DockingContentCtrl() {
        osgiClassLoader = this.getClass().getClassLoader();
        threadClassLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(osgiClassLoader);
        dockableContents = new HashMap<String, DockableContent>();
        dockableViews = new HashMap<String, DockableView>();
        contenManagerUI = new MyDoggyDesktopContentManagerUI();
        contenManagerUI.setCloseable(false);
        
        toolWindowManager = new MyDoggyToolWindowManager();
        
        contentManager = toolWindowManager.getContentManager();
        contentManager.setContentManagerUI(contenManagerUI);
        
    }

    public JPanel getContentPanel() {
        return toolWindowManager;
    }

    /**
     * Gets the dockable content.
     *
     * @param id the id
     * @return the dockable content
     * @throws NoSuchElementException the no such element exception
     */
    public DockableContent getDockableContent(String id)
            throws NoSuchElementException {
        DockableContent out = null;
        if (dockableContents.containsKey(id)) {
            out = dockableContents.get(id);
        }
        if (out == null) {
            throw new NoSuchElementException("No element For id " + id);
        }
        return out;
    }

    /**
     * Gets the dockable view.
     *
     * @param id the id
     * @return the dockable view
     * @throws NoSuchElementException the no such element exception
     */
    public DockableView getDockableView(String id) throws NoSuchElementException {
        DockableView out = null;
        if (dockableViews.containsKey(id)) {
            out = dockableViews.get(id);
        }
        if (out == null) {
            throw new NoSuchElementException("No element For id " + id);
        }
        return out;
    }

    /**
     * Register content.
     *
     * @param content the content
     * @return the dockable content
     * @throws IllegalArgumentException the illegal argument exception
     */
    public DockableContent registerContent(net.staniscia.rca.Content content)
            throws IllegalArgumentException {
        Content ui = makeContent(content.getId(), content.getTitle(),
                content.getIcon(), content.getContentPane(),
                content.getToolTip());
        DockableContent out = new DockableContent(content, ui);
        dockableContents.put(content.getId(), out);
        return out;
    }

    /**
     * Un register content.
     *
     * @param content the content
     * @throws IllegalArgumentException the illegal argument exception
     */
    public void unRegisterContent(DockableContent content)
            throws IllegalArgumentException {
        if (content != null) {
            if (dockableContents.containsKey(content.getModel().getId())) {
                contentManager.removeContent(content.getUI());
                toolWindowManager.repaint();
                dockableContents.remove(content.getModel().getId());

            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * Register view.
     *
     * @param view the view
     * @return the dockable view
     * @throws IllegalArgumentException the illegal argument exception
     */
    public DockableView registerView(View view) throws IllegalArgumentException {
        ToolWindow ui = makeToolWindow(view.getId(), view.getTitle(),
                view.getIcon(), view.getContentPane(),
                view.getDefaultPosition(), view.getDefaultType());
        DockableView out = new DockableView(view, ui);
        out.revalide();
        dockableViews.put(view.getId(), out);
        return out;
    }

    /**
     * Un register view.
     *
     * @param view the view
     * @throws IllegalArgumentException the illegal argument exception
     */
    public void unRegisterView(DockableView view) throws IllegalArgumentException {
        if (view != null) {
            if (dockableViews.containsKey(view.getModel().getId())) {
                toolWindowManager.unregisterToolWindow(view.getUI().getId());
                dockableViews.remove(view.getModel().getId());
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /**
     * Make tool window.
     *
     * @param id the id
     * @param title the title
     * @param icon the icon
     * @param component the component
     * @param anchor the anchor
     * @param viewType the view type
     * @return the tool window
     * @throws IllegalArgumentException the illegal argument exception
     */
    private ToolWindow makeToolWindow(String id, String title, Icon icon,
            Component component, VIEW_ANCHOR anchor, VIEW_TYPE viewType)
            throws IllegalArgumentException {
        ToolWindowAnchor mode;
        ToolWindowType type;
        try {
            mode = ToolWindowAnchor.valueOf(anchor.toString());
        } catch (Exception e) {
            mode = ToolWindowAnchor.RIGHT;
        }

        final ToolWindow toolwindow = toolWindowManager.registerToolWindow(id,
                title, icon, component, mode);
        toolWindowManager.setVisible(true);
        return toolwindow;
    }

    /**
     * Make content.
     *
     * @param id the id
     * @param title the title
     * @param icon the icon
     * @param component the component
     * @param tip the tip
     * @return the content
     * @throws IllegalArgumentException the illegal argument exception
     */
    private Content makeContent(String id, String title, Icon icon,
            Component component, String tip) throws IllegalArgumentException {
        return contentManager.addContent(id, title, icon, component, tip);
    }

    public void setRcaSwing(WindowCtrl guiController) {
        // TODO Auto-generated method stub
    }
}
