package com.cimc.cloud.feign;

import com.cimc.cloud.api.MemberApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author chenz
 * @create 2020-03-10 14:15
 */
@FeignClient(name = "microservice-service-member")
public interface MemberFeignClient extends MemberApi {
}

