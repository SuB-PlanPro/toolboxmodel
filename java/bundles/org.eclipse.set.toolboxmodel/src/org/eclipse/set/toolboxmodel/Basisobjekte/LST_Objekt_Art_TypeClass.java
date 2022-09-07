/**
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LST Objekt Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.LST_Objekt_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getLST_Objekt_Art_TypeClass()
 * @model extendedMetaData="name='TCLST_Objekt_Art' kind='elementOnly'"
 * @generated
 */
public interface LST_Objekt_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMLSTObjektArt)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getLST_Objekt_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Basisobjekte.ENUMLSTObjektArtObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMLSTObjektArt getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.LST_Objekt_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMLSTObjektArt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.LST_Objekt_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMLSTObjektArt)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.LST_Objekt_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMLSTObjektArt)
	 * @generated
	 */
	boolean isSetWert();

} // LST_Objekt_Art_TypeClass
