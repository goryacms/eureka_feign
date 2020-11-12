package com.example.feign3.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignatureDto {

    @JsonProperty(value = "is_valid", required = true)
    private boolean isValid;

    @JsonProperty(value = "created_at")
    private Long createdAt;

    @JsonProperty(value = "comment")
    private String comment;

    @JsonProperty(value = "certificate", required = true)
    private CertificateDto certificate;
}
