/**
 */
package uiAndroid.tests;

import junit.textui.TestRunner;

import uiAndroid.HorizontalLayout;
import uiAndroid.UiAndroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Horizontal Layout</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalLayoutTest extends LayoutTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HorizontalLayoutTest.class);
	}

	/**
	 * Constructs a new Horizontal Layout test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalLayoutTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Horizontal Layout test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HorizontalLayout getFixture() {
		return (HorizontalLayout)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiAndroidFactory.eINSTANCE.createHorizontalLayout());
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

} //HorizontalLayoutTest
