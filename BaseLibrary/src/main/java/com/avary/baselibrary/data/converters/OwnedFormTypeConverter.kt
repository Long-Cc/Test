package com.avary.baselibrary.data.converters

import android.arch.persistence.room.TypeConverter
import com.avary.baselibrary.data.protocol.OwnedForm
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

/**
 * Created by G1596570 on 2018/11/13.
 *
 */

open class OwnedFormTypeConverter {
    @TypeConverter
    open fun stringToOwnedForms(data: String?): List<OwnedForm> {
        return if (data == null) {
            Collections.emptyList()
        } else {
            Gson().fromJson(data, object : TypeToken<List<OwnedForm>>() {}.type)
        }
    }

    @TypeConverter
    open fun ownedFormsToString(ownedForms: List<OwnedForm>): String {
        return Gson().toJson(ownedForms, object : TypeToken<List<OwnedForm>>() {}.type)
    }
}
