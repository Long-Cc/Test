package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * Created by G1596570 on 2018/11/13.
 */
@Entity(tableName = "StubFormItem")
public class StubFormItem implements Parcelable, Comparable<StubFormItem> {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public int no;
    public int orderNo;
    public String equId;
    public String formId;
    public String formName;
    public String field1; //流程
    public String field2; //项目
    public String field3; //点检基准
    public String field4; //班次
    public String frequency; //频率
    public String controlType;
    public String defaultValue;
    public String moreValue; //基准值
    public String numAccuracy; //精度
    public String itemType; //
    public String itemPicId; //表头编号
    public String checkTime;

    public String formStartTime;
    public String checkValue;
    public String changeValue;

    public StubFormItem() {
    }

    public StubFormItem(int no, int orderNo, String equId, String formId, String formName, String field1, String field2, String field3, String field4, String frequency, String controlType, String defaultValue, String moreValue, String numAccuracy, String itemType, String itemPicId, String checkTime, String formStartTime, String checkValue, String changeValue) {
        this.no = no;
        this.orderNo = orderNo;
        this.equId = equId;
        this.formId = formId;
        this.formName = formName;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.frequency = frequency;
        this.controlType = controlType;
        this.defaultValue = defaultValue;
        this.moreValue = moreValue;
        this.numAccuracy = numAccuracy;
        this.itemType = itemType;
        this.itemPicId = itemPicId;
        this.checkTime = checkTime;
        this.formStartTime = formStartTime;
        this.checkValue = checkValue;
        this.changeValue = changeValue;
    }

    protected StubFormItem(Parcel in) {
        id = in.readInt();
        no = in.readInt();
        orderNo = in.readInt();
        equId = in.readString();
        formId = in.readString();
        formName = in.readString();
        field1 = in.readString();
        field2 = in.readString();
        field3 = in.readString();
        field4 = in.readString();
        frequency = in.readString();
        controlType = in.readString();
        defaultValue = in.readString();
        moreValue = in.readString();
        numAccuracy = in.readString();
        itemType = in.readString();
        itemPicId = in.readString();
        checkTime = in.readString();
        formStartTime = in.readString();
        checkValue = in.readString();
        changeValue = in.readString();
    }

    public static final Creator<StubFormItem> CREATOR = new Creator<StubFormItem>() {
        @Override
        public StubFormItem createFromParcel(Parcel in) {
            return new StubFormItem(in);
        }

        @Override
        public StubFormItem[] newArray(int size) {
            return new StubFormItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(no);
        dest.writeInt(orderNo);
        dest.writeString(equId);
        dest.writeString(formId);
        dest.writeString(formName);
        dest.writeString(field1);
        dest.writeString(field2);
        dest.writeString(field3);
        dest.writeString(field4);
        dest.writeString(frequency);
        dest.writeString(controlType);
        dest.writeString(defaultValue);
        dest.writeString(moreValue);
        dest.writeString(numAccuracy);
        dest.writeString(itemType);
        dest.writeString(itemPicId);
        dest.writeString(checkTime);
        dest.writeString(formStartTime);
        dest.writeString(checkValue);
        dest.writeString(changeValue);
    }

    @Override
    public int compareTo(@NonNull StubFormItem o) {
        if(orderNo > o.orderNo){
            return 1;
        }else{
            return -1;
        }
    }
}
