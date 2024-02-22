package com.simple.command;

public class ScoreVo {

    private String name;
    private String kor;
    private String math;
    private String eng;
    public ScoreVo(String name, String kor, String math, String eng) {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKor() {
        return kor;
    }

    public void setKor(String kor) {
        this.kor = kor;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }
}
