package com.decision.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiskFactorDTO {

    private String code;
    private String name;
    private int factor;

    public static RiskFactorDTO newInstance() {
        return new RiskFactorDTO("", "", 0);
    }

    public static RiskFactorDTO newInstance(String code, String name, int factor) {
        return new RiskFactorDTO(code, name, factor);
    }
}
