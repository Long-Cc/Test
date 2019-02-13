package com.avary.login.DataSource.JavaBean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by G1596570 on 2018/11/17.
 */

public class PostLogResult {

    /**
     * meta : {"status":"OK"}
     * data : {"message":"成功插入日誌"}
     */

    @SerializedName("meta")
    private MetaBean meta;
    @SerializedName("data")
    private DataBean data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class MetaBean {
        /**
         * status : OK
         */

        @SerializedName("status")
        private String status;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    public static class DataBean {
        /**
         * message : 成功插入日誌
         */

        @SerializedName("message")
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
