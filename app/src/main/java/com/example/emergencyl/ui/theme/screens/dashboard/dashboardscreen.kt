package com.example.emergencyl.ui.theme.screens.home


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emergencyl.R
import com.example.emergencyl.navigation.ANKLE_URL
import com.example.emergencyl.navigation.BROKENLIMB_URL
import com.example.emergencyl.navigation.BURN_URL
import com.example.emergencyl.navigation.CHEST_URL
import com.example.emergencyl.navigation.FAINT_URL
import com.example.emergencyl.navigation.HEARTATTACK_URL
import com.example.emergencyl.navigation.NOSEBLEED_URL
import com.example.emergencyl.navigation.SPINAL_URL
import com.example.emergencyl.ui.theme.PurpleGrey40



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dashboardscreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(PurpleGrey40))
    {

        //TopAppBar
        val mContext = LocalContext.current
        TopAppBar(title = { Text(text = "Firstaid", color = Color.Red)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),


            actions = {
                IconButton(onClick = {
                    val callIntent=Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:911".toUri()
                    mContext.startActivity(callIntent) }) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "call",
                        tint = Color.Red
                    )
                }
            }
        )
        //end of TopAppBar
        Column(modifier = Modifier
            .verticalScroll(rememberScrollState())) {
            androidx.compose.material3.Text(
                text = "Easy and Fast aid guide",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 40.dp))
            Spacer(modifier = Modifier.height(10.dp))
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.nosebleed),
                                contentDescription = "nosebleed",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Nosebleed",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                       navController.navigate(NOSEBLEED_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(5.dp))


                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.faint),
                                contentDescription = "Faint",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Faint",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(FAINT_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))


                }
                //End of Column2
            }
            //End of Row 1
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.chestpain),
                                contentDescription = "chestpain",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Chestpain",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(CHEST_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)

                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.hearattack),
                                contentDescription = "heartattack",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "Heartattack",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(HEARTATTACK_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column2
            }
            //  End of Row 2
            //Start of Row 3
            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.brokenleg),
                                contentDescription = "anklesprain",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Broken Limbs",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(BROKENLIMB_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }

                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.anklesprain),
                                contentDescription = "anklesprain",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    androidx.compose.material3.Text(
                        text = "AnkleSprain",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(ANKLE_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column3
            }
            //End of Row 3

            Row (modifier = Modifier
                .padding(25.dp)){
                //Column1
                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.spinalinjury),
                                contentDescription = "Fever",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Spinal injury",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(SPINAL_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }
                //End of Column1
                Spacer(modifier = Modifier.width(20.dp))
                //Column2

                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)) {
                        Box (modifier = Modifier
                            .fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.burn),
                                contentDescription = "Fever",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds)

                        }

                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Burn",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .clickable {
                                navController.navigate(BURN_URL)
                            },
                        fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(3.dp))

                }

                //End of Column2
            }
            //End of Row 3



        }


    }
}


@Preview(showBackground = true)
@Composable
fun dashboardPreview(){
    dashboardscreen(rememberNavController())
}