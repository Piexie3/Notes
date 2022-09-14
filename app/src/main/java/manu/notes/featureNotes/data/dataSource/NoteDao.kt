package manu.notes.featureNotes.data.dataSource

import androidx.room.Dao
import androidx.room.Query
import manu.notes.featureNotes.domain.model.Note
import java.util.concurrent.Flow

@Dao
interface NoteDao {

    @Query()
    fun getNotes(): Flow<List<Note>>
}