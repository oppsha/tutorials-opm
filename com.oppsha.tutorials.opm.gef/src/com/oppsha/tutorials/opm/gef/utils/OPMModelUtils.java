package com.oppsha.tutorials.opm.gef.utils;

import com.oppsha.tutorials.opm.model.OPMFactory;
import com.oppsha.tutorials.opm.model.OPMLink;
import com.oppsha.tutorials.opm.model.OPMObject;
import com.oppsha.tutorials.opm.model.OPMProcess;
import com.oppsha.tutorials.opm.model.ObjectProcessDiagram;

public enum OPMModelUtils {

	INSTANCE;
	
	private OPMFactory factory = OPMFactory.eINSTANCE;
	
	public ObjectProcessDiagram createModel() {
		ObjectProcessDiagram opd = factory.createObjectProcessDiagram();
		
		OPMObject object1 = factory.createOPMObject();
		object1.setName("01");
		opd.getObjects().add(object1);
		
		OPMObject object2 = factory.createOPMObject();
		object2.setName("02");
		opd.getObjects().add(object2);
		
		OPMProcess process = factory.createOPMProcess();
		process.setName("P1");
		opd.getProcesses().add(process);
		
		OPMLink link = factory.createOPMLink();
		link.setSource(object1);
		link.setTarget(process);
		opd.getLinks().add(link);
		
		return opd;
	}
	
}
