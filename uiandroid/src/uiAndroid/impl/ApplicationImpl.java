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

import uiAndroid.Activite;
import uiAndroid.Application;
import uiAndroid.Classe;
import uiAndroid.Page;
import uiAndroid.UiAndroidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.ApplicationImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link uiAndroid.impl.ApplicationImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link uiAndroid.impl.ApplicationImpl#getActivite_Principale <em>Activite Principale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Classe> classes;

	/**
	 * The cached value of the '{@link #getActivite_Principale() <em>Activite Principale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivite_Principale()
	 * @generated
	 * @ordered
	 */
	protected Activite activite_Principale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, UiAndroidPackage.APPLICATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classe> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<Classe>(Classe.class, this, UiAndroidPackage.APPLICATION__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite getActivite_Principale() {
		if (activite_Principale != null && activite_Principale.eIsProxy()) {
			InternalEObject oldActivite_Principale = (InternalEObject)activite_Principale;
			activite_Principale = (Activite)eResolveProxy(oldActivite_Principale);
			if (activite_Principale != oldActivite_Principale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiAndroidPackage.APPLICATION__ACTIVITE_PRINCIPALE, oldActivite_Principale, activite_Principale));
			}
		}
		return activite_Principale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetActivite_Principale() {
		return activite_Principale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivite_Principale(Activite newActivite_Principale) {
		Activite oldActivite_Principale = activite_Principale;
		activite_Principale = newActivite_Principale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.APPLICATION__ACTIVITE_PRINCIPALE, oldActivite_Principale, activite_Principale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiAndroidPackage.APPLICATION__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case UiAndroidPackage.APPLICATION__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case UiAndroidPackage.APPLICATION__PAGES:
				return getPages();
			case UiAndroidPackage.APPLICATION__CLASSES:
				return getClasses();
			case UiAndroidPackage.APPLICATION__ACTIVITE_PRINCIPALE:
				if (resolve) return getActivite_Principale();
				return basicGetActivite_Principale();
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
			case UiAndroidPackage.APPLICATION__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case UiAndroidPackage.APPLICATION__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Classe>)newValue);
				return;
			case UiAndroidPackage.APPLICATION__ACTIVITE_PRINCIPALE:
				setActivite_Principale((Activite)newValue);
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
			case UiAndroidPackage.APPLICATION__PAGES:
				getPages().clear();
				return;
			case UiAndroidPackage.APPLICATION__CLASSES:
				getClasses().clear();
				return;
			case UiAndroidPackage.APPLICATION__ACTIVITE_PRINCIPALE:
				setActivite_Principale((Activite)null);
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
			case UiAndroidPackage.APPLICATION__PAGES:
				return pages != null && !pages.isEmpty();
			case UiAndroidPackage.APPLICATION__CLASSES:
				return classes != null && !classes.isEmpty();
			case UiAndroidPackage.APPLICATION__ACTIVITE_PRINCIPALE:
				return activite_Principale != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationImpl
