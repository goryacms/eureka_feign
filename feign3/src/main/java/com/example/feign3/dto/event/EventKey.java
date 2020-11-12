package com.example.feign3.dto.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EventKey {

    @JsonProperty(value = "owner_id", required = true)
    private String ownerId;

    @JsonProperty(value = "direction", required = true)
    private Integer direction;

    @JsonProperty(value = "document_id", required = true)
    private String documentId;

    @JsonProperty(value = "event_id")
    private String eventId;
}
