package com.avary.login.DataSource.JavaBean;

import android.support.v4.util.Pair;

import java.util.List;

/**
 * Created by G1596570 on 2018/10/23.
 */

public class ImageDetail {

    private String machineID;
    private String FormID;
    private List<Pair<String, String>> itemImages;

    public ImageDetail() {
    }

    public ImageDetail(String machineID, String formID, List<Pair<String, String>> itemImages) {
        this.machineID = machineID;
        FormID = formID;
        this.itemImages = itemImages;
    }

    public String getMachineID() {
        return machineID;
    }

    public void setMachineID(String machineID) {
        this.machineID = machineID;
    }

    public String getFormID() {
        return FormID;
    }

    public void setFormID(String formID) {
        FormID = formID;
    }

    public List<Pair<String, String>> getItemImages() {
        return itemImages;
    }

    public void setItemImages(List<Pair<String, String>> itemImages) {
        this.itemImages = itemImages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageDetail that = (ImageDetail) o;

        if (machineID != null ? !machineID.equals(that.machineID) : that.machineID != null)
            return false;
        if (FormID != null ? !FormID.equals(that.FormID) : that.FormID != null) return false;
        return itemImages != null ? itemImages.equals(that.itemImages) : that.itemImages == null;
    }

    @Override
    public int hashCode() {
        int result = machineID != null ? machineID.hashCode() : 0;
        result = 31 * result + (FormID != null ? FormID.hashCode() : 0);
        result = 31 * result + (itemImages != null ? itemImages.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ImageDetail{" +
                "machineID='" + machineID + '\'' +
                ", FormID='" + FormID + '\'' +
                ", itemImages=" + itemImages +
                '}';
    }
}
