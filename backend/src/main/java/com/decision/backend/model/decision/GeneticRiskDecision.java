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
public enum GeneticRiskDecision {

    F1(new RiskScores[]{RiskScores.GRF1a, RiskScores.GRF1b, RiskScores.GRF1c, RiskScores.GRF1d, RiskScores.GRF1e, RiskScores.GRF1f, RiskScores.GRF1g}, 2),
    F2(new RiskScores[]{RiskScores.GRF2a, RiskScores.GRF2b, RiskScores.GRF2c, RiskScores.GRF2d, RiskScores.GRF2e, RiskScores.GRF2f, RiskScores.GRF2g}, 2),

    ;

    public static final String CODE = "OR1";
    public static final String NAME = "来源于网球运动员自身的遗传风险（OR1）决策规则";
    public static final String[] OR1 = {Risks.OR111.getCode(), Risks.OR112.getCode(), Risks.OR121.getCode(), Risks.OR131.getCode(), Risks.OR132.getCode(), Risks.OR141.getCode(), Risks.OR142.getCode(), Risks.OR143.getCode()};

    private final RiskScores[] scoreArr;
    private final int factor;


    public static int determinateFactor(List<RiskAttrDTO> riskAttrs) {
        int factor = 0;
        for (GeneticRiskDecision decision : GeneticRiskDecision.values()) {
            factor = CompareUtils.CompareAttrValue(riskAttrs, factor, decision.getScoreArr(), decision.getFactor());
        }
        return factor;
    }
}
