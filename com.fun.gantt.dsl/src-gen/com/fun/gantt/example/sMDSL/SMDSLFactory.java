/**
 * generated by Xtext 2.10.0
 */
package com.fun.gantt.example.sMDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.fun.gantt.example.sMDSL.SMDSLPackage
 * @generated
 */
public interface SMDSLFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SMDSLFactory eINSTANCE = com.fun.gantt.example.sMDSL.impl.SMDSLFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
  Entry createEntry();

  /**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
  Activity createActivity();

  /**
	 * Returns a new object of class '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency</em>'.
	 * @generated
	 */
  Dependency createDependency();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SMDSLPackage getSMDSLPackage();

} //SMDSLFactory
