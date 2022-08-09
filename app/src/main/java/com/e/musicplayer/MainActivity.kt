package com.e.musicplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.e.musicplayer.ui.theme.MusicPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicPlayerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

class RouteAction(navHostController: NavHostController){
    val navTo: (NAVROUTE) -> Unit = { route ->
        navHostController.navigate(route.routeName)
    }

    val navWithNum: (String) -> Unit = { route ->
        navHostController.navigate(route)
    }

    val goBack: () -> Unit = {
        navHostController.popBackStack()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationGraph(starting: String = NAVROUTE.LOADING.routeName){
    val navController = rememberNavController()
    val routeAction = remember(navController) {RouteAction(navController)}
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val mainViewModel : MainViewModel = viewModel()
    NavHost(navController = navController, startDestination = starting) {
        composable(NAVROUTE.LOADING.routeName){

        }
        composable(NAVROUTE.MAIN.routeName){

        }
        composable(NAVROUTE.DETAIL.routeName){

        }
        composable(NAVROUTE.SETTING.routeName){

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MusicPlayerTheme {

    }
}