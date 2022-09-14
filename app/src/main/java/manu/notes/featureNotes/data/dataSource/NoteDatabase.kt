package manu.notes.featureNotes.data.dataSource

import androidx.room.Database
import manu.notes.featureNotes.domain.model.Note

@Database(
    entities =[Note::class],
    version = 1
)
abstract class NoteDatabase {
    abstract val noteDao:NoteDao
}