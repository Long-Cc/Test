package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by G1596580 on 2018/10/24.
 */

public class PostMsapCheckData {

    /**
     * class : 白班
     * Comment :
     * EndTime : 2015/04/15 10:05:19
     * errorMessage : 无
     * reportCode : SfceWebBY090
     * modetype : 6
     * Equ_id : PNLCYJ001#
     * FieldItems : [{"controlType":"3","orderNo":"26","istop":"","itemcode":"26","key":"保养记录","value":"D","itemtime":"2015/04/15 10:05:19"}]
     * StartTime : 2015/04/15 10:03:21
     * WorkNo : G1596580
     */

    @SerializedName("class")
    private String classX;
    @SerializedName("Comment")
    private String Comment;
    @SerializedName("production")
    private String production;
    @SerializedName("EndTime")
    private String EndTime;
    @SerializedName("errorMessage")
    private String errorMessage;
    @SerializedName("reportcode")
    private String reportcode;
    @SerializedName("modetype")
    private String modetype;
    @SerializedName("Equ_id")
    private String EquId;
    @SerializedName("StartTime")
    private String StartTime;
    @SerializedName("WorkNo")
    private String WorkNo;
    @SerializedName("FieldItems")
    private List<FieldItems> FieldItems;

    public PostMsapCheckData() {
    }

    public PostMsapCheckData(String classX, String comment, String production, String endTime, String errorMessage, String reportcode, String modetype, String equId, String startTime, String workNo, List<PostMsapCheckData.FieldItems> fieldItems) {
        this.classX = classX;
        this.Comment = comment;
        this.production = production;
        this.EndTime = endTime;
        this.errorMessage = errorMessage;
        this.reportcode = reportcode;
        this.modetype = modetype;
        this.EquId = equId;
        this.StartTime = startTime;
        this.WorkNo = workNo;
        this.FieldItems = fieldItems;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getReportcode() {
        return reportcode;
    }

    public void setReportcode(String reportcode) {
        this.reportcode = reportcode;
    }

    public String getModetype() {
        return modetype;
    }

    public void setModetype(String modetype) {
        this.modetype = modetype;
    }

    public String getEquId() {
        return EquId;
    }

    public void setEquId(String EquId) {
        this.EquId = EquId;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getWorkNo() {
        return WorkNo;
    }

    public void setWorkNo(String WorkNo) {
        this.WorkNo = WorkNo;
    }

    public List<FieldItems> getFieldItems() {
        return FieldItems;
    }

    public void setFieldItems(List<FieldItems> FieldItems) {
        this.FieldItems = FieldItems;
    }

    public static class FieldItems {
        /**
         * controlType : 3
         * orderNo : 26
         * istop :
         * itemcode : 26
         * key : 保养记录
         * value : D
         * itemtime : 2015/04/15 10:05:19
         */

        @SerializedName("controlType")
        private String controlType;
        @SerializedName("orderNo")
        private String orderNo;
        @SerializedName("istop")
        private String istop;
        @SerializedName("itemcode")
        private String itemcode;
        @SerializedName("key")
        private String key;
        @SerializedName("value")
        private String value;
        @SerializedName("itemtime")
        private String itemtime;

        public FieldItems() {
        }

        public FieldItems(String controlType, String orderNo, String istop, String itemcode, String key, String value, String itemtime) {
            this.controlType = controlType;
            this.orderNo = orderNo;
            this.istop = istop;
            this.itemcode = itemcode;
            this.key = key;
            this.value = value;
            this.itemtime = itemtime;
        }

        public String getControlType() {
            return controlType;
        }

        public void setControlType(String controlType) {
            this.controlType = controlType;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getIstop() {
            return istop;
        }

        public void setIstop(String istop) {
            this.istop = istop;
        }

        public String getItemcode() {
            return itemcode;
        }

        public void setItemcode(String itemcode) {
            this.itemcode = itemcode;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getItemtime() {
            return itemtime;
        }

        public void setItemtime(String itemtime) {
            this.itemtime = itemtime;
        }
    }
}
