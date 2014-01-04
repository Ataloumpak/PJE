/**
 */
package uiAndroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.TextualElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getTextualElement()
 * @model abstract="true"
 * @generated
 */
public interface TextualElement extends ValueElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uiAndroid.UiAndroidPackage#getTextualElement_Value()
	 * @model dataType="uiAndroid.String" required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link uiAndroid.TextualElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // TextualElement
