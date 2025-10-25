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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Icons.Filled.ArrowForwardIos: ImageVector

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

        WarkopMenuButton(
            text = stringResource(id = R.string.capybara),
            painter = painterResource(id = R.drawable.capybaraboba_removebg_preview),
            backgroundColor = colorResource(id = R.color.ijoMuda),
            contentColor = colorResource(id = R.color.ijoTua)
        )

        Spacer(modifier = Modifier.height(height = 16.dp))

        WarkopMenuButton(
            text = stringResource(id = R.string.kucing),
            painter = painterResource(id = R.drawable.kucing_matcha_removebg_preview),
            backgroundColor = colorResource(id = R.color.ijoMuda),
            contentColor = colorResource(id = R.color.ijoTua)
        )

        Spacer(modifier = Modifier.height(height = 16.dp))

        WarkopMenuButton(
            text = stringResource(id = R.string.kelinci),
            painter = painterResource(id = R.drawable.rabbit_removebg_preview),
            backgroundColor = colorResource(id = R.color.ijoMuda),
            contentColor = colorResource(id = R.color.ijoTua)
        )


    }
}

@Composable
fun WarkopMenuButton (
    text: String,
    painter: Painter,
    backgroundColor: Color,
    contentColor: Color
){
    Card(
        modifier = Modifier
            .height(height = 60.dp)
            .fillMaxWidth(fraction = 1f),
        shape = RoundedCornerShape(50),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp)
        ){
            Image(
                painter = painter,
                contentDescription = text,
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(width = 16.dp))

            Text(
                text = text,
                fontSize = 16.sp,
                color = contentColor,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f)
            )

            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = null,
                tint = Color.Gray,
                modifier = Modifier.size(16.dp)
            )
        }

    }
}

