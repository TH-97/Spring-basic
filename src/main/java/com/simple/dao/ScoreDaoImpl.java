package com.simple.dao;

import com.simple.command.ScoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

@Repository("scoreDao")
public class ScoreDaoImpl implements ScoreDao{

    @Autowired
    private DataSource ds;

    @Override
    public void regist(ScoreVo vo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into score values (SCORE_SEQ.nextval, ?, ?, ?, ?)";
        try {
            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vo.getName());
            pstmt.setString(2, vo.getKor());
            pstmt.setString(3, vo.getEng());
            pstmt.setString(4, vo.getMath());

            pstmt.executeUpdate();
            System.out.println(conn);
        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            try {
                if(conn != null) conn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
