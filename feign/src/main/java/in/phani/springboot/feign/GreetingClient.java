package in.phani.springboot.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client1")
public interface GreetingClient {

  @GetMapping("/greeting")
  String greeting();
}