package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;

import com.avary.login.DataSource.Converters.OwnedFormTypeConverter;
import com.avary.login.DataSource.JavaBean.OwnedForm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by G1494458 on 2017/12/8.
 *
 */

@Entity(tableName = "Machine")
public class Machine {

    /**
     * {
         "Equ_id": "A12F-WETH030H0007",
         "Equ_name": "DESMER+快速蝕刻線1#",
         "Nfctag": "",
         "factory": "QHD-A1",
         "classK": "A1線路一課",
         "line": "063",
         "linename": "水平快速蝕刻線",
         "limittime": "",
         "app_type": "",
         "app_num": "",
         "opcode": "",
         "alarm_person_id": "",
         "alarm_form": "",
         "address": "",
         "ownedForms": [
                         {
                             "reportcode": "SfceWebSys0066",
                             "reportname": "DESMEAR+快速蝕刻線設備點檢表",
                             "form": "Maintenance/MachineNoScan.aspx,ReportMode6.aspx",
                             "mactype": "2"
                         },
                         {
                             "reportcode": "SfceWebQhdhdi029",
                             "reportname": "Desmear+快速蝕刻生產日報表",
                             "form": "Maintenance/MachineNoScan.aspx,ReportMode1.aspx",
                             "mactype": "2"
                         }
                    ]
     }
     */

    @PrimaryKey
    @NonNull
    public String equId;

    public String equName;
    public String nfcTag;
    public String factory;
    public String classK;
    public String line;
    public String lineName;
    public String limitTime;
    public String appType;
    public String appNum;
    public String opCode;
    public String alarmForm;
    public String address;

    @TypeConverters(OwnedFormTypeConverter.class)
    public List<OwnedForm> ownedFormList;

    public String getIsStub;

    @Ignore
    public Boolean isCheckWorkNoHaveIDC;

    public Machine() {
    }

    public Machine(@NonNull String equId) {
        this.equId = equId;
        ownedFormList = new ArrayList<>();
    }
}
