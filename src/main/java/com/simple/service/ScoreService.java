package com.simple.service;

import com.simple.command.ScoreVo;

import java.util.ArrayList;

public interface ScoreService {
    public void regist(ScoreVo vo);
    public ArrayList<ScoreVo> getList();
    public void delete(int sno);
}
