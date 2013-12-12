/**
 */
package uiAndroid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uiAndroid.Attribut;
import uiAndroid.Methode;
import uiAndroid.UiAndroidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.MethodeImpl#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link uiAndroid.impl.MethodeImpl#getParamètres <em>Paramètres</em>}</li>
 *   <li>{@link uiAndroid.impl.MethodeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link uiAndroid.impl.MethodeImpl#getCorpsMethode <em>Corps Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodeImpl extends MinimalEObjectImpl.Container implements Methode {
	/**
	 * The default value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected static final Object NOM_METHODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomMethode() <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomMethode()
	 * @generated
	 * @ordered
	 */
	protected Object nomMethode = NOM_METHODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamètres() <em>Paramètres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamètres()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribut> paramètres;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final Object RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Object returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorpsMethode() <em>Corps Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpsMethode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CORPS_METHODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorpsMethode() <em>Corps Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpsMethode()
	 * @generated
	 * @ordered
	 */
	protected Object corpsMethode = CORPS_METHODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.METHODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNomMethode() {
		return nomMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomMethode(Object newNomMethode) {
		Object oldNomMethode = nomMethode;
		nomMethode = newNomMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.METHODE__NOM_METHODE, oldNomMethode, nomMethode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribut> getParamètres() {
		if (paramètres == null) {
			paramètres = new EObjectContainmentEList<Attribut>(Attribut.class, this, UiAndroidPackage.METHODE__PARAMÈTRES);
		}
		return paramètres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Object newReturnType) {
		Object oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.METHODE__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCorpsMethode() {
		return corpsMethode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorpsMethode(Object newCorpsMethode) {
		Object oldCorpsMethode = corpsMethode;
		corpsMethode = newCorpsMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.METHODE__CORPS_METHODE, oldCorpsMethode, corpsMethode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiAndroidPackage.METHODE__PARAMÈTRES:
				return ((InternalEList<?>)getParamètres()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiAndroidPackage.METHODE__NOM_METHODE:
				return getNomMethode();
			case UiAndroidPackage.METHODE__PARAMÈTRES:
				return getParamètres();
			case UiAndroidPackage.METHODE__RETURN_TYPE:
				return getReturnType();
			case UiAndroidPackage.METHODE__CORPS_METHODE:
				return getCorpsMethode();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case UiAndroidPackage.METHODE__NOM_METHODE:
				setNomMethode((Object)newValue);
				return;
			case UiAndroidPackage.METHODE__PARAMÈTRES:
				getParamètres().clear();
				getParamètres().addAll((Collection<? extends Attribut>)newValue);
				return;
			case UiAndroidPackage.METHODE__RETURN_TYPE:
				setReturnType((Object)newValue);
				return;
			case UiAndroidPackage.METHODE__CORPS_METHODE:
				setCorpsMethode((Object)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiAndroidPackage.METHODE__NOM_METHODE:
				setNomMethode(NOM_METHODE_EDEFAULT);
				return;
			case UiAndroidPackage.METHODE__PARAMÈTRES:
				getParamètres().clear();
				return;
			case UiAndroidPackage.METHODE__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case UiAndroidPackage.METHODE__CORPS_METHODE:
				setCorpsMethode(CORPS_METHODE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiAndroidPackage.METHODE__NOM_METHODE:
				return NOM_METHODE_EDEFAULT == null ? nomMethode != null : !NOM_METHODE_EDEFAULT.equals(nomMethode);
			case UiAndroidPackage.METHODE__PARAMÈTRES:
				return paramètres != null && !paramètres.isEmpty();
			case UiAndroidPackage.METHODE__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case UiAndroidPackage.METHODE__CORPS_METHODE:
				return CORPS_METHODE_EDEFAULT == null ? corpsMethode != null : !CORPS_METHODE_EDEFAULT.equals(corpsMethode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nomMethode: ");
		result.append(nomMethode);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(", corpsMethode: ");
		result.append(corpsMethode);
		result.append(')');
		return result.toString();
	}

} //MethodeImpl
