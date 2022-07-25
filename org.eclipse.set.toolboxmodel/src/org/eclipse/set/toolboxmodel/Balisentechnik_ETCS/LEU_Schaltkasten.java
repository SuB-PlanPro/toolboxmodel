/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Schaltkasten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Schaltkasten als Element der LEU-Anlage zur Unterbringung eines oder mehrerer LEU-Module.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getLEUSchaltkastenEnergie <em>LEU Schaltkasten Energie</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getLEUSchaltkastenPosition <em>LEU Schaltkasten Position</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getLEUSchaltkastenTyp <em>LEU Schaltkasten Typ</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten()
 * @model extendedMetaData="name='CLEU_Schaltkasten' kind='elementOnly'"
 * @generated
 */
public interface LEU_Schaltkasten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(LEU_Schaltkasten_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	LEU_Schaltkasten_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(LEU_Schaltkasten_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung des LEU-Schaltkastens, sofern er nicht direkt am Signal positioniert wird. Bei gemeinsamer Unterbringung mit einer Aussenelementansteuerung (z. B. Objektcontroller) ist deren Unterbringung auszuwählen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_IDUnterbringung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>LEU Schaltkasten Energie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusatzangaben zur Energieversorgung des LEU-Schaltkastens bzw. der darin befindlichen LEU-Module. Die Angabe ist nur bei ESG erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Schaltkasten Energie</em>' containment reference.
	 * @see #setLEUSchaltkastenEnergie(LEU_Schaltkasten_Energie_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_LEUSchaltkastenEnergie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Schaltkasten_Energie'"
	 * @generated
	 */
	LEU_Schaltkasten_Energie_AttributeGroup getLEUSchaltkastenEnergie();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getLEUSchaltkastenEnergie <em>LEU Schaltkasten Energie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Schaltkasten Energie</em>' containment reference.
	 * @see #getLEUSchaltkastenEnergie()
	 * @generated
	 */
	void setLEUSchaltkastenEnergie(LEU_Schaltkasten_Energie_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LEU Schaltkasten Position</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bestimmung der Position des LEU-Schaltkastens. Die Angabe erfolgt nur bei ESG und ist in diesem Fall obligatorisch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Schaltkasten Position</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_LEUSchaltkastenPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Schaltkasten_Position'"
	 * @generated
	 */
	EList<LEU_Schaltkasten_Position_AttributeGroup> getLEUSchaltkastenPosition();

	/**
	 * Returns the value of the '<em><b>LEU Schaltkasten Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des LEU-Schaltkastens (schließt Gerätestand ein, i. d. R. Rücklaufdatum).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Schaltkasten Typ</em>' containment reference.
	 * @see #setLEUSchaltkastenTyp(LEU_Schaltkasten_Typ_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_LEUSchaltkastenTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Schaltkasten_Typ'"
	 * @generated
	 */
	LEU_Schaltkasten_Typ_TypeClass getLEUSchaltkastenTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten#getLEUSchaltkastenTyp <em>LEU Schaltkasten Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Schaltkasten Typ</em>' containment reference.
	 * @see #getLEUSchaltkastenTyp()
	 * @generated
	 */
	void setLEUSchaltkastenTyp(LEU_Schaltkasten_Typ_TypeClass value);

} // LEU_Schaltkasten
