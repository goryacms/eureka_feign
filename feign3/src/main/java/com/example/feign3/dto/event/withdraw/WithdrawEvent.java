package com.example.feign3.dto.event.withdraw;

import com.example.feign3.dto.event.Event;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawEvent implements Event {
    @JsonProperty(value = "docId")
    private DocId docId;
    @JsonProperty(value = "workflowData")
    private WorkflowData workflowData;
    @JsonProperty(value = "exchangeFileInformation")
    private ExchangeFileInformation exchangeFileInformation;
    private String signer;
    @JsonProperty(value = "formVersion")
    private String formVersion;
}
