package com.avary.login.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import com.avary.baselibrary.data.protocol.SingleProgress
import com.avary.login.R

/**
 * Created by G1596570 on 2019/1/26.
 *
 *
 */
class MutableProgress @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : LinearLayout(context, attrs, defStyleAttr) {
    private var mProgressList: List<String> ?= null
    private var mSingleProgressMap: HashMap<String, SingleProgress> = HashMap<String, SingleProgress>()

    init {
        orientation = VERTICAL
        //获取自定义属性
    }

    fun addProgresses(progressList: List<String>) {
        mProgressList = progressList
        for (progressStr in progressList) {
            val singleProgress = LayoutInflater.from(context)
                    .inflate(R.layout.single_progress, this, false);
            val progressTitleTV: TextView = singleProgress.findViewById(R.id.mProgressTitleTV)
            val progressValueTV: TextView = singleProgress.findViewById(R.id.mProgressValueTv)
            val progressBar: ProgressBar = singleProgress.findViewById(R.id.mProgressBar)
            progressTitleTV.text = progressStr
            mSingleProgressMap[progressStr] = SingleProgress(progressValueTV, progressBar)
            addView(singleProgress)
        }
    }

    fun getSingleProgress(key: String): SingleProgress? {
        return mSingleProgressMap[key]
    }

    fun getMProgressList() :List<String>? {
        return mProgressList;
    }

    fun getProgressCount(): Int {
        return if(mProgressList == null) {
            0
        } else {
            mProgressList!!.size
        }
    }
}