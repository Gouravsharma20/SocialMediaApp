package wu.tutorials.socialmediaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import wu.tutorials.socialmediaapp.ui.theme.LogInTop
import wu.tutorials.socialmediaapp.ui.theme.MainBaground
import wu.tutorials.socialmediaapp.ui.theme.MyNavigation
import wu.tutorials.socialmediaapp.ui.theme.SignUpFullName
import wu.tutorials.socialmediaapp.ui.theme.SignUpPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBaground()
            SignUpPage()
        }
    }
}


@Composable
fun FirstPage() {
    Box(modifier = Modifier.fillMaxSize()) {
        MainBaground()
        MyNavigation()
    }
}


