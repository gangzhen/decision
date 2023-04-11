package com.decision.backend.controller.request;

import lombok.Data;

@Data
public class AnswerRequest {
    private String code;
    private int index;
    private int possibility;
    private int severity;
    private int controllability;
}
