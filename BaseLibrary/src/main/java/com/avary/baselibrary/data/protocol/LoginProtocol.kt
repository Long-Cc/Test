package com.avary.baselibrary.data.protocol

import android.widget.ProgressBar
import android.widget.TextView
import com.google.gson.annotations.SerializedName


/**
 * Created by G1596570 on 2019/1/5.
 *
 *
 */


data class CheckUser(
        @SerializedName("AuthList")
        val authList: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("UserID")
        val userID: String
) {
    override fun toString(): String {
        return "CheckUser(authList='$authList', name='$name', userID='$userID')"
    }
}

data class SingleProgress(val progressValueTV:TextView, val progressBar: ProgressBar)

data class Machine(
    @SerializedName("Equ_id")
    val equId: String,
    @SerializedName("Equ_name")
    val equName: String,
    @SerializedName("Nfctag")
    val nfctag: String,
    @SerializedName("classr")
    val classr: String,
    @SerializedName("factory")
    val factory: String,
    @SerializedName("limittime")
    val limittime: String,
    @SerializedName("line")
    val line: String,
    @SerializedName("linename")
    val linename: String,
    @SerializedName("ownedForms")
    val ownedForms: List<OwnedForm>
)

data class OwnedForm(
    @SerializedName("form")
    val form: String,
    @SerializedName("mactype")
    val mactype: String,
    @SerializedName("reportcode")
    val reportcode: String,
    @SerializedName("reportname")
    val reportname: String
)
