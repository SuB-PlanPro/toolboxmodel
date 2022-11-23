/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Handschalteinrichtung Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Handschalteinrichtung_TypeClass()
 * @model extendedMetaData="name='TCBUE_Handschalteinrichtung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Handschalteinrichtung_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMBUEHandschalteinrichtung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Handschalteinrichtung_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Bahnuebergang.ENUMBUEHandschalteinrichtungObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMBUEHandschalteinrichtung getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMBUEHandschalteinrichtung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMBUEHandschalteinrichtung)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMBUEHandschalteinrichtung)
	 * @generated
	 */
	boolean isSetWert();

} // BUE_Handschalteinrichtung_TypeClass