package com.example.kodeinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity() , KodeinAware {
    
    override val kodein by closestKodein()
    private val mAdapter: RecyclerAdapter by instance()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("test",mAdapter.itemCount.toString())
        
    }
}
