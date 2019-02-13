package com.avary.login.DataSource.DataSheet;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by G1596570 on 2018/11/13.
 *
 */
@Entity(tableName = "StubForm")
public class StubForm implements Parcelable{
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String equId;
    public String equName;
    public String formId;
    public String formName;
    public String classR;
    public String workNo;
    public String comment;
    public String errorMessage;
    public String production; //设备状态
    public String startTime;
    public String endTime;
    public String lineName;

    public Boolean hasPost;

    public String loginTime;
    public String swipingEquCardTime;

    @Ignore
    public boolean hasCheck;

    @Ignore
    public boolean hasDelete;

    @Ignore
    public List<StubFormItem> stubFormItemList;

    public StubForm() {
    }

    public StubForm(String equId, String equName, String formId, String formName, String classR, String workNo, String comment, String errorMessage, String production, String startTime, String endTime, String lineName, Boolean hasPost, List<StubFormItem> stubFormItemList) {
        this.equId = equId;
        this.equName = equName;
        this.formId = formId;
        this.formName = formName;
        this.classR = classR;
        this.workNo = workNo;
        this.comment = comment;
        this.errorMessage = errorMessage;
        this.production = production;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lineName = lineName;
        this.hasPost = hasPost;
        this.stubFormItemList = stubFormItemList;
    }

    protected StubForm(Parcel in) {
        id = in.readInt();
        equId = in.readString();
        equName = in.readString();
        formId = in.readString();
        formName = in.readString();
        classR = in.readString();
        workNo = in.readString();
        comment = in.readString();
        errorMessage = in.readString();
        production = in.readString();
        startTime = in.readString();
        endTime = in.readString();
        lineName = in.readString();
        byte tmpHasPost = in.readByte();
        hasPost = tmpHasPost == 0 ? null : tmpHasPost == 1;
        loginTime = in.readString();
        swipingEquCardTime = in.readString();
        hasCheck = in.readByte() != 0;
        hasDelete = in.readByte() != 0;
        stubFormItemList = in.createTypedArrayList(StubFormItem.CREATOR);
    }

    public static final Creator<StubForm> CREATOR = new Creator<StubForm>() {
        @Override
        public StubForm createFromParcel(Parcel in) {
            return new StubForm(in);
        }

        @Override
        public StubForm[] newArray(int size) {
            return new StubForm[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(equId);
        dest.writeString(equName);
        dest.writeString(formId);
        dest.writeString(formName);
        dest.writeString(classR);
        dest.writeString(workNo);
        dest.writeString(comment);
        dest.writeString(errorMessage);
        dest.writeString(production);
        dest.writeString(startTime);
        dest.writeString(endTime);
        dest.writeString(lineName);
        dest.writeByte((byte) (hasPost == null ? 0 : hasPost ? 1 : 2));
        dest.writeString(loginTime);
        dest.writeString(swipingEquCardTime);
        dest.writeByte((byte) (hasCheck ? 1 : 0));
        dest.writeByte((byte) (hasDelete ? 1 : 0));
        dest.writeTypedList(stubFormItemList);
    }
}
