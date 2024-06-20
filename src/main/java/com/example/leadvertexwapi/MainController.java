package com.example.leadvertexwapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wapi")
@Slf4j
public class MainController {

    @PostMapping("/test")
    public void test(@RequestBody String body) {
        log.info("Body of JSON: {}", body);
    }

}
