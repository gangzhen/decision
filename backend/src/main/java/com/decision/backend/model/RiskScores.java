package com.decision.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum RiskScores {

    /**
     * @description 运动员自身的遗传风险决策规则 (OR1)
     */

    // 运动员自身的遗传风险决策规则 f1
    GRF1a(Risks.OR111, 1),
    GRF1b(Risks.OR112, 2),
    GRF1c(Risks.OR121, 1),
    GRF1d(Risks.OR131, 1),
    GRF1e(Risks.OR132, 1),
    GRF1f(Risks.OR141, 1),
    GRF1g(Risks.OR142, 1),

    // 运动员自身的遗传风险决策规则 f2
    GRF2a(Risks.OR111, 1),
    GRF2b(Risks.OR112, 2),
    GRF2c(Risks.OR121, 1),
    GRF2d(Risks.OR131, 1),
    GRF2e(Risks.OR132, 1),
    GRF2f(Risks.OR141, 1),
    GRF2g(Risks.OR143, 1),

    /**
     * @description 运动员自身的非遗传风险决策规则 (OR2)
     */

    // 运动员自身的非遗传风险决策规则 f1
    NGRF1a(Risks.OR211, 1),
    NGRF1b(Risks.OR212, 1),
    NGRF1c(Risks.OR221, 1),
    NGRF1d(Risks.OR223, 1),
    NGRF1e(Risks.OR231, 1),
    NGRF1f(Risks.OR233, 1),
    NGRF1g(Risks.OR242, 1),
    NGRF1h(Risks.OR251, 1),
    NGRF1i(Risks.OR252, 1),
    NGRF1j(Risks.OR264, 1),
    NGRF1k(Risks.OR272, 1),
    NGRF1l(Risks.OR281, 1),

    // 运动员自身的非遗传风险决策规则 f2
    NGRF2a(Risks.OR211, 1),
    NGRF2b(Risks.OR212, 1),
    NGRF2c(Risks.OR223, 1),
    NGRF2d(Risks.OR232, 1),
    NGRF2e(Risks.OR233, 1),
    NGRF2f(Risks.OR242, 1),
    NGRF2g(Risks.OR251, 1),
    NGRF2h(Risks.OR252, 1),
    NGRF2i(Risks.OR264, 1),
    NGRF2j(Risks.OR271, 1),
    NGRF2k(Risks.OR272, 1),
    NGRF2l(Risks.OR281, 1),

    // 运动员自身的非遗传风险决策规则 f3
    NGRF3a(Risks.OR211, 1),
    NGRF3b(Risks.OR212, 1),
    NGRF3c(Risks.OR223, 1),
    NGRF3d(Risks.OR232, 1),
    NGRF3e(Risks.OR233, 1),
    NGRF3f(Risks.OR242, 1),
    NGRF3g(Risks.OR251, 1),
    NGRF3h(Risks.OR252, 1),
    NGRF3i(Risks.OR265, 1),
    NGRF3j(Risks.OR271, 1),
    NGRF3k(Risks.OR272, 1),
    NGRF3l(Risks.OR281, 1),

    // 运动员自身的非遗传风险决策规则 f4
    NGRF4a(Risks.OR211, 1),
    NGRF4b(Risks.OR212, 1),
    NGRF4c(Risks.OR221, 1),
    NGRF4d(Risks.OR223, 1),
    NGRF4e(Risks.OR231, 1),
    NGRF4f(Risks.OR232, 1),
    NGRF4g(Risks.OR233, 1),
    NGRF4h(Risks.OR242, 1),
    NGRF4i(Risks.OR251, 1),
    NGRF4j(Risks.OR252, 1),
    NGRF4k(Risks.OR265, 1),
    NGRF4l(Risks.OR272, 1),
    NGRF4m(Risks.OR281, 1),

    // 运动员自身的非遗传风险决策规则 f5
    NGRF5a(Risks.OR211, 1),
    NGRF5b(Risks.OR212, 1),
    NGRF5c(Risks.OR221, 1),
    NGRF5d(Risks.OR223, 1),
    NGRF5e(Risks.OR232, 1),
    NGRF5f(Risks.OR233, 1),
    NGRF5g(Risks.OR242, 1),
    NGRF5h(Risks.OR251, 1),
    NGRF5i(Risks.OR252, 1),
    NGRF5j(Risks.OR263, 1),
    NGRF5k(Risks.OR264, 1),
    NGRF5l(Risks.OR272, 1),
    NGRF5m(Risks.OR281, 1),

    // 运动员自身的非遗传风险决策规则 f6
    NGRF6a(Risks.OR211, 1),
    NGRF6b(Risks.OR212, 1),
    NGRF6c(Risks.OR221, 1),
    NGRF6d(Risks.OR223, 1),
    NGRF6e(Risks.OR231, 1),
    NGRF6f(Risks.OR233, 1),
    NGRF6g(Risks.OR242, 1),
    NGRF6h(Risks.OR251, 1),
    NGRF6i(Risks.OR252, 1),
    NGRF6j(Risks.OR263, 1),
    NGRF6k(Risks.OR265, 1),
    NGRF6l(Risks.OR271, 1),
    NGRF6m(Risks.OR272, 1),

    /**
     * @description 社会环境的项目文化风险决策规则 (SR1)
     */

    // 社会环境的项目文化风险决策规则 f1
    CRF1a(Risks.SR111, 2),
    CRF1b(Risks.SR121, 2),

    // 社会环境的项目文化风险决策规则 f2
    CRF2a(Risks.SR111, 2),
    CRF2b(Risks.SR121, 1),

    // 社会环境的项目文化风险决策规则 f3
    CRF3a(Risks.SR111, 1),
    CRF3b(Risks.SR121, 2),

    /**
     * @description 社会环境的管理制度风险决策规则 (SR2)
     */

    // 社会环境的管理制度风险决策规则 f1
    SRF1a(Risks.SR211, 2),
    SRF1b(Risks.SR212, 2),
    SRF1c(Risks.SR221, 2),
    SRF1d(Risks.SR222, 2),
    SRF1e(Risks.SR231, 2),
    SRF1f(Risks.SR232, 2),
    SRF1g(Risks.SR233, 2),
    SRF1h(Risks.SR241, 2),
    SRF1i(Risks.SR242, 2),


    // 社会环境的管理制度风险决策规则 f2
    SRF2a(Risks.SR211, 2),
    SRF2b(Risks.SR212, 2),
    SRF2c(Risks.SR214, 2),
    SRF2d(Risks.SR222, 2),
    SRF2e(Risks.SR231, 2),
    SRF2f(Risks.SR232, 2),
    SRF2g(Risks.SR233, 2),
    SRF2h(Risks.SR241, 2),


    // 社会环境的管理制度风险决策规则 f3
    SRF3a(Risks.SR211, 2),
    SRF3b(Risks.SR212, 2),
    SRF3c(Risks.SR213, 2),
    SRF3d(Risks.SR214, 2),
    SRF3e(Risks.SR222, 2),
    SRF3f(Risks.SR231, 2),
    SRF3g(Risks.SR233, 2),
    SRF3h(Risks.SR241, 2),
    SRF3i(Risks.SR242, 2),


    // 社会环境的管理制度风险决策规则 f4
    SRF4a(Risks.SR211, 1),
    SRF4b(Risks.SR212, 1),
    SRF4c(Risks.SR213, 1),
    SRF4d(Risks.SR214, 1),
    SRF4e(Risks.SR222, 1),
    SRF4f(Risks.SR231, 1),
    SRF4g(Risks.SR233, 1),
    SRF4h(Risks.SR241, 1),
    SRF4i(Risks.SR242, 2),

    /**
     * @description 社会环境的物质保障风险决策规则 (SR3)
     */

    // 社会环境的物质保障风险决策规则 f1
    SERF1a(Risks.SR311, 3),
    SERF1b(Risks.SR312, 3),
    SERF1c(Risks.SR321, 3),
    SERF1d(Risks.SR322, 3),
    SERF1e(Risks.SR331, 3),
    SERF1f(Risks.SR341, 3),

    // 社会环境的物质保障风险决策规则 f2
    SERF2a(Risks.SR311, 2),
    SERF2b(Risks.SR312, 2),
    SERF2c(Risks.SR321, 2),
    SERF2d(Risks.SR322, 2),
    SERF2e(Risks.SR331, 2),
    SERF2f(Risks.SR341, 2),

    /**
     * @description 社会环境的人际关系风险决策规则 (SR4)
     */

    // 社会环境的人际关系风险决策规则 f1
    PRF1a(Risks.SR411, 3),
    PRF1b(Risks.SR413, 3),
    PRF1c(Risks.SR414, 3),
    PRF1d(Risks.SR415, 3),
    PRF1e(Risks.SR417, 3),
    PRF1f(Risks.SR418, 3),
    PRF1g(Risks.SR421, 3),
    PRF1h(Risks.SR422, 3),
    PRF1i(Risks.SR431, 3),
    PRF1j(Risks.SR432, 3),


    // 社会环境的人际关系风险决策规则 f2
    PRF2a(Risks.SR411, 3),
    PRF2b(Risks.SR413, 1),
    PRF2c(Risks.SR414, 1),
    PRF2d(Risks.SR415, 1),
    PRF2e(Risks.SR417, 1),
    PRF2f(Risks.SR418, 1),
    PRF2g(Risks.SR421, 1),
    PRF2h(Risks.SR422, 1),
    PRF2i(Risks.SR431, 1),
    PRF2j(Risks.SR432, 1),


    // 社会环境的人际关系风险决策规则 f3
    PRF3a(Risks.SR411, 3),
    PRF3b(Risks.SR413, 1),
    PRF3c(Risks.SR414, 1),
    PRF3d(Risks.SR415, 1),
    PRF3e(Risks.SR416, 1),
    PRF3f(Risks.SR418, 1),
    PRF3g(Risks.SR421, 1),
    PRF3h(Risks.SR422, 1),
    PRF3i(Risks.SR431, 1),
    PRF3j(Risks.SR432, 1),


    // 社会环境的人际关系风险决策规则 f4
    PRF4a(Risks.SR411, 1),
    PRF4b(Risks.SR413, 1),
    PRF4c(Risks.SR414, 1),
    PRF4d(Risks.SR415, 1),
    PRF4e(Risks.SR417, 1),
    PRF4f(Risks.SR418, 1),
    PRF4g(Risks.SR421, 2),
    PRF4h(Risks.SR422, 1),
    PRF4i(Risks.SR431, 1),
    PRF4j(Risks.SR432, 1),


    // 社会环境的人际关系风险决策规则 f5
    PRF5a(Risks.SR411, 1),
    PRF5b(Risks.SR413, 1),
    PRF5c(Risks.SR414, 1),
    PRF5d(Risks.SR415, 1),
    PRF5e(Risks.SR416, 1),
    PRF5f(Risks.SR418, 1),
    PRF5g(Risks.SR421, 2),
    PRF5h(Risks.SR422, 1),
    PRF5i(Risks.SR431, 1),
    PRF5j(Risks.SR432, 1),

    ;


    private final Risks riskItem;
    // 风险属性值
    private final int riskAttr;
}
