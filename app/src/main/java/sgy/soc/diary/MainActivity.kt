package sgy.soc.diary

import android.os.Bundle
import sgy.soc.diary.base.BaseActivity
import sgy.soc.diary.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private val TAG : String = this::class.java.simpleName
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
}