package shamsiddin.project.arithmetic.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import shamsiddin.project.arithmetic.MainActivity
import shamsiddin.project.arithmetic.NewGameActivity
import shamsiddin.project.arithmetic.RecordsActivity

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.MainActivity.route)
    {
        composable(route = Screens.NewActivity.route){
          NewGameActivity(navController)
        }
        composable(route = Screens.Records.route){
           RecordsActivity(navController)
        }
        composable(route = Screens.MainActivity.route){
          MainActivity()
        }
    }
}