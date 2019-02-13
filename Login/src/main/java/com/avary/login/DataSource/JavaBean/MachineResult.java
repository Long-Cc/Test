package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by G1596570 on 2018/7/28.
 */

public class MachineResult {
    /**
     * Status : Success
     * Message : null
     * CheckUser : [{"Equ_id":"PNL17TCC001#","Equ_name":"PNL17T衝床001#","Nfctag":"c6cd0219","factory":"秦皇島A02廠","classK":"A02製九課","line":"PNL17TCC","linename":"PNL17T衝床","limittime":"","ownedForms":[{"reportCode":"SfceWebQWC090","reportname":"QHD-A2 17T 衝床日常保養記錄表","form":"Maintenance/MachineNoScan.aspx,ReportMode6.aspx","mactype":"3"},{"reportCode":"SfceWebQHD-A6BY006","reportname":"QHD-A617T沖床日常保養記錄表","form":"Maintenance/MachineNoScan.aspx,ReportMode6.aspx","mactype":"3"}]}]
     */

    @SerializedName("Status")
    private String Status;
    @SerializedName("Message")
    private Object Message;
    @SerializedName("CheckUser")
    private List<DataBean> Data;

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

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        /**
         * Equ_id : PNL17TCC001#
         * Equ_name : PNL17T衝床001#
         * Nfctag : c6cd0219
         * factory : 秦皇島A02廠
         * classr : A02製九課
         * line : PNL17TCC
         * linename : PNL17T衝床
         * limittime :
         * ownedForms : [{"reportCode":"SfceWebQWC090","reportname":"QHD-A2 17T 衝床日常保養記錄表","form":"Maintenance/MachineNoScan.aspx,ReportMode6.aspx","mactype":"3"},{"reportCode":"SfceWebQHD-A6BY006","reportname":"QHD-A617T沖床日常保養記錄表","form":"Maintenance/MachineNoScan.aspx,ReportMode6.aspx","mactype":"3"}]
         */

        @SerializedName("Equ_id")
        private String EquId;
        @SerializedName("Equ_name")
        private String EquName;
        @SerializedName("Nfctag")
        private String Nfctag;
        @SerializedName("factory")
        private String factory;
        @SerializedName("classr")
        private String classr;
        @SerializedName("line")
        private String line;
        @SerializedName("linename")
        private String linename;
        @SerializedName("limittime")
        private String limittime;
        @SerializedName("ownedForms")
        private List<OwnedFormsBean> ownedForms;

        public String getEquId() {
            return EquId;
        }

        public void setEquId(String EquId) {
            this.EquId = EquId;
        }

        public String getEquName() {
            return EquName;
        }

        public void setEquName(String EquName) {
            this.EquName = EquName;
        }

        public String getNfctag() {
            return Nfctag;
        }

        public void setNfctag(String Nfctag) {
            this.Nfctag = Nfctag;
        }

        public String getFactory() {
            return factory;
        }

        public void setFactory(String factory) {
            this.factory = factory;
        }

        public String getClassr() {
            return classr;
        }

        public void setClassr(String classr) {
            this.classr = classr;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getLinename() {
            return linename;
        }

        public void setLinename(String linename) {
            this.linename = linename;
        }

        public String getLimittime() {
            return limittime;
        }

        public void setLimittime(String limittime) {
            this.limittime = limittime;
        }

        public List<OwnedFormsBean> getOwnedForms() {
            return ownedForms;
        }

        public void setOwnedForms(List<OwnedFormsBean> ownedForms) {
            this.ownedForms = ownedForms;
        }

        public static class OwnedFormsBean {
            /**
             * reportCode : SfceWebQWC090
             * reportname : QHD-A2 17T 衝床日常保養記錄表
             * form : Maintenance/MachineNoScan.aspx,ReportMode6.aspx
             * mactype : 3
             */

            @SerializedName("reportcode")
            private String reportcode;
            @SerializedName("reportname")
            private String reportname;
            @SerializedName("form")
            private String form;
            @SerializedName("mactype")
            private String mactype;

            public String getReportcode() {
                return reportcode;
            }

            public void setReportcode(String reportcode) {
                this.reportcode = reportcode;
            }

            public String getReportname() {
                return reportname;
            }

            public void setReportname(String reportname) {
                this.reportname = reportname;
            }

            public String getForm() {
                return form;
            }

            public void setForm(String form) {
                this.form = form;
            }

            public String getMactype() {
                return mactype;
            }

            public void setMactype(String mactype) {
                this.mactype = mactype;
            }
        }
    }
}
