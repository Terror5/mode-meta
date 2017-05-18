/**
 */
package com.fun.gantt.gantt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fun.gantt.gantt.Dependency#getActivity <em>Activity</em>}</li>
 *   <li>{@link com.fun.gantt.gantt.Dependency#isStartToStart <em>Start To Start</em>}</li>
 *   <li>{@link com.fun.gantt.gantt.Dependency#isFinishToFinish <em>Finish To Finish</em>}</li>
 *   <li>{@link com.fun.gantt.gantt.Dependency#isStartToFinish <em>Start To Finish</em>}</li>
 * </ul>
 *
 * @see com.fun.gantt.gantt.GanttPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see com.fun.gantt.gantt.GanttPackage#getDependency_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link com.fun.gantt.gantt.Dependency#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Start To Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start To Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start To Start</em>' attribute.
	 * @see #setStartToStart(boolean)
	 * @see com.fun.gantt.gantt.GanttPackage#getDependency_StartToStart()
	 * @model
	 * @generated
	 */
	boolean isStartToStart();

	/**
	 * Sets the value of the '{@link com.fun.gantt.gantt.Dependency#isStartToStart <em>Start To Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start To Start</em>' attribute.
	 * @see #isStartToStart()
	 * @generated
	 */
	void setStartToStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Finish To Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish To Finish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish To Finish</em>' attribute.
	 * @see #setFinishToFinish(boolean)
	 * @see com.fun.gantt.gantt.GanttPackage#getDependency_FinishToFinish()
	 * @model
	 * @generated
	 */
	boolean isFinishToFinish();

	/**
	 * Sets the value of the '{@link com.fun.gantt.gantt.Dependency#isFinishToFinish <em>Finish To Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish To Finish</em>' attribute.
	 * @see #isFinishToFinish()
	 * @generated
	 */
	void setFinishToFinish(boolean value);

	/**
	 * Returns the value of the '<em><b>Start To Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start To Finish</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start To Finish</em>' attribute.
	 * @see #setStartToFinish(boolean)
	 * @see com.fun.gantt.gantt.GanttPackage#getDependency_StartToFinish()
	 * @model
	 * @generated
	 */
	boolean isStartToFinish();

	/**
	 * Sets the value of the '{@link com.fun.gantt.gantt.Dependency#isStartToFinish <em>Start To Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start To Finish</em>' attribute.
	 * @see #isStartToFinish()
	 * @generated
	 */
	void setStartToFinish(boolean value);

} // Dependency
