package com.decision.backend.controller;

import com.decision.backend.controller.request.AnswerRequest;
import com.decision.backend.controller.response.ResultResponse;
import com.decision.backend.service.AnalysisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analysis")
public class AnalysisController {

    private final AnalysisService analysisService;

    public AnalysisController(AnalysisService analysisService) {
        this.analysisService = analysisService;
    }

    @PostMapping("/decision")
    public ResultResponse analysisDecisionResult(@RequestBody List<AnswerRequest> answerList) {
        analysisService.analysisDecision(answerList);
        return ResultResponse.testInstance();
    }
}
