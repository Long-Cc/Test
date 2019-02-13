package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "MachineIDC")
public class MachineIDC {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    public String machineID;
    @NonNull
    public String equIDC;

    public MachineIDC(@NonNull String machineID,@NonNull String equIDC) {
        this.machineID = machineID;
        this.equIDC = equIDC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getMachineID() {
        return machineID;
    }

    public void setMachineID(@NonNull String machineID) {
        this.machineID = machineID;
    }

    @NonNull
    public String getEquIDC() {
        return equIDC;
    }

    public void setEquIDC(@NonNull String equIDC) {
        this.equIDC = equIDC;
    }

    @Override
    public String toString() {
        return "MachineIDC{" +
                "id=" + id +
                ", machineID='" + machineID + '\'' +
                ", equIDC='" + equIDC + '\'' +
                '}';
    }
}
