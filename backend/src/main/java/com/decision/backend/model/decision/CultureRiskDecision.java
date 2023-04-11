package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum CultureRiskDecision {

    F1(new RiskScores[]{RiskScores.CRF1a, RiskScores.CRF1b}, 3),
    F2(new RiskScores[]{RiskScores.CRF2a, RiskScores.CRF2b}, 3),
    F3(new RiskScores[]{RiskScores.CRF3a, RiskScores.CRF3b}, 3),

    ;

    private final RiskScores[] scoreArr;
    private final int factor;
}
