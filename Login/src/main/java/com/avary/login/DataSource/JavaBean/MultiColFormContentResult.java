package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MultiColFormContentResult {

    /**
     * Status : Success
     * Message : null
     * CheckUser : [{"Name":"VCP设备点检表4#","Machineno":"A02F6011","Reportcode":"SfceWebSys0073","codingid":"","remark":"","Isxls":"N","ctid":"[DEV09]","lineid":"","linename":"","DetailedFieldPad":[{"no":"4","orderno":"2","field1":"酸性清洁槽","field2":"温度","field3":"30±2℃","field4":"一次 / 班","field5":"[CONTROLTYPE]","field6":"","field7":"","frequency":"0","controltype":"2","defaultvlaue":"","isreadonly":"1","getfield":"","setfield":"","morevalues":"30|2","num_accuracy":"","item_type":"","item_pic_id":"1","address_one":"A02F6011_SfceWebSys0073_2_left","address_two":"A02F6011_SfceWebSys0073_2_right"}]}]
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
         * Name : VCP设备点检表4#
         * Machineno : A02F6011
         * Reportcode : SfceWebSys0073
         * codingid :
         * remark :
         * Isxls : N
         * ctid : [DEV09]
         * lineid :
         * linename :
         * DetailedFieldPad : [{"no":"4","orderno":"2","field1":"酸性清洁槽","field2":"温度","field3":"30±2℃","field4":"一次 / 班","field5":"[CONTROLTYPE]","field6":"","field7":"","frequency":"0","controltype":"2","defaultvlaue":"","isreadonly":"1","getfield":"","setfield":"","morevalues":"30|2","num_accuracy":"","item_type":"","item_pic_id":"1","address_one":"A02F6011_SfceWebSys0073_2_left","address_two":"A02F6011_SfceWebSys0073_2_right"}]
         */

        @SerializedName("Name")
        private String Name;
        @SerializedName("Machineno")
        private String Machineno;
        @SerializedName("Reportcode")
        private String Reportcode;
        @SerializedName("codingid")
        private String codingid;
        @SerializedName("remark")
        private String remark;
        @SerializedName("Isxls")
        private String Isxls;
        @SerializedName("ctid")
        private String ctid;
        @SerializedName("lineid")
        private String lineid;
        @SerializedName("linename")
        private String linename;
        @SerializedName("DetailedFieldPad")
        private List<DetailedFieldPadBean> DetailedFieldPad;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getMachineno() {
            return Machineno;
        }

        public void setMachineno(String Machineno) {
            this.Machineno = Machineno;
        }

        public String getReportcode() {
            return Reportcode;
        }

        public void setReportcode(String Reportcode) {
            this.Reportcode = Reportcode;
        }

        public String getCodingid() {
            return codingid;
        }

        public void setCodingid(String codingid) {
            this.codingid = codingid;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getIsxls() {
            return Isxls;
        }

        public void setIsxls(String Isxls) {
            this.Isxls = Isxls;
        }

        public String getCtid() {
            return ctid;
        }

        public void setCtid(String ctid) {
            this.ctid = ctid;
        }

        public String getLineid() {
            return lineid;
        }

        public void setLineid(String lineid) {
            this.lineid = lineid;
        }

        public String getLinename() {
            return linename;
        }

        public void setLinename(String linename) {
            this.linename = linename;
        }

        public List<DetailedFieldPadBean> getDetailedFieldPad() {
            return DetailedFieldPad;
        }

        public void setDetailedFieldPad(List<DetailedFieldPadBean> DetailedFieldPad) {
            this.DetailedFieldPad = DetailedFieldPad;
        }

        public static class DetailedFieldPadBean {
            /**
             * no : 4
             * orderno : 2
             * field1 : 酸性清洁槽
             * field2 : 温度
             * field3 : 30±2℃
             * field4 : 一次 / 班
             * field5 : [CONTROLTYPE]
             * field6 :
             * field7 :
             * frequency : 0
             * controltype : 2
             * defaultvlaue :
             * isreadonly : 1
             * getfield :
             * setfield :
             * morevalues : 30|2
             * num_accuracy :
             * item_type :
             * item_pic_id : 1
             * address_one : A02F6011_SfceWebSys0073_2_left
             * address_two : A02F6011_SfceWebSys0073_2_right
             */

            @SerializedName("no")
            private String no;
            @SerializedName("orderno")
            private String orderno;
            @SerializedName("field1")
            private String field1;
            @SerializedName("field2")
            private String field2;
            @SerializedName("field3")
            private String field3;
            @SerializedName("field4")
            private String field4;
            @SerializedName("field5")
            private String field5;
            @SerializedName("field6")
            private String field6;
            @SerializedName("field7")
            private String field7;
            @SerializedName("frequency")
            private String frequency;
            @SerializedName("controltype")
            private String controltype;
            @SerializedName("defaultvlaue")
            private String defaultvlaue;
            @SerializedName("isreadonly")
            private String isreadonly;
            @SerializedName("getfield")
            private String getfield;
            @SerializedName("setfield")
            private String setfield;
            @SerializedName("morevalues")
            private String morevalues;
            @SerializedName("num_accuracy")
            private String numAccuracy;
            @SerializedName("item_type")
            private String itemType;
            @SerializedName("item_pic_id")
            private String itemPicId;
            @SerializedName("address_one")
            private String addressOne;
            @SerializedName("address_two")
            private String addressTwo;

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getOrderno() {
                return orderno;
            }

            public void setOrderno(String orderno) {
                this.orderno = orderno;
            }

            public String getField1() {
                return field1;
            }

            public void setField1(String field1) {
                this.field1 = field1;
            }

            public String getField2() {
                return field2;
            }

            public void setField2(String field2) {
                this.field2 = field2;
            }

            public String getField3() {
                return field3;
            }

            public void setField3(String field3) {
                this.field3 = field3;
            }

            public String getField4() {
                return field4;
            }

            public void setField4(String field4) {
                this.field4 = field4;
            }

            public String getField5() {
                return field5;
            }

            public void setField5(String field5) {
                this.field5 = field5;
            }

            public String getField6() {
                return field6;
            }

            public void setField6(String field6) {
                this.field6 = field6;
            }

            public String getField7() {
                return field7;
            }

            public void setField7(String field7) {
                this.field7 = field7;
            }

            public String getFrequency() {
                return frequency;
            }

            public void setFrequency(String frequency) {
                this.frequency = frequency;
            }

            public String getControltype() {
                return controltype;
            }

            public void setControltype(String controltype) {
                this.controltype = controltype;
            }

            public String getDefaultvlaue() {
                return defaultvlaue;
            }

            public void setDefaultvlaue(String defaultvlaue) {
                this.defaultvlaue = defaultvlaue;
            }

            public String getIsreadonly() {
                return isreadonly;
            }

            public void setIsreadonly(String isreadonly) {
                this.isreadonly = isreadonly;
            }

            public String getGetfield() {
                return getfield;
            }

            public void setGetfield(String getfield) {
                this.getfield = getfield;
            }

            public String getSetfield() {
                return setfield;
            }

            public void setSetfield(String setfield) {
                this.setfield = setfield;
            }

            public String getMorevalues() {
                return morevalues;
            }

            public void setMorevalues(String morevalues) {
                this.morevalues = morevalues;
            }

            public String getNumAccuracy() {
                return numAccuracy;
            }

            public void setNumAccuracy(String numAccuracy) {
                this.numAccuracy = numAccuracy;
            }

            public String getItemType() {
                return itemType;
            }

            public void setItemType(String itemType) {
                this.itemType = itemType;
            }

            public String getItemPicId() {
                return itemPicId;
            }

            public void setItemPicId(String itemPicId) {
                this.itemPicId = itemPicId;
            }

            public String getAddressOne() {
                return addressOne;
            }

            public void setAddressOne(String addressOne) {
                this.addressOne = addressOne;
            }

            public String getAddressTwo() {
                return addressTwo;
            }

            public void setAddressTwo(String addressTwo) {
                this.addressTwo = addressTwo;
            }
        }
    }
}
