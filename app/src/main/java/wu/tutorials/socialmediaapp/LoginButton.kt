package wu.tutorials.socialmediaapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import wu.tutorials.socialmediaapp.ui.theme.LogInTop
import wu.tutorials.socialmediaapp.ui.theme.Signup

@Composable
fun LoginButton(navController: NavController) {
    LogInTop()
    UsernameInputBox()
    PasswardInputBox()
    Signup()
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 625.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
        Button(onClick = { navController.navigate(Pagetwo.route)}, colors = ButtonDefaults.buttonColors(containerColor = (Color.Blue)), modifier = Modifier.clip(shape = RoundedCornerShape(10.dp))) {
            Text(text = "Login" , color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }
    }

    
}
