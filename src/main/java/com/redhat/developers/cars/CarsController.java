package com.redhat.developers.cars;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/cars")
public class CarsController {

	@RequestMapping(value = "/home",produces = "text/html")
    public String home() {
        return "<h1>Hello!!</h1><p><h2>Cars API</h2></p><p>Click <a href=\"/cars/list\">list</a> to get a " +
            "list of my favorite cars</p>";
    }

    @RequestMapping(value = "/v1/list", produces = "application/json")
    public List<String> cars() {
        return Arrays.asList("BMW", "Hyundai Verna", "Audi", "Ferrari");
    }
    
    @RequestMapping(value = "/v1/isAlive",produces = "text/html")
    public String isAlive() {
        return "ok";
    }
    
    @RequestMapping(value = "/v2/list", produces = "application/json")
    public List<String> carsV2() {
        return Arrays.asList("BMW", "Hyundai Verna", "Audi", "Ferrari");
    }
    
    @RequestMapping(value = "/v2/isAlive",produces = "text/html")
    public String isAliveV2() {
        return "ok";
    }
    
}
