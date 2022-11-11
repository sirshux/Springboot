package com.example.demo;


import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController//简化RequestMapping、Controller
@RequestMapping("/save")
public class 入门 {
//    @RequestMapping(value = "/save",method = RequestMethod.PUT)
//    @ResponseBody
    @PutMapping
    public String put( User user) {
        System.out.println("user"+user);
        return "{module':'user savegsagasg'}";
    }
//@RequestMapping(value = "/save",method = RequestMethod.POST)
//    @ResponseBody
    @PostMapping
    public String save() {
    System.out.println("user");
    return "{module':'user save',user}";
}
//    @RequestMapping(value = "/save",method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping
    public String get() {
        System.out.println("user");
        return "{module':'user save'}";
    }
//    @RequestMapping(value = "/save/{id}",method = RequestMethod.DELETE)
//    @ResponseBody
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("id:"+id);
        return "{module':'user save'ddd}";
    }

}
