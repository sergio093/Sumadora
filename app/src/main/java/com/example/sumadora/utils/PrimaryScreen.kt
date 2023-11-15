package com.example.sumadora.utils

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
//import androidx.compose.material3.LocalNavController
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sumadora.Model.OperacionRepository
import com.example.sumadora.R
import com.example.sumadora.ui.theme.SumadoraTheme
import java.text.NumberFormat

@Composable
fun Sumador() {
    //val navController = LocalNavController.current

    var numero1Input by remember { mutableStateOf("") }
    var numero2Input by remember { mutableStateOf("") }
    val numero1 = numero1Input.toIntOrNull() ?: 0
    val numero2 = numero2Input.toIntOrNull() ?: 0
    val result = calculate(numero1, numero2)

    Column(
        modifier = Modifier
            .padding(40.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.sumador),
            modifier = Modifier
                .padding(bottom = 16.dp)
                .align(alignment = Alignment.Start)
        )

        EditNumber(
            label = R.string.numero1,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            value = numero1Input,
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth(),
        )

        EditNumber(
            label = R.string.numero2,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            value = numero2Input,
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth(),
        )

        Button(
            onClick = {
                //navController.navigate("SecondScreen")
            },
            modifier = Modifier.widthIn(min = 250.dp)
        ) {
            Text(
                text = stringResource(R.string.boton)
            )
        }
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun EditNumber(
    @StringRes label: Int,
    keyboardOptions: KeyboardOptions,
    value: String,
    modifier: Modifier = Modifier
) {
    TextField(
        value = value,
        singleLine = true,
        onValueChange = {},
        modifier = modifier,
        keyboardOptions = keyboardOptions
    )
}

@Composable
fun CustomText(
    @StringRes textResource: Int,
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

@VisibleForTesting
internal fun calculate(numero1: Int, numero2: Int): String {
    var operation = numero1 + numero2
    /*if (suma) {
        operation = kotlin.math.ceil(operation.toDouble())
    }*/
    return NumberFormat.getCurrencyInstance().format(operation)
}



@Preview(showBackground = true)
@Composable
fun SumadoraPreview() {
    SumadoraTheme {
            Sumador()

        }
    }

