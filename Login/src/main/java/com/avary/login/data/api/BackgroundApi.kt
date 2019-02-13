package com.avary.base.data.api

import com.avary.baselibrary.data.protocol.BaseResp
import com.avary.baselibrary.data.protocol.CheckUser
import com.avary.baselibrary.data.protocol.Machine
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by G1596570 on 2019/1/4.
 *
 *
 */
interface BackgroundApi {

    //用户列表
    // http://10.182.15.165:8999/e_system_interface/GetAllPadUserAuthList.aspx?db=SzFpc
    @GET("/e_system_interface/GetAllPadUserAuthList.aspx")
    fun getCheckUserList(@Query("db") db: String): Observable<BaseResp<List<CheckUser>>>

    //设备列表
    @GET("e_system_interface/GetAllPadMachineListN.aspx")
    fun getMachineList(@Query("db") db: String): Observable<BaseResp<List<Machine>>>

//    //人员上崗證列表
//    @GET("/e_system_interface/GetAllPadSgzData.aspx")
//    fun getUserIDCList(@Query("db") db: String): Observable<UserIDCResult>
//
//    //審核人員列表
//    @GET("/e_system_interface/GetAllPadUser_Check.aspx")
//    fun getReviewUserList(@Query("db") db: String): Observable<UserCheckResult>
//
//    //设备上崗證列表
//    @GET("/e_system_interface/GetAllPadMacCard.aspx")
//    fun getMachineIDCList(@Query("db") db: String): Observable<MachineIDCResult>
//
//    //設備點檢表明細
//    @GET("/e_system_interface/GetAllPadBYDetailL_image.aspx")
//    fun getMultiColFormContents(@Query("db") db: String): Observable<MultiColFormContentResult>
//
//    //绑定NFC标签
//    @FormUrlEncoded
//    @POST("/e_system_interface/SavePadMachineBankNfc.aspx")
//    fun boundNFCCard(@Query("db") db: String, @Field("bindData") bindData: String): Observable<GeneralPostResult>
//
//    //数据提交
//    @FormUrlEncoded
//    @POST("/e_system_interface/SavePadMachineData.aspx")
//    fun postFormData(@Query("db") db: String, @Field("field_data") data: String): Observable<PostMsapFormDataResult>
//
//    @FormUrlEncoded
//    @POST("e_system_interface/SavePadMachineLimitTime.aspx")
//    fun postLineLimitTime(@Query("db") db: String, @Field("bindData") data: String): Observable<PostLineLimitTimeResult>
}