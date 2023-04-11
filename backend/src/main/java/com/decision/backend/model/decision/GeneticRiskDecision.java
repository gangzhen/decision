package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum GeneticRiskDecision {

    F1(new RiskScores[]{RiskScores.GRF1a, RiskScores.GRF1b, RiskScores.GRF1c, RiskScores.GRF1d, RiskScores.GRF1e, RiskScores.GRF1f, RiskScores.GRF1g}, 2),
    F2(new RiskScores[]{RiskScores.GRF2a, RiskScores.GRF2b, RiskScores.GRF2c, RiskScores.GRF2d, RiskScores.GRF2e, RiskScores.GRF2f, RiskScores.GRF2g}, 2),

    ;

    private final RiskScores[] scoreArr;
    private final int factor;

}
