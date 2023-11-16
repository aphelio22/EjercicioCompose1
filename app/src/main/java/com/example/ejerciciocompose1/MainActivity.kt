package com.example.ejerciciocompose1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejerciciocompose1.ui.theme.EjercicioCompose1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjercicioCompose1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(par1 = getString(R.string.par1), par2 = stringResource(R.string.par2), par3 = stringResource(R.string.par3))
                }
            }
        }
    }
}

@Composable
fun GreetingImage(par1: String, par2: String, par3: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

Column {
    Image(
        painter = image,
        contentDescription = null,
    )
    GreetingText(par1 = par1, par2 = par2, par3 = par3, modifier = Modifier
        .fillMaxSize()
        .padding(6.dp))
}
}

@Composable
fun GreetingText(par1: String, par2: String, par3: String, modifier: Modifier){
    Text(text = par1,
        fontSize = 24.sp,
        lineHeight = 16.sp,
        textAlign = TextAlign.Start,
        modifier = Modifier.padding(8.dp),
        textDecoration = TextDecoration.Underline)

    Text(text = par2,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        textAlign = TextAlign.Start,
        modifier = Modifier.padding(8.dp))

    Text(text = par3,
        fontSize = 16.sp,
        lineHeight = 16.sp,
        textAlign = TextAlign.Start,
        modifier = Modifier.padding(8.dp))

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjercicioCompose1Theme {
        GreetingImage(par1 = stringResource(R.string.par1), par2 = stringResource(R.string.par2), par3 = stringResource(
            R.string.par3
        )
        )
    }
}