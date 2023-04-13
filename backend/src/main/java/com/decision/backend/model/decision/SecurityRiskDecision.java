package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import com.decision.backend.model.Risks;
import com.decision.backend.dto.RiskAttrDTO;
import com.decision.backend.utils.CompareUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public enum SecurityRiskDecision {

    F1(new RiskScores[]{RiskScores.SERF1a, RiskScores.SERF1b, RiskScores.SERF1c, RiskScores.SERF1d, RiskScores.SERF1e, RiskScores.SERF1f}, 3),
    F2(new RiskScores[]{RiskScores.SERF2a, RiskScores.SERF2b, RiskScores.SERF2c, RiskScores.SERF2d, RiskScores.SERF2e, RiskScores.SERF2f}, 3),

    ;

    public static final String CODE = "SR3";
    public static final String NAME = "来源于社会环境的物质保障风险（SR3）决策规则";
    public static final String[] SR3 = {Risks.SR311.getCode(), Risks.SR312.getCode(), Risks.SR321.getCode(), Risks.SR322.getCode(), Risks.SR331.getCode(), Risks.SR341.getCode()};

    private final RiskScores[] scoreArr;
    private final int factor;

    public static int determinateFactor(List<RiskAttrDTO> riskAttrs) {
        int factor = 0;
        for (SecurityRiskDecision decision : SecurityRiskDecision.values()) {
            factor = CompareUtils.CompareAttrValue(riskAttrs, factor, decision.getScoreArr(), decision.getFactor());
        }
        return factor;
    }
}
