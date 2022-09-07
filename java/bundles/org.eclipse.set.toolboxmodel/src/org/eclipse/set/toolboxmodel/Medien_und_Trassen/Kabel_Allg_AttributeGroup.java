/**
 */
package org.eclipse.set.toolboxmodel.Medien_und_Trassen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAderReserve <em>Ader Reserve</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAnzahlVerseilelemente <em>Anzahl Verseilelemente</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelArt <em>Kabel Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelLaenge <em>Kabel Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelTyp <em>Kabel Typ</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getVerseilart <em>Verseilart</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAderDurchmesser <em>Ader Durchmesser</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAderQuerschnitt <em>Ader Querschnitt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup()
 * @model extendedMetaData="name='CKabel_Allg' kind='elementOnly'"
 * @generated
 */
public interface Kabel_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ader Reserve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der Reserveadern. Bsp.: 3x4x1,4 (4).
	 * Die unter Anzahl_Verseilelemente angebbare Aderanzahl muss auch als Reserve angebbar sein (freigeschaltetes Kabel).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ader Reserve</em>' containment reference.
	 * @see #setAderReserve(Ader_Reserve_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_AderReserve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ader_Reserve'"
	 * @generated
	 */
	Ader_Reserve_TypeClass getAderReserve();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAderReserve <em>Ader Reserve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ader Reserve</em>' containment reference.
	 * @see #getAderReserve()
	 * @generated
	 */
	void setAderReserve(Ader_Reserve_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Anzahl Verseilelemente</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der Verseilelemente. Bsp.: 3x4x1,4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzahl Verseilelemente</em>' containment reference.
	 * @see #setAnzahlVerseilelemente(Anzahl_Verseilelemente_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_AnzahlVerseilelemente()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anzahl_Verseilelemente'"
	 * @generated
	 */
	Anzahl_Verseilelemente_TypeClass getAnzahlVerseilelemente();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAnzahlVerseilelemente <em>Anzahl Verseilelemente</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Verseilelemente</em>' containment reference.
	 * @see #getAnzahlVerseilelemente()
	 * @generated
	 */
	void setAnzahlVerseilelemente(Anzahl_Verseilelemente_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Kabels, z. B. Signalkabel oder Lichtwellenleiter (LWL).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Art</em>' containment reference.
	 * @see #setKabelArt(Kabel_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_KabelArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Art'"
	 * @generated
	 */
	Kabel_Art_TypeClass getKabelArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelArt <em>Kabel Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Art</em>' containment reference.
	 * @see #getKabelArt()
	 * @generated
	 */
	void setKabelArt(Kabel_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Kabels in m.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Laenge</em>' containment reference.
	 * @see #setKabelLaenge(Kabel_Laenge_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_KabelLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Laenge'"
	 * @generated
	 */
	Kabel_Laenge_TypeClass getKabelLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelLaenge <em>Kabel Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Laenge</em>' containment reference.
	 * @see #getKabelLaenge()
	 * @generated
	 */
	void setKabelLaenge(Kabel_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des Kabels. Eine Liste der zugelassenen Kabeltypen soll über Planungswerkzeug vorgegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Typ</em>' containment reference.
	 * @see #setKabelTyp(Kabel_Typ_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_KabelTyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Typ'"
	 * @generated
	 */
	Kabel_Typ_TypeClass getKabelTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelTyp <em>Kabel Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Typ</em>' containment reference.
	 * @see #getKabelTyp()
	 * @generated
	 */
	void setKabelTyp(Kabel_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verseilart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verseilart (4 = Viererverseilung; 1 = adrige Verseilung). Bsp.: 3x4x1,4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verseilart</em>' containment reference.
	 * @see #setVerseilart(Verseilart_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_Verseilart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verseilart'"
	 * @generated
	 */
	Verseilart_TypeClass getVerseilart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getVerseilart <em>Verseilart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verseilart</em>' containment reference.
	 * @see #getVerseilart()
	 * @generated
	 */
	void setVerseilart(Verseilart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ader Durchmesser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Signalkabeln: Durchmesser der Kabeladern in mm. Bsp.: 3x4x1,4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ader Durchmesser</em>' containment reference.
	 * @see #setAderDurchmesser(Ader_Durchmesser_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_AderDurchmesser()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ader_Durchmesser'"
	 * @generated
	 */
	Ader_Durchmesser_TypeClass getAderDurchmesser();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAderDurchmesser <em>Ader Durchmesser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ader Durchmesser</em>' containment reference.
	 * @see #getAderDurchmesser()
	 * @generated
	 */
	void setAderDurchmesser(Ader_Durchmesser_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ader Querschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Kabeln zur rein elektrischen Energieübertragung: Querschnitt der Kabeladern in Quadratmillimetern. Bsp.: 2x1,5.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ader Querschnitt</em>' containment reference.
	 * @see #setAderQuerschnitt(Ader_Querschnitt_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_AderQuerschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ader_Querschnitt'"
	 * @generated
	 */
	Ader_Querschnitt_TypeClass getAderQuerschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getAderQuerschnitt <em>Ader Querschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ader Querschnitt</em>' containment reference.
	 * @see #getAderQuerschnitt()
	 * @generated
	 */
	void setAderQuerschnitt(Ader_Querschnitt_TypeClass value);

} // Kabel_Allg_AttributeGroup
