/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage_Moduleigenschaften_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_AnlageImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_AnlageImpl#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_AnlageImpl#getLEUAnlageModuleigenschaften <em>LEU Anlage Moduleigenschaften</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_AnlageImpl extends Basis_ObjektImpl implements LEU_Anlage {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected LEU_Anlage_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDLEUBezugspunkt() <em>IDLEU Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDLEUBezugspunkt;

	/**
	 * This is true if the IDLEU Bezugspunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDLEUBezugspunktESet;

	/**
	 * The cached value of the '{@link #getLEUAnlageModuleigenschaften() <em>LEU Anlage Moduleigenschaften</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAnlageModuleigenschaften()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Anlage_Moduleigenschaften_AttributeGroup> lEUAnlageModuleigenschaften;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Anlage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		LEU_Anlage_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDLEUBezugspunkt() {
		if (iDLEUBezugspunkt != null && iDLEUBezugspunkt.eIsProxy()) {
			InternalEObject oldIDLEUBezugspunkt = (InternalEObject)iDLEUBezugspunkt;
			iDLEUBezugspunkt = (Basis_Objekt)eResolveProxy(oldIDLEUBezugspunkt);
			if (iDLEUBezugspunkt != oldIDLEUBezugspunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, oldIDLEUBezugspunkt, iDLEUBezugspunkt));
			}
		}
		return iDLEUBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDLEUBezugspunkt() {
		return iDLEUBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDLEUBezugspunkt(Basis_Objekt newIDLEUBezugspunkt) {
		Basis_Objekt oldIDLEUBezugspunkt = iDLEUBezugspunkt;
		iDLEUBezugspunkt = newIDLEUBezugspunkt;
		boolean oldIDLEUBezugspunktESet = iDLEUBezugspunktESet;
		iDLEUBezugspunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, oldIDLEUBezugspunkt, iDLEUBezugspunkt, !oldIDLEUBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDLEUBezugspunkt() {
		Basis_Objekt oldIDLEUBezugspunkt = iDLEUBezugspunkt;
		boolean oldIDLEUBezugspunktESet = iDLEUBezugspunktESet;
		iDLEUBezugspunkt = null;
		iDLEUBezugspunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT, oldIDLEUBezugspunkt, null, oldIDLEUBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDLEUBezugspunkt() {
		return iDLEUBezugspunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Anlage_Moduleigenschaften_AttributeGroup> getLEUAnlageModuleigenschaften() {
		if (lEUAnlageModuleigenschaften == null) {
			lEUAnlageModuleigenschaften = new EObjectContainmentEList<LEU_Anlage_Moduleigenschaften_AttributeGroup>(LEU_Anlage_Moduleigenschaften_AttributeGroup.class, this, Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_MODULEIGENSCHAFTEN);
		}
		return lEUAnlageModuleigenschaften;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_MODULEIGENSCHAFTEN:
				return ((InternalEList<?>)getLEUAnlageModuleigenschaften()).basicRemove(otherEnd, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				if (resolve) return getIDLEUBezugspunkt();
				return basicGetIDLEUBezugspunkt();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_MODULEIGENSCHAFTEN:
				return getLEUAnlageModuleigenschaften();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				setBezeichnung((LEU_Anlage_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				setIDLEUBezugspunkt((Basis_Objekt)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_MODULEIGENSCHAFTEN:
				getLEUAnlageModuleigenschaften().clear();
				getLEUAnlageModuleigenschaften().addAll((Collection<? extends LEU_Anlage_Moduleigenschaften_AttributeGroup>)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				setBezeichnung((LEU_Anlage_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				unsetIDLEUBezugspunkt();
				return;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_MODULEIGENSCHAFTEN:
				getLEUAnlageModuleigenschaften().clear();
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__IDLEU_BEZUGSPUNKT:
				return isSetIDLEUBezugspunkt();
			case Balisentechnik_ETCSPackage.LEU_ANLAGE__LEU_ANLAGE_MODULEIGENSCHAFTEN:
				return lEUAnlageModuleigenschaften != null && !lEUAnlageModuleigenschaften.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_AnlageImpl
