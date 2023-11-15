package com.example.sumadora.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sumadora.R
import com.example.sumadora.ui.theme.SumadoraTheme

@Composable
fun ScreenResult() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 16.dp)
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = R.string.operacion,
            fontSize = 50.sp,
            colorStyle = colorResource(R.color.black)
        )
    }
}

@Composable
fun Text(
    textResource: Int.Companion,
    modifier: Modifier = Modifier,
    fontSize: Int = 16,
    colorStyle: Color = colorResource(R.color.black)
) {
    Text(
        text = textResource,
        fontSize = fontSize.sp,
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
