package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by castro on 10/27/16.
 */
@RestController
public class DemoController {

   @RequestMapping("/hello")
    public String hello(){
       return "hello";
   }


}
