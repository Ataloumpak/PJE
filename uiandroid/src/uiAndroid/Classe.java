/**
 */
package uiAndroid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.Classe#getAttributs <em>Attributs</em>}</li>
 *   <li>{@link uiAndroid.Classe#getMethodes <em>Methodes</em>}</li>
 *   <li>{@link uiAndroid.Classe#getNomClasse <em>Nom Classe</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getClasse()
 * @model
 * @generated
 */
public interface Classe extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributs</b></em>' containment reference list.
	 * The list contents are of type {@link uiAndroid.Attribut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributs</em>' containment reference list.
	 * @see uiAndroid.UiAndroidPackage#getClasse_Attributs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribut> getAttributs();

	/**
	 * Returns the value of the '<em><b>Methodes</b></em>' containment reference list.
	 * The list contents are of type {@link uiAndroid.Methode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methodes</em>' containment reference list.
	 * @see uiAndroid.UiAndroidPackage#getClasse_Methodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Methode> getMethodes();

	/**
	 * Returns the value of the '<em><b>Nom Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Classe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Classe</em>' attribute.
	 * @see #setNomClasse(String)
	 * @see uiAndroid.UiAndroidPackage#getClasse_NomClasse()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getNomClasse();

	/**
	 * Sets the value of the '{@link uiAndroid.Classe#getNomClasse <em>Nom Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Classe</em>' attribute.
	 * @see #getNomClasse()
	 * @generated
	 */
	void setNomClasse(Object value);

} // Classe
