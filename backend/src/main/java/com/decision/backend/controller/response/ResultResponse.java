package com.decision.backend.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse {
    // API请求状态码
    private String status;
    // API请求消息
    private String message;
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

    public static ResultResponse testInstance() {
        return new ResultResponse("200", "success", "", "", "", "", "", "", "", "");
    }
}
