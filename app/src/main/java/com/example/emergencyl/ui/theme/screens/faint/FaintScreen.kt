package com.example.emergencyl.ui.theme.screens.faint

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.R
import com.example.emergencyl.ui.theme.EmergencyLTheme
import com.example.emergencyl.ui.theme.PurpleGrey40
import com.example.emergencyl.ui.theme.screens.home.HomeScreen

@Composable
fun FaintScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.faintaid),
            contentDescription = "faint aid",
            modifier = Modifier
                .fillMaxSize())

    }

}
@Composable
@Preview(showBackground = true)
fun FaintScreenPreview(){
    EmergencyLTheme {
        FaintScreen(navController = rememberNavController())
    }
}