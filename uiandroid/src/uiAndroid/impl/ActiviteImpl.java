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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uiAndroid.Activite;
import uiAndroid.Classe;
import uiAndroid.IntentPackage;
import uiAndroid.UiAndroidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.ActiviteImpl#getClasse <em>Classe</em>}</li>
 *   <li>{@link uiAndroid.impl.ActiviteImpl#getIntentPackage <em>Intent Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActiviteImpl extends ClasseImpl implements Activite {
	/**
	 * The cached value of the '{@link #getClasse() <em>Classe</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasse()
	 * @generated
	 * @ordered
	 */
	protected EList<Classe> classe;

	/**
	 * The cached value of the '{@link #getIntentPackage() <em>Intent Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentPackage()
	 * @generated
	 * @ordered
	 */
	protected IntentPackage intentPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.ACTIVITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getClasse() {
		if (classe == null) {
			classe = new EObjectResolvingEList<Classe>(Classe.class, this, UiAndroidPackage.ACTIVITE__CLASSE);
		}
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentPackage getIntentPackage() {
		return intentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntentPackage(IntentPackage newIntentPackage, NotificationChain msgs) {
		IntentPackage oldIntentPackage = intentPackage;
		intentPackage = newIntentPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiAndroidPackage.ACTIVITE__INTENT_PACKAGE, oldIntentPackage, newIntentPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntentPackage(IntentPackage newIntentPackage) {
		if (newIntentPackage != intentPackage) {
			NotificationChain msgs = null;
			if (intentPackage != null)
				msgs = ((InternalEObject)intentPackage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiAndroidPackage.ACTIVITE__INTENT_PACKAGE, null, msgs);
			if (newIntentPackage != null)
				msgs = ((InternalEObject)newIntentPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiAndroidPackage.ACTIVITE__INTENT_PACKAGE, null, msgs);
			msgs = basicSetIntentPackage(newIntentPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.ACTIVITE__INTENT_PACKAGE, newIntentPackage, newIntentPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiAndroidPackage.ACTIVITE__INTENT_PACKAGE:
				return basicSetIntentPackage(null, msgs);
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
			case UiAndroidPackage.ACTIVITE__CLASSE:
				return getClasse();
			case UiAndroidPackage.ACTIVITE__INTENT_PACKAGE:
				return getIntentPackage();
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
			case UiAndroidPackage.ACTIVITE__CLASSE:
				getClasse().clear();
				getClasse().addAll((Collection<? extends Classe>)newValue);
				return;
			case UiAndroidPackage.ACTIVITE__INTENT_PACKAGE:
				setIntentPackage((IntentPackage)newValue);
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
			case UiAndroidPackage.ACTIVITE__CLASSE:
				getClasse().clear();
				return;
			case UiAndroidPackage.ACTIVITE__INTENT_PACKAGE:
				setIntentPackage((IntentPackage)null);
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
			case UiAndroidPackage.ACTIVITE__CLASSE:
				return classe != null && !classe.isEmpty();
			case UiAndroidPackage.ACTIVITE__INTENT_PACKAGE:
				return intentPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //ActiviteImpl
