/**
 */
package uiAndroid.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uiAndroid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uiAndroid.UiAndroidPackage
 * @generated
 */
public class UiAndroidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiAndroidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAndroidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiAndroidPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiAndroidSwitch<Adapter> modelSwitch =
		new UiAndroidSwitch<Adapter>() {
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseText(Text object) {
				return createTextAdapter();
			}
			@Override
			public Adapter caseTextualElement(TextualElement object) {
				return createTextualElementAdapter();
			}
			@Override
			public Adapter caseValueElement(ValueElement object) {
				return createValueElementAdapter();
			}
			@Override
			public Adapter caseButton(Button object) {
				return createButtonAdapter();
			}
			@Override
			public Adapter caseClickableElement(ClickableElement object) {
				return createClickableElementAdapter();
			}
			@Override
			public Adapter caseVerticalLayout(VerticalLayout object) {
				return createVerticalLayoutAdapter();
			}
			@Override
			public Adapter caseHorizontalLayout(HorizontalLayout object) {
				return createHorizontalLayoutAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseClasse(Classe object) {
				return createClasseAdapter();
			}
			@Override
			public Adapter caseAttribut(Attribut object) {
				return createAttributAdapter();
			}
			@Override
			public Adapter caseMethode(Methode object) {
				return createMethodeAdapter();
			}
			@Override
			public Adapter caseActivite(Activite object) {
				return createActiviteAdapter();
			}
			@Override
			public Adapter caseIntentPackage(IntentPackage object) {
				return createIntentPackageAdapter();
			}
			@Override
			public Adapter caseIntegerElement(IntegerElement object) {
				return createIntegerElementAdapter();
			}
			@Override
			public Adapter caseBooleanElement(BooleanElement object) {
				return createBooleanElementAdapter();
			}
			@Override
			public Adapter caseCheckbox(Checkbox object) {
				return createCheckboxAdapter();
			}
			@Override
			public Adapter caseTimePicker(TimePicker object) {
				return createTimePickerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.TextualElement <em>Textual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.TextualElement
	 * @generated
	 */
	public Adapter createTextualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.ValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.ValueElement
	 * @generated
	 */
	public Adapter createValueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.ClickableElement <em>Clickable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.ClickableElement
	 * @generated
	 */
	public Adapter createClickableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.VerticalLayout <em>Vertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.VerticalLayout
	 * @generated
	 */
	public Adapter createVerticalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.HorizontalLayout <em>Horizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.HorizontalLayout
	 * @generated
	 */
	public Adapter createHorizontalLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Classe
	 * @generated
	 */
	public Adapter createClasseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Attribut
	 * @generated
	 */
	public Adapter createAttributAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Methode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Methode
	 * @generated
	 */
	public Adapter createMethodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Activite
	 * @generated
	 */
	public Adapter createActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.IntentPackage <em>Intent Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.IntentPackage
	 * @generated
	 */
	public Adapter createIntentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.IntegerElement <em>Integer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.IntegerElement
	 * @generated
	 */
	public Adapter createIntegerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.BooleanElement <em>Boolean Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.BooleanElement
	 * @generated
	 */
	public Adapter createBooleanElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.Checkbox
	 * @generated
	 */
	public Adapter createCheckboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uiAndroid.TimePicker <em>Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uiAndroid.TimePicker
	 * @generated
	 */
	public Adapter createTimePickerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UiAndroidAdapterFactory
