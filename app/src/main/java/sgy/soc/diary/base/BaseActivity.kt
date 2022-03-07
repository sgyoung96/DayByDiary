package sgy.soc.diary.base

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* 전체화면 설정 (StatusBar, NavigationBar 까지 화면 확장) */
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN)
    }
}