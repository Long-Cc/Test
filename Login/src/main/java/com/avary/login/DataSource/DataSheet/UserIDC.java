package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity(tableName = "UserIDC", primaryKeys = {"workNo", "userIDC"})
public class UserIDC {

    @NonNull
    public String workNo;
    @NonNull
    public String userIDC;

    public UserIDC(@NonNull String workNo,  @NonNull String userIDC) {
        this.workNo = workNo;
        this.userIDC = userIDC;
    }

    @NonNull
    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(@NonNull String workNo) {
        this.workNo = workNo;
    }

    @NonNull
    public String getUserIDC() {
        return userIDC;
    }

    public void setUserIDC(@NonNull String userIDC) {
        this.userIDC = userIDC;
    }
}
