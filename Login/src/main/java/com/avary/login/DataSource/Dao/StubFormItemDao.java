package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.StubFormItem;

import java.util.List;

/**
 * Created by G1596570 on 2018/11/13.
 */
@Dao
public interface StubFormItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(StubFormItem... stubFormItems);

    @Transaction
    @Query("SELECT * FROM  StubFormItem p WHERE p.equId = :machineId and  p.formId = :formId and p.formStartTime = :sTime")
    List<StubFormItem> findStubFormItemList(String machineId, String formId, String sTime);

    @Delete
    int deleteStubFormItem(StubFormItem... stubFormItems);

    @Delete
    int deleteAllStubFormItem(List<StubFormItem> stubFormItems);
}
