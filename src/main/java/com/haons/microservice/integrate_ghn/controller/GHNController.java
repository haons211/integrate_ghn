package com.haons.microservice.integrate_ghn.controller;

import com.haons.microservice.integrate_ghn.dto.GHNRequest;
import com.haons.microservice.integrate_ghn.dto.GHNResponse;
import com.haons.microservice.integrate_ghn.service.GHNService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;



@RestController
@Slf4j
@RequestMapping("/shipping")
@RequiredArgsConstructor
public class GHNController {

    private final GHNService ghnService;


    @PostMapping("/get-fees")
    public ResponseEntity<GHNResponse> getFees(@RequestParam GHNRequest ghnRequest) {
        return ResponseEntity.ok(ghnService.getFees(ghnRequest));
    }
}
