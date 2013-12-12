/**
 */
package uiAndroid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uiAndroid.Attribut;
import uiAndroid.UiAndroidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.AttributImpl#getNomAttribut <em>Nom Attribut</em>}</li>
 *   <li>{@link uiAndroid.impl.AttributImpl#getTypeAttribut <em>Type Attribut</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributImpl extends MinimalEObjectImpl.Container implements Attribut {
	/**
	 * The default value of the '{@link #getNomAttribut() <em>Nom Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAttribut()
	 * @generated
	 * @ordered
	 */
	protected static final Object NOM_ATTRIBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomAttribut() <em>Nom Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAttribut()
	 * @generated
	 * @ordered
	 */
	protected Object nomAttribut = NOM_ATTRIBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeAttribut() <em>Type Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribut()
	 * @generated
	 * @ordered
	 */
	protected static final Object TYPE_ATTRIBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeAttribut() <em>Type Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribut()
	 * @generated
	 * @ordered
	 */
	protected Object typeAttribut = TYPE_ATTRIBUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.ATTRIBUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNomAttribut() {
		return nomAttribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomAttribut(Object newNomAttribut) {
		Object oldNomAttribut = nomAttribut;
		nomAttribut = newNomAttribut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.ATTRIBUT__NOM_ATTRIBUT, oldNomAttribut, nomAttribut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTypeAttribut() {
		return typeAttribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttribut(Object newTypeAttribut) {
		Object oldTypeAttribut = typeAttribut;
		typeAttribut = newTypeAttribut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.ATTRIBUT__TYPE_ATTRIBUT, oldTypeAttribut, typeAttribut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiAndroidPackage.ATTRIBUT__NOM_ATTRIBUT:
				return getNomAttribut();
			case UiAndroidPackage.ATTRIBUT__TYPE_ATTRIBUT:
				return getTypeAttribut();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiAndroidPackage.ATTRIBUT__NOM_ATTRIBUT:
				setNomAttribut((Object)newValue);
				return;
			case UiAndroidPackage.ATTRIBUT__TYPE_ATTRIBUT:
				setTypeAttribut((Object)newValue);
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
			case UiAndroidPackage.ATTRIBUT__NOM_ATTRIBUT:
				setNomAttribut(NOM_ATTRIBUT_EDEFAULT);
				return;
			case UiAndroidPackage.ATTRIBUT__TYPE_ATTRIBUT:
				setTypeAttribut(TYPE_ATTRIBUT_EDEFAULT);
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
			case UiAndroidPackage.ATTRIBUT__NOM_ATTRIBUT:
				return NOM_ATTRIBUT_EDEFAULT == null ? nomAttribut != null : !NOM_ATTRIBUT_EDEFAULT.equals(nomAttribut);
			case UiAndroidPackage.ATTRIBUT__TYPE_ATTRIBUT:
				return TYPE_ATTRIBUT_EDEFAULT == null ? typeAttribut != null : !TYPE_ATTRIBUT_EDEFAULT.equals(typeAttribut);
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
		result.append(" (nomAttribut: ");
		result.append(nomAttribut);
		result.append(", typeAttribut: ");
		result.append(typeAttribut);
		result.append(')');
		return result.toString();
	}

} //AttributImpl
