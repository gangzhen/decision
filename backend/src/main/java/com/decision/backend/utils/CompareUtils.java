package com.decision.backend.utils;

import com.decision.backend.model.RiskScores;
import com.decision.backend.service.RiskAttrDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CompareUtils {

    /**
     * @param riskAttrs     风险属性值集合
     * @param factor        对比得出的风险系数
     * @param scoreArr      决策规则信息
     * @param defaultFactor 决策规则规定的默认风险系数
     * @description 根据题目选择选项得出的风险属性值与决策规则信息对比，得出风险系数
     * @return: int
     * @date 2023/4/12 14:27
     */
    public static int CompareAttrValue(List<RiskAttrDTO> riskAttrs, int factor, RiskScores[] scoreArr, int defaultFactor) {
        boolean flag = true;
        for (RiskScores score : scoreArr) {
            List<RiskAttrDTO> riskAttr = riskAttrs.stream().filter(attr -> Objects.equals(score.getRiskItem().getCode(), attr.getCode())).collect(Collectors.toList());
            if (riskAttr.size() > 0) {
                flag = score.getRiskAttr() == riskAttr.get(0).getAttribute();
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            factor = defaultFactor;
        }
        return factor;
    }
}
