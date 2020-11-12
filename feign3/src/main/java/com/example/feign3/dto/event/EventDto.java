package com.example.feign3.dto.event;

import com.example.feign3.dto.SignatureDto;
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
public class EventDto<T extends Event> {

    @JsonProperty(value = "key", required = true)
    private EventKey key;

    @JsonProperty(value = "content")
    private T content;

    @JsonProperty(value = "created_at", required = true)
    private Long createdAt;

    @JsonProperty(value = "filename")
    private String filename;

    @JsonProperty(value = "signature")
    private SignatureDto signature;

    @JsonProperty(value = "status", required = true)
    private int status;

    @JsonProperty(value = "type", required = true)
    private int type;

    @JsonProperty(value = "need_copy")
    private Boolean needCopy;

    @JsonProperty(value = "created_by")
    private Integer createdBy;

    @JsonProperty(value = "changed_by")
    private Integer changedBy;
}