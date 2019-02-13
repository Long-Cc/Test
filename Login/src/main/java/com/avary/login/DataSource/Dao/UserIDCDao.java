package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.avary.login.DataSource.DataSheet.UserIDC;

import java.util.List;

@Dao
public interface UserIDCDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(UserIDC userIDC);

    @Transaction
    @Query("SELECT COUNT(*) FROM UserIDC WHERE workNo = :workNo")
    int findUserByIDCount(String workNo);

    @Transaction
    @Query("SELECT * FROM UserIDC WHERE workNo = :workNo")
    List<UserIDC> findUserByID(String workNo);

    @Query("SELECT u.userIDC FROM UserIDC u WHERE u.workNo = :workNo")
    List<String> findUserIDCByID(String workNo);

    @Transaction
    @Query("select * from UserIDC p  where p.workNo = :workNo and p.userIDC = :equIDC")
    List<UserIDC> findUserByIDSum(String workNo, String equIDC);

    @Transaction
    @Query("SELECT * FROM UserIDC ")
    List<UserIDC> getAllUserIDC();

    @Delete
    void deleteAllUserIDC(List<UserIDC> userIDCList);
}
