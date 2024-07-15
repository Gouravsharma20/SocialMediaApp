package wu.tutorials.socialmediaapp.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import wu.tutorials.socialmediaapp.Home
import wu.tutorials.socialmediaapp.LoginButton
import wu.tutorials.socialmediaapp.Pagetwo

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route ) {
        composable(Home.route) {
            LoginButton(navController = navController)
        }
        composable(Pagetwo.route) {
            Pagetwo()
        }
    }

}