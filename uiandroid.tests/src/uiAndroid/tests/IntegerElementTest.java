/**
 */
package uiAndroid.tests;

import junit.textui.TestRunner;

import uiAndroid.IntegerElement;
import uiAndroid.UiAndroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerElementTest extends ValueElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerElementTest.class);
	}

	/**
	 * Constructs a new Integer Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerElement getFixture() {
		return (IntegerElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiAndroidFactory.eINSTANCE.createIntegerElement());
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

} //IntegerElementTest
