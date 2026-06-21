package com.example.wishflow.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish_table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish_title")
    val title: String="",
    @ColumnInfo(name = "wish_description")
    val description: String="",
)

object DummyWish {
    val wishList = listOf(
        Wish(1L, "Wish 1", "Description 1"),
        Wish(2L, "Wish 2", "Description 2"),
        Wish(3L, "Wish 3", "Description 3"),
        Wish(4L, "Wish 4", "Description 4"),
        Wish(5L, "Wish 5", "Description 5")
    )
}