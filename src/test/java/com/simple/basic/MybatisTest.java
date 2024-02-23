package com.simple.basic;

import com.simple.command.ScoreVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

//이 클래스를 junit4 와 연결해서 스프링 클래스로 동작을 시키려면
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") // 테스트랑 스프링 빈 파일의 경로
public class MybatisTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void selectThree(){
       ArrayList<ScoreVo> list = testMapper.selectThree();
        System.out.println(list.toString());
    }
    @Test
    public void update(){
       testMapper.update(new ScoreVo(1,"김박사", "50","50","50"));
    }

}
