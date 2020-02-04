package cn.hanff.controller;

/**
 * Created by hanff on 2020/02/04.
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String testHello(){

        return "hello";
    }

}
