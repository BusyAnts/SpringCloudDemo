package com.cimc.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${version}")
    private String version;

    @RequestMapping("/getVersion")
    private String getVersion() {
        return version;
    }
}
