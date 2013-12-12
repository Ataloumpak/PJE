/**
 */
package uiAndroid.tests;

import junit.textui.TestRunner;

import uiAndroid.TimePicker;
import uiAndroid.UiAndroidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Picker</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimePickerTest extends IntegerElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimePickerTest.class);
	}

	/**
	 * Constructs a new Time Picker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePickerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Picker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimePicker getFixture() {
		return (TimePicker)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UiAndroidFactory.eINSTANCE.createTimePicker());
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

} //TimePickerTest
