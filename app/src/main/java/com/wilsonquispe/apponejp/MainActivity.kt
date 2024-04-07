package com.wilsonquispe.apponejp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wilsonquispe.apponejp.ui.theme.JetpackComposeAppOneTheme
import com.wilsonquispe.apponejp.ui.theme.backgroundBox
import com.wilsonquispe.apponejp.ui.theme.blueDuo
import com.wilsonquispe.apponejp.ui.theme.greenDuo
import com.wilsonquispe.apponejp.ui.theme.greenShadowDuo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeAppOneTheme {
                greetings()
            }
        }
    }
}

@Composable
fun greetings(){
    Column (modifier = Modifier.padding(24.dp)) {
        var count by remember {
            mutableStateOf(0)
        }
        if (count > 0){
            Text(fontSize = 24.sp, text = "$count")
        }

        Button(onClick = {
            count++
        }) {
            Text(text = "AÑADIR +1")
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun GreetingPreview() {
    JetpackComposeAppOneTheme {
        greetings()
    }
}