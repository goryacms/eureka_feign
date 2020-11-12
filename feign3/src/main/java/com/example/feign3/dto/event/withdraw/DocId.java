package com.example.feign3.dto.event.withdraw;

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
public class DocId {
    private String sender;
    private String recipient;
    private String prefix;
    @JsonProperty(value = "eventId")
    private String eventId;
    private String time;
}
