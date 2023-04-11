package com.decision.backend.model.decision;

import com.decision.backend.model.RuleScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum SuccessRiskDecision {

    F1(new RuleScores[]{RuleScores.SRF1a, RuleScores.SRF1b, RuleScores.SRF1c, RuleScores.SRF1d}, 3),
    F2(new RuleScores[]{RuleScores.SRF2a, RuleScores.SRF2b, RuleScores.SRF2c, RuleScores.SRF2d}, 3),
    F3(new RuleScores[]{RuleScores.SRF3a, RuleScores.SRF3b, RuleScores.SRF3c, RuleScores.SRF3d}, 2),
    F4(new RuleScores[]{RuleScores.SRF4a, RuleScores.SRF4b, RuleScores.SRF4c, RuleScores.SRF4d}, 2),
    F5(new RuleScores[]{RuleScores.SRF5a, RuleScores.SRF5b, RuleScores.SRF5c, RuleScores.SRF5d}, 2),
    F6(new RuleScores[]{RuleScores.SRF6a, RuleScores.SRF6b, RuleScores.SRF6c, RuleScores.SRF6d}, 2),
    F7(new RuleScores[]{RuleScores.SRF6a, RuleScores.SRF6b, RuleScores.SRF6c, RuleScores.SRF6d}, 2),

    ;

    private final RuleScores[] scoreArr;
    private final int factor;
}
