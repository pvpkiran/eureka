package in.phani.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
/*
 * There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper).
 * @EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath.
 * @EnableEurekaClient lives in spring-cloud-netflix and only works for eureka.
 * If eureka is on your classpath, they are effectively the same.
 */
public class ClientApplication {
  public static void main(String[] args) {
    SpringApplication.run(ClientApplication.class, args);
  }
}
