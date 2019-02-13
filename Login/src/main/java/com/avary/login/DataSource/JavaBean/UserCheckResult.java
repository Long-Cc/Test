package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserCheckResult {

    /**
     * Status : Success
     * Message : null
     * CheckUser : [{"userid":"F7012687","reportcode":"FB7YA070212F1"}]
     */

    @SerializedName("Status")
    private String Status;
    @SerializedName("Message")
    private Object Message;
    @SerializedName("CheckUser")
    private List<CheckData> Data;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Object getMessage() {
        return Message;
    }

    public void setMessage(Object Message) {
        this.Message = Message;
    }

    public List<CheckData> getData() {
        return Data;
    }

    public void setData(List<CheckData> Data) {
        this.Data = Data;
    }

    public static class CheckData {
        /**
         * userid : F7012687
         * reportcode : FB7YA070212F1
         */

        @SerializedName("userid")
        private String userid;
        @SerializedName("reportcode")
        private String reportcode;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getReportcode() {
            return reportcode;
        }

        public void setReportcode(String reportcode) {
            this.reportcode = reportcode;
        }
    }
}
