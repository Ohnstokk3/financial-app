package com.example.financemobile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CardScreen(modifier: Modifier){
Card(modifier = Modifier.size(width = 500.dp, height = 800.dp).padding(start = 15.dp, end = 15.dp, top = 8.dp)) {
    Column(modifier = Modifier.fillMaxSize().padding(top = 100.dp),
            verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            painter = painterResource(id = R.drawable.thisiswhatiwant),
            contentDescription = "",
            modifier = Modifier
                .size(250.dp)
                .clip(CircleShape)

        )
        Text(text = "Lets get started")
        Text(text = "Never a better time than now to start\n thinking about how you manage all your\n" +
                "finances with ease" )
        Column (modifier=Modifier.fillMaxSize(),verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally){
            Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
                Text("Create Account")
            }
            Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
                Text("Login to Account")
            }
        }
    }
}
}