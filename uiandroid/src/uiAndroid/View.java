/**
 */
package uiAndroid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.View#getId <em>Id</em>}</li>
 *   <li>{@link uiAndroid.View#getLayout_width <em>Layout width</em>}</li>
 *   <li>{@link uiAndroid.View#getLayout_height <em>Layout height</em>}</li>
 *   <li>{@link uiAndroid.View#getLayout_gravity <em>Layout gravity</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getView()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see uiAndroid.UiAndroidPackage#getView_Id()
	 * @model dataType="uiAndroid.int" required="true" ordered="false"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link uiAndroid.View#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout width</em>' attribute.
	 * @see #setLayout_width(int)
	 * @see uiAndroid.UiAndroidPackage#getView_Layout_width()
	 * @model dataType="uiAndroid.int" required="true" ordered="false"
	 * @generated
	 */
	int getLayout_width();

	/**
	 * Sets the value of the '{@link uiAndroid.View#getLayout_width <em>Layout width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout width</em>' attribute.
	 * @see #getLayout_width()
	 * @generated
	 */
	void setLayout_width(int value);

	/**
	 * Returns the value of the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout height</em>' attribute.
	 * @see #setLayout_height(int)
	 * @see uiAndroid.UiAndroidPackage#getView_Layout_height()
	 * @model dataType="uiAndroid.int" required="true" ordered="false"
	 * @generated
	 */
	int getLayout_height();

	/**
	 * Sets the value of the '{@link uiAndroid.View#getLayout_height <em>Layout height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout height</em>' attribute.
	 * @see #getLayout_height()
	 * @generated
	 */
	void setLayout_height(int value);

	/**
	 * Returns the value of the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout gravity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout gravity</em>' attribute.
	 * @see #setLayout_gravity(int)
	 * @see uiAndroid.UiAndroidPackage#getView_Layout_gravity()
	 * @model dataType="uiAndroid.int" required="true" ordered="false"
	 * @generated
	 */
	int getLayout_gravity();

	/**
	 * Sets the value of the '{@link uiAndroid.View#getLayout_gravity <em>Layout gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout gravity</em>' attribute.
	 * @see #getLayout_gravity()
	 * @generated
	 */
	void setLayout_gravity(int value);

} // View
