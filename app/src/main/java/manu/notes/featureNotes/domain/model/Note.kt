package manu.notes.featureNotes.domain.model

import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import manu.notes.ui.theme.*

@Entity
data class Note(
    val tittle: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id : Int?=null
){
    companion object{
        val noteColors= listOf( LightBlue, LightGreen, RedOrange, RedPink, Color.Red, BabyBlue, Violet, Purple700, Color.Green)
    }
}
