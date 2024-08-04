package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update


@Dao
interface ContactDoa {

    @Query("SELECT * FROM contact")
   suspend fun getAll(): List<Contact>

    /* @Query("SELECT * FROM student_table WHERE uid IN (:userIds)")
     fun loadAllByIds(userIds: IntArray): List<Student>*/
/*
    @Query("SELECT * FROM contact WHERE id LIKE :idd LIMIT 1")
    suspend fun findByRoll(idd : Int): Contact*/


    @Query("SELECT * FROM contact WHERE id LIKE :idd LIMIT 1")
    suspend fun findByid(idd : Int): Contact


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(contact : Contact)

    @Delete
    suspend fun delete(contact : Contact)

    @Query("DELETE FROM contact")
    suspend fun deleteAll()

}