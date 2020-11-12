package com.example.feign3.controller;

import com.example.feign3.dto.Items;
import com.example.feign3.dto.event.EventDto;
import com.example.feign3.dto.event.EventKey;
import com.example.feign3.dto.event.withdraw.WithdrawEvent;
import com.example.feign3.proxy.ExamProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/outgoing-documents")
public class ExamController {
    private final ExamProxy proxy;

    public ExamController(ExamProxy proxy) {
        this.proxy = proxy;
    }

    @GetMapping("/event")
    public ResponseEntity<Items<EventDto<WithdrawEvent>>> getWithdrawContent() {
        ResponseEntity<Items<EventDto<WithdrawEvent>>> event = proxy.getEventByType("documentId", 1004);
        return event;
    }
}
