/**
 */
package uiAndroid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.IntentPackage#getActiviteCible <em>Activite Cible</em>}</li>
 *   <li>{@link uiAndroid.IntentPackage#getPressedButton <em>Pressed Button</em>}</li>
 *   <li>{@link uiAndroid.IntentPackage#getValueTransferedElement <em>Value Transfered Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getIntentPackage()
 * @model
 * @generated
 */
public interface IntentPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Activite Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Cible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Cible</em>' reference.
	 * @see #setActiviteCible(Activite)
	 * @see uiAndroid.UiAndroidPackage#getIntentPackage_ActiviteCible()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activite getActiviteCible();

	/**
	 * Sets the value of the '{@link uiAndroid.IntentPackage#getActiviteCible <em>Activite Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Cible</em>' reference.
	 * @see #getActiviteCible()
	 * @generated
	 */
	void setActiviteCible(Activite value);

	/**
	 * Returns the value of the '<em><b>Pressed Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressed Button</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressed Button</em>' reference.
	 * @see #setPressedButton(Button)
	 * @see uiAndroid.UiAndroidPackage#getIntentPackage_PressedButton()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Button getPressedButton();

	/**
	 * Sets the value of the '{@link uiAndroid.IntentPackage#getPressedButton <em>Pressed Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressed Button</em>' reference.
	 * @see #getPressedButton()
	 * @generated
	 */
	void setPressedButton(Button value);

	/**
	 * Returns the value of the '<em><b>Value Transfered Element</b></em>' reference list.
	 * The list contents are of type {@link uiAndroid.ValueElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Transfered Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Transfered Element</em>' reference list.
	 * @see uiAndroid.UiAndroidPackage#getIntentPackage_ValueTransferedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueElement> getValueTransferedElement();

} // IntentPackage
