package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum SecurityRiskDecision {

    F1(new RiskScores[]{RiskScores.SERF1a, RiskScores.SERF1b, RiskScores.SERF1c, RiskScores.SERF1d, RiskScores.SERF1e, RiskScores.SERF1f}, 3),
    F2(new RiskScores[]{RiskScores.SERF2a, RiskScores.SERF2b, RiskScores.SERF2c, RiskScores.SERF2d, RiskScores.SERF2e, RiskScores.SERF2f}, 3),

    ;

    private final RiskScores[] scoreArr;
    private final int factor;
}
