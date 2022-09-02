package ca.enjoyit.mavenspringbootapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.Duration;


@RestController
@Slf4j
@RequestMapping(path= "/v1/rest-api")
public class Controller {

    @Value("${duration}")
    Duration duration;

    @GetMapping
    public String getInfo() {
        return "Hello World! " + duration.toMillis();
        //return "Hello World! " + Duration.parse("pt20.344s").toMillis();
    }
}
