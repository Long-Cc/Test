package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;

import org.jetbrains.annotations.NotNull;

import java.util.List;


/**
 * Created by G1596570 on 2018/11/13.
 */

@Entity(tableName = "MultiColumnForm", primaryKeys = {"machineNo", "reportCode"})
public class MultiColumnForm {

    /**
     * {
         "Name": "VCP设备点检表4#",
         "Machineno": "A02F6011",
         "Reportcode": "SfceWebSys0073",
         "codingid": "",
         "remark": "",
         "Isxls": "N",
         "ctid": "[DEV09]",
         "lineid": "",
         "linename": "",
         "DetailedFieldPad": [
             {
                 "no": "4",
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
             }
         ]
     }
     */

    public String reportName;
    @NotNull
    public String machineNo;
    @NotNull
    public String reportCode;
    public String codingId;
    public String remark;
    public String production;
    public String isXls;
//    public String ctId;
    public String lineId;
    public String lineName;

    @Ignore
    public List<FormItemDetail> formItemDetailList;

    public MultiColumnForm() {
    }

    public MultiColumnForm(String reportName, String machineNo, String reportCode, String codingId, String remark, String production, String isXls, String lineId, String lineName, List<FormItemDetail> formItemDetailList) {
        this.reportName = reportName;
        this.machineNo = machineNo;
        this.reportCode = reportCode;
        this.codingId = codingId;
        this.remark = remark;
        this.production = production;
        this.isXls = isXls;
//        this.ctId = ctId;
        this.lineId = lineId;
        this.lineName = lineName;
        this.formItemDetailList = formItemDetailList;
    }
}
