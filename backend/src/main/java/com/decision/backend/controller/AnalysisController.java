package com.decision.backend.controller;

import com.decision.backend.controller.request.AnswerRequest;
import com.decision.backend.controller.response.ResultResponse;
import com.decision.backend.service.AnalysisService;
import org.springframework.web.bind.annotation.*;

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
        return analysisService.analysisDecision(answerList);
    }

    @GetMapping("/fallback")
    public String fallback() {
        return "访问超时，请稍后再试!";
    }
}
