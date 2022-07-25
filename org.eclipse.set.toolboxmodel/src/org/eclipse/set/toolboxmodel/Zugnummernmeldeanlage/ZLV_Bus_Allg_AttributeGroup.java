/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup#getUnterstationMax <em>Unterstation Max</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup#getZLVBusNr <em>ZLV Bus Nr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup#getZNModem <em>ZN Modem</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZLV_Bus_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Unterstation Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der maximal auf einen ZLV-Bus anschließbaren Unterstationen. Die Anzahl hängt von der Länge, der Qualität und des Umfangs der Telegramme ab. Nach Ril sind in der Regel maximal 10 Unterstationen pro ZLV-Bus zu planen. DB-Regelwerk 819.0731 5 (12) 819.0731 5 (13) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterstation Max</em>' containment reference.
	 * @see #setUnterstationMax(Unterstation_Max_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Allg_AttributeGroup_UnterstationMax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Unterstation_Max'"
	 * @generated
	 */
	Unterstation_Max_TypeClass getUnterstationMax();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup#getUnterstationMax <em>Unterstation Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterstation Max</em>' containment reference.
	 * @see #getUnterstationMax()
	 * @generated
	 */
	void setUnterstationMax(Unterstation_Max_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZLV Bus Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des ZLV-Busses. Jeder ZLV-Bus hat eine ihn identifizierende Nummer, die zentral festgelegt wird. Zukünftig wird die Nummer vierstellig angegeben; die ersten beiden Ziffern geben die Region an. Damit ist jeder ZLV-Bus bereits anhand seiner Nummer eindeutig in der Region identifizierbar. Bei BZ-übergreifenden ZLV-Bussen wird der BZ-Code nach Ril 100.0001A01 der ZLV-Bus-Nummer vorangestellt, getrennt durch einen Schrägstrich. Der BZ-Code wird aus dem Verweis auf die Bedien Zentrale generiert. DB-Regelwerk 100.0001A01 819.0731 5 (14) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLV Bus Nr</em>' containment reference.
	 * @see #setZLVBusNr(ZLV_Bus_Nr_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Allg_AttributeGroup_ZLVBusNr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus_Nr'"
	 * @generated
	 */
	ZLV_Bus_Nr_TypeClass getZLVBusNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup#getZLVBusNr <em>ZLV Bus Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLV Bus Nr</em>' containment reference.
	 * @see #getZLVBusNr()
	 * @generated
	 */
	void setZLVBusNr(ZLV_Bus_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Modem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modem, welches die Verbindung zwischen ZN Unterstation und ZLV-Bus für die Datenkommunikation herstellt. Je ZLV-Bus ist nur eine Modembauart zulässig. Für Neuanlagen ist das Modem der Bauart LOGEM 1200 MD oder LineRunner SCADA NG zu verwenden. Bei Auswahl von "sonstige" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk 819.0731A04 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Modem</em>' containment reference.
	 * @see #setZNModem(ZN_Modem_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Allg_AttributeGroup_ZNModem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Modem'"
	 * @generated
	 */
	ZN_Modem_TypeClass getZNModem();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup#getZNModem <em>ZN Modem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Modem</em>' containment reference.
	 * @see #getZNModem()
	 * @generated
	 */
	void setZNModem(ZN_Modem_TypeClass value);

} // ZLV_Bus_Allg_AttributeGroup
