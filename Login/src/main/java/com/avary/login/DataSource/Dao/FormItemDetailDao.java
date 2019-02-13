package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.FormItemDetail;

import java.util.List;

/**
 * Created by G1596570 on 2018/11/13.
 */
@Dao
public interface FormItemDetailDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(FormItemDetail formItemDetail);

    @Transaction
    @Query("SELECT * FROM FormItemDetail WHERE machineNo = :machineID and reportCode = :formId")
    List<FormItemDetail> findFormItemDetailList(String machineID, String formId);

    @Transaction
    @Query("SELECT * FROM FormItemDetail")
    List<FormItemDetail> findAllFormItemDetailList();

    @Delete
    void deleteAllFormItem(List<FormItemDetail> formItemDetails);

}
