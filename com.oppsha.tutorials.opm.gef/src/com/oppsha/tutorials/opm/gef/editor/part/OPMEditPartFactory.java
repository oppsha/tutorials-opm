package com.oppsha.tutorials.opm.gef.editor.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.oppsha.tutorials.opm.model.OPMObject;
import com.oppsha.tutorials.opm.model.ObjectProcessDiagram;

public class OPMEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		
		if (model instanceof ObjectProcessDiagram) {
			part = new ObjectProcessDiagramEditPart();
		} else if (model instanceof OPMObject) {
			part = new OPMObjectEditPart();
		}
		
		if (part != null) {
			part.setModel(model);
		}
		
		return part;
	}

}
