package com.example.navhomework003

import android.app.backup.BackupAgent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavHostController

@Composable
fun SecondScreen( navcont:NavHostController,name:String,age:Int) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "wellcome ${name} your age is ${1402 - age}")
        Button(onClick = {
            navcont.navigate(Home.Route)
        }) {
            Text(text = "Go Back")
        }
    }
}

