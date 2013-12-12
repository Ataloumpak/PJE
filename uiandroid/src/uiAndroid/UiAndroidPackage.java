/**
 */
package uiAndroid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uiAndroid.UiAndroidFactory
 * @model kind="package"
 * @generated
 */
public interface UiAndroidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uiAndroid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///uiAndroid.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uiAndroid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiAndroidPackage eINSTANCE = uiAndroid.impl.UiAndroidPackageImpl.init();

	/**
	 * The meta object id for the '{@link uiAndroid.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.PageImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NOM = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.View <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.View
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ID = 0;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT_HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LAYOUT_GRAVITY = 3;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.LayoutImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYOUT_WIDTH = VIEW__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYOUT_HEIGHT = VIEW__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__LAYOUT_GRAVITY = VIEW__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VIEWS = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ORIENTATION = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.ValueElementImpl <em>Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.ValueElementImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getValueElement()
	 * @generated
	 */
	int VALUE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__ID = VIEW__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__LAYOUT_WIDTH = VIEW__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__LAYOUT_HEIGHT = VIEW__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__LAYOUT_GRAVITY = VIEW__LAYOUT_GRAVITY;

	/**
	 * The number of structural features of the '<em>Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.TextualElementImpl <em>Textual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.TextualElementImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getTextualElement()
	 * @generated
	 */
	int TEXTUAL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT__ID = VALUE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT__LAYOUT_WIDTH = VALUE_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT__LAYOUT_HEIGHT = VALUE_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT__LAYOUT_GRAVITY = VALUE_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT__VALUE = VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Textual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_ELEMENT_OPERATION_COUNT = VALUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.TextImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ID = TEXTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYOUT_WIDTH = TEXTUAL_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYOUT_HEIGHT = TEXTUAL_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYOUT_GRAVITY = TEXTUAL_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = TEXTUAL_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.ClickableElementImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getClickableElement()
	 * @generated
	 */
	int CLICKABLE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__ID = TEXTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__LAYOUT_WIDTH = TEXTUAL_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__LAYOUT_HEIGHT = TEXTUAL_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__LAYOUT_GRAVITY = TEXTUAL_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__VALUE = TEXTUAL_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Clickable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT_FEATURE_COUNT = TEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clickable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT_OPERATION_COUNT = TEXTUAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.ButtonImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = CLICKABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_WIDTH = CLICKABLE_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_HEIGHT = CLICKABLE_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LAYOUT_GRAVITY = CLICKABLE_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VALUE = CLICKABLE_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CLICKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.VerticalLayoutImpl <em>Vertical Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.VerticalLayoutImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getVerticalLayout()
	 * @generated
	 */
	int VERTICAL_LAYOUT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__ID = LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__LAYOUT_WIDTH = LAYOUT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__LAYOUT_HEIGHT = LAYOUT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__LAYOUT_GRAVITY = LAYOUT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__VIEWS = LAYOUT__VIEWS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT__ORIENTATION = LAYOUT__ORIENTATION;

	/**
	 * The number of structural features of the '<em>Vertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertical Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.HorizontalLayoutImpl <em>Horizontal Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.HorizontalLayoutImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getHorizontalLayout()
	 * @generated
	 */
	int HORIZONTAL_LAYOUT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__ID = LAYOUT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__LAYOUT_WIDTH = LAYOUT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__LAYOUT_HEIGHT = LAYOUT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__LAYOUT_GRAVITY = LAYOUT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__VIEWS = LAYOUT__VIEWS;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT__ORIENTATION = LAYOUT__ORIENTATION;

	/**
	 * The number of structural features of the '<em>Horizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT_FEATURE_COUNT = LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LAYOUT_OPERATION_COUNT = LAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.ApplicationImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PAGES = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Activite Principale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ACTIVITE_PRINCIPALE = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.ClasseImpl <em>Classe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.ClasseImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getClasse()
	 * @generated
	 */
	int CLASSE = 11;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__ATTRIBUTS = 0;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__METHODES = 1;

	/**
	 * The feature id for the '<em><b>Nom Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE__NOM_CLASSE = 2;

	/**
	 * The number of structural features of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Classe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.AttributImpl <em>Attribut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.AttributImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getAttribut()
	 * @generated
	 */
	int ATTRIBUT = 12;

	/**
	 * The feature id for the '<em><b>Nom Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__NOM_ATTRIBUT = 0;

	/**
	 * The feature id for the '<em><b>Type Attribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT__TYPE_ATTRIBUT = 1;

	/**
	 * The number of structural features of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attribut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.MethodeImpl <em>Methode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.MethodeImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getMethode()
	 * @generated
	 */
	int METHODE = 13;

	/**
	 * The feature id for the '<em><b>Nom Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__NOM_METHODE = 0;

	/**
	 * The feature id for the '<em><b>Paramètres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__PARAMÈTRES = 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__RETURN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Corps Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE__CORPS_METHODE = 3;

	/**
	 * The number of structural features of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Methode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.ActiviteImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 14;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__ATTRIBUTS = CLASSE__ATTRIBUTS;

	/**
	 * The feature id for the '<em><b>Methodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__METHODES = CLASSE__METHODES;

	/**
	 * The feature id for the '<em><b>Nom Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__NOM_CLASSE = CLASSE__NOM_CLASSE;

	/**
	 * The feature id for the '<em><b>Classe</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__CLASSE = CLASSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Intent Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__INTENT_PACKAGE = CLASSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_FEATURE_COUNT = CLASSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_OPERATION_COUNT = CLASSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.IntentPackageImpl <em>Intent Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.IntentPackageImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getIntentPackage()
	 * @generated
	 */
	int INTENT_PACKAGE = 15;

	/**
	 * The feature id for the '<em><b>Activite Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_PACKAGE__ACTIVITE_CIBLE = 0;

	/**
	 * The feature id for the '<em><b>Pressed Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_PACKAGE__PRESSED_BUTTON = 1;

	/**
	 * The feature id for the '<em><b>Value Transfered Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Intent Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Intent Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.IntegerElementImpl <em>Integer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.IntegerElementImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getIntegerElement()
	 * @generated
	 */
	int INTEGER_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__ID = VALUE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__LAYOUT_WIDTH = VALUE_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__LAYOUT_HEIGHT = VALUE_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__LAYOUT_GRAVITY = VALUE_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__VALUE = VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT_OPERATION_COUNT = VALUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.BooleanElementImpl <em>Boolean Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.BooleanElementImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getBooleanElement()
	 * @generated
	 */
	int BOOLEAN_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__ID = VALUE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__LAYOUT_WIDTH = VALUE_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__LAYOUT_HEIGHT = VALUE_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__LAYOUT_GRAVITY = VALUE_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__VALUE = VALUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT_FEATURE_COUNT = VALUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT_OPERATION_COUNT = VALUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.CheckboxImpl <em>Checkbox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.CheckboxImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getCheckbox()
	 * @generated
	 */
	int CHECKBOX = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__ID = BOOLEAN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LAYOUT_WIDTH = BOOLEAN_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LAYOUT_HEIGHT = BOOLEAN_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__LAYOUT_GRAVITY = BOOLEAN_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX__VALUE = BOOLEAN_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_FEATURE_COUNT = BOOLEAN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Checkbox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKBOX_OPERATION_COUNT = BOOLEAN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uiAndroid.impl.TimePickerImpl <em>Time Picker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.TimePickerImpl
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getTimePicker()
	 * @generated
	 */
	int TIME_PICKER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER__ID = INTEGER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Layout width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER__LAYOUT_WIDTH = INTEGER_ELEMENT__LAYOUT_WIDTH;

	/**
	 * The feature id for the '<em><b>Layout height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER__LAYOUT_HEIGHT = INTEGER_ELEMENT__LAYOUT_HEIGHT;

	/**
	 * The feature id for the '<em><b>Layout gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER__LAYOUT_GRAVITY = INTEGER_ELEMENT__LAYOUT_GRAVITY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER__VALUE = INTEGER_ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_FEATURE_COUNT = INTEGER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Picker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PICKER_OPERATION_COUNT = INTEGER_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getint()
	 * @generated
	 */
	int INT = 20;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see String
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getString()
	 * @generated
	 */
	int STRING = 21;

	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uiAndroid.impl.UiAndroidPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 22;


	/**
	 * Returns the meta object for class '{@link uiAndroid.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see uiAndroid.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference '{@link uiAndroid.Page#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see uiAndroid.Page#getLayout()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Layout();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Page#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see uiAndroid.Page#getNom()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Nom();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see uiAndroid.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link uiAndroid.Layout#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see uiAndroid.Layout#getViews()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Views();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Layout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see uiAndroid.Layout#getOrientation()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Orientation();

	/**
	 * Returns the meta object for class '{@link uiAndroid.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see uiAndroid.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.View#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uiAndroid.View#getId()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Id();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.View#getLayout_width <em>Layout width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout width</em>'.
	 * @see uiAndroid.View#getLayout_width()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Layout_width();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.View#getLayout_height <em>Layout height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout height</em>'.
	 * @see uiAndroid.View#getLayout_height()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Layout_height();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.View#getLayout_gravity <em>Layout gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout gravity</em>'.
	 * @see uiAndroid.View#getLayout_gravity()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Layout_gravity();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see uiAndroid.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link uiAndroid.TextualElement <em>Textual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Element</em>'.
	 * @see uiAndroid.TextualElement
	 * @generated
	 */
	EClass getTextualElement();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.TextualElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uiAndroid.TextualElement#getValue()
	 * @see #getTextualElement()
	 * @generated
	 */
	EAttribute getTextualElement_Value();

	/**
	 * Returns the meta object for class '{@link uiAndroid.ValueElement <em>Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Element</em>'.
	 * @see uiAndroid.ValueElement
	 * @generated
	 */
	EClass getValueElement();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uiAndroid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link uiAndroid.ClickableElement <em>Clickable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clickable Element</em>'.
	 * @see uiAndroid.ClickableElement
	 * @generated
	 */
	EClass getClickableElement();

	/**
	 * Returns the meta object for class '{@link uiAndroid.VerticalLayout <em>Vertical Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Layout</em>'.
	 * @see uiAndroid.VerticalLayout
	 * @generated
	 */
	EClass getVerticalLayout();

	/**
	 * Returns the meta object for class '{@link uiAndroid.HorizontalLayout <em>Horizontal Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Layout</em>'.
	 * @see uiAndroid.HorizontalLayout
	 * @generated
	 */
	EClass getHorizontalLayout();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see uiAndroid.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link uiAndroid.Application#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see uiAndroid.Application#getPages()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link uiAndroid.Application#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see uiAndroid.Application#getClasses()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Classes();

	/**
	 * Returns the meta object for the reference '{@link uiAndroid.Application#getActivite_Principale <em>Activite Principale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Principale</em>'.
	 * @see uiAndroid.Application#getActivite_Principale()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Activite_Principale();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Classe <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classe</em>'.
	 * @see uiAndroid.Classe
	 * @generated
	 */
	EClass getClasse();

	/**
	 * Returns the meta object for the containment reference list '{@link uiAndroid.Classe#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributs</em>'.
	 * @see uiAndroid.Classe#getAttributs()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Attributs();

	/**
	 * Returns the meta object for the containment reference list '{@link uiAndroid.Classe#getMethodes <em>Methodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methodes</em>'.
	 * @see uiAndroid.Classe#getMethodes()
	 * @see #getClasse()
	 * @generated
	 */
	EReference getClasse_Methodes();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Classe#getNomClasse <em>Nom Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Classe</em>'.
	 * @see uiAndroid.Classe#getNomClasse()
	 * @see #getClasse()
	 * @generated
	 */
	EAttribute getClasse_NomClasse();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Attribut <em>Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribut</em>'.
	 * @see uiAndroid.Attribut
	 * @generated
	 */
	EClass getAttribut();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Attribut#getNomAttribut <em>Nom Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Attribut</em>'.
	 * @see uiAndroid.Attribut#getNomAttribut()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_NomAttribut();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Attribut#getTypeAttribut <em>Type Attribut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Attribut</em>'.
	 * @see uiAndroid.Attribut#getTypeAttribut()
	 * @see #getAttribut()
	 * @generated
	 */
	EAttribute getAttribut_TypeAttribut();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Methode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methode</em>'.
	 * @see uiAndroid.Methode
	 * @generated
	 */
	EClass getMethode();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Methode#getNomMethode <em>Nom Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Methode</em>'.
	 * @see uiAndroid.Methode#getNomMethode()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_NomMethode();

	/**
	 * Returns the meta object for the containment reference list '{@link uiAndroid.Methode#getParamètres <em>Paramètres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paramètres</em>'.
	 * @see uiAndroid.Methode#getParamètres()
	 * @see #getMethode()
	 * @generated
	 */
	EReference getMethode_Paramètres();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Methode#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see uiAndroid.Methode#getReturnType()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.Methode#getCorpsMethode <em>Corps Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corps Methode</em>'.
	 * @see uiAndroid.Methode#getCorpsMethode()
	 * @see #getMethode()
	 * @generated
	 */
	EAttribute getMethode_CorpsMethode();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see uiAndroid.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the reference list '{@link uiAndroid.Activite#getClasse <em>Classe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classe</em>'.
	 * @see uiAndroid.Activite#getClasse()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Classe();

	/**
	 * Returns the meta object for the containment reference '{@link uiAndroid.Activite#getIntentPackage <em>Intent Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intent Package</em>'.
	 * @see uiAndroid.Activite#getIntentPackage()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_IntentPackage();

	/**
	 * Returns the meta object for class '{@link uiAndroid.IntentPackage <em>Intent Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent Package</em>'.
	 * @see uiAndroid.IntentPackage
	 * @generated
	 */
	EClass getIntentPackage();

	/**
	 * Returns the meta object for the reference '{@link uiAndroid.IntentPackage#getActiviteCible <em>Activite Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Cible</em>'.
	 * @see uiAndroid.IntentPackage#getActiviteCible()
	 * @see #getIntentPackage()
	 * @generated
	 */
	EReference getIntentPackage_ActiviteCible();

	/**
	 * Returns the meta object for the reference '{@link uiAndroid.IntentPackage#getPressedButton <em>Pressed Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pressed Button</em>'.
	 * @see uiAndroid.IntentPackage#getPressedButton()
	 * @see #getIntentPackage()
	 * @generated
	 */
	EReference getIntentPackage_PressedButton();

	/**
	 * Returns the meta object for the reference list '{@link uiAndroid.IntentPackage#getValueTransferedElement <em>Value Transfered Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Transfered Element</em>'.
	 * @see uiAndroid.IntentPackage#getValueTransferedElement()
	 * @see #getIntentPackage()
	 * @generated
	 */
	EReference getIntentPackage_ValueTransferedElement();

	/**
	 * Returns the meta object for class '{@link uiAndroid.IntegerElement <em>Integer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Element</em>'.
	 * @see uiAndroid.IntegerElement
	 * @generated
	 */
	EClass getIntegerElement();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.IntegerElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uiAndroid.IntegerElement#getValue()
	 * @see #getIntegerElement()
	 * @generated
	 */
	EAttribute getIntegerElement_Value();

	/**
	 * Returns the meta object for class '{@link uiAndroid.BooleanElement <em>Boolean Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Element</em>'.
	 * @see uiAndroid.BooleanElement
	 * @generated
	 */
	EClass getBooleanElement();

	/**
	 * Returns the meta object for the attribute '{@link uiAndroid.BooleanElement#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uiAndroid.BooleanElement#isValue()
	 * @see #getBooleanElement()
	 * @generated
	 */
	EAttribute getBooleanElement_Value();

	/**
	 * Returns the meta object for class '{@link uiAndroid.Checkbox <em>Checkbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkbox</em>'.
	 * @see uiAndroid.Checkbox
	 * @generated
	 */
	EClass getCheckbox();

	/**
	 * Returns the meta object for class '{@link uiAndroid.TimePicker <em>Time Picker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Picker</em>'.
	 * @see uiAndroid.TimePicker
	 * @generated
	 */
	EClass getTimePicker();

	/**
	 * Returns the meta object for data type '<em>int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>int</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getint();

	/**
	 * Returns the meta object for data type '{@link String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see String
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getboolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiAndroidFactory getUiAndroidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uiAndroid.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.PageImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LAYOUT = eINSTANCE.getPage_Layout();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NOM = eINSTANCE.getPage_Nom();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.LayoutImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__VIEWS = eINSTANCE.getLayout_Views();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ORIENTATION = eINSTANCE.getLayout_Orientation();

		/**
		 * The meta object literal for the '{@link uiAndroid.View <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.View
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__ID = eINSTANCE.getView_Id();

		/**
		 * The meta object literal for the '<em><b>Layout width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LAYOUT_WIDTH = eINSTANCE.getView_Layout_width();

		/**
		 * The meta object literal for the '<em><b>Layout height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LAYOUT_HEIGHT = eINSTANCE.getView_Layout_height();

		/**
		 * The meta object literal for the '<em><b>Layout gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__LAYOUT_GRAVITY = eINSTANCE.getView_Layout_gravity();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.TextImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.TextualElementImpl <em>Textual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.TextualElementImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getTextualElement()
		 * @generated
		 */
		EClass TEXTUAL_ELEMENT = eINSTANCE.getTextualElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_ELEMENT__VALUE = eINSTANCE.getTextualElement_Value();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.ValueElementImpl <em>Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.ValueElementImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getValueElement()
		 * @generated
		 */
		EClass VALUE_ELEMENT = eINSTANCE.getValueElement();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.ButtonImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.ClickableElementImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getClickableElement()
		 * @generated
		 */
		EClass CLICKABLE_ELEMENT = eINSTANCE.getClickableElement();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.VerticalLayoutImpl <em>Vertical Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.VerticalLayoutImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getVerticalLayout()
		 * @generated
		 */
		EClass VERTICAL_LAYOUT = eINSTANCE.getVerticalLayout();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.HorizontalLayoutImpl <em>Horizontal Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.HorizontalLayoutImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getHorizontalLayout()
		 * @generated
		 */
		EClass HORIZONTAL_LAYOUT = eINSTANCE.getHorizontalLayout();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.ApplicationImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__PAGES = eINSTANCE.getApplication_Pages();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CLASSES = eINSTANCE.getApplication_Classes();

		/**
		 * The meta object literal for the '<em><b>Activite Principale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ACTIVITE_PRINCIPALE = eINSTANCE.getApplication_Activite_Principale();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.ClasseImpl <em>Classe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.ClasseImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getClasse()
		 * @generated
		 */
		EClass CLASSE = eINSTANCE.getClasse();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__ATTRIBUTS = eINSTANCE.getClasse_Attributs();

		/**
		 * The meta object literal for the '<em><b>Methodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSE__METHODES = eINSTANCE.getClasse_Methodes();

		/**
		 * The meta object literal for the '<em><b>Nom Classe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSE__NOM_CLASSE = eINSTANCE.getClasse_NomClasse();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.AttributImpl <em>Attribut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.AttributImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getAttribut()
		 * @generated
		 */
		EClass ATTRIBUT = eINSTANCE.getAttribut();

		/**
		 * The meta object literal for the '<em><b>Nom Attribut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__NOM_ATTRIBUT = eINSTANCE.getAttribut_NomAttribut();

		/**
		 * The meta object literal for the '<em><b>Type Attribut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUT__TYPE_ATTRIBUT = eINSTANCE.getAttribut_TypeAttribut();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.MethodeImpl <em>Methode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.MethodeImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getMethode()
		 * @generated
		 */
		EClass METHODE = eINSTANCE.getMethode();

		/**
		 * The meta object literal for the '<em><b>Nom Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__NOM_METHODE = eINSTANCE.getMethode_NomMethode();

		/**
		 * The meta object literal for the '<em><b>Paramètres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODE__PARAMÈTRES = eINSTANCE.getMethode_Paramètres();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__RETURN_TYPE = eINSTANCE.getMethode_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Corps Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHODE__CORPS_METHODE = eINSTANCE.getMethode_CorpsMethode();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.ActiviteImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getActivite()
		 * @generated
		 */
		EClass ACTIVITE = eINSTANCE.getActivite();

		/**
		 * The meta object literal for the '<em><b>Classe</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__CLASSE = eINSTANCE.getActivite_Classe();

		/**
		 * The meta object literal for the '<em><b>Intent Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__INTENT_PACKAGE = eINSTANCE.getActivite_IntentPackage();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.IntentPackageImpl <em>Intent Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.IntentPackageImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getIntentPackage()
		 * @generated
		 */
		EClass INTENT_PACKAGE = eINSTANCE.getIntentPackage();

		/**
		 * The meta object literal for the '<em><b>Activite Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_PACKAGE__ACTIVITE_CIBLE = eINSTANCE.getIntentPackage_ActiviteCible();

		/**
		 * The meta object literal for the '<em><b>Pressed Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_PACKAGE__PRESSED_BUTTON = eINSTANCE.getIntentPackage_PressedButton();

		/**
		 * The meta object literal for the '<em><b>Value Transfered Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT_PACKAGE__VALUE_TRANSFERED_ELEMENT = eINSTANCE.getIntentPackage_ValueTransferedElement();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.IntegerElementImpl <em>Integer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.IntegerElementImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getIntegerElement()
		 * @generated
		 */
		EClass INTEGER_ELEMENT = eINSTANCE.getIntegerElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ELEMENT__VALUE = eINSTANCE.getIntegerElement_Value();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.BooleanElementImpl <em>Boolean Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.BooleanElementImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getBooleanElement()
		 * @generated
		 */
		EClass BOOLEAN_ELEMENT = eINSTANCE.getBooleanElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ELEMENT__VALUE = eINSTANCE.getBooleanElement_Value();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.CheckboxImpl <em>Checkbox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.CheckboxImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getCheckbox()
		 * @generated
		 */
		EClass CHECKBOX = eINSTANCE.getCheckbox();

		/**
		 * The meta object literal for the '{@link uiAndroid.impl.TimePickerImpl <em>Time Picker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.TimePickerImpl
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getTimePicker()
		 * @generated
		 */
		EClass TIME_PICKER = eINSTANCE.getTimePicker();

		/**
		 * The meta object literal for the '<em>int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getint()
		 * @generated
		 */
		EDataType INT = eINSTANCE.getint();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see String
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uiAndroid.impl.UiAndroidPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

	}

} //UiAndroidPackage
