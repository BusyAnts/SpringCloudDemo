package com.cimc.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author chenz
 * @create 2020-03-11 14:31
 */
@Service
public class MemberService {

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String getMember_OK(Long id) {
        return "线程池：" + Thread.currentThread().getName() + ", 调用getMember_OK,id:=" + id + ", 服务运行正常";
    }

    /**
     * 模拟耗时访问，模拟服务降级
     *
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "getMember_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String getMember_Timeout(Long id) {
        int timeNumber = 5;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + ", 调用getMember_Timeout,id:=" + id + ", 执行时间：(秒)" + timeNumber;
    }

    public String getMember_TimeoutHandler(Long id) {
        return "调用会员接口超时或异常，当前线程池：" + Thread.currentThread().getName();
    }

    @HystrixCommand(fallbackMethod = "getMemberCircuitBreakerFallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60")
    })
    public String getMemberCircuitBreaker(@PathVariable("id") Integer id) {
        if (id < 0) {
            throw new RuntimeException("*****id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号：" + serialNumber;
    }

    public String getMemberCircuitBreakerFallback(@PathVariable("id") Integer id) {
        return "id不能为负数，请稍后重试，id：" + id;
    }

}
