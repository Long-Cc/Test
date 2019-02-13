package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by G1596570 on 2018/11/13.
 */

public class OwnedForm {

    /**
     * reportcode : SfceWebSys0066
     * reportname : DESMEAR+快速蝕刻線設備點檢表
     * form : Maintenance/MachineNoScan.aspx,ReportMode6.aspx
     * mactype : 2
     */

    @SerializedName("reportcode")
    private String reportCode;
    @SerializedName("reportname")
    private String reportName;
    @SerializedName("form")
    private String form;
    @SerializedName("mactype")
    private String macType;

    public OwnedForm(String reportCode, String reportName, String form, String macType) {
        this.reportCode = reportCode;
        this.reportName = reportName;
        this.form = form;
        this.macType = macType;
    }

    public String getReportCode() {
        return reportCode;
    }

    public void setReportCode(String reportCode) {
        this.reportCode = reportCode;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getMacType() {
        return macType;
    }

    public void setMacType(String macType) {
        this.macType = macType;
    }
}
