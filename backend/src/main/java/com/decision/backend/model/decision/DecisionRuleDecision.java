package com.decision.backend.model.decision;

import com.decision.backend.model.LevelScores;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum DecisionRuleDecision {

    F1(new LevelScores[]{LevelScores.DRF1a, LevelScores.DRF1b, LevelScores.DRF1c}, 3),
    F2(new LevelScores[]{LevelScores.DRF2a, LevelScores.DRF2b, LevelScores.DRF2c}, 3),
    F3(new LevelScores[]{LevelScores.DRF3a, LevelScores.DRF3b, LevelScores.DRF3c}, 3),
    F4(new LevelScores[]{LevelScores.DRF4a, LevelScores.DRF4b, LevelScores.DRF4c}, 3),

    ;

    private final LevelScores[] scoreArr;
    private final int factor;
}
