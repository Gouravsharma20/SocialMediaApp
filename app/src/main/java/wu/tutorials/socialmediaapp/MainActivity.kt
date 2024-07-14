package wu.tutorials.socialmediaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (modifier = Modifier.fillMaxSize()){
                Column (modifier = Modifier
                    .weight(.25f)
                    .fillMaxWidth()
                    .background(Color.Blue), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "Wibe-Zone", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Text(text = "Your favourite social network", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.White, modifier = Modifier.padding( top = 10.dp))
                    
                }
                Box(modifier = Modifier
                    .weight(.75f)
                    .fillMaxWidth()
                    .background(Color.Blue)
                    .clip(
                        shape = RoundedCornerShape(
                            topStart = 50.dp,
                            topEnd = 50.dp,
                            bottomStart = 30.dp,
                            bottomEnd = 30.dp
                        )
                    )){
                    Column (modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)){
                        Text(text = "   Log in", color = Color.Black, fontSize = 32.sp, modifier = Modifier.padding( top = 45.dp))
                    }
                    Column(modifier = Modifier.padding()) {
                        Text(text = "UserName")
                        UsernameInputBox()
                    }


                }
            }


        }
    }
}


