package com.e.musicplayer

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.e.musicplayer.menu.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView(){
    Scaffold(topBar = { TopBar()}) {
        Column(modifier = Modifier.padding(it)) {

        }
    }
}