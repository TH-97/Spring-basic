package com.simple.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/request") //컨트롤러 상위 요청이
public class RequestController {
    //화면을 띄우고 싶으면, 컨트롤러 화면을 띄우는 맵핑
    @RequestMapping(value = "/ex01")
    public String ex01(){
        return "/request/ex01"; //return "화면의 경로
    }

    //get방식의 요청만 허용한다. RequestMethod.Get
    //post방식의 요청만 허용함 Request.Post

    @RequestMapping("/basic")
    public void basic(){
        System.out.println("여기 잘 실행됨");
    }

    //ex화면
    @RequestMapping("/ex02")
    public String ex02(){
        return "request/ex02";
    }
    //폼의 요청
    @RequestMapping(value = "/param", method = RequestMethod.POST)
    public String param(HttpServletRequest request){ //데이터

        System.out.println(request.getParameter("id"));
        System.out.println(request.getParameter("name"));
        System.out.println(request.getParameter("age"));
        System.out.println(Arrays.toString(request.getParameterValues("inter")));


        return "request/ex02_result";
    }
}
