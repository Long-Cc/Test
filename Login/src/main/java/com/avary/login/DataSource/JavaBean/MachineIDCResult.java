package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MachineIDCResult {
    @SerializedName("Status")
    private String Status;
    @SerializedName("Message")
    private Object Message;
    @SerializedName("CheckUser")
    private List<Data> Data;

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

    public List<Data> getData() {
        return Data;
    }

    public void setData(List<Data> Data) {
        this.Data = Data;
    }

    public static class Data {
        @SerializedName("machineno")
        private String machineID;
        @SerializedName("idc")
        private String equIDC;

        public String getMachineID() {
            return machineID;
        }

        public void setMachineID(String machineno) {
            this.machineID = machineno;
        }

        public String getEquIDC() {
            return equIDC;
        }

        public void setEquIDC(String idc) {
            this.equIDC = idc;
        }

    }
}
