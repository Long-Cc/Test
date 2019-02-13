package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by G1596580 on 2018/10/25.
 */

public class PostMsapFormDataResult {

    /**
     * Status : Failure
     * Message : 數據處理出錯，請稍候再試！出錯信息：Object reference not set to an instance of an object.
     * CheckUser : null
     */

    @SerializedName("Status")
    private String Status;
    @SerializedName("Message")
    private String Message;
    @SerializedName("CheckUser")
    private Object Data;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }
}
