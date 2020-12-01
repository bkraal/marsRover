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
			builder.put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_2(), "rule__Mission__Group_2__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_3(), "rule__Mission__Group_3__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_4(), "rule__Mission__Group_4__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_5(), "rule__Mission__Group_5__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_6(), "rule__Mission__Group_6__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_7(), "rule__Mission__Group_7__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_8(), "rule__Mission__Group_8__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_11(), "rule__Mission__Group_11__0");
			builder.put(grammarAccess.getMissionAccess().getGroup_12(), "rule__Mission__Group_12__0");
			builder.put(grammarAccess.getMissionAccess().getMissiontypeAssignment_1(), "rule__Mission__MissiontypeAssignment_1");
			builder.put(grammarAccess.getMissionAccess().getBeginsentenceAssignment_2_1(), "rule__Mission__BeginsentenceAssignment_2_1");
			builder.put(grammarAccess.getMissionAccess().getBorderAssignment_3_1(), "rule__Mission__BorderAssignment_3_1");
			builder.put(grammarAccess.getMissionAccess().getForwardspeedAssignment_4_1(), "rule__Mission__ForwardspeedAssignment_4_1");
			builder.put(grammarAccess.getMissionAccess().getReversespeedAssignment_5_1(), "rule__Mission__ReversespeedAssignment_5_1");
			builder.put(grammarAccess.getMissionAccess().getTurndirectionAssignment_6_1(), "rule__Mission__TurndirectionAssignment_6_1");
			builder.put(grammarAccess.getMissionAccess().getColorlistAssignment_7_1(), "rule__Mission__ColorlistAssignment_7_1");
			builder.put(grammarAccess.getMissionAccess().getSensorlistAssignment_8_1(), "rule__Mission__SensorlistAssignment_8_1");
			builder.put(grammarAccess.getMissionAccess().getTerminationconditionAssignment_10(), "rule__Mission__TerminationconditionAssignment_10");
			builder.put(grammarAccess.getMissionAccess().getFlashingcolorAssignment_11_1(), "rule__Mission__FlashingcolorAssignment_11_1");
			builder.put(grammarAccess.getMissionAccess().getFinalsentenceAssignment_12_1(), "rule__Mission__FinalsentenceAssignment_12_1");
			builder.put(grammarAccess.getColorsAccess().getColorAssignment(), "rule__Colors__ColorAssignment");
			builder.put(grammarAccess.getSensorsAccess().getSensorAssignment(), "rule__Sensors__SensorAssignment");
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
