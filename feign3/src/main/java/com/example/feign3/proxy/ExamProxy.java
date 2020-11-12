package com.example.feign3.proxy;

import com.example.feign3.dto.Items;
import com.example.feign3.dto.event.EventDto;
import com.example.feign3.dto.event.withdraw.WithdrawEvent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "feign4", decode404 = true)
public interface ExamProxy {

    @GetMapping(value = "/incoming-documents/{documentId}/events/{eventTypeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Items<EventDto<WithdrawEvent>>> getEventByType(@PathVariable String documentId,
                                                                  @PathVariable Integer eventTypeId);
}
