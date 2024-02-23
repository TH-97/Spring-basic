package com.simple.controller;

import com.simple.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {

    @Autowired
    @Qualifier("BoardServiceImple")
    private BoardService boardService;

    @RequestMapping("/boardRegister")
    public String boardRegister(){
        return "views/board/boardRegister";
    }
}
