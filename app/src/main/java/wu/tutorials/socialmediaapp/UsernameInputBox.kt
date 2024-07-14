package wu.tutorials.socialmediaapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun UsernameInputBox() {
    val testState = remember { mutableStateOf(" ") }
    Column {
        TextField(value = testState.value, onValueChange = {testState.value = it}, label = { Text(
            text = "your_name123"
        )})
    }
}