package org.eclipse.ui.articles.action.contribution;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IViewAction;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.Action;

public class ViewAction1
	extends Action
	implements IViewAction
{

	/**
	 * @see Action#run(IAction)
	 */
	public void run(IAction action) {
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		box.setMessage("Executing: " + getClass());
		box.open();
	}

	/**
	 * @see IViewAction#init(IViewPart)
	 */
	public void init(IViewPart view) {
	}

}

