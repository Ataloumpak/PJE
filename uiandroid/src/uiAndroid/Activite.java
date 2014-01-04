/**
 */
package uiAndroid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.Activite#getClasse <em>Classe</em>}</li>
 *   <li>{@link uiAndroid.Activite#getIntentPackage <em>Intent Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getActivite()
 * @model
 * @generated
 */
public interface Activite extends Classe {
	/**
	 * Returns the value of the '<em><b>Classe</b></em>' reference list.
	 * The list contents are of type {@link uiAndroid.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' reference list.
	 * @see uiAndroid.UiAndroidPackage#getActivite_Classe()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classe> getClasse();

	/**
	 * Returns the value of the '<em><b>Intent Package</b></em>' containment reference list.
	 * The list contents are of type {@link uiAndroid.IntentPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent Package</em>' containment reference list.
	 * @see uiAndroid.UiAndroidPackage#getActivite_IntentPackage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IntentPackage> getIntentPackage();

} // Activite
