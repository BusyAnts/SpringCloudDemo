package com.cimc.cloud.controller;

import com.cimc.cloud.model.ConfigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 */
@RestController
//@RefreshScope
public class IndexController {
    @Value("${version}")
    private String version;

    @RequestMapping("/getVersion")
    private String getVersion() {
        return version;
    }

    @Autowired
    private ConfigData configData;

    @RequestMapping("/getVersion2")
    private String getVersion2() {
        return configData.getVersion();
    }

}
