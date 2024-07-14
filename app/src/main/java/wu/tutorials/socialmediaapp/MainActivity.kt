package wu.tutorials.socialmediaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import wu.tutorials.socialmediaapp.ui.theme.LogInTop
import wu.tutorials.socialmediaapp.ui.theme.MainBaground
import wu.tutorials.socialmediaapp.ui.theme.MyNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(modifier = Modifier.fillMaxSize()) {
                MainBaground()
                MyNavigation()

            }

        }
    }
}


