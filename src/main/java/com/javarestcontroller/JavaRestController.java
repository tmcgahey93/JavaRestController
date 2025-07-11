package com.javarestcontroller;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaRestController {

    @RequestMapping("/")
    @Timed(value = "RESTCALL", description = "RESTCALL")
    public String javaRestController() {
        ExpensiveClass.doWork();
        return "Troys JavaRestController Running";
    }
}
