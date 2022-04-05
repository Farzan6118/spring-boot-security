package com.example.security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/info")
@RequiredArgsConstructor
public class InfoController {

    Map<String, String> stringStringMap = new HashMap<>();

    @PreAuthorize("hasRole('ROLE_VIEWER')")
    @GetMapping("test")
    public Map<String, String> testCall() {
        stringStringMap.put("one", "testOne");
        stringStringMap.put("two", "testTwo");

        return stringStringMap;
    }

}
