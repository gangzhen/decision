package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import com.decision.backend.model.Risks;
import com.decision.backend.service.RiskAttrDTO;
import com.decision.backend.utils.CompareUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@ToString
public enum CultureRiskDecision {

    F1(new RiskScores[]{RiskScores.CRF1a, RiskScores.CRF1b}, 3),
    F2(new RiskScores[]{RiskScores.CRF2a, RiskScores.CRF2b}, 3),
    F3(new RiskScores[]{RiskScores.CRF3a, RiskScores.CRF3b}, 3),

    ;

    public static final String CODE = "SR1";
    public static final String[] SR1 = {Risks.SR111.getCode(), Risks.SR121.getCode()};


    private final RiskScores[] scoreArr;
    private final int factor;

    public static int determinateFactor(List<RiskAttrDTO> riskAttrs) {
        int factor = 0;
        for (CultureRiskDecision decision : CultureRiskDecision.values()) {
            factor = CompareUtils.CompareAttrValue(riskAttrs, factor, decision.getScoreArr(), decision.getFactor());
        }
        return factor;
    }
}
