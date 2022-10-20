package com.mermer.oop.controller;

import com.mermer.oop.service.SortService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MyController {

    @Resource
    private SortService sortService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }


    @GetMapping("/sort")
    @ResponseBody
    public List<String> sort(@RequestParam List<String> list){
        return sortService.doSort(list);
    }
}
