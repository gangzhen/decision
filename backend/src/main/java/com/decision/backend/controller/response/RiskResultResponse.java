package com.decision.backend.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskResultResponse {

    /*

    // 遗传风险
    private String geneticRisk;
    // 非遗传风险
    private String nonGeneticRisk;
    // 项目文化风险
    private String cultureRisk;
    // 管理制度风险
    private String systemRisk;
    // 物质保障风险
    private String securityRisk;
    // 人际关系风险
    private String personalRisk;
    // 成才风险
    private String successRisk;
    // 决策规则
    private String decisionRule;

    */

    private int index;
    private int score;
    private String code;
    private String name;
    private String detail;

    public static RiskResultResponse newInstance(int index, int score, String code, String name, String detail) {
        return new RiskResultResponse(index, score, code, name, detail);
    }
}
