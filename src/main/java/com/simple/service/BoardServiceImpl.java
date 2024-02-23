package com.simple.service;

import com.simple.board.mapper.BoardMapper;
import com.simple.command.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("BoardServiceImple")
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardMapper boardMapper;
    @Override
    public void boardRegist(BoardVO vo) {

    }

    @Override
    public ArrayList<BoardVO> getList() {
        return null;
    }

    @Override
    public void boardDelete(int num) {

    }
}
