package com.example.navhomework003

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navhomework003.ui.theme.NavHomework003Theme
import com.example.navhomework003.Second

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavHomework003Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    mynavigation()
                }
            }
        }
    }
}

@Composable
fun mynavigation(){
    val navcont= rememberNavController()
    NavHost(navController = navcont, startDestination =Home.Route ){
        composable(Home.Route){
            HomeScreen(navcont)
        }
        composable(route="Second/{user}/{age}", arguments =listOf(
            navArgument("user"){type=NavType.StringType},
        navArgument("age"){type= NavType.IntType}
        ) ){
            val user=it.arguments?.getString("user")
            val age=it.arguments?.getInt("age")
            SecondScreen(navcont=navcont,name =user.toString() , age = age!!.toInt())

        }
    }
    }


