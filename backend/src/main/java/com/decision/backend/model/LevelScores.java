package com.decision.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum LevelScores {

    /**
     * @description 网球运动员成才风险发生的可能性、严重性、可控性决策规则
     */

    // 网球运动员成才风险发生的可能性、严重性、可控性决策规则 f1
    DRF1a(Levels.P, 3),
    DRF1b(Levels.S, 3),
    DRF1c(Levels.C, 3),

    // 网球运动员成才风险发生的可能性、严重性、可控性决策规则 f2
    DRF2a(Levels.P, 4),
    DRF2b(Levels.S, 4),
    DRF2c(Levels.C, 3),

    // 网球运动员成才风险发生的可能性、严重性、可控性决策规则 f3
    DRF3a(Levels.P, 4),
    DRF3b(Levels.S, 4),
    DRF3c(Levels.C, 4),

    // 网球运动员成才风险发生的可能性、严重性、可控性决策规则 f4
    DRF4a(Levels.P, 3),
    DRF4b(Levels.S, 4),
    DRF4c(Levels.C, 3),

    ;

    private final Levels levelItem;
    // 风险属性值
    private final int riskAttr;
}
