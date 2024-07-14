package wu.tutorials.socialmediaapp.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpTop() {
    Column(verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "   Create an account", fontSize = 32.sp, fontWeight = FontWeight.Bold)
    }

}