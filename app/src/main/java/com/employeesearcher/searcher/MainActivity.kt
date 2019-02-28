package com.employeesearcher.searcher

import android.os.Bundle
import android.support.v4.app.Fragment
import com.employeesearcher.searcher.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun createMainFragment(): Fragment? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcome.text = "Welcome"
        welcome.setOnClickListener { view ->
            SearchingActivity.launch(this)
        }
    }
}
