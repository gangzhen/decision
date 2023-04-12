package com.decision.backend.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskFactorDTO {

    private String code;
    private int factor;

    public static RiskFactorDTO newInstance() {
        return new RiskFactorDTO("", 0);
    }
}
