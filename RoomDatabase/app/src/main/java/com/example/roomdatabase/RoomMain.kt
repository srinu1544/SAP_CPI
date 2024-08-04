package com.example.roomdatabase

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext



class RoomMain : AppCompatActivity() {



    companion object{
        private val TAG = "RoomMain";

    }




    private lateinit var appdb : MyDatabase
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_main)

        appdb = MyDatabase.getDatabase(this)


        for (i in 1..20) {

            val contact = Contact(i,"srinivas","998956747",)
            GlobalScope.launch(Dispatchers.IO) {
                appdb.ContacDao().insert(contact)
            }

        }



        GlobalScope.launch(Dispatchers.Main) {

            val list =  appdb.ContacDao().getAll()
            Log.d(TAG,"list Data"+list)
        }


        GlobalScope.launch(Dispatchers.Main) {

            val contact =  appdb.ContacDao().findByid(6)
            Log.d(TAG,"data by given id"+contact)
        }













    }

}