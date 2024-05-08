package com.example.emergencyl.ui.theme.screens.login


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.data.AuthViewModel
import com.example.emergencyl.navigation.SIGNUP_URL
import com.example.emergencyl.ui.theme.Purple40
import com.example.emergencyl.ui.theme.PurpleGrey40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController:NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple40),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login to your Account.",
            color = Color.Black,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(30.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter email")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text(text = "Enter password")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )
        )

        Spacer(modifier = Modifier.height(30.dp))
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(onClick = {
            authViewModel.login(email, password)
        },
            colors =ButtonDefaults.buttonColors(PurpleGrey40),
            shape = RoundedCornerShape(5.dp)) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Dont have an account yet.Sign Up.",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = Color.Black,

            modifier = Modifier
                .clickable {
                    navController.navigate(SIGNUP_URL)
                })
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){

    LoginScreen(navController = rememberNavController())

}