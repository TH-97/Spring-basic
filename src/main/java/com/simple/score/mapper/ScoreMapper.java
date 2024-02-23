package com.simple.score.mapper;

import com.simple.command.ScoreVo;

import java.util.ArrayList;

public interface ScoreMapper {
    public void regist(ScoreVo vo);
    public ArrayList<ScoreVo> getList();
    public void delete(int sno);
}
