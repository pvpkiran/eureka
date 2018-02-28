package in.phani.springboot.controller;

import in.phani.springboot.feign.GreetingClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

  private final GreetingClient greetingClient;

  public GreetingController(final GreetingClient greetingClient) {
    this.greetingClient = greetingClient;
  }

  @GetMapping("/greeting")
  public String greet() {
    return greetingClient.greeting();
  }
}
