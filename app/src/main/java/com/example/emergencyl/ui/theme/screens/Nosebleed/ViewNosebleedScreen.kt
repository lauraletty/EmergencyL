package com.example.wazitoecommerce.ui.theme.screens.Nosebleed

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.wazitoecommerce.data.NosebleedViewModel
import com.example.wazitoecommerce.data.ProductViewModel
import com.example.wazitoecommerce.models.Product
import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme

@Composable
fun ViewNosebleedScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        var context = LocalContext.current
        var InstructionRepository = NosebleedViewModel(navController, context)


        val emptyInstructionState = remember { mutableStateOf(Product("","","","","")) }
        var emptyInstructionListState = remember { mutableStateListOf<Product>() }

        var Instruction =  InstructionRepository.allInstructions(emptyInstructionState, emptyInstructionListState)


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Nosebleed first aid instructions",
                fontSize = 25.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Red)

            Spacer(modifier = Modifier.height(20.dp))

            LazyColumn(){
                items(Instruction){
                    Instruction(
                        instruction = it.name,
                        id = it.id,
                        navController = navController,
                        InstructionRepository= InstructionRepository,
                        InstructionImage = it.imageUrl
                    )
                }
            }
        }
    }
}


@Composable
fun Instruction(instruction:String, id:String,
                navController:NavHostController,
                InstructionRepository:NosebleedViewModel, InstructionImage:String) {

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = instruction)

        Image(
            painter = rememberAsyncImagePainter(InstructionImage),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )
        Button(onClick = {
            InstructionRepository.deleteInstruction(id)
        }) {
            Text(text = "Delete")
        }
        Button(onClick = {
            //navController.navigate(ROUTE_UPDATE_Instruction+"/$id")
        }) {
            Text(text = "Update")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ViewProductsScreenPreview(){
        ViewNosebleedScreen(navController = rememberNavController())

}