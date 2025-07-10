package com.javarestcontroller;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaRestController {

    @RequestMapping
    public String javaRestController() {
        return "Troys JavaRestController Running";
    }

    @GetMapping("/expensive")
    @Timed(value = "expensive.operation", description = "Time spent on expensive operation")
    public String expensiveCall() throws InterruptedException {
        Thread.sleep(500);  // simulate delay
        return "Done";
    }
}
