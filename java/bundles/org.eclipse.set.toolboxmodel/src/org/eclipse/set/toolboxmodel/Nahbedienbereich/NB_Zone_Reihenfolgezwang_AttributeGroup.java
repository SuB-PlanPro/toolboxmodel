/**
 */
package org.eclipse.set.toolboxmodel.Nahbedienbereich;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone Reihenfolgezwang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienbereich.NB_Zone_Reihenfolgezwang_AttributeGroup#getNBZoneAllg <em>NB Zone Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Nahbedienbereich.NahbedienbereichPackage#getNB_Zone_Reihenfolgezwang_AttributeGroup()
 * @model extendedMetaData="name='CNB_Zone_Reihenfolgezwang' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Reihenfolgezwang_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>NB Zone Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Festlegung, an welcher Stelle die NB_Zone in der Reihe(nfolge) steht. Ist bei mehreren Zonen, die einer "Haupt"zone untergeordnet sind, eine Reihenfolge der Zonen für die Ein- bzw. Ausschaltung als notwendig festgelegt worden, muss für jede Zone ein Rang in dieser Reihe festgelegt werden. DB-Regelwerk Für die Planung von Nahbedienbereichen existiert bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich nur im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Zone Allg</em>' containment reference.
	 * @see #setNBZoneAllg(NB_Zone_Allg_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienbereich.NahbedienbereichPackage#getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Allg'"
	 * @generated
	 */
	NB_Zone_Allg_TypeClass getNBZoneAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienbereich.NB_Zone_Reihenfolgezwang_AttributeGroup#getNBZoneAllg <em>NB Zone Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Zone Allg</em>' containment reference.
	 * @see #getNBZoneAllg()
	 * @generated
	 */
	void setNBZoneAllg(NB_Zone_Allg_TypeClass value);

} // NB_Zone_Reihenfolgezwang_AttributeGroup
