package com.javarestcontroller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaRestController {

    @RequestMapping
    public String javaRestController() {
        return "Troys JavaRestController Running";
    }
}
