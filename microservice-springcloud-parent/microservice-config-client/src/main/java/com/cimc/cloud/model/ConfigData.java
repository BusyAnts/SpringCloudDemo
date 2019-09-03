package com.cimc.cloud.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author chenz
 */
@Component
@Data
@RefreshScope
public class ConfigData {

    @Value("${version}")
    private String version;

}
