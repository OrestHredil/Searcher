package com.employeesearcher.searcher

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import com.employeesearcher.searcher.base.BaseActivity

class SearchingActivity : BaseActivity() {
    override fun createMainFragment(): Fragment? {
        return SearchingFragment.newInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }

    companion object {
        fun launch(fromActivity: Activity) {
            val intent = Intent(fromActivity, SearchingActivity::class.java)

            BaseActivity.launch(fromActivity, intent)
        }
    }
}