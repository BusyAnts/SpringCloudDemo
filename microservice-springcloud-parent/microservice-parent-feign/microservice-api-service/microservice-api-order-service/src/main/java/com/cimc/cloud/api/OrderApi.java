package com.cimc.cloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenz
 * @create 2020-03-10 13:39
 */
@RequestMapping("order")
public interface OrderApi {

    @GetMapping("/getOrder/{id}")
    String getOrder(@PathVariable("id") Long id);

}
