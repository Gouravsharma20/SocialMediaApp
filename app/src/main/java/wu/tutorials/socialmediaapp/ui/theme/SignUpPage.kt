package wu.tutorials.socialmediaapp.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SignUpPage() {
    val scrollState = rememberScrollState()
    Column (modifier = Modifier
        .fillMaxHeight()
        .verticalScroll(scrollState)
        .padding(top = 250.dp)){
        MainBaground()
        SignUpTop()
        SignUpFullName()
        SignUpusername()
        SignUpEmail()
        SignUpPassword()
        SignUpRepeatpassword()
        AcceptSignUpTandC()
        SignUpButton()
        SignUpNavigation()
    }
}