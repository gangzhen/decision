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
public enum NonGeneticRiskDecision {

    F1(new RiskScores[]{RiskScores.NGRF1a, RiskScores.NGRF1b, RiskScores.NGRF1c, RiskScores.NGRF1d, RiskScores.NGRF1e, RiskScores.NGRF1f, RiskScores.NGRF1g, RiskScores.NGRF1h, RiskScores.NGRF1i, RiskScores.NGRF1j, RiskScores.NGRF1k, RiskScores.NGRF1l}, 2),
    F2(new RiskScores[]{RiskScores.NGRF2a, RiskScores.NGRF2b, RiskScores.NGRF2c, RiskScores.NGRF2d, RiskScores.NGRF2e, RiskScores.NGRF2f, RiskScores.NGRF2g, RiskScores.NGRF2h, RiskScores.NGRF2i, RiskScores.NGRF2j, RiskScores.NGRF2k, RiskScores.NGRF2l}, 2),
    F3(new RiskScores[]{RiskScores.NGRF3a, RiskScores.NGRF3b, RiskScores.NGRF3c, RiskScores.NGRF3d, RiskScores.NGRF3e, RiskScores.NGRF3f, RiskScores.NGRF3g, RiskScores.NGRF3h, RiskScores.NGRF3i, RiskScores.NGRF3j, RiskScores.NGRF3k, RiskScores.NGRF3l}, 2),
    F4(new RiskScores[]{RiskScores.NGRF4a, RiskScores.NGRF4b, RiskScores.NGRF4c, RiskScores.NGRF4d, RiskScores.NGRF4e, RiskScores.NGRF4f, RiskScores.NGRF4g, RiskScores.NGRF4h, RiskScores.NGRF4i, RiskScores.NGRF4j, RiskScores.NGRF4k, RiskScores.NGRF4l, RiskScores.NGRF4m}, 2),
    F5(new RiskScores[]{RiskScores.NGRF5a, RiskScores.NGRF5b, RiskScores.NGRF5c, RiskScores.NGRF5d, RiskScores.NGRF5e, RiskScores.NGRF5f, RiskScores.NGRF5g, RiskScores.NGRF5h, RiskScores.NGRF5i, RiskScores.NGRF5j, RiskScores.NGRF5k, RiskScores.NGRF5l, RiskScores.NGRF5m}, 2),
    F6(new RiskScores[]{RiskScores.NGRF6a, RiskScores.NGRF6b, RiskScores.NGRF6c, RiskScores.NGRF6d, RiskScores.NGRF6e, RiskScores.NGRF6f, RiskScores.NGRF6g, RiskScores.NGRF6h, RiskScores.NGRF6i, RiskScores.NGRF6j, RiskScores.NGRF6k, RiskScores.NGRF6l, RiskScores.NGRF6m}, 2),

    ;

    public static final String CODE = "OR2";
    public static final String[] OR2 = {Risks.OR211.getCode(), Risks.OR212.getCode(), Risks.OR221.getCode(), Risks.OR223.getCode(), Risks.OR231.getCode(), Risks.OR232.getCode(), Risks.OR233.getCode(), Risks.OR242.getCode(), Risks.OR251.getCode(), Risks.OR252.getCode(), Risks.OR263.getCode(), Risks.OR264.getCode(), Risks.OR265.getCode(), Risks.OR271.getCode(), Risks.OR272.getCode(), Risks.OR281.getCode()};

    private final RiskScores[] scoreArr;
    private final int factor;

    public static int determinateFactor(List<RiskAttrDTO> riskAttrs) {
        int factor = 0;
        for (NonGeneticRiskDecision decision : NonGeneticRiskDecision.values()) {
            factor = CompareUtils.CompareAttrValue(riskAttrs, factor, decision.getScoreArr(), decision.getFactor());
        }
        return factor;
    }
}
