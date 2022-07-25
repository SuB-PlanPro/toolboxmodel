/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Telegramm ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getIDFTAnschaltbedingungGeplant <em>IDFT Anschaltbedingung Geplant</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getIDFTAnschaltbedingungRealisiert <em>IDFT Anschaltbedingung Realisiert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getSRSUnterversion <em>SRS Unterversion</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getSRSVersion <em>SRS Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup()
 * @model extendedMetaData="name='CDP_Telegramm_ESG' kind='elementOnly'"
 * @generated
 */
public interface DP_Telegramm_ESG_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fachtelegramme, die bei Erfüllung der angegebenen Anschaltbedingungen gültig sind. Es können gleichzeitig mehrere Fachtelegramme des selben und/oder unterschiedlicher Anwendungssysteme angegeben werden. Zusätzlich zu Fachtelegrammen des (führenden) Anwendungssystems ESG können hier auch Fachtelegramme weiterer Anwendungssysteme angegeben werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_IDFachtelegramm()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	EList<Fachtelegramm> getIDFachtelegramm();

	/**
	 * Returns the value of the '<em><b>IDFT Anschaltbedingung Geplant</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Anschaltbedingung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geplante Anschaltbedingung(en), die für die angegebenen Fachtelegramme erfüllt sein müssen. Die Angabe ist bei ESG nur dann erforderlich, wenn im Fachtelegramm individuelle oder spezifische Merkmale definiert wurden und sich die Anschaltbedingungen neben dem Bezugspunkt auf weitere Elemente beziehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Anschaltbedingung Geplant</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_IDFTAnschaltbedingungGeplant()
	 * @model extendedMetaData="kind='element' name='ID_FT_Anschaltbedingung_Geplant'"
	 * @generated
	 */
	EList<FT_Anschaltbedingung> getIDFTAnschaltbedingungGeplant();

	/**
	 * Returns the value of the '<em><b>IDFT Anschaltbedingung Realisiert</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Anschaltbedingung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Realisierte Anschaltbedingung(en), mit denen die geplante(n) Anschaltbedingung(en) für die angegebenen Fachtelegramme umgesetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Anschaltbedingung Realisiert</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_IDFTAnschaltbedingungRealisiert()
	 * @model extendedMetaData="kind='element' name='ID_FT_Anschaltbedingung_Realisiert'"
	 * @generated
	 */
	EList<FT_Anschaltbedingung> getIDFTAnschaltbedingungRealisiert();

	/**
	 * Returns the value of the '<em><b>SRS Unterversion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterversion der System Requirement Specification gemäß Subset 26 Kapitel 7. In einem Datenpunkt können zu einem Zeitpunkt nur Telegramme der gleichen SRS-Unterversion gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SRS Unterversion</em>' containment reference.
	 * @see #setSRSUnterversion(SRS_Unterversion_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_SRSUnterversion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SRS_Unterversion'"
	 * @generated
	 */
	SRS_Unterversion_TypeClass getSRSUnterversion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getSRSUnterversion <em>SRS Unterversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRS Unterversion</em>' containment reference.
	 * @see #getSRSUnterversion()
	 * @generated
	 */
	void setSRSUnterversion(SRS_Unterversion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>SRS Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version der System Requirement Specification gemäß Subset 26 Kapitel 7. In einem Datenpunkt können zu einem Zeitpunkt nur Telegramme der gleichen SRS-Version gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SRS Version</em>' containment reference.
	 * @see #setSRSVersion(SRS_Version_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Telegramm_ESG_AttributeGroup_SRSVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SRS_Version'"
	 * @generated
	 */
	SRS_Version_TypeClass getSRSVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup#getSRSVersion <em>SRS Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRS Version</em>' containment reference.
	 * @see #getSRSVersion()
	 * @generated
	 */
	void setSRSVersion(SRS_Version_TypeClass value);

} // DP_Telegramm_ESG_AttributeGroup
