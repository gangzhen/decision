package com.decision.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum Levels {

    P(1, "possibility", "可能性"),
    S(1, "severity", "严重性"),
    C(1, "controllability", "可控性"),

    ;

    private final int index;
    private final String code;
    private final String detail;
}
