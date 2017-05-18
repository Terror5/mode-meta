/*
 * generated by Xtext 2.10.0
 */
package com.fun.gantt.example.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SMDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class EntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.fun.gantt.example.SMDSL.Entry");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActivityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDependencyParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Entry:
		//	Activity | Dependency;
		@Override public ParserRule getRule() { return rule; }
		
		//Activity | Dependency
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Activity
		public RuleCall getActivityParserRuleCall_0() { return cActivityParserRuleCall_0; }
		
		//Dependency
		public RuleCall getDependencyParserRuleCall_1() { return cDependencyParserRuleCall_1; }
	}
	public class ActivityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.fun.gantt.example.SMDSL.Activity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cActivityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContentsEntryParserRuleCall_3_0 = (RuleCall)cContentsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Activity:
		//	'Activity' name=ID '{' contents+=Entry* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Activity' name=ID '{' contents+=Entry* '}'
		public Group getGroup() { return cGroup; }
		
		//'Activity'
		public Keyword getActivityKeyword_0() { return cActivityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//contents+=Entry*
		public Assignment getContentsAssignment_3() { return cContentsAssignment_3; }
		
		//Entry
		public RuleCall getContentsEntryParserRuleCall_3_0() { return cContentsEntryParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DependencyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.fun.gantt.example.SMDSL.Dependency");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDependencyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cToActivityCrossReference_2_0 = (CrossReference)cToAssignment_2.eContents().get(0);
		private final RuleCall cToActivityIDTerminalRuleCall_2_0_1 = (RuleCall)cToActivityCrossReference_2_0.eContents().get(1);
		
		//Dependency:
		//	'Dependency' '->' to=[Activity];
		@Override public ParserRule getRule() { return rule; }
		
		//'Dependency' '->' to=[Activity]
		public Group getGroup() { return cGroup; }
		
		//'Dependency'
		public Keyword getDependencyKeyword_0() { return cDependencyKeyword_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//to=[Activity]
		public Assignment getToAssignment_2() { return cToAssignment_2; }
		
		//[Activity]
		public CrossReference getToActivityCrossReference_2_0() { return cToActivityCrossReference_2_0; }
		
		//ID
		public RuleCall getToActivityIDTerminalRuleCall_2_0_1() { return cToActivityIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final EntryElements pEntry;
	private final ActivityElements pActivity;
	private final DependencyElements pDependency;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SMDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntry = new EntryElements();
		this.pActivity = new ActivityElements();
		this.pDependency = new DependencyElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.fun.gantt.example.SMDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Entry:
	//	Activity | Dependency;
	public EntryElements getEntryAccess() {
		return pEntry;
	}
	
	public ParserRule getEntryRule() {
		return getEntryAccess().getRule();
	}
	
	//Activity:
	//	'Activity' name=ID '{' contents+=Entry* '}';
	public ActivityElements getActivityAccess() {
		return pActivity;
	}
	
	public ParserRule getActivityRule() {
		return getActivityAccess().getRule();
	}
	
	//Dependency:
	//	'Dependency' '->' to=[Activity];
	public DependencyElements getDependencyAccess() {
		return pDependency;
	}
	
	public ParserRule getDependencyRule() {
		return getDependencyAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
