package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;
import android.arch.persistence.room.Update;

import com.avary.login.DataSource.DataSheet.StubForm;

import java.util.List;

/**
 * Created by G1596570 on 2018/11/13.
 */
@Dao
public interface StubFormDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(StubForm... stubForm);

    @Update
    void update(StubForm stubForm);

    @Transaction
    @Query("SELECT * FROM StubForm WHERE hasPost = :hasPost")
    List<StubForm> findHasPostStubForm(Boolean hasPost);

    @Delete
    int deleteStubForm(StubForm... stubForms);


}
