package com.example.emergencyl.ui.theme.screens.home

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.R
import com.example.emergencyl.navigation.CALL_URL
import com.example.emergencyl.navigation.DASHBOARD_URL
import com.example.emergencyl.ui.theme.EmergencyLTheme
import com.example.emergencyl.ui.theme.Pink40
import com.example.emergencyl.ui.theme.PurpleGrey40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40),
        horizontalAlignment = Alignment.CenterHorizontally,

        )
    {

        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = {
                    val callIntent= Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:911".toUri()
                    mContext.startActivity(callIntent)
                }) {


                }
            },
        )
        //end of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Choose what you want.", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))
        Row (modifier = Modifier
            .padding(10.dp,top = 70.dp)){
            //Column1
            Column {
                Card(modifier = Modifier
                    .height(400.dp)
                    .width(150.dp),
                    border = BorderStroke(width = 3.dp, color = Pink40)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.call),
                            contentDescription = "help",
                            modifier = Modifier
                                .size(150.dp)
                                .padding(top = 50.dp),
                            contentScale = ContentScale.Inside
                        )
                        Spacer(modifier = Modifier.height(20.dp))


                    }




                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Emergency Call",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 30.dp)
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Press the button below to call for an ambulance in order to get help.",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp))


                    Button(
                        onClick = {
                            navController.navigate(CALL_URL)
                        },
                        modifier = Modifier
                            .padding(start = 30.dp, top = 10.dp)
                    )
                    {
                        Text(
                            text = "CALL",
                            color = Color.White
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))


            }
            //End of Column1
            Spacer(modifier = Modifier.width(30.dp))
            //Column2
            Column {
                Card(modifier = Modifier
                    .height(400.dp)
                    .width(150.dp),
                    border = BorderStroke(width = 3.dp, color = Pink40 )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.aid),
                            contentDescription = "help",
                            modifier = Modifier
                                .size(150.dp)
                                .padding(top = 50.dp),
                            contentScale = ContentScale.Inside
                        )
                        Spacer(modifier = Modifier.height(15.dp))


                    }




                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "First Aid",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 40.dp)
                    )
                    Spacer(modifier = Modifier.height(15.dp))

                    Text(text = "Here are fast and easy first aid tips to help you with the emergency .",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp))



                    Button(
                        onClick = {
                            navController.navigate(DASHBOARD_URL)
                        },
                        modifier = Modifier
                            .padding(start = 30.dp, top = 10.dp)
                    )
                    {
                        Text(
                            text = "START",
                            color = Color.White
                        )

                    }
                }
                Spacer(modifier = Modifier.height(5.dp))


            }
            //end of column2
            Spacer(modifier = Modifier.width(30.dp))


            //column3
        }


    }
}
@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    EmergencyLTheme {
        HomeScreen(navController = rememberNavController())
    }
}