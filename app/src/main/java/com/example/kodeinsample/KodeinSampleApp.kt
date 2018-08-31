package com.example.kodeinsample

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware

/**
 * Created by Idorenyin Obong on 30/08/2018
 *
 */

class KodeinSampleApp : Application(), KodeinAware{
   
    override var kodein = Kodein.lazy {
        import(recyclerAdapterModule)
    }
}