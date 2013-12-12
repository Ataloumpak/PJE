/**
 */
package uiAndroid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uiAndroid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiAndroidFactoryImpl extends EFactoryImpl implements UiAndroidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiAndroidFactory init() {
		try {
			UiAndroidFactory theUiAndroidFactory = (UiAndroidFactory)EPackage.Registry.INSTANCE.getEFactory(UiAndroidPackage.eNS_URI);
			if (theUiAndroidFactory != null) {
				return theUiAndroidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiAndroidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAndroidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UiAndroidPackage.PAGE: return createPage();
			case UiAndroidPackage.TEXT: return createText();
			case UiAndroidPackage.TEXTUAL_ELEMENT: return createTextualElement();
			case UiAndroidPackage.VALUE_ELEMENT: return createValueElement();
			case UiAndroidPackage.BUTTON: return createButton();
			case UiAndroidPackage.CLICKABLE_ELEMENT: return createClickableElement();
			case UiAndroidPackage.VERTICAL_LAYOUT: return createVerticalLayout();
			case UiAndroidPackage.HORIZONTAL_LAYOUT: return createHorizontalLayout();
			case UiAndroidPackage.APPLICATION: return createApplication();
			case UiAndroidPackage.CLASSE: return createClasse();
			case UiAndroidPackage.ATTRIBUT: return createAttribut();
			case UiAndroidPackage.METHODE: return createMethode();
			case UiAndroidPackage.ACTIVITE: return createActivite();
			case UiAndroidPackage.INTENT_PACKAGE: return createIntentPackage();
			case UiAndroidPackage.INTEGER_ELEMENT: return createIntegerElement();
			case UiAndroidPackage.BOOLEAN_ELEMENT: return createBooleanElement();
			case UiAndroidPackage.CHECKBOX: return createCheckbox();
			case UiAndroidPackage.TIME_PICKER: return createTimePicker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UiAndroidPackage.INT:
				return createintFromString(eDataType, initialValue);
			case UiAndroidPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case UiAndroidPackage.BOOLEAN:
				return createbooleanFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UiAndroidPackage.INT:
				return convertintToString(eDataType, instanceValue);
			case UiAndroidPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case UiAndroidPackage.BOOLEAN:
				return convertbooleanToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualElement createTextualElement() {
		TextualElementImpl textualElement = new TextualElementImpl();
		return textualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueElement createValueElement() {
		ValueElementImpl valueElement = new ValueElementImpl();
		return valueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickableElement createClickableElement() {
		ClickableElementImpl clickableElement = new ClickableElementImpl();
		return clickableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalLayout createVerticalLayout() {
		VerticalLayoutImpl verticalLayout = new VerticalLayoutImpl();
		return verticalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalLayout createHorizontalLayout() {
		HorizontalLayoutImpl horizontalLayout = new HorizontalLayoutImpl();
		return horizontalLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classe createClasse() {
		ClasseImpl classe = new ClasseImpl();
		return classe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribut createAttribut() {
		AttributImpl attribut = new AttributImpl();
		return attribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Methode createMethode() {
		MethodeImpl methode = new MethodeImpl();
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite createActivite() {
		ActiviteImpl activite = new ActiviteImpl();
		return activite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentPackage createIntentPackage() {
		IntentPackageImpl intentPackage = new IntentPackageImpl();
		return intentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerElement createIntegerElement() {
		IntegerElementImpl integerElement = new IntegerElementImpl();
		return integerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanElement createBooleanElement() {
		BooleanElementImpl booleanElement = new BooleanElementImpl();
		return booleanElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkbox createCheckbox() {
		CheckboxImpl checkbox = new CheckboxImpl();
		return checkbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePicker createTimePicker() {
		TimePickerImpl timePicker = new TimePickerImpl();
		return timePicker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createintFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertintToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStringFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createbooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAndroidPackage getUiAndroidPackage() {
		return (UiAndroidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiAndroidPackage getPackage() {
		return UiAndroidPackage.eINSTANCE;
	}

} //UiAndroidFactoryImpl
