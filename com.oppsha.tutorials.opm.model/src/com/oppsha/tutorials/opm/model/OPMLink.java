/**
 */
package com.oppsha.tutorials.opm.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.oppsha.tutorials.opm.model.OPMLink#getOpd <em>Opd</em>}</li>
 *   <li>{@link com.oppsha.tutorials.opm.model.OPMLink#getSource <em>Source</em>}</li>
 *   <li>{@link com.oppsha.tutorials.opm.model.OPMLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMLink()
 * @model
 * @generated
 */
public interface OPMLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.oppsha.tutorials.opm.model.ObjectProcessDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(ObjectProcessDiagram)
	 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMLink_Opd()
	 * @see com.oppsha.tutorials.opm.model.ObjectProcessDiagram#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	ObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link com.oppsha.tutorials.opm.model.OPMLink#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(ObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.oppsha.tutorials.opm.model.OPMThing#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OPMThing)
	 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMLink_Source()
	 * @see com.oppsha.tutorials.opm.model.OPMThing#getOutgoingLinks
	 * @model opposite="outgoingLinks"
	 * @generated
	 */
	OPMThing getSource();

	/**
	 * Sets the value of the '{@link com.oppsha.tutorials.opm.model.OPMLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OPMThing value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.oppsha.tutorials.opm.model.OPMThing#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(OPMThing)
	 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMLink_Target()
	 * @see com.oppsha.tutorials.opm.model.OPMThing#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	OPMThing getTarget();

	/**
	 * Sets the value of the '{@link com.oppsha.tutorials.opm.model.OPMLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(OPMThing value);

} // OPMLink
