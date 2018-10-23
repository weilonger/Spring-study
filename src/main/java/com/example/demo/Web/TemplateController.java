package com.example.demo.Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TemplateController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/test1")
    public String test(Model model){
        model.addAttribute("hello","麒麟");
//        Student student1 = new Student(1,"李白","杜甫1",new Date());
//        Student student2 = new Student(2,"李白","杜甫2",new Date());
//        Student student3 = new Student(3,"李白","杜甫3",new Date());
        List<Student> student = new ArrayList<Student>();
        for (int i = 0; i <10 ; i++) {
            Student student1 = new Student(i,"李白" + i,"杜甫" + i,new Date());
            student.add(student1);
        }
        model.addAttribute("student",student);
        return "test";
    }

}
