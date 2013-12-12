/**
 */
package uiAndroid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.Methode#getNomMethode <em>Nom Methode</em>}</li>
 *   <li>{@link uiAndroid.Methode#getParamètres <em>Paramètres</em>}</li>
 *   <li>{@link uiAndroid.Methode#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link uiAndroid.Methode#getCorpsMethode <em>Corps Methode</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getMethode()
 * @model
 * @generated
 */
public interface Methode extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Methode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Methode</em>' attribute.
	 * @see #setNomMethode(String)
	 * @see uiAndroid.UiAndroidPackage#getMethode_NomMethode()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getNomMethode();

	/**
	 * Sets the value of the '{@link uiAndroid.Methode#getNomMethode <em>Nom Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Methode</em>' attribute.
	 * @see #getNomMethode()
	 * @generated
	 */
	void setNomMethode(Object value);

	/**
	 * Returns the value of the '<em><b>Paramètres</b></em>' containment reference list.
	 * The list contents are of type {@link uiAndroid.Attribut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramètres</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramètres</em>' containment reference list.
	 * @see uiAndroid.UiAndroidPackage#getMethode_Paramètres()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribut> getParamètres();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see #setReturnType(String)
	 * @see uiAndroid.UiAndroidPackage#getMethode_ReturnType()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getReturnType();

	/**
	 * Sets the value of the '{@link uiAndroid.Methode#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Object value);

	/**
	 * Returns the value of the '<em><b>Corps Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corps Methode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corps Methode</em>' attribute.
	 * @see #setCorpsMethode(String)
	 * @see uiAndroid.UiAndroidPackage#getMethode_CorpsMethode()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getCorpsMethode();

	/**
	 * Sets the value of the '{@link uiAndroid.Methode#getCorpsMethode <em>Corps Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corps Methode</em>' attribute.
	 * @see #getCorpsMethode()
	 * @generated
	 */
	void setCorpsMethode(Object value);

} // Methode
