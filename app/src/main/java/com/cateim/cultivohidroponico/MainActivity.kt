package com.cateim.cultivohidroponico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerview : RecyclerView
    private lateinit var newArrayList : ArrayList<Items>
    lateinit var code : Array<String>
    lateinit var name : Array<String>
    lateinit var seed : Array<Int>
    lateinit var days : Array<Int>
    lateinit var siembraDate : Array<String>
    lateinit var gDays : Array<Int>
    lateinit var almacigoDate : Array<String>
    lateinit var aDays : Array<Int>
    lateinit var trasplanteDate : Array<String>
    lateinit var tDays : Array<Int>
    lateinit var cosechaDate : Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        code = arrayOf("16072021","17072021","20072021","21072021")
        name = arrayOf("senorita","crespa","romana","albahaca")
        seed = arrayOf(17,23,8,21)
        days = arrayOf(2,1,2,3)
        siembraDate = arrayOf("17.07.2021","17.07.2021","17.07.2021","17.07.2021")
        gDays = arrayOf(2,3,1,2)
        almacigoDate = arrayOf("17.07.2021","17.07.2021","17.07.2021","17.07.2021")
        aDays = arrayOf(0,0,0,0)
        trasplanteDate = arrayOf("00.00.2021","00.00.2021","00.00.2021","00.00.2021")
        tDays = arrayOf(0,0,0,0)
        cosechaDate = arrayOf("00.00.2021","00.00.2021","00.00.2021","00.00.2021")

        newRecyclerview = findViewById(R.id.itemsRecyclerView)
        newRecyclerview.layoutManager = LinearLayoutManager(this)
        newRecyclerview.setHasFixedSize(true)

        newArrayList = arrayListOf<Items>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in code.indices){
            val items = Items(code[i],name[i],seed[i],days[i],siembraDate[i],gDays[i],almacigoDate[i],aDays[i],trasplanteDate[i],tDays[i],cosechaDate[i])
            newArrayList.add(items)
        }
        newRecyclerview.adapter = Adapter(newArrayList)
    }

}