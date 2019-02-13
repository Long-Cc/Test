package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by G1596570 on 2018/11/24.
 */

public class GetImageErrResult {

    /**
     * message : 下载的照片不存在,請檢查文件路徑
     */

    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GetImageErrResult{" +
                "message='" + message + '\'' +
                '}';
    }
}
