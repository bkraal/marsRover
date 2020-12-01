/*
 * generated by Xtext 2.23.0
 */
package mars.rover.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RoverDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MissionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.Mission");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMissionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMissiontypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMissiontypeMissionTypeEnumRuleCall_1_0 = (RuleCall)cMissiontypeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cBeginSentenceKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cBeginsentenceAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cBeginsentenceSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cBeginsentenceAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cOuterBorderKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBorderAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBorderSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cBorderAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cForwardSpeedKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cForwardspeedAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cForwardspeedINTTerminalRuleCall_4_1_0 = (RuleCall)cForwardspeedAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cReverseSpeedKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cReversespeedAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cReversespeedINTTerminalRuleCall_5_1_0 = (RuleCall)cReversespeedAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTurnDirectionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTurndirectionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cTurndirectionINTTerminalRuleCall_6_1_0 = (RuleCall)cTurndirectionAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cColorsKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cColorlistAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cColorlistColorsParserRuleCall_7_1_0 = (RuleCall)cColorlistAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cSensorsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cSensorlistAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cSensorlistSensorsParserRuleCall_8_1_0 = (RuleCall)cSensorlistAssignment_8_1.eContents().get(0);
		private final Keyword cEndKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTerminationconditionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTerminationconditionSTRINGTerminalRuleCall_10_0 = (RuleCall)cTerminationconditionAssignment_10.eContents().get(0);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cFlashingColorKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cFlashingcolorAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final RuleCall cFlashingcolorSTRINGTerminalRuleCall_11_1_0 = (RuleCall)cFlashingcolorAssignment_11_1.eContents().get(0);
		private final Group cGroup_12 = (Group)cGroup.eContents().get(12);
		private final Keyword cFinalSentenceKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final Assignment cFinalsentenceAssignment_12_1 = (Assignment)cGroup_12.eContents().get(1);
		private final RuleCall cFinalsentenceSTRINGTerminalRuleCall_12_1_0 = (RuleCall)cFinalsentenceAssignment_12_1.eContents().get(0);
		
		////Model:
		////	greetings+=Greeting*;
		////Greeting:
		////	'Hello' name=ID '!';
		//// test for new commit Jurian 2
		//Mission:
		//	'Mission:' missiontype=MissionType ('BeginSentence:' beginsentence=STRING)? ('OuterBorder:' border=STRING)?
		//	('ForwardSpeed:' forwardspeed=INT)? ('ReverseSpeed:' reversespeed=INT)? ('TurnDirection:' turndirection=INT)?
		//	('Colors:' colorlist+=Colors*)? ('Sensors:' sensorlist+=Sensors*)?
		//	'End:' terminationcondition=STRING ('FlashingColor:' flashingcolor=STRING)? ('FinalSentence:' finalsentence=STRING)? // For robot to say when mission is done. Maybe change final sentence to song? (validate options) Optional, default white
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Mission:' missiontype=MissionType ('BeginSentence:' beginsentence=STRING)? ('OuterBorder:' border=STRING)?
		//('ForwardSpeed:' forwardspeed=INT)? ('ReverseSpeed:' reversespeed=INT)? ('TurnDirection:' turndirection=INT)?
		//('Colors:' colorlist+=Colors*)? ('Sensors:' sensorlist+=Sensors*)? 'End:' terminationcondition=STRING
		//('FlashingColor:' flashingcolor=STRING)? ('FinalSentence:' finalsentence=STRING)?
		public Group getGroup() { return cGroup; }
		
		//'Mission:'
		public Keyword getMissionKeyword_0() { return cMissionKeyword_0; }
		
		//missiontype=MissionType
		public Assignment getMissiontypeAssignment_1() { return cMissiontypeAssignment_1; }
		
		//MissionType
		public RuleCall getMissiontypeMissionTypeEnumRuleCall_1_0() { return cMissiontypeMissionTypeEnumRuleCall_1_0; }
		
		//('BeginSentence:' beginsentence=STRING)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'BeginSentence:'
		public Keyword getBeginSentenceKeyword_2_0() { return cBeginSentenceKeyword_2_0; }
		
		//beginsentence=STRING
		public Assignment getBeginsentenceAssignment_2_1() { return cBeginsentenceAssignment_2_1; }
		
		//STRING
		public RuleCall getBeginsentenceSTRINGTerminalRuleCall_2_1_0() { return cBeginsentenceSTRINGTerminalRuleCall_2_1_0; }
		
		//('OuterBorder:' border=STRING)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'OuterBorder:'
		public Keyword getOuterBorderKeyword_3_0() { return cOuterBorderKeyword_3_0; }
		
		//border=STRING
		public Assignment getBorderAssignment_3_1() { return cBorderAssignment_3_1; }
		
		//STRING
		public RuleCall getBorderSTRINGTerminalRuleCall_3_1_0() { return cBorderSTRINGTerminalRuleCall_3_1_0; }
		
		//('ForwardSpeed:' forwardspeed=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'ForwardSpeed:'
		public Keyword getForwardSpeedKeyword_4_0() { return cForwardSpeedKeyword_4_0; }
		
		//forwardspeed=INT
		public Assignment getForwardspeedAssignment_4_1() { return cForwardspeedAssignment_4_1; }
		
		//INT
		public RuleCall getForwardspeedINTTerminalRuleCall_4_1_0() { return cForwardspeedINTTerminalRuleCall_4_1_0; }
		
		//('ReverseSpeed:' reversespeed=INT)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'ReverseSpeed:'
		public Keyword getReverseSpeedKeyword_5_0() { return cReverseSpeedKeyword_5_0; }
		
		//reversespeed=INT
		public Assignment getReversespeedAssignment_5_1() { return cReversespeedAssignment_5_1; }
		
		//INT
		public RuleCall getReversespeedINTTerminalRuleCall_5_1_0() { return cReversespeedINTTerminalRuleCall_5_1_0; }
		
		//('TurnDirection:' turndirection=INT)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'TurnDirection:'
		public Keyword getTurnDirectionKeyword_6_0() { return cTurnDirectionKeyword_6_0; }
		
		//turndirection=INT
		public Assignment getTurndirectionAssignment_6_1() { return cTurndirectionAssignment_6_1; }
		
		//INT
		public RuleCall getTurndirectionINTTerminalRuleCall_6_1_0() { return cTurndirectionINTTerminalRuleCall_6_1_0; }
		
		//('Colors:' colorlist+=Colors*)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'Colors:'
		public Keyword getColorsKeyword_7_0() { return cColorsKeyword_7_0; }
		
		//colorlist+=Colors*
		public Assignment getColorlistAssignment_7_1() { return cColorlistAssignment_7_1; }
		
		//Colors
		public RuleCall getColorlistColorsParserRuleCall_7_1_0() { return cColorlistColorsParserRuleCall_7_1_0; }
		
		//('Sensors:' sensorlist+=Sensors*)?
		public Group getGroup_8() { return cGroup_8; }
		
		//'Sensors:'
		public Keyword getSensorsKeyword_8_0() { return cSensorsKeyword_8_0; }
		
		//sensorlist+=Sensors*
		public Assignment getSensorlistAssignment_8_1() { return cSensorlistAssignment_8_1; }
		
		//Sensors
		public RuleCall getSensorlistSensorsParserRuleCall_8_1_0() { return cSensorlistSensorsParserRuleCall_8_1_0; }
		
		//'End:'
		public Keyword getEndKeyword_9() { return cEndKeyword_9; }
		
		//terminationcondition=STRING
		public Assignment getTerminationconditionAssignment_10() { return cTerminationconditionAssignment_10; }
		
		//STRING
		public RuleCall getTerminationconditionSTRINGTerminalRuleCall_10_0() { return cTerminationconditionSTRINGTerminalRuleCall_10_0; }
		
		//('FlashingColor:' flashingcolor=STRING)?
		public Group getGroup_11() { return cGroup_11; }
		
		//'FlashingColor:'
		public Keyword getFlashingColorKeyword_11_0() { return cFlashingColorKeyword_11_0; }
		
		//flashingcolor=STRING
		public Assignment getFlashingcolorAssignment_11_1() { return cFlashingcolorAssignment_11_1; }
		
		//STRING
		public RuleCall getFlashingcolorSTRINGTerminalRuleCall_11_1_0() { return cFlashingcolorSTRINGTerminalRuleCall_11_1_0; }
		
		//('FinalSentence:' finalsentence=STRING)?
		public Group getGroup_12() { return cGroup_12; }
		
		//'FinalSentence:'
		public Keyword getFinalSentenceKeyword_12_0() { return cFinalSentenceKeyword_12_0; }
		
		//finalsentence=STRING
		public Assignment getFinalsentenceAssignment_12_1() { return cFinalsentenceAssignment_12_1; }
		
		//STRING
		public RuleCall getFinalsentenceSTRINGTerminalRuleCall_12_1_0() { return cFinalsentenceSTRINGTerminalRuleCall_12_1_0; }
	}
	public class ColorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.Colors");
		private final Assignment cColorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cColorSTRINGTerminalRuleCall_0 = (RuleCall)cColorAssignment.eContents().get(0);
		
		//Colors:
		//	color=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//color=STRING
		public Assignment getColorAssignment() { return cColorAssignment; }
		
		//STRING
		public RuleCall getColorSTRINGTerminalRuleCall_0() { return cColorSTRINGTerminalRuleCall_0; }
	}
	public class SensorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.Sensors");
		private final Assignment cSensorAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSensorSTRINGTerminalRuleCall_0 = (RuleCall)cSensorAssignment.eContents().get(0);
		
		//// Keep string or change to enum???
		//Sensors:
		//	sensor=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//sensor=STRING
		public Assignment getSensorAssignment() { return cSensorAssignment; }
		
		//STRING
		public RuleCall getSensorSTRINGTerminalRuleCall_0() { return cSensorSTRINGTerminalRuleCall_0; }
	}
	
	public class MissionTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "mars.rover.RoverDSL.MissionType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAvoidColorsEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAvoidColorsAvoidColorsKeyword_0_0 = (Keyword)cAvoidColorsEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFindColorsEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFindColorsFindColorsKeyword_1_0 = (Keyword)cFindColorsEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum MissionType:
		//	AvoidColors | FindColors;
		public EnumRule getRule() { return rule; }
		
		//AvoidColors | FindColors
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AvoidColors
		public EnumLiteralDeclaration getAvoidColorsEnumLiteralDeclaration_0() { return cAvoidColorsEnumLiteralDeclaration_0; }
		
		//"AvoidColors"
		public Keyword getAvoidColorsAvoidColorsKeyword_0_0() { return cAvoidColorsAvoidColorsKeyword_0_0; }
		
		//FindColors
		public EnumLiteralDeclaration getFindColorsEnumLiteralDeclaration_1() { return cFindColorsEnumLiteralDeclaration_1; }
		
		//"FindColors"
		public Keyword getFindColorsFindColorsKeyword_1_0() { return cFindColorsFindColorsKeyword_1_0; }
	}
	
	private final MissionElements pMission;
	private final MissionTypeElements eMissionType;
	private final ColorsElements pColors;
	private final SensorsElements pSensors;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RoverDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMission = new MissionElements();
		this.eMissionType = new MissionTypeElements();
		this.pColors = new ColorsElements();
		this.pSensors = new SensorsElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("mars.rover.RoverDSL".equals(grammar.getName())) {
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

	
	////Model:
	////	greetings+=Greeting*;
	////Greeting:
	////	'Hello' name=ID '!';
	//// test for new commit Jurian 2
	//Mission:
	//	'Mission:' missiontype=MissionType ('BeginSentence:' beginsentence=STRING)? ('OuterBorder:' border=STRING)?
	//	('ForwardSpeed:' forwardspeed=INT)? ('ReverseSpeed:' reversespeed=INT)? ('TurnDirection:' turndirection=INT)?
	//	('Colors:' colorlist+=Colors*)? ('Sensors:' sensorlist+=Sensors*)?
	//	'End:' terminationcondition=STRING ('FlashingColor:' flashingcolor=STRING)? ('FinalSentence:' finalsentence=STRING)? // For robot to say when mission is done. Maybe change final sentence to song? (validate options) Optional, default white
	//;
	public MissionElements getMissionAccess() {
		return pMission;
	}
	
	public ParserRule getMissionRule() {
		return getMissionAccess().getRule();
	}
	
	//enum MissionType:
	//	AvoidColors | FindColors;
	public MissionTypeElements getMissionTypeAccess() {
		return eMissionType;
	}
	
	public EnumRule getMissionTypeRule() {
		return getMissionTypeAccess().getRule();
	}
	
	//Colors:
	//	color=STRING;
	public ColorsElements getColorsAccess() {
		return pColors;
	}
	
	public ParserRule getColorsRule() {
		return getColorsAccess().getRule();
	}
	
	//// Keep string or change to enum???
	//Sensors:
	//	sensor=STRING;
	public SensorsElements getSensorsAccess() {
		return pSensors;
	}
	
	public ParserRule getSensorsRule() {
		return getSensorsAccess().getRule();
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
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
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
