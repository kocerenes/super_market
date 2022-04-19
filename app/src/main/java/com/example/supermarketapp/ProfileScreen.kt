package com.example.supermarketapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 15.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(175.dp,175.dp),
            shape = CircleShape,
            elevation = 12.dp
        ) {
            // below line we are creating a new image.
            Image(
                painter = painterResource(id = R.drawable.enes),
                contentDescription = "" ,
                modifier = Modifier.fillMaxSize()
            )
        }//Card

        Text(text = "Enes Koçer", fontSize = 23.sp)
        Text(text = "(+90) 541-364-6038", fontSize = 20.sp)
    }

}