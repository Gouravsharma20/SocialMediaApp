package wu.tutorials.socialmediaapp.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpPassword() {
    val testState6 = remember { mutableStateOf(" ") }

    Column(modifier = Modifier.padding(top = 32.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text(text = "          Password *", fontSize = 16.sp)

    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 15.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(value = testState6.value, onValueChange = {testState6.value = it}, placeholder = { Text(
            text = "***********"
        )
        })
    }
}