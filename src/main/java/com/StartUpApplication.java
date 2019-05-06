package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
@RestController
public class StartUpApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartUpApplication.class,args);
        ExecutorService executorService = Executors.newScheduledThreadPool(1);
        Thread thread = new Thread(() -> {
            while (true){
                System.out.println("hello");
            }
        },"AThread");
        executorService.execute(thread);
    }

    @GetMapping(value = "/index")
    public String index(@RequestParam("name") String name){
        return name;
    }


}
