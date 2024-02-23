package com.simple.dao;

import com.simple.command.ScoreVo;

import java.util.ArrayList;

public interface ScoreDao {
    public void regist(ScoreVo vo);
    public ArrayList<ScoreVo> getList();
    public void delete(int sno);
}
