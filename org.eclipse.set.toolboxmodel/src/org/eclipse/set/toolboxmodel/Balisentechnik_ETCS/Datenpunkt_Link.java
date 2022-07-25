/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenpunkt Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Linking-Information zu einem nachfolgenden Datenpunkt. Die Information kann in mehreren Fachtelegrammen verwendet werden. Die Festlegung erfolgt nur bei ZBS und GNT im Rahmen des PT 1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkStart <em>IDDP Link Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkZiel <em>IDDP Link Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getLinkDistanz <em>Link Distanz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getZielDPAusrichtung <em>Ziel DP Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getGNTMerkmale <em>GNT Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getZBSMerkmale <em>ZBS Merkmale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link()
 * @model extendedMetaData="name='CDatenpunkt_Link' kind='elementOnly'"
 * @generated
 */
public interface Datenpunkt_Link extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDDP Link Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datenpunkt, von dem das Linking ausgeht (Start).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Link Start</em>' reference.
	 * @see #isSetIDDPLinkStart()
	 * @see #unsetIDDPLinkStart()
	 * @see #setIDDPLinkStart(Datenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_IDDPLinkStart()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Link_Start'"
	 * @generated
	 */
	Datenpunkt getIDDPLinkStart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkStart <em>IDDP Link Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Link Start</em>' reference.
	 * @see #isSetIDDPLinkStart()
	 * @see #unsetIDDPLinkStart()
	 * @see #getIDDPLinkStart()
	 * @generated
	 */
	void setIDDPLinkStart(Datenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkStart <em>IDDP Link Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDDPLinkStart()
	 * @see #getIDDPLinkStart()
	 * @see #setIDDPLinkStart(Datenpunkt)
	 * @generated
	 */
	void unsetIDDPLinkStart();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkStart <em>IDDP Link Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDDP Link Start</em>' reference is set.
	 * @see #unsetIDDPLinkStart()
	 * @see #getIDDPLinkStart()
	 * @see #setIDDPLinkStart(Datenpunkt)
	 * @generated
	 */
	boolean isSetIDDPLinkStart();

	/**
	 * Returns the value of the '<em><b>IDDP Link Ziel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ziel-Datenpunkt des betreffenden Linkings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Link Ziel</em>' reference.
	 * @see #isSetIDDPLinkZiel()
	 * @see #unsetIDDPLinkZiel()
	 * @see #setIDDPLinkZiel(Datenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_IDDPLinkZiel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Link_Ziel'"
	 * @generated
	 */
	Datenpunkt getIDDPLinkZiel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkZiel <em>IDDP Link Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Link Ziel</em>' reference.
	 * @see #isSetIDDPLinkZiel()
	 * @see #unsetIDDPLinkZiel()
	 * @see #getIDDPLinkZiel()
	 * @generated
	 */
	void setIDDPLinkZiel(Datenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkZiel <em>IDDP Link Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDDPLinkZiel()
	 * @see #getIDDPLinkZiel()
	 * @see #setIDDPLinkZiel(Datenpunkt)
	 * @generated
	 */
	void unsetIDDPLinkZiel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getIDDPLinkZiel <em>IDDP Link Ziel</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDDP Link Ziel</em>' reference is set.
	 * @see #unsetIDDPLinkZiel()
	 * @see #getIDDPLinkZiel()
	 * @see #setIDDPLinkZiel(Datenpunkt)
	 * @generated
	 */
	boolean isSetIDDPLinkZiel();

	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe aller Fachtelegramme, denen die Linking-Information zugeordnet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_IDFachtelegramm()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	EList<Fachtelegramm> getIDFachtelegramm();

	/**
	 * Returns the value of the '<em><b>Link Distanz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand zwischen Start- und Ziel-Datenpunkt des Linkings. Die Angabe ist erforderlich, um bei mehreren Fahrwegen zwischen Start- und Ziel-Datenpunkt die relevante Distanz eindeutig zu bestimmen.
	 * Sofern mehrere Fahrwege und damit Distanzen zwischen Start- und Ziel-Datenpunkt existieren, sind mehrere Instanzen von Datenpunkt_Link anzulegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Distanz</em>' containment reference.
	 * @see #setLinkDistanz(Link_Distanz_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_LinkDistanz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Link_Distanz'"
	 * @generated
	 */
	Link_Distanz_TypeClass getLinkDistanz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getLinkDistanz <em>Link Distanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Distanz</em>' containment reference.
	 * @see #getLinkDistanz()
	 * @generated
	 */
	void setLinkDistanz(Link_Distanz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ziel DP Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Linking festgelegte Ausrichtung des Ziel-Datenpunkts in Bezug auf die Fahrtrichtung des auswertenden Zuges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ziel DP Ausrichtung</em>' containment reference.
	 * @see #setZielDPAusrichtung(Ziel_DP_Ausrichtung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_ZielDPAusrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ziel_DP_Ausrichtung'"
	 * @generated
	 */
	Ziel_DP_Ausrichtung_TypeClass getZielDPAusrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getZielDPAusrichtung <em>Ziel DP Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel DP Ausrichtung</em>' containment reference.
	 * @see #getZielDPAusrichtung()
	 * @generated
	 */
	void setZielDPAusrichtung(Ziel_DP_Ausrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GNT Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNT Merkmale</em>' containment reference.
	 * @see #setGNTMerkmale(GNT_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_GNTMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GNT_Merkmale'"
	 * @generated
	 */
	GNT_Merkmale_AttributeGroup getGNTMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getGNTMerkmale <em>GNT Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNT Merkmale</em>' containment reference.
	 * @see #getGNTMerkmale()
	 * @generated
	 */
	void setGNTMerkmale(GNT_Merkmale_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZBS Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZBS Merkmale</em>' containment reference.
	 * @see #setZBSMerkmale(ZBS_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Link_ZBSMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZBS_Merkmale'"
	 * @generated
	 */
	ZBS_Merkmale_AttributeGroup getZBSMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Link#getZBSMerkmale <em>ZBS Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Merkmale</em>' containment reference.
	 * @see #getZBSMerkmale()
	 * @generated
	 */
	void setZBSMerkmale(ZBS_Merkmale_AttributeGroup value);

} // Datenpunkt_Link
