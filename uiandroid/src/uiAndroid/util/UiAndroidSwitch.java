/**
 */
package uiAndroid.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uiAndroid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uiAndroid.UiAndroidPackage
 * @generated
 */
public class UiAndroidSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiAndroidPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAndroidSwitch() {
		if (modelPackage == null) {
			modelPackage = UiAndroidPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UiAndroidPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = caseView(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseTextualElement(text);
				if (result == null) result = caseValueElement(text);
				if (result == null) result = caseView(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.TEXTUAL_ELEMENT: {
				TextualElement textualElement = (TextualElement)theEObject;
				T result = caseTextualElement(textualElement);
				if (result == null) result = caseValueElement(textualElement);
				if (result == null) result = caseView(textualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.VALUE_ELEMENT: {
				ValueElement valueElement = (ValueElement)theEObject;
				T result = caseValueElement(valueElement);
				if (result == null) result = caseView(valueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseClickableElement(button);
				if (result == null) result = caseTextualElement(button);
				if (result == null) result = caseValueElement(button);
				if (result == null) result = caseView(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.CLICKABLE_ELEMENT: {
				ClickableElement clickableElement = (ClickableElement)theEObject;
				T result = caseClickableElement(clickableElement);
				if (result == null) result = caseTextualElement(clickableElement);
				if (result == null) result = caseValueElement(clickableElement);
				if (result == null) result = caseView(clickableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.VERTICAL_LAYOUT: {
				VerticalLayout verticalLayout = (VerticalLayout)theEObject;
				T result = caseVerticalLayout(verticalLayout);
				if (result == null) result = caseLayout(verticalLayout);
				if (result == null) result = caseView(verticalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.HORIZONTAL_LAYOUT: {
				HorizontalLayout horizontalLayout = (HorizontalLayout)theEObject;
				T result = caseHorizontalLayout(horizontalLayout);
				if (result == null) result = caseLayout(horizontalLayout);
				if (result == null) result = caseView(horizontalLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.CLASSE: {
				Classe classe = (Classe)theEObject;
				T result = caseClasse(classe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.ATTRIBUT: {
				Attribut attribut = (Attribut)theEObject;
				T result = caseAttribut(attribut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.METHODE: {
				Methode methode = (Methode)theEObject;
				T result = caseMethode(methode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.ACTIVITE: {
				Activite activite = (Activite)theEObject;
				T result = caseActivite(activite);
				if (result == null) result = caseClasse(activite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.INTENT_PACKAGE: {
				IntentPackage intentPackage = (IntentPackage)theEObject;
				T result = caseIntentPackage(intentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.INTEGER_ELEMENT: {
				IntegerElement integerElement = (IntegerElement)theEObject;
				T result = caseIntegerElement(integerElement);
				if (result == null) result = caseValueElement(integerElement);
				if (result == null) result = caseView(integerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.BOOLEAN_ELEMENT: {
				BooleanElement booleanElement = (BooleanElement)theEObject;
				T result = caseBooleanElement(booleanElement);
				if (result == null) result = caseValueElement(booleanElement);
				if (result == null) result = caseView(booleanElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.CHECKBOX: {
				Checkbox checkbox = (Checkbox)theEObject;
				T result = caseCheckbox(checkbox);
				if (result == null) result = caseBooleanElement(checkbox);
				if (result == null) result = caseValueElement(checkbox);
				if (result == null) result = caseView(checkbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiAndroidPackage.TIME_PICKER: {
				TimePicker timePicker = (TimePicker)theEObject;
				T result = caseTimePicker(timePicker);
				if (result == null) result = caseIntegerElement(timePicker);
				if (result == null) result = caseValueElement(timePicker);
				if (result == null) result = caseView(timePicker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualElement(TextualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueElement(ValueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clickable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clickable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClickableElement(ClickableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalLayout(VerticalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalLayout(HorizontalLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClasse(Classe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribut</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribut(Attribut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethode(Methode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivite(Activite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intent Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intent Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntentPackage(IntentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerElement(IntegerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanElement(BooleanElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckbox(Checkbox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Picker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Picker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePicker(TimePicker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UiAndroidSwitch
