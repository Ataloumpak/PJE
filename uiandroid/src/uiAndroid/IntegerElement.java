/**
 */
package uiAndroid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uiAndroid.IntegerElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uiAndroid.UiAndroidPackage#getIntegerElement()
 * @model abstract="true"
 * @generated
 */
public interface IntegerElement extends ValueElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see uiAndroid.UiAndroidPackage#getIntegerElement_Value()
	 * @model dataType="uiAndroid.int" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link uiAndroid.IntegerElement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerElement
