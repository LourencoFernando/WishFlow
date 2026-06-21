package com.example.wishflow.data

data class Wish(
    val id: Long = 0L,
    val title: String="",
    val description: String="",
)

object DummyWish {
    val wishList = listOf(
        Wish(1L, "Wish 1", "Description 1"),
        Wish(2L, "Wish 2", "Description 2"),
        Wish(3L, "Wish 3", "Description 3"),
        Wish(4L, "Wish 4", "Description 4"),
        Wish(5L, "Wish 5", "Description 5"),
        Wish(6L, "Wish 6", "Description 6"),
        Wish(7L, "Wish 7", "Description 7"),
        Wish(8L, "Wish 8", "Description 8"),
        Wish(9L, "Wish 9", "Description 9")
    )
}