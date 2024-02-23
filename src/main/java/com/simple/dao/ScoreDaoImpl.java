package com.simple.dao;

import com.simple.command.ScoreVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
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

    @Override
    public ArrayList<ScoreVo> getList() {

        ArrayList<ScoreVo> list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from score order by sno desc";


        try {

            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while(rs.next()) {
                int sno= rs.getInt("sno");
                String name = rs.getString("name");
                String kor = rs.getString("kor");
                String eng = rs.getString("eng");
                String math = rs.getString("math");

                ScoreVo vo = new ScoreVo(sno, name, kor, math, eng);
                list.add(vo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn != null) conn.close();
                if(pstmt != null) pstmt.close();
                if(rs != null) rs.close();
            } catch (Exception e2) {

            }
        }

        return list;
    }

    @Override
    public void delete(int sno) {
        String sql = "delete from score where sno = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ds.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,sno);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(conn != null) conn.close();
                if(pstmt != null) pstmt.close();
            }catch (Exception e2){

            }

        }
    }
}
