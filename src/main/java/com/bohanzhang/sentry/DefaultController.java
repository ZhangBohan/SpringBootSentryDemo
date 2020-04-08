package com.bohanzhang.sentry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping
    public void index() {
        throw new NullPointerException();
    }
}
