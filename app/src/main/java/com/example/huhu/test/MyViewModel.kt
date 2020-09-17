package com.example.huhu.test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * 测试Viewmodel的使用
 */
class MyViewModel :ViewModel() {

    val noticeCount  = MutableLiveData<Int>();


}