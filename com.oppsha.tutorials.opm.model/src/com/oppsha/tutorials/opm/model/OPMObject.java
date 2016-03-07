/**
 */
package com.oppsha.tutorials.opm.model;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.oppsha.tutorials.opm.model.OPMObject#getName <em>Name</em>}</li>
 *   <li>{@link com.oppsha.tutorials.opm.model.OPMObject#getOpd <em>Opd</em>}</li>
 *   <li>{@link com.oppsha.tutorials.opm.model.OPMObject#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMObject()
 * @model
 * @generated
 */
public interface OPMObject extends OPMThing {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.oppsha.tutorials.opm.model.OPMObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Opd</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.oppsha.tutorials.opm.model.ObjectProcessDiagram#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opd</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opd</em>' container reference.
	 * @see #setOpd(ObjectProcessDiagram)
	 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMObject_Opd()
	 * @see com.oppsha.tutorials.opm.model.ObjectProcessDiagram#getObjects
	 * @model opposite="objects" transient="false"
	 * @generated
	 */
	ObjectProcessDiagram getOpd();

	/**
	 * Sets the value of the '{@link com.oppsha.tutorials.opm.model.OPMObject#getOpd <em>Opd</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opd</em>' container reference.
	 * @see #getOpd()
	 * @generated
	 */
	void setOpd(ObjectProcessDiagram value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see com.oppsha.tutorials.opm.model.OPMPackage#getOPMObject_Constraints()
	 * @model default="" dataType="com.oppsha.tutorials.opm.model.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.oppsha.tutorials.opm.model.OPMObject#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

} // OPMObject
