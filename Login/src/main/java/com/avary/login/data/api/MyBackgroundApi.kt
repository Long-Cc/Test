package com.avary.base.data.api

import com.avary.login.data.protocol.user.WorkNoResp
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * Created by G1596570 on 2019/1/4.
 *
 *
 */
interface MyBackgroundApi {

    //人员资料
    @GET("/MachinePaperLess/GetAllPadUserAuthList.aspx")
    fun getWorkNo(@Query("softno") code: String): Observable<WorkNoResp>

//    //记录Log
//    @POST("/SpotCheck/api/SpotCheckApi/Log")
//    fun postAppLogInfo(@Body appLogObject: AppLogObject): Observable<PostLogResult>

    //图片下载API
    @GET("/LoadImg/api/MsapApp/getImgStream")
    fun getFormImage(@Query("name") imageName: String, @Query("FImgPath") path: String): Observable<ResponseBody>
}