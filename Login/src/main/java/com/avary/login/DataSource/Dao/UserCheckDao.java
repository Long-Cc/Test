package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.UserCheck;

import java.util.List;

@Dao
public interface UserCheckDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserCheck userCheck);

    @Transaction
    @Query("SELECT * FROM UserCheck WHERE  userId= :workNo and  reportCode = :formId")
    UserCheck findUserCheckByID(String workNo, String formId);

    @Transaction
    @Query("SELECT * FROM UserCheck")
    List<UserCheck> findAllUserCheck();

    @Delete
    void deleteAllUserCheck(List<UserCheck> checks);

}
