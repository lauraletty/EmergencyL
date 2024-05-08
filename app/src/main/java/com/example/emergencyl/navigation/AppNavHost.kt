package com.example.emergencyl.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.navigation.HEARTATTACK_URL

import com.example.emergencyl.ui.theme.screens.HOME.Homescreen
import com.example.emergencyl.ui.theme.screens.call.CallScreen
import com.example.emergencyl.ui.theme.screens.faint.FaintScreen
import com.example.emergencyl.ui.theme.screens.faint.chestscreen
import com.example.emergencyl.ui.theme.screens.home.HomeScreen
import com.example.emergencyl.ui.theme.screens.home.dashboardscreen
import com.example.emergencyl.ui.theme.screens.login.LoginScreen
import com.example.emergencyl.ui.theme.screens.nosebleed.anklescreen
import com.example.emergencyl.ui.theme.screens.nosebleed.brokenscreen
import com.example.emergencyl.ui.theme.screens.nosebleed.burnscreen
import com.example.emergencyl.ui.theme.screens.nosebleed.heartattackscreen
import com.example.emergencyl.ui.theme.screens.nosebleed.nosebleedscreen
import com.example.emergencyl.ui.theme.screens.signup.SignupScreen
import com.example.emergencyl.navigation.ANKLE_URL
import com.example.emergencyl.navigation.BROKENLIMB_URL
import com.example.emergencyl.navigation.BURN_URL
import com.example.emergencyl.navigation.CALL_URL
import com.example.emergencyl.navigation.CHEST_URL
import com.example.emergencyl.navigation.DASHBOARD_URL
import com.example.emergencyl.navigation.FAINT_URL
import com.example.emergencyl.navigation.HOMEP_URL
import com.example.emergencyl.navigation.HOME_URL
import com.example.emergencyl.navigation.LOGIN_URL
import com.example.emergencyl.navigation.NOSEBLEED_URL
import com.example.emergencyl.navigation.SIGNUP_URL
import com.example.emergencyl.navigation.SPINAL_URL
import com.example.emergencyl.ui.theme.screens.splash.splashscreen
import com.example.wazitoecommerce.ui.theme.screens.nosebleed.spinalscreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = HOMEP_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(HOMEP_URL){
            Homescreen(navController = navController)
        }
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }

        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }

        composable(DASHBOARD_URL){
            dashboardscreen(navController = navController)
        }
        composable(CALL_URL){
            CallScreen(navController = navController)
        }

        composable(NOSEBLEED_URL){
            nosebleedscreen(navController = navController)
        }

        composable(CHEST_URL){
            chestscreen(navController = navController)
        }

        composable(BROKENLIMB_URL){
            brokenscreen(navController = navController)
        }

        composable(BURN_URL){
            burnscreen(navController = navController)
        }

        composable(FAINT_URL){
            FaintScreen(navController = navController)
        }

        composable(SPINAL_URL){
            spinalscreen(navController = navController)
        }

        composable(ANKLE_URL){
            anklescreen(navController = navController)
        }

        composable(HEARTATTACK_URL){
            heartattackscreen(navController = navController)
        }

        composable(SPLASH_URL){
            splashscreen(navController = navController)
        }
    }
}