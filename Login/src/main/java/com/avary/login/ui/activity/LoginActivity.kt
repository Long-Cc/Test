package com.avary.login.ui.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.KeyEvent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.avary.base.presenter.LoginView
import com.avary.baselibrary.data.database.DbHelper
import com.avary.baselibrary.ui.activity.BaseMvpActivity
import com.avary.baselibrary.utils.DialogUtil
import com.avary.login.BuildConfig
import com.avary.login.R
import com.avary.login.common.LoginConstant.Companion.FORM_DOWNLOAD_TITLE
import com.avary.login.common.LoginConstant.Companion.PERMISSION_DOWNLOAD_TITLE
import com.avary.login.common.LoginConstant.Companion.USER_DOWNLOAD_TITLE
import com.avary.login.injection.component.DaggerLoginComponent
import com.avary.login.injection.module.LoginModule
import com.avary.login.presenter.LoginPresenter
import com.avary.login.widget.MutableProgress
import kotlinx.android.synthetic.main.activity_login.*
import java.text.SimpleDateFormat
import java.util.*

class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {

    private lateinit var progressDialog: AlertDialog;
    private lateinit var mutableProgress: MutableProgress
    private lateinit var downloadBtn: Button
    @SuppressLint("SimpleDateFormat")
    private val format: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    private val downloadTitleList = Arrays.asList(
            USER_DOWNLOAD_TITLE,
            FORM_DOWNLOAD_TITLE,
            PERMISSION_DOWNLOAD_TITLE
    )

    companion object {
        private val TAG = LoginActivity::class.java.simpleName
    }

    override fun successDownload() {
        Log.d(TAG, "資料下載成功！")
        progressDialog.dismiss()
        last_update_time.text = format.format(Date())
        DialogUtil.showTips(this, "資料下載成功！", null, "確定", null)
    }

    override fun failureDownload(message: String) {
        Log.d(TAG, "資料下載失敗:$message")
        downloadBtn.isEnabled = true
        DialogUtil.showTips(this, "資料下載失敗！", message, "確定", null)
    }

    override fun updateDownloadProgress(progress: Int, progressTitle: String) {
        val singleProgress = mutableProgress.getSingleProgress(progressTitle)
        singleProgress!!.progressBar.progress = progress
        singleProgress.progressValueTV.text = String.format("%02d%%", progress)
    }

    override fun injectComponent() {
        DaggerLoginComponent.builder()
                .activityComponent(activityComponent)
                .loginModule(LoginModule())
                .build()
                .inject(this)
        mPresenter.mView = this
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initToolBar()
        initDownloadDialog()
        ver_code.text = "版本号：${BuildConfig.VERSION_NAME}"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.d(TAG, "onCreateOptionsMenu")
        menuInflater.inflate(R.menu.menu_login, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when {
            item.itemId == R.id.pre_download -> {
                progressDialog.show() //下载按钮，下载表单资料
                return true
            }
            item.itemId == R.id.image_download -> {                 //图片下载按钮

                return true
            }
            item.itemId == R.id.log -> {
                // val intent = Intent(this, LogActivity::class.java) //记录最后一次错误log
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return if (keyCode == KeyEvent.KEYCODE_BACK) {
            progressDialog.hide();
            true;
        } else { // 如果不是back键正常响应
            super.onKeyDown(keyCode, event);
        }
    }

    private fun initToolBar() {
        val mToolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar);
        supportActionBar!!.setDisplayShowTitleEnabled(false);
    }


    private fun initDownloadDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("資料下載")
        val view = View.inflate(this, R.layout.download_progress_k, null)
        mutableProgress = view.findViewById(R.id.mutableProgress)
        mutableProgress.addProgresses(downloadTitleList)

        downloadBtn = view.findViewById<Button>(R.id.downloadBtn)
        downloadBtn.setOnClickListener {
            downloadBtn.isEnabled = false
            mPresenter.startDownloadAllData(downloadTitleList)
        }
        builder.setView(view)
        progressDialog = builder.create()
        progressDialog.setCanceledOnTouchOutside(false)
    }

    override fun onDestroy() {
        super.onDestroy()
        progressDialog.dismiss()
        DbHelper.INSTANCE!!.onDestory()
    }
}
