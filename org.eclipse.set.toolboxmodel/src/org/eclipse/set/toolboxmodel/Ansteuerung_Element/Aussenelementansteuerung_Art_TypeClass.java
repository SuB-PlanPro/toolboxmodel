/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aussenelementansteuerung Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_Art_TypeClass()
 * @model extendedMetaData="name='TCAussenelementansteuerung_Art' kind='elementOnly'"
 * @generated
 */
public interface Aussenelementansteuerung_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMAussenelementansteuerungArt)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getAussenelementansteuerung_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Ansteuerung_Element.ENUMAussenelementansteuerungArtObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMAussenelementansteuerungArt getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMAussenelementansteuerungArt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAussenelementansteuerungArt)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAussenelementansteuerungArt)
	 * @generated
	 */
	boolean isSetWert();

} // Aussenelementansteuerung_Art_TypeClass
