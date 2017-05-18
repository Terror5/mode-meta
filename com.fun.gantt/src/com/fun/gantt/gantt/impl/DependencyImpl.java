/**
 */
package com.fun.gantt.gantt.impl;

import com.fun.gantt.gantt.Activity;
import com.fun.gantt.gantt.Dependency;
import com.fun.gantt.gantt.GanttPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.fun.gantt.gantt.impl.DependencyImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link com.fun.gantt.gantt.impl.DependencyImpl#isStartToStart <em>Start To Start</em>}</li>
 *   <li>{@link com.fun.gantt.gantt.impl.DependencyImpl#isFinishToFinish <em>Finish To Finish</em>}</li>
 *   <li>{@link com.fun.gantt.gantt.impl.DependencyImpl#isStartToFinish <em>Start To Finish</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency {
	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The default value of the '{@link #isStartToStart() <em>Start To Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartToStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_TO_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartToStart() <em>Start To Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartToStart()
	 * @generated
	 * @ordered
	 */
	protected boolean startToStart = START_TO_START_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinishToFinish() <em>Finish To Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinishToFinish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISH_TO_FINISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinishToFinish() <em>Finish To Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinishToFinish()
	 * @generated
	 * @ordered
	 */
	protected boolean finishToFinish = FINISH_TO_FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #isStartToFinish() <em>Start To Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartToFinish()
	 * @generated
	 * @ordered
	 */
	protected static final boolean START_TO_FINISH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStartToFinish() <em>Start To Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStartToFinish()
	 * @generated
	 * @ordered
	 */
	protected boolean startToFinish = START_TO_FINISH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GanttPackage.Literals.DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject)activity;
			activity = (Activity)eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GanttPackage.DEPENDENCY__ACTIVITY, oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GanttPackage.DEPENDENCY__ACTIVITY, oldActivity, activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartToStart() {
		return startToStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartToStart(boolean newStartToStart) {
		boolean oldStartToStart = startToStart;
		startToStart = newStartToStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GanttPackage.DEPENDENCY__START_TO_START, oldStartToStart, startToStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinishToFinish() {
		return finishToFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinishToFinish(boolean newFinishToFinish) {
		boolean oldFinishToFinish = finishToFinish;
		finishToFinish = newFinishToFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GanttPackage.DEPENDENCY__FINISH_TO_FINISH, oldFinishToFinish, finishToFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStartToFinish() {
		return startToFinish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartToFinish(boolean newStartToFinish) {
		boolean oldStartToFinish = startToFinish;
		startToFinish = newStartToFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GanttPackage.DEPENDENCY__START_TO_FINISH, oldStartToFinish, startToFinish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GanttPackage.DEPENDENCY__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
			case GanttPackage.DEPENDENCY__START_TO_START:
				return isStartToStart();
			case GanttPackage.DEPENDENCY__FINISH_TO_FINISH:
				return isFinishToFinish();
			case GanttPackage.DEPENDENCY__START_TO_FINISH:
				return isStartToFinish();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GanttPackage.DEPENDENCY__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case GanttPackage.DEPENDENCY__START_TO_START:
				setStartToStart((Boolean)newValue);
				return;
			case GanttPackage.DEPENDENCY__FINISH_TO_FINISH:
				setFinishToFinish((Boolean)newValue);
				return;
			case GanttPackage.DEPENDENCY__START_TO_FINISH:
				setStartToFinish((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GanttPackage.DEPENDENCY__ACTIVITY:
				setActivity((Activity)null);
				return;
			case GanttPackage.DEPENDENCY__START_TO_START:
				setStartToStart(START_TO_START_EDEFAULT);
				return;
			case GanttPackage.DEPENDENCY__FINISH_TO_FINISH:
				setFinishToFinish(FINISH_TO_FINISH_EDEFAULT);
				return;
			case GanttPackage.DEPENDENCY__START_TO_FINISH:
				setStartToFinish(START_TO_FINISH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GanttPackage.DEPENDENCY__ACTIVITY:
				return activity != null;
			case GanttPackage.DEPENDENCY__START_TO_START:
				return startToStart != START_TO_START_EDEFAULT;
			case GanttPackage.DEPENDENCY__FINISH_TO_FINISH:
				return finishToFinish != FINISH_TO_FINISH_EDEFAULT;
			case GanttPackage.DEPENDENCY__START_TO_FINISH:
				return startToFinish != START_TO_FINISH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startToStart: ");
		result.append(startToStart);
		result.append(", finishToFinish: ");
		result.append(finishToFinish);
		result.append(", startToFinish: ");
		result.append(startToFinish);
		result.append(')');
		return result.toString();
	}

} //DependencyImpl
