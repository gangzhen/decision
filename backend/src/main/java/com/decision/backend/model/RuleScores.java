package com.decision.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum RuleScores {

    /**
     * @description 网球运动员成才风险决策规则
     */

    // 网球运动员成才风险决策规则 f1
    SRF1a(Rules.OR2, 3),
    SRF1b(Rules.SR1, 3),
    SRF1c(Rules.SR3, 3),
    SRF1d(Rules.SR4, 3),

    // 网球运动员成才风险决策规则 f2
    SRF2a(Rules.OR2, 3),
    SRF2b(Rules.SR1, 2),
    SRF2c(Rules.SR3, 3),
    SRF2d(Rules.SR4, 3),

    // 网球运动员成才风险决策规则 f3
    SRF3a(Rules.OR2, 3),
    SRF3b(Rules.SR1, 3),
    SRF3c(Rules.SR3, 2),
    SRF3d(Rules.SR4, 2),

    // 网球运动员成才风险决策规则 f4
    SRF4a(Rules.OR2, 2),
    SRF4b(Rules.SR1, 2),
    SRF4c(Rules.SR3, 2),
    SRF4d(Rules.SR4, 2),

    // 网球运动员成才风险决策规则 f5
    SRF5a(Rules.OR2, 2),
    SRF5b(Rules.SR1, 2),
    SRF5c(Rules.SR3, 2),
    SRF5d(Rules.SR4, 3),

    // 网球运动员成才风险决策规则 f6
    SRF6a(Rules.OR2, 2),
    SRF6b(Rules.SR1, 3),
    SRF6c(Rules.SR3, 2),
    SRF6d(Rules.SR4, 2),

    // 网球运动员成才风险决策规则 f7
    SRF7a(Rules.OR2, 2),
    SRF7b(Rules.SR1, 1),
    SRF7c(Rules.SR3, 2),
    SRF7d(Rules.SR4, 2),

    ;

    private final Rules ruleItem;
    // 风险属性值
    private final int riskAttr;
}
