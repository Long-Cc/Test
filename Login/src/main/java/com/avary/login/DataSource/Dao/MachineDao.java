package com.avary.login.DataSource.Dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;
import android.arch.persistence.room.Update;

import com.avary.login.DataSource.DataSheet.Machine;

import java.util.List;

/**
 * Created by G1494458 on 2017/12/8.
 */

@Dao
public interface MachineDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Machine machine);


    @Transaction
    @Query("SELECT * FROM Machine m WHERE m.nfcTag = :code OR m.nfcTag = :upperCode")
    List<Machine> findMachinesByNFCCode(String code, String upperCode);


    @Transaction
    @Query("SELECT * FROM Machine m WHERE m.equId = :code")
    Machine findMachineByID(String code);


    @Update(onConflict = OnConflictStrategy.REPLACE)
    int updateMachineRecord(Machine machine);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    int updateMachineRecord(Machine... machine);

    @Transaction
    @Query("SELECT * FROM Machine")
    List<Machine> findAllMachines();

    @Transaction
    @Query("SELECT * FROM Machine m WHERE m.equId LIKE :query OR m.equName LIKE :query OR m.lineName LIKE :query OR m.classK LIKE :query")
    List<Machine> findMachinesByQuery(String query);

    @Transaction
    @Query("SELECT m.classK FROM Machine m")
    List<String> findAllMachinesClassK();

    @Transaction
    @Query("SELECT * FROM Machine m WHERE m.classK = :classK")
    List<Machine> findMachinesByClassK(String classK);

    @Delete
    void deleteAllMachine(List<Machine> machineList);

    @Transaction
    @Query("SELECT * FROM Machine m WHERE m.line <> '' ")
    List<Machine> findAllMachinesByLine();

    @Transaction
    @Query("SELECT * FROM Machine m WHERE m.line = :line")
    List<Machine> findAllMachinesByLine(String line);

    @Transaction
    @Query("SELECT DISTINCT(limitTime) FROM Machine m WHERE m.line = :line")
    String findMachineLimitTimeByLine(String line);
}
