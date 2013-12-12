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
import uiAndroid.Classe;
import uiAndroid.Methode;
import uiAndroid.UiAndroidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uiAndroid.impl.ClasseImpl#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link uiAndroid.impl.ClasseImpl#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link uiAndroid.impl.ClasseImpl#getNomClasse <em>Nom Classe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClasseImpl extends MinimalEObjectImpl.Container implements Classe {
	/**
	 * The cached value of the '{@link #getAttributs() <em>Attributs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributs()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribut> attributs;

	/**
	 * The cached value of the '{@link #getMethodes() <em>Methodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Methode> methodes;

	/**
	 * The default value of the '{@link #getNomClasse() <em>Nom Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomClasse()
	 * @generated
	 * @ordered
	 */
	protected static final Object NOM_CLASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomClasse() <em>Nom Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomClasse()
	 * @generated
	 * @ordered
	 */
	protected Object nomClasse = NOM_CLASSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiAndroidPackage.Literals.CLASSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribut> getAttributs() {
		if (attributs == null) {
			attributs = new EObjectContainmentEList<Attribut>(Attribut.class, this, UiAndroidPackage.CLASSE__ATTRIBUTS);
		}
		return attributs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Methode> getMethodes() {
		if (methodes == null) {
			methodes = new EObjectContainmentEList<Methode>(Methode.class, this, UiAndroidPackage.CLASSE__METHODES);
		}
		return methodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNomClasse() {
		return nomClasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomClasse(Object newNomClasse) {
		Object oldNomClasse = nomClasse;
		nomClasse = newNomClasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiAndroidPackage.CLASSE__NOM_CLASSE, oldNomClasse, nomClasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiAndroidPackage.CLASSE__ATTRIBUTS:
				return ((InternalEList<?>)getAttributs()).basicRemove(otherEnd, msgs);
			case UiAndroidPackage.CLASSE__METHODES:
				return ((InternalEList<?>)getMethodes()).basicRemove(otherEnd, msgs);
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
			case UiAndroidPackage.CLASSE__ATTRIBUTS:
				return getAttributs();
			case UiAndroidPackage.CLASSE__METHODES:
				return getMethodes();
			case UiAndroidPackage.CLASSE__NOM_CLASSE:
				return getNomClasse();
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
			case UiAndroidPackage.CLASSE__ATTRIBUTS:
				getAttributs().clear();
				getAttributs().addAll((Collection<? extends Attribut>)newValue);
				return;
			case UiAndroidPackage.CLASSE__METHODES:
				getMethodes().clear();
				getMethodes().addAll((Collection<? extends Methode>)newValue);
				return;
			case UiAndroidPackage.CLASSE__NOM_CLASSE:
				setNomClasse((Object)newValue);
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
			case UiAndroidPackage.CLASSE__ATTRIBUTS:
				getAttributs().clear();
				return;
			case UiAndroidPackage.CLASSE__METHODES:
				getMethodes().clear();
				return;
			case UiAndroidPackage.CLASSE__NOM_CLASSE:
				setNomClasse(NOM_CLASSE_EDEFAULT);
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
			case UiAndroidPackage.CLASSE__ATTRIBUTS:
				return attributs != null && !attributs.isEmpty();
			case UiAndroidPackage.CLASSE__METHODES:
				return methodes != null && !methodes.isEmpty();
			case UiAndroidPackage.CLASSE__NOM_CLASSE:
				return NOM_CLASSE_EDEFAULT == null ? nomClasse != null : !NOM_CLASSE_EDEFAULT.equals(nomClasse);
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
		result.append(" (nomClasse: ");
		result.append(nomClasse);
		result.append(')');
		return result.toString();
	}

} //ClasseImpl
