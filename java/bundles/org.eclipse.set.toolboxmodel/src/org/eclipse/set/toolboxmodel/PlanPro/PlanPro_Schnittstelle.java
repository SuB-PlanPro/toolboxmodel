/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Pro Schnittstelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ermöglicht die globale Angabe und Zuordnung von Daten, die für alle Einzelplanungen einer Planungsgruppe gleichermaßen gelten. Dabei können in organisatorische und inhaltliche Angaben unterschieden werden. 
 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
 * Die ~ muss vor Beginn der Erstellung nachfolgender Einzelplanungen festgelegt sein. 
 * Enthält Informationen zur Bezeichnung der Planungsgruppe, zum gesperrten Planungsbereich und zum notwendigen Betrachtungsbereich.
 * Beim Anlegen der ~ erfolgt keine Festlegung der Anzahl der Einzelplanungen. Der erste Bauzustand ist entweder eine Neuplanung oder baut auf einer Bestandsdokumentationbzw. Bestandsdatenauf. Alle weiteren Bauzustände bauen auf der neutralisierten Bezugsplanung des jeweiligen Vorgängers auf.
 * Eine Planungsgruppe durchläuft definierte Status. Spätestens vor Abschluss einer ~ (sowie nach jeder Revision/Rev_letzte_Planung_E) werden neue Bestandsdaten erstellt.
 * 
 * DB-Regelwerk
 * Bisher nicht abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getPlanProSchnittstelleAllg <em>Plan Pro Schnittstelle Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTPlanung <em>LST Planung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTZustand <em>LST Zustand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle()
 * @model extendedMetaData="name='CPlanPro_Schnittstelle' kind='elementOnly'"
 * @generated
 */
public interface PlanPro_Schnittstelle extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Plan Pro Schnittstelle Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Pro Schnittstelle Allg</em>' containment reference.
	 * @see #setPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_PlanProSchnittstelleAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PlanPro_Schnittstelle_Allg'"
	 * @generated
	 */
	PlanPro_Schnittstelle_Allg_AttributeGroup getPlanProSchnittstelleAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getPlanProSchnittstelleAllg <em>Plan Pro Schnittstelle Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Pro Schnittstelle Allg</em>' containment reference.
	 * @see #getPlanProSchnittstelleAllg()
	 * @generated
	 */
	void setPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LST Planung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Einbindung von Planungen einer LST-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung</em>' containment reference.
	 * @see #setLSTPlanung(LST_Planung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_LSTPlanung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LST_Planung'"
	 * @generated
	 */
	LST_Planung_AttributeGroup getLSTPlanung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTPlanung <em>LST Planung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Planung</em>' containment reference.
	 * @see #getLSTPlanung()
	 * @generated
	 */
	void setLSTPlanung(LST_Planung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LST Zustand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Einbindung eines Zustands einer LST-Anlage (z. B. Bestandsdaten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Zustand</em>' containment reference.
	 * @see #setLSTZustand(LST_Zustand)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_LSTZustand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LST_Zustand'"
	 * @generated
	 */
	LST_Zustand getLSTZustand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTZustand <em>LST Zustand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Zustand</em>' containment reference.
	 * @see #getLSTZustand()
	 * @generated
	 */
	void setLSTZustand(LST_Zustand value);

} // PlanPro_Schnittstelle
