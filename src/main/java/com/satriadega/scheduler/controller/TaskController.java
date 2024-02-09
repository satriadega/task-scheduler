package com.satriadega.scheduler.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @GetMapping("/test")
  public Map<String, String> testEndpoint() {

    Map<String, String> jsonResponse = new HashMap<>();
    jsonResponse.put("message", "This is a test endpoint");
    return jsonResponse;
  }
}
