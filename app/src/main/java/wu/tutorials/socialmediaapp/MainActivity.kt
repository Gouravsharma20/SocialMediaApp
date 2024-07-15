package wu.tutorials.socialmediaapp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import wu.tutorials.socialmediaapp.ui.theme.LogInTop
import wu.tutorials.socialmediaapp.ui.theme.MainBaground
import wu.tutorials.socialmediaapp.ui.theme.MyNavigation
import wu.tutorials.socialmediaapp.ui.theme.SignUpButton
import wu.tutorials.socialmediaapp.ui.theme.SignUpPage
import wu.tutorials.socialmediaapp.ui.theme.Signup

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()

        }
    }
}


@Composable
fun FirstPage(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        MainBaground()
        LogInTop()
        UsernameInputBox()
        PasswardInputBox()
        Signup()
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "first_page") {
        composable("first_page") { FirstPage(navController) }
        composable("second_page") {  }
    }
}
