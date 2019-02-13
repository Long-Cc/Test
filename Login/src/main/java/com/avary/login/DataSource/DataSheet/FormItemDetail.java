package com.avary.login.DataSource.DataSheet;

/**
 * Created by G1596570 on 2018/11/13.
 */

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;

import com.avary.login.DataSource.Converters.FormItemDetailNumbersTypeConverter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@Entity(tableName = "FormItemDetail", primaryKeys = {"machineNo", "reportCode", "no"})
public class FormItemDetail implements Comparable<FormItemDetail> {

    /**
     *   "no": "4",
         "orderno": "2",
         "field1": "酸性清洁槽",
         "field2": "温度",
         "field3": "30±2℃",
         "field4": "一次 / 班",
         "field5": "[CONTROLTYPE]",
         "field6": "",
         "field7": "",
         "frequency": "0",
         "controltype": "2",
         "defaultvlaue": "",
         "isreadonly": "1",
         "getfield": "",
         "setfield": "",
         "morevalues": "30|2",
         "num_accuracy": "",
         "item_type": "",
         "item_pic_id": "1",
         "address_one": "A02F6011_SfceWebSys0073_2_left",
         "address_two": "A02F6011_SfceWebSys0073_2_right"
     */

    @NotNull
    public String machineNo;
    @NotNull
    public String reportCode;
    @NotNull
    public int no;

    public int orderNo;
    public String field1;
    public String field2;
    public String field3;
    public String field4;
//    public String field5;
//    public String field6;
//    public String field7;
    public String frequency;
    public String controlType;
    public String defaultValue;
//    public String isReadOnly;
//    public String getField;
//    public String setField;
    public String moreValue;
    public String numAccuracy;
    public String itemType;
    public String itemPicId;
    public String addressOne;
    public String addressTwo;

    @TypeConverters(FormItemDetailNumbersTypeConverter.class)
    public List<String> numbers;

    @Override
    public int compareTo(@NonNull FormItemDetail itemDetail) {
        if(no > itemDetail.no){
            return 1;
        }else{
            return -1;
        }
    }
}
