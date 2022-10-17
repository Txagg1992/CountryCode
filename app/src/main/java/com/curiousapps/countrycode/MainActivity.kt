package com.curiousapps.countrycode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test_btn.setOnClickListener {
            if (mProgressBar?.visibility == View.VISIBLE){
                showProgressBar(false)
            }else showProgressBar(true)
        }
    }


}