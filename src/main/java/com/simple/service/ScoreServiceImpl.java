package com.simple.service;

import com.simple.command.ScoreVo;
import com.simple.dao.ScoreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("xxx") //이름은 xxx
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;
    @Override
    public void regist(ScoreVo vo) {
        scoreDao.regist(vo);
    }
}
