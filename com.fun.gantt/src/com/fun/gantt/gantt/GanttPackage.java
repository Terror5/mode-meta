/**
 */
package com.fun.gantt.gantt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.fun.gantt.gantt.GanttFactory
 * @model kind="package"
 * @generated
 */
public interface GanttPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gantt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gantt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gantt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GanttPackage eINSTANCE = com.fun.gantt.gantt.impl.GanttPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.fun.gantt.gantt.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fun.gantt.gantt.impl.ActivityImpl
	 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Is Milestone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__IS_MILESTONE = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fun.gantt.gantt.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fun.gantt.gantt.impl.ProjectImpl
	 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fun.gantt.gantt.impl.SummaryImpl <em>Summary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fun.gantt.gantt.impl.SummaryImpl
	 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getSummary()
	 * @generated
	 */
	int SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Summary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.fun.gantt.gantt.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.fun.gantt.gantt.impl.DependencyImpl
	 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 3;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Start To Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__START_TO_START = 1;

	/**
	 * The feature id for the '<em><b>Finish To Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__FINISH_TO_FINISH = 2;

	/**
	 * The feature id for the '<em><b>Start To Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__START_TO_FINISH = 3;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.fun.gantt.gantt.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see com.fun.gantt.gantt.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fun.gantt.gantt.Activity#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see com.fun.gantt.gantt.Activity#getDependency()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fun.gantt.gantt.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Activity#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.fun.gantt.gantt.Activity#getDuration()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Activity#isIsMilestone <em>Is Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Milestone</em>'.
	 * @see com.fun.gantt.gantt.Activity#isIsMilestone()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_IsMilestone();

	/**
	 * Returns the meta object for class '{@link com.fun.gantt.gantt.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.fun.gantt.gantt.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fun.gantt.gantt.Project#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Summary</em>'.
	 * @see com.fun.gantt.gantt.Project#getSummary()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Summary();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Project#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see com.fun.gantt.gantt.Project#getDuration()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Duration();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fun.gantt.gantt.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for class '{@link com.fun.gantt.gantt.Summary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summary</em>'.
	 * @see com.fun.gantt.gantt.Summary
	 * @generated
	 */
	EClass getSummary();

	/**
	 * Returns the meta object for the containment reference list '{@link com.fun.gantt.gantt.Summary#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see com.fun.gantt.gantt.Summary#getActivity()
	 * @see #getSummary()
	 * @generated
	 */
	EReference getSummary_Activity();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Summary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.fun.gantt.gantt.Summary#getName()
	 * @see #getSummary()
	 * @generated
	 */
	EAttribute getSummary_Name();

	/**
	 * Returns the meta object for class '{@link com.fun.gantt.gantt.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see com.fun.gantt.gantt.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link com.fun.gantt.gantt.Dependency#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see com.fun.gantt.gantt.Dependency#getActivity()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Activity();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Dependency#isStartToStart <em>Start To Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start To Start</em>'.
	 * @see com.fun.gantt.gantt.Dependency#isStartToStart()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_StartToStart();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Dependency#isFinishToFinish <em>Finish To Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish To Finish</em>'.
	 * @see com.fun.gantt.gantt.Dependency#isFinishToFinish()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_FinishToFinish();

	/**
	 * Returns the meta object for the attribute '{@link com.fun.gantt.gantt.Dependency#isStartToFinish <em>Start To Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start To Finish</em>'.
	 * @see com.fun.gantt.gantt.Dependency#isStartToFinish()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_StartToFinish();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GanttFactory getGanttFactory();

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
		 * The meta object literal for the '{@link com.fun.gantt.gantt.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fun.gantt.gantt.impl.ActivityImpl
		 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DEPENDENCY = eINSTANCE.getActivity_Dependency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__DURATION = eINSTANCE.getActivity_Duration();

		/**
		 * The meta object literal for the '<em><b>Is Milestone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__IS_MILESTONE = eINSTANCE.getActivity_IsMilestone();

		/**
		 * The meta object literal for the '{@link com.fun.gantt.gantt.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fun.gantt.gantt.impl.ProjectImpl
		 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SUMMARY = eINSTANCE.getProject_Summary();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DURATION = eINSTANCE.getProject_Duration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '{@link com.fun.gantt.gantt.impl.SummaryImpl <em>Summary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fun.gantt.gantt.impl.SummaryImpl
		 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getSummary()
		 * @generated
		 */
		EClass SUMMARY = eINSTANCE.getSummary();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMARY__ACTIVITY = eINSTANCE.getSummary_Activity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUMMARY__NAME = eINSTANCE.getSummary_Name();

		/**
		 * The meta object literal for the '{@link com.fun.gantt.gantt.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.fun.gantt.gantt.impl.DependencyImpl
		 * @see com.fun.gantt.gantt.impl.GanttPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__ACTIVITY = eINSTANCE.getDependency_Activity();

		/**
		 * The meta object literal for the '<em><b>Start To Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__START_TO_START = eINSTANCE.getDependency_StartToStart();

		/**
		 * The meta object literal for the '<em><b>Finish To Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__FINISH_TO_FINISH = eINSTANCE.getDependency_FinishToFinish();

		/**
		 * The meta object literal for the '<em><b>Start To Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__START_TO_FINISH = eINSTANCE.getDependency_StartToFinish();

	}

} //GanttPackage
