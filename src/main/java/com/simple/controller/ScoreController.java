package com.simple.controller;

import com.simple.command.ScoreVo;
import com.simple.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

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
    public String scoreList(Model model) {
        ArrayList<ScoreVo> list = new ArrayList<>();
        model.addAttribute("list",list);
        return "/views/score/scoreList";
    }

    //등록요청
    @RequestMapping(value = "/scoreForm", method = RequestMethod.POST)
    public String scoreForm(ScoreVo vo){

        service.regist(vo);
        return "redirect:/score/scoreResult";
    }
    //삭제요청 post방식으로 해야하지만 지금은 get방식
    @RequestMapping("/deleteForm")
    public String deleteForm(@RequestParam("sno") int sno){
        service.delete(sno);
        return "redirect:/score/scoreList"; //리 다이랙트를 쓰는 이유는 컨트롤러를 호출해서 데이터를 다시 불러오기 위함
    }
}
