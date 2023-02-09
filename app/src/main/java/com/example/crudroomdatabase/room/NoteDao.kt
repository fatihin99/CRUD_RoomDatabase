package com.example.crudroomdatabase.room

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    fun addNote(note: Note)

    @Update
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query( "select * from note")
    fun getNotes() : List<Note>

    @Query( "select * from note WHERE id=:note_id")
    fun getNote(note_id: Int) : List<Note>
}