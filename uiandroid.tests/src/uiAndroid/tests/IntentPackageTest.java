/**
 */
package uiAndroid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uiAndroid.IntentPackage;
import uiAndroid.UiAndroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intent Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntentPackageTest extends TestCase {

	/**
	 * The fixture for this Intent Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentPackage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntentPackageTest.class);
	}

	/**
	 * Constructs a new Intent Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentPackageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Intent Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IntentPackage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Intent Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentPackage getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiAndroidFactory.eINSTANCE.createIntentPackage());
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

} //IntentPackageTest
