package org.sopt.becomposemaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.sopt.becomposemaster.ui.theme.BeComposeMasterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeComposeMasterTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Introduce()
                }
            }
        }
    }
}

@Preview
@Composable
fun Introduce() {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(painter = painterResource(id = R.drawable.img_dabin),
            contentDescription = null,
            modifier = Modifier
                .wrapContentSize(),
            contentScale = ContentScale.Fit
        )

        Spacer(Modifier.height(16.dp))

        Text("안녕하세요")
        Text("안드로이드 초보 개발자")
        Text("문다빈입니다")
    }
}