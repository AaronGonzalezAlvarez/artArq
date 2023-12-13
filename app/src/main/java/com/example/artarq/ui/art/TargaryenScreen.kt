package com.example.artarq.ui.art

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artarq.R
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun artTargaryen(viewModel: TargaryenViewModel = viewModel()) {
    val targaryenUiState by viewModel.uiState.collectAsState()
    Column(
        modifier = Modifier
            .background(Color.DarkGray)
            .padding(15.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            modifier = Modifier
                .background(Color.Gray)
                .padding(5.dp).width(300.dp).height(450.dp),
            painter = painterResource(id = targaryenUiState.img),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(15.dp))
        Column (
            modifier = Modifier
                .background(Color.Black)
                .padding(5.dp).fillMaxWidth()
        ){
            Text(
                text = stringResource(id = targaryenUiState.titulo),
                color = Color.Red,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = targaryenUiState.nameRey + " ("+ targaryenUiState.year+")",
                color = Color.White,
                fontSize = 15.sp,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
            )
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row (
            modifier = Modifier.padding(5.dp)
        ){
            Button(
                onClick = { viewModel.atras() }
            ) {
                Text(text = "atras")
            }
            Button(
                onClick = { viewModel.siguiente() }
            ) {
                Text(text = "siguiente")
            }
        }
    }
}