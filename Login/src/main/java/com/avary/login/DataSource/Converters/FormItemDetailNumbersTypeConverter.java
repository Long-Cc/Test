package com.avary.login.DataSource.Converters;

import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Created by G1596570 on 2018/11/21.
 */

public class FormItemDetailNumbersTypeConverter {
    @TypeConverter
    public static List<String> stringToListString(String data) {
        if (data == null) {
            return Collections.EMPTY_LIST;
        } else {
            Type typeList = new TypeToken<List<String>>() {}.getType();
            return new Gson().fromJson(data, typeList);
        }
    }
    @TypeConverter
    public static String listStringToString(List<String> numbers) {
        return new Gson().toJson(numbers);
    }
}
