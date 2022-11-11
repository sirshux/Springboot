package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.Element;
import java.nio.file.Path;

@RestController
@RequestMapping(value = "/books",method = RequestMethod.POST)
public class cs {

//    @Value("${cit}")取yml中cit的属性值
//    public String cit;
    @Autowired

    public Environment env;
    @Autowired
    private MyDateSuce MyDateSuce;

    @GetMapping
    public String save(){

        System.out.println("Hello Word"+ MyDateSuce);
        return "HelloWord"+env.getProperty("cit");
    }

}
