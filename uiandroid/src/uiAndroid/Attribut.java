/**
 */
package uiAndroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.Attribut#getNomAttribut <em>Nom Attribut</em>}</li>
 *   <li>{@link uiAndroid.Attribut#getTypeAttribut <em>Type Attribut</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getAttribut()
 * @model
 * @generated
 */
public interface Attribut extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Attribut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Attribut</em>' attribute.
	 * @see #setNomAttribut(String)
	 * @see uiAndroid.UiAndroidPackage#getAttribut_NomAttribut()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getNomAttribut();

	/**
	 * Sets the value of the '{@link uiAndroid.Attribut#getNomAttribut <em>Nom Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Attribut</em>' attribute.
	 * @see #getNomAttribut()
	 * @generated
	 */
	void setNomAttribut(Object value);

	/**
	 * Returns the value of the '<em><b>Type Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attribut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attribut</em>' attribute.
	 * @see #setTypeAttribut(String)
	 * @see uiAndroid.UiAndroidPackage#getAttribut_TypeAttribut()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getTypeAttribut();

	/**
	 * Sets the value of the '{@link uiAndroid.Attribut#getTypeAttribut <em>Type Attribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attribut</em>' attribute.
	 * @see #getTypeAttribut()
	 * @generated
	 */
	void setTypeAttribut(Object value);

} // Attribut
