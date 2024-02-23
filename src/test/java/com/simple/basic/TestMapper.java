package com.simple.basic;

import com.simple.command.ScoreVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface TestMapper {

    public String getTime();
    public Map<String, Object> selectTwo = new HashMap<>(); //조인 할때에는 좋지만 나머지는 효율이 떨어질 수도 있다
    //다중행
    public ArrayList<ScoreVo> selectThree(); // 다중행 조회
    public void update(ScoreVo vo);// 업데이트
}
