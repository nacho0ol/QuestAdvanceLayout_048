package com.example.questadvancelayout_048

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WarkopAnabul(modifier: Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier= Modifier.height(height = 40.dp))

        val logo_company = painterResource(id = R.drawable.ellipse_48)
        Image(
            painter = logo_company,
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )


        Spacer(modifier = Modifier.height(height = 24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painterResource(id = R.drawable.instagram), contentDescription = null, modifier = Modifier.size(40.dp))
            Spacer(modifier = Modifier.width(width = 20.dp))
            Image(painterResource(id = R.drawable.tiktok), contentDescription = null, modifier = Modifier.size(40.dp))
            Spacer(modifier = Modifier.width(width = 20.dp))
            Image(painterResource(id = R.drawable.whatsapp), contentDescription = null, modifier = Modifier.size(40.dp))
            Spacer(modifier = Modifier.width(width = 20.dp))
            Image(painterResource(id = R.drawable.email), contentDescription = null, modifier = Modifier.size(40.dp))


        }

        Text(
            text = stringResource(id = R.string.company_name),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.ijoTua)
        )

        Text(
            text = stringResource(id = R.string.username),
            fontSize = 16.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(height = 8.dp))

        Text(
            text = stringResource(id = R.string.slogan),
            fontSize = 14.sp,
            color = colorResource(id = R.color.item),
            textAlign = TextAlign.Center
        )



    }
}