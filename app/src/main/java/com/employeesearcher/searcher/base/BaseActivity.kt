package com.employeesearcher.searcher.base

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected abstract fun createMainFragment(): Fragment?

    companion object {
        fun launch(fromActivity: Activity, intent: Intent, options: Bundle) {
            ActivityCompat.startActivity(fromActivity, intent, options)
        }

        fun launch(fromActivity: Activity, intent: Intent) {
            ActivityCompat.startActivity(fromActivity, intent, null)
        }
    }
}