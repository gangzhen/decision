package com.decision.backend.service;

import com.decision.backend.controller.request.AnswerRequest;
import com.decision.backend.controller.response.ResultResponse;
import com.decision.backend.model.decision.DecisionRuleDecision;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AnalysisService {

    public ResultResponse analysisDecision(List<AnswerRequest> answerList) {

        // 计算网球运动员成才风险发生的可能性、严重性、可控性决策规则风险系数 （p、s、c）
        RiskFactorDTO decisionRuleFactor = analysisDecisionRuleFactor(answerList);
        // 计算每项风险的风险属性值 (p * s * c)
        List<RiskAttrDTO> riskAttrs = analysisRiskAttr(answerList);
        // 根据是否匹配风险得分模板确定规则风险系数 (7项)
        RiskFactorDTO or1Factor = analysisGROR1Factor(riskAttrs);
        RiskFactorDTO or2Factor = analysisNGROR2Factor(riskAttrs);
        RiskFactorDTO sr1Factor = analysisCRSR1Factor(riskAttrs);
        RiskFactorDTO sr2Factor = analysisSRSR2Factor(riskAttrs);
        RiskFactorDTO sr3Factor = analysisSERSR3Factor(riskAttrs);
        RiskFactorDTO sr4Factor = analysisPRSR4Factor(riskAttrs);
        List<RiskFactorDTO> factorList = new ArrayList<>(Arrays.asList(or1Factor, or2Factor, sr1Factor, sr2Factor, sr3Factor, sr4Factor));
        RiskFactorDTO successRiskFactor = analysisSuccessRiskFactor(factorList);
        factorList.add(decisionRuleFactor);
        factorList.add(successRiskFactor);
        // 根据八项风险系数，判定风险等级
        return eachResult(factorList);
    }

    /**
     * @param answerList 问题选择项集合
     * @description 计算网球运动员成才风险发生的可能性、严重性、可控性决策规则风险系数 （p、s、c）
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:17
     */
    public RiskFactorDTO analysisDecisionRuleFactor(List<AnswerRequest> answerList) {
        return RiskFactorDTO.newInstance();
    }

    /**
     * @param answerList 问题选择项集合
     * @description 计算每项风险的风险属性值 (p * s * c)
     * @return: java.util.List<com.decision.backend.service.RiskAttrDTO>
     * @date 2023/4/12 10:10
     */
    private List<RiskAttrDTO> analysisRiskAttr(List<AnswerRequest> answerList) {
        List<RiskAttrDTO> res = new ArrayList<>();
        answerList.forEach(answer -> {
            RiskAttrDTO riskAttr = RiskAttrDTO.newInstance();
            int score = answer.getPossibility() * answer.getSeverity() * answer.getControllability();
            int attr = determinateAttr(score);
            riskAttr.setCode(answer.getCode());
            riskAttr.setAttribute(attr);
            res.add(riskAttr);
        });
        return res;
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (OR1)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisGROR1Factor(List<RiskAttrDTO> riskAttrs) {
        return null;
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (OR2)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisNGROR2Factor(List<RiskAttrDTO> riskAttrs) {
        return null;
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR1)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisCRSR1Factor(List<RiskAttrDTO> riskAttrs) {
        return null;
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR2)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisSRSR2Factor(List<RiskAttrDTO> riskAttrs) {
        return null;
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR3)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisSERSR3Factor(List<RiskAttrDTO> riskAttrs) {
        return null;
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR4)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisPRSR4Factor(List<RiskAttrDTO> riskAttrs) {
        return null;
    }

    /**
     * @param factorList 风险项系数集合
     * @description 根据是否匹配风险得分模板确定规则风险系数 (成才风险)
     * @return: com.decision.backend.service.RiskFactorDTO
     * @date 2023/4/12 10:33
     */
    private RiskFactorDTO analysisSuccessRiskFactor(List<RiskFactorDTO> factorList) {
        return null;
    }

    /**
     * @param factorList 风险项系数集合
     * @description 根据八项风险系数，判定风险等级
     * @return: com.decision.backend.controller.response.ResultResponse
     * @date 2023/4/12 10:32
     */
    private ResultResponse eachResult(List<RiskFactorDTO> factorList) {
        return ResultResponse.testInstance();
    }

    public int determinateAttr(int score) {
        int attribute = 0;
        if (score < 40) {
            attribute = 1;
        } else if (score < 90) {
            attribute = 2;
        } else {
            attribute = 3;
        }
        return attribute;
    }
}
