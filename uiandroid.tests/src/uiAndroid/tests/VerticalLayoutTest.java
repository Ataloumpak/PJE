/**
 */
package uiAndroid.tests;

import junit.textui.TestRunner;

import uiAndroid.UiAndroidFactory;
import uiAndroid.VerticalLayout;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vertical Layout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VerticalLayoutTest extends LayoutTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VerticalLayoutTest.class);
	}

	/**
	 * Constructs a new Vertical Layout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalLayoutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vertical Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VerticalLayout getFixture() {
		return (VerticalLayout)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiAndroidFactory.eINSTANCE.createVerticalLayout());
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

} //VerticalLayoutTest
