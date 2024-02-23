package com.simple.controller;

import com.simple.command.MemberVo;
//import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/quiz") //컨트롤러 상위 요청이
public class QuizController {

    @RequestMapping(value = "/quiz01")
    public String quiz01(){
        return "/quiz/quiz01";
    }
    @RequestMapping(value = "/sendBirth", method = RequestMethod.POST)
    public String quiz01_ok(@RequestParam("year") String year,
                            @RequestParam("month") String month,
                            @RequestParam("day") String day,
                            Model model){
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        model.addAttribute("year",year);
        model.addAttribute("month",month);
        model.addAttribute("day",day);

        return "/quiz/quiz01_ok";
    }
    @RequestMapping(value = "/quiz02")
    public String quiz02(Model model){

        MemberVo vo = new MemberVo("aaa123","홍길동", null, 20);
        MemberVo vo2 = new MemberVo("aaa124","김박사", null, 21);
        MemberVo vo3 = new MemberVo("aaa125","박시청", null, 22);

        ArrayList<MemberVo> list = new ArrayList<>();
        list.add(vo);
        list.add(vo2);
        list.add(vo3);
        model.addAttribute("data", list);

        return "/quiz/quiz02";
    }
    @RequestMapping("/quiz02_data")
    public String quiz02_data(@RequestParam("data") String id,Model model){
        System.out.println(id);
        model.addAttribute("id",id);
        return "/quiz/quiz02_data";
    }
}
