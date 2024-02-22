package com.simple.basic;

import com.simple.command.ScoreVo;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/score")
public class ScoreController {
    //1st
//    private ScoreService service = new ScoreServiceImpl();
    //2st
    @Autowired
    @Qualifier("xxx") //이름으로 연결
    private ScoreService service;


    @RequestMapping("/scoreRegist")
    public String scoreRegist() {
        return "/views/score/scoreRegist";
    }
    @RequestMapping("/scoreResult")
    public String scoreResult() {
        return "/views/score/scoreResult";
    }

    @RequestMapping("/scoreList")
    public String scoreList() {
        return "/views/score/scoreList";
    }

    //등록요청
    @RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
    public String scoreForm(ScoreVo vo){

        service.regist(vo);
        return "redirect:/score/scoreResult";
    }
}
