package com.example.sumadora.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sumadora.Model.OperacionRepository
import com.example.sumadora.R
import com.example.sumadora.ui.theme.SumadoraTheme

fun ScreenResult() {
    Column(
        modifier = Modifier
            .padding(all = 16.dp)
            .padding(top = 20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                textResource = R.string.operacion,
                fontSize = 50,
                colorStyle = colorResource(R.color.black)
            )
        }


    }
    }

@Composable
fun Text(
    textResource: Int,
    modifier: Modifier = Modifier,
    fontSize: Int = 16,
    colorStyle: Color = colorResource(R.color.black)
) {
    Text(
        text = stringResource(textResource),
        fontSize = fontSize.sp,
        style = TextStyle(
            color = colorStyle
        ),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ResultPreview() {
    SumadoraTheme {
        ScreenResult()
    }
}