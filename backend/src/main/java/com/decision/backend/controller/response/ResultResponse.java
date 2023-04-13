package com.decision.backend.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse {
    // API请求状态码
    private int status;
    // API请求消息
    private String message;
    private List<RiskResultResponse> resultList;

    public static ResultResponse testInstance() {
        return new ResultResponse(200, "success", new ArrayList<>());
    }

    public static ResultResponse newInstance(int status, String message, List<RiskResultResponse> resultList) {
        return new ResultResponse(status, message, resultList);
    }
}
