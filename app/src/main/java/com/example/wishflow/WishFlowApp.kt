package com.example.wishflow

import android.app.Application
import com.example.wishflow.data.Graph

class WishFlowApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }
}