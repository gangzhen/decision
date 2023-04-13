package com.decision.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskAttrDTO {

    private String code;
    private int attribute;

    public static RiskAttrDTO newInstance() {
        return new RiskAttrDTO("", 0);
    }
}
