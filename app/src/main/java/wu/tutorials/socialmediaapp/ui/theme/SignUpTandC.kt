package wu.tutorials.socialmediaapp.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AcceptSignUpTandC() {
    var isChecked by remember { mutableStateOf(false) }

    Box {
        Row {
            Checkbox(checked = isChecked, onCheckedChange = {isChecked = it})
            Text(text = "I accept the Terms and Conditions", fontSize = 16.sp, color = Color.Blue, modifier = Modifier.padding(top = 16.dp))
        }
    }
}