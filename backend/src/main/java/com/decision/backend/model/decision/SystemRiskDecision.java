package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum SystemRiskDecision {

    F1(new RiskScores[]{RiskScores.SRF1a, RiskScores.SRF1b, RiskScores.SRF1c, RiskScores.SRF1d, RiskScores.SRF1e, RiskScores.SRF1f, RiskScores.SRF1g, RiskScores.SRF1h, RiskScores.SRF1i}, 3),
    F2(new RiskScores[]{RiskScores.SRF2a, RiskScores.SRF2b, RiskScores.SRF2c, RiskScores.SRF2d, RiskScores.SRF2e, RiskScores.SRF2f, RiskScores.SRF2g, RiskScores.SRF2h}, 3),
    F3(new RiskScores[]{RiskScores.SRF3a, RiskScores.SRF3b, RiskScores.SRF3c, RiskScores.SRF3d, RiskScores.SRF3e, RiskScores.SRF3f, RiskScores.SRF3g, RiskScores.SRF3h, RiskScores.SRF3i}, 3),
    F4(new RiskScores[]{RiskScores.SRF4a, RiskScores.SRF4b, RiskScores.SRF4c, RiskScores.SRF4d, RiskScores.SRF4e, RiskScores.SRF4f, RiskScores.SRF4g, RiskScores.SRF4h, RiskScores.SRF4i}, 2),

    ;

    private final RiskScores[] scoreArr;
    private final int factor;
}
