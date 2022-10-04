package dev.be.profilemw1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${db_id}")
    private String db_id;

    @GetMapping("/demo")
    public String demo() {
        System.out.println(db_id);
        return "demo";
    }
}