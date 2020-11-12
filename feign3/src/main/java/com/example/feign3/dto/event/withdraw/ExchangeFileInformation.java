package com.example.feign3.dto.event.withdraw;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExchangeFileInformation {
    @JsonProperty(value = "fileIdentifier")
    private String fileIdentifier;
    @JsonProperty(value = "fileCreationDateTime")
    private String fileCreationDateTime;
    @JsonProperty(value = "electronicSignature")
    private ArrayList<SignatureDto> electronicSignature;
}
