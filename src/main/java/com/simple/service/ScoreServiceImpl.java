package com.simple.service;

import com.simple.command.ScoreVo;
import com.simple.dao.ScoreDao;
import com.simple.score.mapper.ScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("xxx") //이름은 xxx
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public void regist(ScoreVo vo) {
        scoreMapper.regist(vo);
    }

    @Override
    public ArrayList<ScoreVo> getList() {
        ArrayList<ScoreVo> list = scoreMapper.getList();
        return list;
    }

    @Override
    public void delete(int sno) {

    }
}
