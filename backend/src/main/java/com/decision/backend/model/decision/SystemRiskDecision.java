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
public enum SystemRiskDecision {

    F1(new RiskScores[]{RiskScores.SRF1a, RiskScores.SRF1b, RiskScores.SRF1c, RiskScores.SRF1d, RiskScores.SRF1e, RiskScores.SRF1f, RiskScores.SRF1g, RiskScores.SRF1h, RiskScores.SRF1i}, 3),
    F2(new RiskScores[]{RiskScores.SRF2a, RiskScores.SRF2b, RiskScores.SRF2c, RiskScores.SRF2d, RiskScores.SRF2e, RiskScores.SRF2f, RiskScores.SRF2g, RiskScores.SRF2h}, 3),
    F3(new RiskScores[]{RiskScores.SRF3a, RiskScores.SRF3b, RiskScores.SRF3c, RiskScores.SRF3d, RiskScores.SRF3e, RiskScores.SRF3f, RiskScores.SRF3g, RiskScores.SRF3h, RiskScores.SRF3i}, 3),
    F4(new RiskScores[]{RiskScores.SRF4a, RiskScores.SRF4b, RiskScores.SRF4c, RiskScores.SRF4d, RiskScores.SRF4e, RiskScores.SRF4f, RiskScores.SRF4g, RiskScores.SRF4h, RiskScores.SRF4i}, 2),

    ;

    public static final String CODE = "SR2";
    public static final String[] SR2 = {Risks.SR211.getCode(), Risks.SR212.getCode(), Risks.SR213.getCode(), Risks.SR214.getCode(), Risks.SR221.getCode(), Risks.SR222.getCode(), Risks.SR231.getCode(), Risks.SR232.getCode(), Risks.SR233.getCode(), Risks.SR241.getCode(), Risks.SR242.getCode()};


    private final RiskScores[] scoreArr;
    private final int factor;

    public static int determinateFactor(List<RiskAttrDTO> riskAttrs) {
        int factor = 0;
        for (SystemRiskDecision decision : SystemRiskDecision.values()) {
            factor = CompareUtils.CompareAttrValue(riskAttrs, factor, decision.getScoreArr(), decision.getFactor());
        }
        return factor;
    }
}
