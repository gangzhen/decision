package com.decision.backend.model.decision;

import com.decision.backend.model.RiskScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum PersonalRiskDecision {

    F1(new RiskScores[]{RiskScores.PRF1a, RiskScores.PRF1b, RiskScores.PRF1c, RiskScores.PRF1d, RiskScores.PRF1e, RiskScores.PRF1f, RiskScores.PRF1g, RiskScores.PRF1h, RiskScores.PRF1i, RiskScores.PRF1j}, 3),
    F2(new RiskScores[]{RiskScores.PRF2a, RiskScores.PRF2b, RiskScores.PRF2c, RiskScores.PRF2d, RiskScores.PRF2e, RiskScores.PRF2f, RiskScores.PRF2g, RiskScores.PRF2h, RiskScores.PRF2i, RiskScores.PRF2j}, 2),
    F3(new RiskScores[]{RiskScores.PRF3a, RiskScores.PRF3b, RiskScores.PRF3c, RiskScores.PRF3d, RiskScores.PRF3e, RiskScores.PRF3f, RiskScores.PRF3g, RiskScores.PRF3h, RiskScores.PRF3i, RiskScores.PRF3j}, 2),
    F4(new RiskScores[]{RiskScores.PRF4a, RiskScores.PRF4b, RiskScores.PRF4c, RiskScores.PRF4d, RiskScores.PRF4e, RiskScores.PRF4f, RiskScores.PRF4g, RiskScores.PRF4h, RiskScores.PRF4i, RiskScores.PRF4j}, 2),
    F5(new RiskScores[]{RiskScores.PRF5a, RiskScores.PRF5b, RiskScores.PRF5c, RiskScores.PRF5d, RiskScores.PRF5e, RiskScores.PRF5f, RiskScores.PRF5g, RiskScores.PRF5h, RiskScores.PRF5i, RiskScores.PRF5j}, 2),

    ;

    private final RiskScores[] scoreArr;
    private final int factor;
}
