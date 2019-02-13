package com.avary.login.DataSource.Converters

import android.arch.persistence.room.TypeConverter


import com.avary.login.DataSource.JavaBean.OwnedForm
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import java.lang.reflect.Type
import java.util.Collections

/**
 * Created by G1596570 on 2018/11/13.
 */

object OwnedFormTypeConverter {
    @TypeConverter
    fun stringToOwnedForms(data: String?): List<OwnedForm> {
        return if (data == null) {
            Collections.emptyList()
        } else {
            val typeList = object : TypeToken<List<OwnedForm>>() {}.type
            Gson().fromJson(data, typeList)
        }
    }

    @TypeConverter
    fun ownedFormsToString(ownedForms: List<OwnedForm>): String {
        return Gson().toJson(ownedForms)
    }
}