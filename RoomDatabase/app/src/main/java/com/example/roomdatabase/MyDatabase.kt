package com.example.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contact :: class], version = 1)

abstract class MyDatabase : RoomDatabase() {

    abstract fun ContacDao() : ContactDoa

    companion object{

        @Volatile
        private var INSTANCE : MyDatabase? = null

        fun getDatabase(context: Context): MyDatabase {

            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "contact"
                ).build()
                INSTANCE = instance
                return instance
            }

        }

    }
}