package com.example.feign3.dto;

import lombok.Data;

import java.util.List;

@Data
public class Items<T> {
    private Integer count;
    private List<T> items;
}