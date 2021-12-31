package org.eclipse.ui.articles.action.contribution;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowPulldown;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.Action;

public class SetAction2
	extends Action
	implements IWorkbenchWindowPulldown {

	/**
	 * @see ActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		box.setMessage("Executing: " + getClass());
		box.open();
	}

	/**
	 * @see IWorkbenchWindowPulldown#getMenu(Control)
	 */
	public Menu getMenu(Control parent) {
		return null;
	}

	/**
	 * @see IWorkbenchWindowAction#dispose()
	 */
	public void dispose() {
	}

	/**
	 * @see IWorkbenchWindowAction#init(IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
	}

}

