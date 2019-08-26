package com.cimc.cloud.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenz
 */
@Configuration
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {
    private static WebServerInitializedEvent event;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        event = webServerInitializedEvent;
    }

    /**
     * 获取端口号
     *
     * @return
     */
    public static int getPort() {
        return event.getWebServer().getPort();
    }

}
