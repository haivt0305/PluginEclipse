package org.eclipse.ui.articles.action.contribution;

import org.eclipse.jface.action.IAction;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorAction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.Action;

public class XMLEditorAction1 extends Action implements
		IEditorAction {

	public XMLEditorAction1() {
	}

	/**
	 * @see Action#run(IAction)
	 */
	public void run(IAction action) {
		MessageBox box = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		box.setMessage("Executing: " + getClass());
		box.open();
	}
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {

	}

}
