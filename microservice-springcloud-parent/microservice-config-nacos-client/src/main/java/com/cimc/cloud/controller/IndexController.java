package com.cimc.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 */
@RestController
@RefreshScope
public class IndexController {
    @Value("${config.version}")
    private String version;

    @GetMapping("/getVersion")
    public String getVersion() {
        return version;
    }

}