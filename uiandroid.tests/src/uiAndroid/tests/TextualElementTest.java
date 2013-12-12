/**
 */
package uiAndroid.tests;

import junit.textui.TestRunner;
import uiAndroid.TextualElement;
import uiAndroid.UiAndroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Textual Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualElementTest extends ValueElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextualElementTest.class);
	}

	/**
	 * Constructs a new Textual Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Textual Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextualElement getFixture() {
		return (TextualElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiAndroidFactory.eINSTANCE.createTextualElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TextualElementTest
