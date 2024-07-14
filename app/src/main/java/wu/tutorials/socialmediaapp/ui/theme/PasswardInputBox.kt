package wu.tutorials.socialmediaapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PasswardInputBox() {
    val testState = remember { mutableStateOf(" ") }

    Row (modifier = Modifier
        .fillMaxSize()
        .padding(start = 40.dp,top=110.dp
        ), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start){
        Text(text = "Password", fontSize = 18.sp)
        Text(text = "Forgot your password?.", modifier = Modifier.padding(start = 60.dp).clickable {  },fontSize = 14.sp, color = Color.Blue)

    }
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 470.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(value = testState.value, onValueChange = {testState.value = it}, placeholder = { Text(
            text = "*********"
        )})
    }
}
