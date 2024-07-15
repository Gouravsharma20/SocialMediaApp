package wu.tutorials.socialmediaapp.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SignUpNavigation() {
    Row (modifier = Modifier.fillMaxWidth().padding(15.dp), horizontalArrangement = Arrangement.Center){
        Text(text = "Already have an account?")
        Text(text = "  Log in", modifier = Modifier.clickable {  }, color = Color.Blue)
    }
    
}