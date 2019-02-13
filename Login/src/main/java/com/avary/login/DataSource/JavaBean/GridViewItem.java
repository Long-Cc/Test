package com.avary.login.DataSource.JavaBean;

import android.support.annotation.NonNull;

/**
 * Created by G1596580 on 2018/10/26.
 */

public class GridViewItem implements Comparable<GridViewItem> {
    private int rowId;
    private String g1;
    private String g2;
    private String g3;
    private String g4;
    private String g5;
    private String g6;
    private String g7;
    private String g8;
    private String g9;
    private Boolean isNormalData;

    public GridViewItem( int rowId, String g1, String g2, String g3, String g4, String g5, String g6, String g7, String g8, String g9) {
        this.rowId = rowId;
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
        this.g4 = g4;
        this.g5 = g5;
        this.g6 = g6;
        this.g7 = g7;
        this.g8 = g8;
        this.g9 = g9;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getG1() {
        return g1;
    }

    public String getG2() {
        return g2;
    }

    public String getG3() {
        return g3;
    }

    public String getG4() {
        return g4;
    }

    public String getG5() {
        return g5;
    }

    public String getG6() {
        return g6;
    }

    public String getG7() {
        return g7;
    }

    public String getG8() {
        return g8;
    }

    public String getG9() {
        return g9;
    }

    public Boolean getNormalData() {
        return isNormalData;
    }

    public void setNormalData(Boolean normalData) {
        isNormalData = normalData;
    }

    @Override
    public int compareTo(@NonNull GridViewItem o) {
        return this.rowId - o.rowId;
    }
}
