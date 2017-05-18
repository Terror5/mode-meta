/**
 */
package com.fun.statemachine.statemachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.fun.statemachine.statemachine.CompositeState#getSubstate <em>Substate</em>}</li>
 * </ul>
 *
 * @see com.fun.statemachine.statemachine.StatemachinePackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>Substate</b></em>' containment reference list.
	 * The list contents are of type {@link com.fun.statemachine.statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substate</em>' containment reference list.
	 * @see com.fun.statemachine.statemachine.StatemachinePackage#getCompositeState_Substate()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getSubstate();

} // CompositeState
