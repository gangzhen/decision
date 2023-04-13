package com.decision.backend.service;

import com.decision.backend.controller.request.AnswerRequest;
import com.decision.backend.controller.response.ResultResponse;
import com.decision.backend.controller.response.RiskResultResponse;
import com.decision.backend.dto.RiskAttrDTO;
import com.decision.backend.dto.RiskFactorDTO;
import com.decision.backend.model.decision.*;
import com.decision.backend.utils.CompareUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:17
     */
    public RiskFactorDTO analysisDecisionRuleFactor(List<AnswerRequest> answerList) {
        return RiskFactorDTO.newInstance();
    }

    /**
     * @param answerList 问题选择项集合
     * @description 计算每项风险的风险属性值 (p * s * c)
     * @return: java.util.List<com.decision.backend.dto.RiskAttrDTO>
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
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisGROR1Factor(List<RiskAttrDTO> riskAttrs) {
        List<String> OR1 = Arrays.asList(GeneticRiskDecision.OR1);
        List<RiskAttrDTO> geneticRiskAttrs = riskAttrs.stream().filter(item -> OR1.contains(item.getCode())).collect(Collectors.toList());
        int factor = GeneticRiskDecision.determinateFactor(geneticRiskAttrs);
        return RiskFactorDTO.newInstance(GeneticRiskDecision.CODE, GeneticRiskDecision.NAME, factor);
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (OR2)
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisNGROR2Factor(List<RiskAttrDTO> riskAttrs) {
        List<String> OR2 = Arrays.asList(NonGeneticRiskDecision.OR2);
        List<RiskAttrDTO> nonGeneticRiskAttrs = riskAttrs.stream().filter(item -> OR2.contains(item.getCode())).collect(Collectors.toList());
        int factor = NonGeneticRiskDecision.determinateFactor(nonGeneticRiskAttrs);
        return RiskFactorDTO.newInstance(NonGeneticRiskDecision.CODE, NonGeneticRiskDecision.NAME, factor);
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR1)
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisCRSR1Factor(List<RiskAttrDTO> riskAttrs) {
        List<String> SR1 = Arrays.asList(CultureRiskDecision.SR1);
        List<RiskAttrDTO> cultureRiskAttrs = riskAttrs.stream().filter(item -> SR1.contains(item.getCode())).collect(Collectors.toList());
        int factor = CultureRiskDecision.determinateFactor(cultureRiskAttrs);
        return RiskFactorDTO.newInstance(CultureRiskDecision.CODE, CultureRiskDecision.NAME, factor);
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR2)
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisSRSR2Factor(List<RiskAttrDTO> riskAttrs) {
        List<String> SR2 = Arrays.asList(SystemRiskDecision.SR2);
        List<RiskAttrDTO> systemRiskAttrs = riskAttrs.stream().filter(item -> SR2.contains(item.getCode())).collect(Collectors.toList());
        int factor = SystemRiskDecision.determinateFactor(systemRiskAttrs);
        return RiskFactorDTO.newInstance(SystemRiskDecision.CODE, SystemRiskDecision.NAME, factor);
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR3)
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisSERSR3Factor(List<RiskAttrDTO> riskAttrs) {
        List<String> SR3 = Arrays.asList(SecurityRiskDecision.SR3);
        List<RiskAttrDTO> systemRiskAttrs = riskAttrs.stream().filter(item -> SR3.contains(item.getCode())).collect(Collectors.toList());
        int factor = SecurityRiskDecision.determinateFactor(systemRiskAttrs);
        return RiskFactorDTO.newInstance(SecurityRiskDecision.CODE, SecurityRiskDecision.NAME, factor);
    }

    /**
     * @param riskAttrs 每项风险的风险属性值
     * @description 根据是否匹配风险得分模板确定规则风险系数 (SR4)
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:27
     */
    private RiskFactorDTO analysisPRSR4Factor(List<RiskAttrDTO> riskAttrs) {
        List<String> SR4 = Arrays.asList(PersonalRiskDecision.SR4);
        List<RiskAttrDTO> personalRiskAttrs = riskAttrs.stream().filter(item -> SR4.contains(item.getCode())).collect(Collectors.toList());
        int factor = PersonalRiskDecision.determinateFactor(personalRiskAttrs);
        return RiskFactorDTO.newInstance(PersonalRiskDecision.CODE, PersonalRiskDecision.NAME, factor);
    }

    /**
     * @param factorList 风险项系数集合
     * @description 根据是否匹配风险得分模板确定规则风险系数 (成才风险)
     * @return: com.decision.backend.dto.RiskFactorDTO
     * @date 2023/4/12 10:33
     */
    private RiskFactorDTO analysisSuccessRiskFactor(List<RiskFactorDTO> factorList) {
        List<String> SR = Arrays.asList(SuccessRiskDecision.SR);
        List<RiskFactorDTO> successRiskFactors = factorList.stream().filter(item -> SR.contains(item.getCode())).collect(Collectors.toList());
        int factor = SuccessRiskDecision.determinateFactor(successRiskFactors);
        return RiskFactorDTO.newInstance(SuccessRiskDecision.CODE, SuccessRiskDecision.NAME, factor);
    }

    /**
     * @param factorList 风险项系数集合
     * @description 根据八项风险系数，判定风险等级
     * @return: com.decision.backend.controller.response.ResultResponse
     * @date 2023/4/12 10:32
     */
    private ResultResponse eachResult(List<RiskFactorDTO> factorList) {
        // TODO 根据业务需求，此处将DR的结果剔除，暂不进行删除，以备用
        List<RiskFactorDTO> filterRiskFactors = factorList.stream().filter(item -> !Objects.equals(DecisionRuleDecision.CODE, item.getCode())).collect(Collectors.toList());

        List<RiskResultResponse> resultList = new ArrayList<>();
        filterRiskFactors.forEach(item -> {
            // TODO 得分只有一分两分，这个分数怎么算，就用一分两分
            int score = item.getFactor();
            String analysisResult = CompareUtils.compareFactor(item.getFactor());
            RiskResultResponse riskResult = RiskResultResponse.newInstance(item.getFactor(), score, item.getCode(), item.getName(), analysisResult);
            resultList.add(riskResult);
        });
        return ResultResponse.newInstance(200, "响应成功", resultList);
    }

    public int determinateAttr(int score) {
        int attribute;
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
