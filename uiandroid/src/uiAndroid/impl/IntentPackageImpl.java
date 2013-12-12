/**
 */
package uiAndroid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uiAndroid.Activite;
import uiAndroid.Button;
import uiAndroid.IntentPackage;
import uiAndroid.UiAndroidPackage;
import uiAndroid.ValueElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.IntentPackageImpl#getActiviteCible <em>Activite Cible</em>}</li>
 *   <li>{@link uiAndroid.impl.IntentPackageImpl#getPressedButton <em>Pressed Button</em>}</li>
 *   <li>{@link uiAndroid.impl.IntentPackageImpl#getValueTransferedElement <em>Value Transfered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentPackageImpl extends MinimalEObjectImpl.Container implements IntentPackage {
	/**
	 * The cached value of the '{@link #getActiviteCible() <em>Activite Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteCible()
	 * @generated
	 * @ordered
	 */
	protected Activite activiteCible;

	/**
	 * The cached value of the '{@link #getPressedButton() <em>Pressed Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressedButton()
	 * @generated
	 * @ordered
	 */
	protected Button pressedButton;

	/**
	 * The cached value of the '{@link #getValueTransferedElement() <em>Value Transfered Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTransferedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueElement> valueTransferedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.INTENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite getActiviteCible() {
		if (activiteCible != null && activiteCible.eIsProxy()) {
			InternalEObject oldActiviteCible = (InternalEObject)activiteCible;
			activiteCible = (Activite)eResolveProxy(oldActiviteCible);
			if (activiteCible != oldActiviteCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiAndroidPackage.INTENT_PACKAGE__ACTIVITE_CIBLE, oldActiviteCible, activiteCible));
			}
		}
		return activiteCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetActiviteCible() {
		return activiteCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiviteCible(Activite newActiviteCible) {
		Activite oldActiviteCible = activiteCible;
		activiteCible = newActiviteCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.INTENT_PACKAGE__ACTIVITE_CIBLE, oldActiviteCible, activiteCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button getPressedButton() {
		if (pressedButton != null && pressedButton.eIsProxy()) {
			InternalEObject oldPressedButton = (InternalEObject)pressedButton;
			pressedButton = (Button)eResolveProxy(oldPressedButton);
			if (pressedButton != oldPressedButton) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiAndroidPackage.INTENT_PACKAGE__PRESSED_BUTTON, oldPressedButton, pressedButton));
			}
		}
		return pressedButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button basicGetPressedButton() {
		return pressedButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressedButton(Button newPressedButton) {
		Button oldPressedButton = pressedButton;
		pressedButton = newPressedButton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.INTENT_PACKAGE__PRESSED_BUTTON, oldPressedButton, pressedButton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueElement> getValueTransferedElement() {
		if (valueTransferedElement == null) {
			valueTransferedElement = new EObjectResolvingEList<ValueElement>(ValueElement.class, this, UiAndroidPackage.INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT);
		}
		return valueTransferedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiAndroidPackage.INTENT_PACKAGE__ACTIVITE_CIBLE:
				if (resolve) return getActiviteCible();
				return basicGetActiviteCible();
			case UiAndroidPackage.INTENT_PACKAGE__PRESSED_BUTTON:
				if (resolve) return getPressedButton();
				return basicGetPressedButton();
			case UiAndroidPackage.INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT:
				return getValueTransferedElement();
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
			case UiAndroidPackage.INTENT_PACKAGE__ACTIVITE_CIBLE:
				setActiviteCible((Activite)newValue);
				return;
			case UiAndroidPackage.INTENT_PACKAGE__PRESSED_BUTTON:
				setPressedButton((Button)newValue);
				return;
			case UiAndroidPackage.INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT:
				getValueTransferedElement().clear();
				getValueTransferedElement().addAll((Collection<? extends ValueElement>)newValue);
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
			case UiAndroidPackage.INTENT_PACKAGE__ACTIVITE_CIBLE:
				setActiviteCible((Activite)null);
				return;
			case UiAndroidPackage.INTENT_PACKAGE__PRESSED_BUTTON:
				setPressedButton((Button)null);
				return;
			case UiAndroidPackage.INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT:
				getValueTransferedElement().clear();
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
			case UiAndroidPackage.INTENT_PACKAGE__ACTIVITE_CIBLE:
				return activiteCible != null;
			case UiAndroidPackage.INTENT_PACKAGE__PRESSED_BUTTON:
				return pressedButton != null;
			case UiAndroidPackage.INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT:
				return valueTransferedElement != null && !valueTransferedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntentPackageImpl
