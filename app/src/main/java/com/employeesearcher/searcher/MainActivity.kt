package com.employeesearcher.searcher

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @OnClick(R.id.welcome)
    fun onWelcomeClick() {
        SearchingActivity.launch(this)
    }

}
