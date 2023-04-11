package com.decision.backend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum Rules {

    OR1(1, "OR1", "遗传"),
    OR2(2, "OR2", "非遗传"),
    SR1(3, "SR1", "项目文化"),
    SR2(4, "SR2", "管理制度"),
    SR3(5, "SR3", "物质保障"),
    SR4(6, "SR4", "人际关"),

    ;

    private final int index;
    private final String code;
    private final String detail;
}
