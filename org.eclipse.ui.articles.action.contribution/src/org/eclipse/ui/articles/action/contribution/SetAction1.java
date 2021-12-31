package org.eclipse.ui.articles.action.contribution;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowAction;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.Action;

public class SetAction1
	extends Action
	implements IWorkbenchWindowAction {

	/**
	 * @see ActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		box.setMessage("Executing: " + getClass());
		box.open();
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

