package com.example.feign4.controller;

import com.example.feign4.dto.Items;
import com.example.feign4.dto.event.EventDto;
import com.example.feign4.dto.event.withdraw.WithdrawEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.feign4.utils.FileTestUtils.stringFromFile;


@RefreshScope
@RestController
@RequestMapping("/incoming-documents")
public class ExamController {
    private static final String docOfficeDir = "doc-office/";

    @GetMapping(value = "/{documentId}/events/{eventTypeId}")
    public ResponseEntity<Items<EventDto<WithdrawEvent>>> getWithdrawContent(
            @PathVariable String documentId
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Items<EventDto<WithdrawEvent>> eventType = objectMapper.readValue(
                stringFromFile(docOfficeDir + "withdraw_response.json", this.getClass()), new TypeReference<>() {});
        ResponseEntity<Items<EventDto<WithdrawEvent>>> withdrawResponseEntity = new ResponseEntity<>(eventType, HttpStatus.OK);
        return withdrawResponseEntity;
    }
}
