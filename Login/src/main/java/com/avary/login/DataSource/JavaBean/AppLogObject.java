package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by G1596570 on 2018/11/16.
 */

public class AppLogObject {

    /**
     * appname : 152
     * ieminum : dasd
     * device : dasd
     * mac : asd
     * ip : asd
     * ssid : asd
     * workno : G1596570
     * channame : kdhf
     * department : asd
     * bu : FPC
     * nfccode : asda
     * deviceid : asd
     * machinename : asda
     * formid : dasd
     * formname : asd
     * starttime : asd
     * endtime : asd
     */

    @SerializedName("appname")
    private int appName;
    @SerializedName("ieminum")
    private String IEMINum;
    @SerializedName("device")
    private String device;
    @SerializedName("mac")
    private String MAC;
    @SerializedName("ip")
    private String ipAdress;
    @SerializedName("ssid")
    private String SSID;
    @SerializedName("workno")
    private String workNo;
    @SerializedName("chnname")
    private String chanName;
    @SerializedName("department")
    private String department;
    @SerializedName("bu")
    private String BU;
    @SerializedName("nfccode")
    private String NFCCode;
    @SerializedName("deviceid")
    private String deviceId;
    @SerializedName("machinename")
    private String machineName;
    @SerializedName("formid")
    private String formId;
    @SerializedName("formname")
    private String formName;
    @SerializedName("starttime")
    private String startTime;
    @SerializedName("endtime")
    private String endTime;
    @SerializedName("app_version")
    private String appVersion;
    @SerializedName("logintime")
    private String loginTime;
    @SerializedName("cardentrytime")
    private String cardEntryTime;

    public AppLogObject(int appName, String IEMINum, String device, String MAC, String ipAdress, String SSID, String appVersion, String workNo, String chanName, String department, String BU, String NFCCode, String deviceId, String machineName, String formId, String formName, String startTime, String endTime) {
        this.appName = appName;
        this.IEMINum = IEMINum;
        this.device = device;
        this.MAC = MAC;
        this.ipAdress = ipAdress;
        this.SSID = SSID;
        this.workNo = workNo;
        this.chanName = chanName;
        this.department = department;
        this.BU = BU;
        this.NFCCode = NFCCode;
        this.deviceId = deviceId;
        this.machineName = machineName;
        this.formId = formId;
        this.formName = formName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.appVersion = appVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public int getAppName() {
        return appName;
    }

    public void setAppName(int appName) {
        this.appName = appName;
    }

    public String getIEMINum() {
        return IEMINum;
    }

    public void setIEMINum(String IEMINum) {
        this.IEMINum = IEMINum;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getChanName() {
        return chanName;
    }

    public void setChanName(String chanName) {
        this.chanName = chanName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBU() {
        return BU;
    }

    public void setBU(String BU) {
        this.BU = BU;
    }

    public String getNFCCode() {
        return NFCCode;
    }

    public void setNFCCode(String NFCCode) {
        this.NFCCode = NFCCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getCardEntryTime() {
        return cardEntryTime;
    }

    public void setCardEntryTime(String cardEntryTime) {
        this.cardEntryTime = cardEntryTime;
    }

    @Override
    public String toString() {
        return "AppLogObject{" +
                "appName=" + appName +
                ", IEMINum='" + IEMINum + '\'' +
                ", device='" + device + '\'' +
                ", MAC='" + MAC + '\'' +
                ", ipAdress='" + ipAdress + '\'' +
                ", SSID='" + SSID + '\'' +
                ", workNo='" + workNo + '\'' +
                ", chanName='" + chanName + '\'' +
                ", department='" + department + '\'' +
                ", BU='" + BU + '\'' +
                ", NFCCode='" + NFCCode + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", machineName='" + machineName + '\'' +
                ", formId='" + formId + '\'' +
                ", formName='" + formName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", cardEntryTime='" + cardEntryTime + '\'' +
                '}';
    }
}
