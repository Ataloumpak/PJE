/**
 */
package uiAndroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.Page#getLayout <em>Layout</em>}</li>
 *   <li>{@link uiAndroid.Page#getNom <em>Nom</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see uiAndroid.UiAndroidPackage#getPage_Layout()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link uiAndroid.Page#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see uiAndroid.UiAndroidPackage#getPage_Nom()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getNom();

	/**
	 * Sets the value of the '{@link uiAndroid.Page#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(Object value);

} // Page
