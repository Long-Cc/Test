package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FormPostData {
    @SerializedName("WorkNo")
    public String workNo;
    @SerializedName("reportCode")
    public String formID;
    @SerializedName("Equ_id")
    public String machineID;
    @SerializedName("modetype")
    public String formType;
    @SerializedName("StartTime")
    public String startTime;
    @SerializedName("EndTime")
    public String endTime;
    @SerializedName("class")
    public String clsr;   //班别
    @SerializedName("errorMessage")
    public String errorMsg;
    @SerializedName("Comment")
    public String comment;    //备注
    @SerializedName("production")
    public String production;   //设备生产状态
    @SerializedName("FieldItems")
    public List<FormPostRow> postRows;

    public FormPostData() {
        postRows = new ArrayList<>();
    }

    public FormPostData(String workNo, String formID, String machineID, String formType, String startTime, String endTime, String clsr, String errorMsg, String comment, String production) {
        this.workNo = workNo;
        this.formID = formID;
        this.machineID = machineID;
        this.formType = formType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.clsr = clsr;
        this.errorMsg = errorMsg;
        this.comment = comment;
        this.production = production;
        postRows = new ArrayList<>();
    }

    public static class FormPostRow {
        @SerializedName("key")
        public String rowName;
        @SerializedName("value")
        public String rowValue;
        @SerializedName("itemcode")
        public String rowID;
        @SerializedName("istop")
        public String rowExtraType;
        @SerializedName("controlType")
        public String controlType;
        @SerializedName("appdate")
        public String appdate;
        @SerializedName("orderNo")
        public String orderNo;

//        @Expose(serialize = false, deserialize = false)
//        public String orderNo;


        public FormPostRow(String rowName, String rowValue, String rowID, String rowExtraType, String controlType, String appdate, String orderNo) {
            this.rowName = rowName;
            this.rowValue = rowValue;
            this.rowID = rowID;
            this.rowExtraType = rowExtraType;
            this.controlType = controlType;
            this.appdate = appdate;
            this.orderNo = orderNo;

        }
    }
}
