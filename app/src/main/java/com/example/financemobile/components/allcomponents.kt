package com.example.financemobile.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.financemobile.R
@Composable
fun background(modifier: Modifier){
    Card(modifier = Modifier.size(width = 500.dp, height = 800.dp).padding(start = 15.dp, end = 15.dp, top = 8.dp)) {
        Column(
            modifier = Modifier.fillMaxSize().padding(top = 50.dp, start = 25.dp),
            verticalArrangement = Arrangement.Top,

        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(end = 46.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    Icons.Default.Menu,
                    contentDescription = ""
                )

                Icon(
                    Icons.Default.Notifications,
                    contentDescription = ""
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(id = R.drawable.img_20230802_190111_687),
                    contentDescription = "",
                    modifier = Modifier.size(50.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Column {
                    Text(text = "Ika Puspita sari")
                    Text(text = "@ikaPuspitasari")
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Card(
                modifier = Modifier.size(width = 300.dp, height = 200.dp)
                    .padding(end = 15.dp, top = 8.dp).background(color = Color.Red)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "My Balance")
                    Text(text = "$100,00")
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                    )
                    Icon(
                        Icons.Filled.Camera,
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                    )
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                    )
                    Icon(
                        Icons.Default.ShoppingCart,
                        contentDescription = "",
                        modifier = Modifier.size(80.dp)
                    )
                }

            }
            Spacer(modifier = Modifier.padding(20.dp))
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {

                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "",

                            )
                        Text(text = "E-shoping")
                    }
                    Row(
                        modifier = Modifier.padding(end = 27.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "",

                            )
                        Text(text = "E-shoping")
                    }

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {

                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "",

                            )
                        Text(text = "E-shoping")
                    }
                    Row(
                        modifier = Modifier.padding(end = 27.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "",

                            )
                        Text(text = "E-shoping")
                    }

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(horizontalArrangement = Arrangement.SpaceBetween) {

                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "",

                            )
                        Text(text = "E-shoping")
                    }
                    Row(
                        modifier = Modifier.padding(end = 27.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = "",

                            )
                        Text(text = "E-shoping")
                    }

                }
            }
        }
    }
}
