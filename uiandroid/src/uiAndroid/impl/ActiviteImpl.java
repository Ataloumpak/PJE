/**
 */
package uiAndroid.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
	 * The cached value of the '{@link #getIntentPackage() <em>Intent Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntentPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentPackage> intentPackage;

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
	public EList<IntentPackage> getIntentPackage() {
		if (intentPackage == null) {
			intentPackage = new EObjectContainmentEList<IntentPackage>(IntentPackage.class, this, UiAndroidPackage.ACTIVITE__INTENT_PACKAGE);
		}
		return intentPackage;
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
				return ((InternalEList<?>)getIntentPackage()).basicRemove(otherEnd, msgs);
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
				getIntentPackage().clear();
				getIntentPackage().addAll((Collection<? extends IntentPackage>)newValue);
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
				getIntentPackage().clear();
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
				return intentPackage != null && !intentPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActiviteImpl
