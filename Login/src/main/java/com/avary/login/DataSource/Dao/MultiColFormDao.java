package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.MultiColumnForm;

import java.util.List;


/**
 * Created by G1494458 on 2017/12/28.
 */

@Dao
public interface MultiColFormDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(MultiColumnForm multiColumnForm);

    @Transaction
    @Query("SELECT * FROM MultiColumnForm WHERE machineNo = :machineID and reportCode = :formId")
    MultiColumnForm findMultiColFormByID(String machineID, String formId);

    @Transaction
    @Query("SELECT * FROM MultiColumnForm")
    List<MultiColumnForm> getAllMachineAndFormID();

    @Delete
    void deleteAllMultiColumn(List<MultiColumnForm> multiColumnFormList);
}
