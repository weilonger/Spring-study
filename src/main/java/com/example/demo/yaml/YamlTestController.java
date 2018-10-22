package com.example.demo.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ImportResource(locations = {"classpath:beans.xml"})
@Controller
public class YamlTestController {

    @Autowired
    Person person;

    @Autowired
    Person1 person1;

    @Autowired
    ApplicationContext context;

    @ResponseBody
    @RequestMapping("/person")
    public String people() {
        return person.toString();
    }
    @ResponseBody
    @RequestMapping("/ps")
    //控制台打印
    public void person(){
        System.out.println(person);
        System.out.println(person1);
        Object person2 = context.getBean("person2");
        System.out.println(person2);
    }

}
