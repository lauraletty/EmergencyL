package com.example.emergencyl.ui.theme.screens.call

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.R
import com.example.emergencyl.ui.theme.EmergencyLTheme

@Composable
fun CallScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)

    ) {

        val mContext = LocalContext.current

        Column(
        ) {
            Card(
                modifier = Modifier
                    .height(400.dp)
                    .fillMaxWidth()
                    .background(Color.Blue)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.call),
                    contentDescription = "call",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(width = 200.dp, height = 100.dp)
                )

            }


            Button(
                onClick = {
                    val callIntent = Intent(Intent.ACTION_DIAL)
                    callIntent.data = "tel:911".toUri()
                    mContext.startActivity(callIntent)
                },
                modifier = Modifier
                    .padding(start = 140.dp, end = 30.dp, top = 100.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(width = 2.dp, color = Color.Red)
            ) {
                Text(
                    text = "CALL",
                    color = Color.Black,
                    modifier = Modifier
                        .size(width = 120.dp, height = 20.dp),
                    textAlign = TextAlign.Center
                )


            }


        }
    }

}

@Composable
@Preview(showBackground = true)
fun CallScreenPreview(){
    EmergencyLTheme {
        CallScreen(navController = rememberNavController())
    }
}