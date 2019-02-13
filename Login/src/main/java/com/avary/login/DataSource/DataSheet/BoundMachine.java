package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "BoundMachine")
public class BoundMachine {
    @NotNull
    @PrimaryKey
    public String machineID;

    public BoundMachine(@NotNull String machineID) {
        this.machineID = machineID;
    }
}