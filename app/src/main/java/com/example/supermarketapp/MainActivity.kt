package com.example.supermarketapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.supermarketapp.ui.theme.SuperMarketAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperMarketAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomePage()
                }
            }
        }
    }
}

@Composable
fun HomePage() {

    val bottomBarItem = remember {
        mutableStateOf(0)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = colorResource(id = R.color.essential),
                contentColor = Color.White,
                title = { Text(text = "Best Market")}
            )
        },
        content = {
            if (bottomBarItem.value == 0){

            }
            if (bottomBarItem.value == 2){
                ProfileScreen()
            }
        },
        bottomBar = {
            BottomAppBar(
                backgroundColor = colorResource(id = R.color.essential),
                content = {
                    BottomNavigation(backgroundColor = colorResource(id = R.color.essential)) {
                        BottomNavigationItem(
                            selected = bottomBarItem.value == 0,
                            onClick = {
                                bottomBarItem.value =0
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_homepage),
                                    contentDescription = "", modifier = Modifier.size(40.dp,40.dp)
                                )
                            },
                            selectedContentColor = Color.Black,
                            unselectedContentColor = Color.White
                        )
                        BottomNavigationItem(
                            selected = bottomBarItem.value == 1,
                            onClick = {
                                bottomBarItem.value =1
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_basket),
                                    contentDescription = "", modifier = Modifier.size(40.dp,40.dp)
                                )
                            },
                            selectedContentColor = Color.Black,
                            unselectedContentColor = Color.White
                        )
                        BottomNavigationItem(
                            selected = bottomBarItem.value == 2,
                            onClick = {
                                bottomBarItem.value =2
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_person),
                                    contentDescription = "", modifier = Modifier.size(40.dp,40.dp)
                                )
                            },
                            selectedContentColor = Color.Black,
                            unselectedContentColor = Color.White
                        )
                    }
                }
            )
        }
    ) 

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SuperMarketAppTheme {
        HomePage()
    }
}