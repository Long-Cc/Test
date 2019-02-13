package com.avary.login.DataSource.JavaBean;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by G1596570 on 2018/8/4.
 *
 */

public class FormCheckContent implements Parcelable {


    /**
     * formName : 前处理（2）
     * formId : sfcewebfpc01
     * formContent : [{"workStation":"快速蚀刻","process":"膨松段","headerNum":"1","base":"槽液温度","checkStandard":"77±0.2℃","standardValue":"77|0.2","precision":0.01,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"膨松段近景","rightImgSrc":"膨松段远景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"投收板机","headerNum":"0","base":"吸嘴","checkStandard":"吸嘴破损及脏污无法清洁时更换","standardValue":"","precision":null,"frequency":"1次/ 班","shift":"白班","modleType":2,"leftImgSrc":"投收板机近景","rightImgSrc":"投收板机远景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"desmear","headerNum":"0","base":"线速","checkStandard":"2.0±0.5m/min","standardValue":"0.5|0.2","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"desmear近景","rightImgSrc":"desmear远景","reuslt":"","changeResult":""},{"workStation":"快速蚀刻","process":"膨松段","headerNum":"1","base":"上喷压","checkStandard":"0.5±0.2kg/cm2","standardValue":"0.5|0.2","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"膨松段1近景","rightImgSrc":"膨松段1远景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"膨松段","headerNum":"2","base":"过滤机压力","checkStandard":"0.5±0.3kg/cm2","standardValue":"0.5|0.3","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"膨松段2近景","rightImgSrc":"膨松段2远景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"膨松段","headerNum":"3","base":"下喷压","checkStandard":"0.5±0.2kg/cm2","standardValue":"0.5|0.2","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"膨松段3近景","rightImgSrc":"膨松段3远景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"回收水洗1","headerNum":"4","base":"上喷压","checkStandard":"0.5±0.2kg/cm2","standardValue":"0.5|0.2","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"回收水洗1近景","rightImgSrc":"回收水洗1远景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"回收水洗1","headerNum":"5","base":"下喷压","checkStandard":"0.5±0.2kg/cm2","standardValue":"0.5|0.2","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"回收水洗1近景","rightImgSrc":"回收水洗1近景","result":"","changeResult":""},{"workStation":"快速蚀刻","process":"回收水洗1","headerNum":"6","base":"过滤机压力","checkStandard":"0.5±0.3kg/cm2","standardValue":"0.5|0.2","precision":0.1,"frequency":"1次/班","shift":"白班","modleType":1,"leftImgSrc":"回收水洗1近景","rightImgSrc":"回收水洗1近景","result":"","changeResult":""}]
     */
    @SerializedName("machineId")
    private String machineId;
    @SerializedName("formName")
    private String formName;
    @SerializedName("codingId")
    private String codingId;
    @SerializedName("formId")
    private String formId;
    @SerializedName("startTime")
    private String competeTime;
    @SerializedName("sTime")
    private String endTime;
    //@SerializedName("formContent")
    @SerializedName("multiColFormRowItem")
    private List<FormContentBean> formContent;

    protected FormCheckContent(Parcel in) {
        machineId = in.readString();
        formName = in.readString();
        codingId = in.readString();
        formId = in.readString();
        competeTime = in.readString();
        endTime = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(machineId);
        dest.writeString(formName);
        dest.writeString(codingId);
        dest.writeString(formId);
        dest.writeString(competeTime);
        dest.writeString(endTime);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<FormCheckContent> CREATOR = new Creator<FormCheckContent>() {
        @Override
        public FormCheckContent createFromParcel(Parcel in) {
            return new FormCheckContent(in);
        }

        @Override
        public FormCheckContent[] newArray(int size) {
            return new FormCheckContent[size];
        }
    };

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public String getFormName() {
        return formName;
    }

    public String getCodingId() {
        return codingId;
    }

    public void setCodingId(String codingId) {
        this.codingId = codingId;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getCompeteTime() {
        return competeTime;
    }

    public void setCompeteTime(String competeTime) {
        this.competeTime = competeTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public List<FormContentBean> getFormContent() {
        return formContent;
    }

    public void setFormContent(List<FormContentBean> formContent) {
        this.formContent = formContent;
    }

    public static class FormContentBean {
        /**
         * workStation : 快速蚀刻
         * process : 膨松段
         * headerNum : 1
         * base : 槽液温度
         * checkStandard : 77±0.2℃
         * standardValue : 77|0.2
         * precision : 0.01
         * frequency : 1次/班
         * shift : 白班
         * modleType : 1
         * leftImgSrc : 膨松段近景
         * rightImgSrc : 膨松段远景
         * result :
         * changeResult :
         * reuslt :
         */
        @SerializedName("rowID")
        private String rowID;
        @SerializedName("workStation")
        private String workStation;
        @SerializedName("process")
        private String process;
        @SerializedName("headerNum")
        private String headerNum;
        @SerializedName("base")
        private String check;
        @SerializedName("checkStandard")
        private String checkStandard;
        @SerializedName("standardValue")
        private String standardValue;
        @SerializedName("precision")
        private double precision;
        @SerializedName("frequency")
        private String frequency;
        @SerializedName("shift")
        private String shift;
        @SerializedName("modleType")
        private int modleType;
        @SerializedName("leftImgSrc")
        private String leftImgSrc;
        @SerializedName("rightImgSrc")
        private String rightImgSrc;
        @SerializedName("result")
        private String result;
        @SerializedName("changeResult")
        private String changeResult;
        @SerializedName("resultDatetime")
        private String resultDatetime;

        public String getRowID() {
            return rowID;
        }

        public void setRowID(String rowID) {
            this.rowID = rowID;
        }

        public String getWorkStation() {
            return workStation;
        }

        public void setWorkStation(String workStation) {
            this.workStation = workStation;
        }

        public String getProcess() {
            return process;
        }

        public void setProcess(String process) {
            this.process = process;
        }

        public String getHeaderNum() {
            return headerNum;
        }

        public void setHeaderNum(String headerNum) {
            this.headerNum = headerNum;
        }

        public String getCheck() {
            return check;
        }

        public void setCheck(String check) {
            this.check = check;
        }

        public String getCheckStandard() {
            return checkStandard;
        }

        public void setCheckStandard(String checkStandard) {
            this.checkStandard = checkStandard;
        }

        public String getStandardValue() {
            return standardValue;
        }

        public void setStandardValue(String standardValue) {
            this.standardValue = standardValue;
        }

        public double getPrecision() {
            return precision;
        }

        public void setPrecision(double precision) {
            this.precision = precision;
        }

        public String getFrequency() {
            return frequency;
        }

        public void setFrequency(String frequency) {
            this.frequency = frequency;
        }

        public String getShift() {
            return shift;
        }

        public void setShift(String shift) {
            this.shift = shift;
        }

        public int getModleType() {
            return modleType;
        }

        public void setModleType(int modleType) {
            this.modleType = modleType;
        }

        public String getLeftImgSrc() {
            return leftImgSrc;
        }

        public void setLeftImgSrc(String leftImgSrc) {
            this.leftImgSrc = leftImgSrc;
        }

        public String getRightImgSrc() {
            return rightImgSrc;
        }

        public void setRightImgSrc(String rightImgSrc) {
            this.rightImgSrc = rightImgSrc;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getChangeResult() {
            return changeResult;
        }

        public void setChangeResult(String changeResult) {
            this.changeResult = changeResult;
        }

        public String getResultDateTime() {
            return resultDatetime;
        }

        public void setResultDateTime(String resultDatetime) {
            this.resultDatetime = resultDatetime;
        }
    }
}
