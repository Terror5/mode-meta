/*
 * generated by Xtext 2.10.0
 */
package com.fun.gantt.example


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SMDSLStandaloneSetup extends SMDSLStandaloneSetupGenerated {

	def static void doSetup() {
		new SMDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}