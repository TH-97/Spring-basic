package com.simple.controller;

import com.simple.command.MemberVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

@Controller
@RequestMapping("/response")
public class ResponseController {
    @RequestMapping("/ex01")
    public String ex01(Model model){
        System.out.println();
        model.addAttribute("name", "홍길동");
        model.addAttribute("list", Arrays.asList(1,2,3,4));
        model.addAttribute("age", 20);
        return "views/response/ex01";
    }

    @RequestMapping("/ex02")
    public ModelAndView ex02(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "이순신");
        mv.addObject("age", 20);
        mv.setViewName("views/response/ex02");

        return mv;

    }
    //ModelAttribute - id를 받고 id이름으로 model을 넘긴다
//    @RequestMapping("/ex03")
//    public String ex03(@ModelAttribute("id") String id){
//
//        return "views/response/ex03";
//    }

    @RequestMapping("/ex03")
    public String ex03(@ModelAttribute("info") MemberVo vo
                        ){

        return "views/response/ex03";
    }
    //////redirect와 redirectAttirubute

    //화면처리
    @RequestMapping("/redirect_login")
    public String loginView(){

        return "views/response/redirect_login";
    }

    @RequestMapping(value = "/loginForm", method = RequestMethod.POST)
    public String loginForm(@RequestParam("id") String id,
                            @RequestParam("pw") String pw,
                            RedirectAttributes ra)
    {

        if(id.equals(pw)) { //로그인 성공
            return "views/response/redirect_ok";
        } else {
            ra.addFlashAttribute("msg","아이디 비밀번호를 확인하세요"); //단 한번만 실행 가능하다
            return "redirect:redirect_login";
        }
    }

}
