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

import uiAndroid.Layout;
import uiAndroid.UiAndroidPackage;
import uiAndroid.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.LayoutImpl#getId <em>Id</em>}</li>
 *   <li>{@link uiAndroid.impl.LayoutImpl#getLayout_width <em>Layout width</em>}</li>
 *   <li>{@link uiAndroid.impl.LayoutImpl#getLayout_height <em>Layout height</em>}</li>
 *   <li>{@link uiAndroid.impl.LayoutImpl#getLayout_gravity <em>Layout gravity</em>}</li>
 *   <li>{@link uiAndroid.impl.LayoutImpl#getViews <em>Views</em>}</li>
 *   <li>{@link uiAndroid.impl.LayoutImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
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
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Object ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Object orientation = ORIENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.LAYOUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.LAYOUT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.LAYOUT__LAYOUT_WIDTH, oldLayout_width, layout_width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.LAYOUT__LAYOUT_HEIGHT, oldLayout_height, layout_height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.LAYOUT__LAYOUT_GRAVITY, oldLayout_gravity, layout_gravity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentEList<View>(View.class, this, UiAndroidPackage.LAYOUT__VIEWS);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Object newOrientation) {
		Object oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.LAYOUT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiAndroidPackage.LAYOUT__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
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
			case UiAndroidPackage.LAYOUT__ID:
				return getId();
			case UiAndroidPackage.LAYOUT__LAYOUT_WIDTH:
				return getLayout_width();
			case UiAndroidPackage.LAYOUT__LAYOUT_HEIGHT:
				return getLayout_height();
			case UiAndroidPackage.LAYOUT__LAYOUT_GRAVITY:
				return getLayout_gravity();
			case UiAndroidPackage.LAYOUT__VIEWS:
				return getViews();
			case UiAndroidPackage.LAYOUT__ORIENTATION:
				return getOrientation();
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
			case UiAndroidPackage.LAYOUT__ID:
				setId((Integer)newValue);
				return;
			case UiAndroidPackage.LAYOUT__LAYOUT_WIDTH:
				setLayout_width((Integer)newValue);
				return;
			case UiAndroidPackage.LAYOUT__LAYOUT_HEIGHT:
				setLayout_height((Integer)newValue);
				return;
			case UiAndroidPackage.LAYOUT__LAYOUT_GRAVITY:
				setLayout_gravity((Integer)newValue);
				return;
			case UiAndroidPackage.LAYOUT__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case UiAndroidPackage.LAYOUT__ORIENTATION:
				setOrientation((Object)newValue);
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
			case UiAndroidPackage.LAYOUT__ID:
				setId(ID_EDEFAULT);
				return;
			case UiAndroidPackage.LAYOUT__LAYOUT_WIDTH:
				setLayout_width(LAYOUT_WIDTH_EDEFAULT);
				return;
			case UiAndroidPackage.LAYOUT__LAYOUT_HEIGHT:
				setLayout_height(LAYOUT_HEIGHT_EDEFAULT);
				return;
			case UiAndroidPackage.LAYOUT__LAYOUT_GRAVITY:
				setLayout_gravity(LAYOUT_GRAVITY_EDEFAULT);
				return;
			case UiAndroidPackage.LAYOUT__VIEWS:
				getViews().clear();
				return;
			case UiAndroidPackage.LAYOUT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
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
			case UiAndroidPackage.LAYOUT__ID:
				return id != ID_EDEFAULT;
			case UiAndroidPackage.LAYOUT__LAYOUT_WIDTH:
				return layout_width != LAYOUT_WIDTH_EDEFAULT;
			case UiAndroidPackage.LAYOUT__LAYOUT_HEIGHT:
				return layout_height != LAYOUT_HEIGHT_EDEFAULT;
			case UiAndroidPackage.LAYOUT__LAYOUT_GRAVITY:
				return layout_gravity != LAYOUT_GRAVITY_EDEFAULT;
			case UiAndroidPackage.LAYOUT__VIEWS:
				return views != null && !views.isEmpty();
			case UiAndroidPackage.LAYOUT__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
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
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
