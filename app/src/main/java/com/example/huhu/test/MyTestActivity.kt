package com.example.huhu.test

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.huhu.R

/**
 *  MyTestActivitys
 *
 */
class MyTestActivity  : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_main)


       var myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java);

        // 监听event的变化
        myViewModel.noticeCount.observe(this, Observer {

            // 更新 UI 系统


        })

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}