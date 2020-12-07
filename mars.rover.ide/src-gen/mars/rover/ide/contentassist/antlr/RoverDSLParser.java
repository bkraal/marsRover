/*
 * generated by Xtext 2.23.0
 */
package mars.rover.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import mars.rover.ide.contentassist.antlr.internal.InternalRoverDSLParser;
import mars.rover.services.RoverDSLGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RoverDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RoverDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RoverDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMissionTypeAccess().getAlternatives(), "rule__MissionType__Alternatives");
			builder.put(grammarAccess.getColorsAccess().getAlternatives(), "rule__Colors__Alternatives");
			builder.put(grammarAccess.getSafetyAccess().getAlternatives(), "rule__Safety__Alternatives");
			builder.put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_2(), "rule__Mission__Group_2__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_3(), "rule__Mission__Group_3__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_4(), "rule__Mission__Group_4__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_5(), "rule__Mission__Group_5__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_6(), "rule__Mission__Group_6__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_7(), "rule__Mission__Group_7__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_8(), "rule__Mission__Group_8__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_9(), "rule__Mission__Group_9__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_12(), "rule__Mission__Group_12__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_13(), "rule__Mission__Group_13__0");
			builder.put(grammarAccess.getMissionAccess().getMissiontypeAssignment_1(), "rule__Mission__MissiontypeAssignment_1");
			builder.put(grammarAccess.getMissionAccess().getSafetypropertyAssignment_2_1(), "rule__Mission__SafetypropertyAssignment_2_1");
			builder.put(grammarAccess.getMissionAccess().getLakelistAssignment_3_1(), "rule__Mission__LakelistAssignment_3_1");
			builder.put(grammarAccess.getMissionAccess().getBeginsentenceAssignment_4_1(), "rule__Mission__BeginsentenceAssignment_4_1");
			builder.put(grammarAccess.getMissionAccess().getBorderAssignment_5_1(), "rule__Mission__BorderAssignment_5_1");
			builder.put(grammarAccess.getMissionAccess().getForwardspeedAssignment_6_1(), "rule__Mission__ForwardspeedAssignment_6_1");
			builder.put(grammarAccess.getMissionAccess().getReversespeedAssignment_7_1(), "rule__Mission__ReversespeedAssignment_7_1");
			builder.put(grammarAccess.getMissionAccess().getTurndirectionAssignment_8_1(), "rule__Mission__TurndirectionAssignment_8_1");
			builder.put(grammarAccess.getMissionAccess().getColorlistAssignment_9_1(), "rule__Mission__ColorlistAssignment_9_1");
			builder.put(grammarAccess.getMissionAccess().getTerminationconditionAssignment_11(), "rule__Mission__TerminationconditionAssignment_11");
			builder.put(grammarAccess.getMissionAccess().getFlashingcolorAssignment_12_1(), "rule__Mission__FlashingcolorAssignment_12_1");
			builder.put(grammarAccess.getMissionAccess().getFinalsentenceAssignment_13_1(), "rule__Mission__FinalsentenceAssignment_13_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RoverDSLGrammarAccess grammarAccess;

	@Override
	protected InternalRoverDSLParser createParser() {
		InternalRoverDSLParser result = new InternalRoverDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RoverDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RoverDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
