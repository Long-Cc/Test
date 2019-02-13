package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.User;

import java.util.List;


/**
 * Created by G1494458 on 2017/12/28.
 */

@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(User user);

    @Transaction
    @Query("SELECT * FROM User WHERE workNo = :workNo")
    User findUserByID(String workNo);

    @Transaction
    @Query("SELECT * FROM User WHERE workNo = :workNo AND (userAuths = :auth1 OR userAuths =:auth2)")
    User findUserByWorkNOAndUserAuths(String workNo, String auth1, String auth2);

    @Transaction
    @Query("SELECT * FROM User WHERE workNo = :workNo AND userAuths = :auth1")
    User findUserByWorkNOAuths(String workNo, String auth1);

    @Transaction
    @Query("SELECT * FROM User ")
    List<User> getAllUser();

    @Delete
    int deleteAll(List<User> users);
}
