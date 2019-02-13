package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by G1596570 on 2018/12/28.
 */

public class PostLineLimitTimeData {

    @SerializedName("limittime")
    private List<LimitTimeBean> limitTime;

    public List<LimitTimeBean> getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(List<LimitTimeBean> limitTime) {
        this.limitTime = limitTime;
    }

    public static class LimitTimeBean {
        /**
         * line : 075
         * time : 25
         */

        @SerializedName("line")
        private String line;
        @SerializedName("time")
        private int time;

        public LimitTimeBean(String line, int time) {
            this.line = line;
            this.time = time;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }
}
