package com.example.wishflow

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wishflow.data.Graph
import com.example.wishflow.data.Wish
import com.example.wishflow.data.WishRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class WishViewModel (
    private val wishRepository: WishRepository = Graph.wishRepository
) : ViewModel() {
    var wishTitleState by mutableStateOf("")
    var wishDescriptionState by mutableStateOf("")

    fun onWishTitleChange(title: String) {
        wishTitleState = title
    }

    fun onWishDescriptionChange(description: String) {
        wishDescriptionState = description
    }

    val getAllWishes: Flow<List<Wish>> = wishRepository.getAllWishes()

    init {
        // No need to launch a coroutine to initialize a Flow
    }

    fun insertWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.insertWish(wish = wish)
        }
    }

    fun getWishById(id: Long): Flow<Wish> {
        return wishRepository.getWishById(id)
    }

    fun updateWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.updateWish(wish = wish)
        }
    }

    fun deleteWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.deleteWish(wish = wish)
        }
    }
}