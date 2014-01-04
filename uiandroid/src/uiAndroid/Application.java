/**
 */
package uiAndroid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.Application#getPages <em>Pages</em>}</li>
 *   <li>{@link uiAndroid.Application#getClasses <em>Classes</em>}</li>
 *   <li>{@link uiAndroid.Application#getActivite_Principale <em>Activite Principale</em>}</li>
 *   <li>{@link uiAndroid.Application#getNomAppli <em>Nom Appli</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link uiAndroid.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see uiAndroid.UiAndroidPackage#getApplication_Pages()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link uiAndroid.Classe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see uiAndroid.UiAndroidPackage#getApplication_Classes()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Classe> getClasses();

	/**
	 * Returns the value of the '<em><b>Activite Principale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Principale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Principale</em>' reference.
	 * @see #setActivite_Principale(Activite)
	 * @see uiAndroid.UiAndroidPackage#getApplication_Activite_Principale()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activite getActivite_Principale();

	/**
	 * Sets the value of the '{@link uiAndroid.Application#getActivite_Principale <em>Activite Principale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Principale</em>' reference.
	 * @see #getActivite_Principale()
	 * @generated
	 */
	void setActivite_Principale(Activite value);

	/**
	 * Returns the value of the '<em><b>Nom Appli</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Appli</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Appli</em>' attribute.
	 * @see #setNomAppli(String)
	 * @see uiAndroid.UiAndroidPackage#getApplication_NomAppli()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getNomAppli();

	/**
	 * Sets the value of the '{@link uiAndroid.Application#getNomAppli <em>Nom Appli</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Appli</em>' attribute.
	 * @see #getNomAppli()
	 * @generated
	 */
	void setNomAppli(Object value);

} // Application
