package com.cimc.cloud.controller;

import com.cimc.cloud.feign.MemberFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2020-03-11 16:48
 */
@RestController
@RequestMapping("order")
@Slf4j
//@DefaultProperties(defaultFallback = "getOrder_GlobalFallbackMethod")
public class OrderController {

    @Autowired
    private MemberFeignClient memberFeignClient;

    @GetMapping("/getOrder_OK/{id}")
    public String getOrder_OK(@PathVariable("id") Long id) {
        String result = memberFeignClient.getMember_OK(id);
        log.info("*****result:" + result);
        return result;
    }

    @GetMapping("/getOrder_Timeout/{id}")
/*    @HystrixCommand(fallbackMethod = "getOrder_TimeoutFallbackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")
    })*/
    //@HystrixCommand
    public String getOrder_Timeout(@PathVariable Long id) {
        String result = memberFeignClient.getMember_Timeout(id);
        log.info("*****result:" + result);
        return result;
    }

    public String getOrder_TimeoutFallbackMethod(@PathVariable("id") Long id) {
        return "订单服务调用会员服务，订单服务异常或者会员服务系统繁忙，请稍后重试！";
    }

    public String getOrder_GlobalFallbackMethod(Long id) {
        return "默认降级---订单服务调用会员服务，订单服务异常或者会员服务系统繁忙，请稍后重试！";
    }

}
