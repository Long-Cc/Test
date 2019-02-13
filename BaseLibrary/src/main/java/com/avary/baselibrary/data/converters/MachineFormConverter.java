package com.avary.baselibrary.data.converters;

import android.arch.persistence.room.TypeConverter;

import com.avary.baselibrary.data.protocol.OwnedForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Created by G1596570 on 2019/1/28.
 *
 */

public class MachineFormConverter {
    @TypeConverter
    public static List<OwnedForm> stringToOwnedForms(String data) {
        if (data == null) {
            return Collections.emptyList();
        } else {
            Type typeList = new TypeToken<List<OwnedForm>>() {}.getType();
            return new Gson().fromJson(data, typeList);
        }
    }
    @TypeConverter
    public static String ownedFormsToString(List<OwnedForm> ownedForms) {
        return new Gson().toJson(ownedForms);
    }
}
