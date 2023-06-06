package com.example.navhomework003

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navcont: NavHostController) {
    var user: String by remember { mutableStateOf("") }
    var pass : String by remember { mutableStateOf("") }
    var bd:String by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.ico_tvu)
            , contentDescription ="Logo Image"
        )
        TextField(
            value = user,
            onValueChange = {user=it},
            label = { Text(text = "Username") },
        )
        TextField(
            value = bd,
            onValueChange = {bd=it},
            label = { Text(text = "Birthdayyear") },
        )
        TextField(
            value = pass,
            onValueChange = {pass=it},
            label = { Text(text = "Password") },
        )
        val context1= LocalContext.current
        Button(onClick = {
            if (user=="amir" && pass=="111"){
                navcont.navigate("Second/$user/$bd")
            }else{
                Toast.makeText(context1,"Wrong!",Toast.LENGTH_SHORT).show()
            }
        }, colors = ButtonDefaults.buttonColors(Color(0xFC52FAE))) {
            Text(text = "Login")
        }
    }
}