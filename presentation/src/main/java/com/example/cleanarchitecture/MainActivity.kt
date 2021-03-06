package com.example.cleanarchitecture

import android.os.Bundle
import com.example.cleanarchitecture.base.BaseActivity
import com.example.cleanarchitecture.ui.main.MainFragment
import dagger.android.AndroidInjection

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()

        }
    }

}
