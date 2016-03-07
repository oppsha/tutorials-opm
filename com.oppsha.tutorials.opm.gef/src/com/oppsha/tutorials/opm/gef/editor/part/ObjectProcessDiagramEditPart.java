package com.oppsha.tutorials.opm.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.oppsha.tutorials.opm.model.OPMObject;
import com.oppsha.tutorials.opm.model.ObjectProcessDiagram;

public class ObjectProcessDiagramEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		FreeformLayer layer = new FreeformLayer();
		
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder());
		
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

	@Override
	protected List<OPMObject> getModelChildren() {
		List<OPMObject> retVal = new ArrayList<OPMObject>();
		ObjectProcessDiagram opd = (ObjectProcessDiagram) getModel();
		
		retVal.addAll(opd.getObjects());
		
		return retVal;
	}
	
}
