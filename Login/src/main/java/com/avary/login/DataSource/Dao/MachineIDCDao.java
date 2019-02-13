package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.MachineIDC;

import java.util.List;

@Dao
public interface MachineIDCDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MachineIDC machineIDC);

    @Transaction
    @Query("SELECT * FROM MachineIDC p WHERE p.machineID = :machineID")
    List<MachineIDC> findMachineIDCByID(String machineID);

    @Query("SELECt * FROM MachineIDC")
    List<MachineIDC> getAll();

    @Transaction
    @Query("select machineID From MachineIDC  where equIDC = :userIDC")
    List<String> findMachineIDCBy(String userIDC);

    @Transaction
    @Query("select m.machineID From MachineIDC m where m.equIDC IN (SELECT u.userIDC FROM UserIDC u WHERE u.workNo = :workNo)")
    List<String> findMachineIDByWorkNO(String workNo);

    @Transaction
    @Query("SELECT * FROM MachineIDC")
    List<MachineIDC> getAllMachineIDC();

    @Delete
    void deleteAllMachineIDC(List<MachineIDC> machineIDCS);

}
