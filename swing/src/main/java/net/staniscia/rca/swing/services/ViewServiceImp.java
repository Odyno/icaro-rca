package net.staniscia.rca.swing.services;

import java.util.Collection;
import java.util.Iterator;

import net.staniscia.rca.View;
import net.staniscia.rca.services.ViewServices;
import net.staniscia.rca.swing.action.basic.ShowViewAction;
import net.staniscia.rca.swing.view.DockableView;

public class ViewServiceImp extends DockableService implements  ViewServices{
	
	

	public void addViews(Collection<View> view) {
		for (Iterator<View> iterator = view.iterator(); iterator.hasNext();) {
			View content =  iterator.next();
			add(content);
		}

	}
	
	public void removeViews(Collection<String> viewId) {
		for (Iterator iterator = viewId.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			remove(string);
		}

	}

	public void add(View view) {
		DockableView out = dockingContentCTRL.registerView(view);
		actionService.add(new ShowViewAction(out));

	}

	public void remove(String viewId) {
		DockableView out = dockingContentCTRL.getDockableView(viewId);
		dockingContentCTRL.unRegisterView(out);
		actionService.remove(actionService.getAction(out.getModel().getId()));
	}

}
