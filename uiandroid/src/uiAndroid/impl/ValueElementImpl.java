/**
 */
package uiAndroid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uiAndroid.UiAndroidPackage;
import uiAndroid.ValueElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.ValueElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link uiAndroid.impl.ValueElementImpl#getLayout_width <em>Layout width</em>}</li>
 *   <li>{@link uiAndroid.impl.ValueElementImpl#getLayout_height <em>Layout height</em>}</li>
 *   <li>{@link uiAndroid.impl.ValueElementImpl#getLayout_gravity <em>Layout gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueElementImpl extends MinimalEObjectImpl.Container implements ValueElement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_width() <em>Layout width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_width()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYOUT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayout_width() <em>Layout width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_width()
	 * @generated
	 * @ordered
	 */
	protected int layout_width = LAYOUT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_height() <em>Layout height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_height()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYOUT_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayout_height() <em>Layout height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_height()
	 * @generated
	 * @ordered
	 */
	protected int layout_height = LAYOUT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayout_gravity() <em>Layout gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_gravity()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYOUT_GRAVITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayout_gravity() <em>Layout gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout_gravity()
	 * @generated
	 * @ordered
	 */
	protected int layout_gravity = LAYOUT_GRAVITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.VALUE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.VALUE_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayout_width() {
		return layout_width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_width(int newLayout_width) {
		int oldLayout_width = layout_width;
		layout_width = newLayout_width;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.VALUE_ELEMENT__LAYOUT_WIDTH, oldLayout_width, layout_width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayout_height() {
		return layout_height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_height(int newLayout_height) {
		int oldLayout_height = layout_height;
		layout_height = newLayout_height;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.VALUE_ELEMENT__LAYOUT_HEIGHT, oldLayout_height, layout_height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayout_gravity() {
		return layout_gravity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout_gravity(int newLayout_gravity) {
		int oldLayout_gravity = layout_gravity;
		layout_gravity = newLayout_gravity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.VALUE_ELEMENT__LAYOUT_GRAVITY, oldLayout_gravity, layout_gravity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiAndroidPackage.VALUE_ELEMENT__ID:
				return getId();
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_WIDTH:
				return getLayout_width();
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_HEIGHT:
				return getLayout_height();
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_GRAVITY:
				return getLayout_gravity();
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
			case UiAndroidPackage.VALUE_ELEMENT__ID:
				setId((Integer)newValue);
				return;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_WIDTH:
				setLayout_width((Integer)newValue);
				return;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_HEIGHT:
				setLayout_height((Integer)newValue);
				return;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_GRAVITY:
				setLayout_gravity((Integer)newValue);
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
			case UiAndroidPackage.VALUE_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_WIDTH:
				setLayout_width(LAYOUT_WIDTH_EDEFAULT);
				return;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_HEIGHT:
				setLayout_height(LAYOUT_HEIGHT_EDEFAULT);
				return;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_GRAVITY:
				setLayout_gravity(LAYOUT_GRAVITY_EDEFAULT);
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
			case UiAndroidPackage.VALUE_ELEMENT__ID:
				return id != ID_EDEFAULT;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_WIDTH:
				return layout_width != LAYOUT_WIDTH_EDEFAULT;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_HEIGHT:
				return layout_height != LAYOUT_HEIGHT_EDEFAULT;
			case UiAndroidPackage.VALUE_ELEMENT__LAYOUT_GRAVITY:
				return layout_gravity != LAYOUT_GRAVITY_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", layout_width: ");
		result.append(layout_width);
		result.append(", layout_height: ");
		result.append(layout_height);
		result.append(", layout_gravity: ");
		result.append(layout_gravity);
		result.append(')');
		return result.toString();
	}

} //ValueElementImpl
