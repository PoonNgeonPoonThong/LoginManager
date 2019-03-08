package com.example.login

import android.app.Application
import com.base.library.login.LoginManager

/**
 * Description:
 * App 入口
 *
 * @author  Alpinist Wang
 * Company: Mobile CPX
 * Date:    2019/3/8
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        LoginManager.init(this)
    }
}