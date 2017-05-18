/**
 */
package com.fun.gantt.gantt.tests;

import com.fun.gantt.gantt.GanttFactory;
import com.fun.gantt.gantt.Summary;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Summary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SummaryTest extends TestCase {

	/**
	 * The fixture for this Summary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Summary fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SummaryTest.class);
	}

	/**
	 * Constructs a new Summary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Summary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Summary fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Summary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Summary getFixture() {
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
		setFixture(GanttFactory.eINSTANCE.createSummary());
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

} //SummaryTest
