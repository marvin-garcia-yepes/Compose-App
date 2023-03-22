package com.example.compose.login.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.R

@Composable
fun LoginScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Login(Modifier.align(Alignment.Center))
    }
}

@Composable
fun Login(modifier: Modifier) {
    Column(modifier = modifier) {
        ImageSintia(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(5.dp))
        EmailField()
        Spacer(modifier = Modifier.padding(5.dp))
        PasswordField()
        ConsolidatePassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(15.dp))
        LoginButton()
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xffff4303),
            disabledBackgroundColor = Color(0xfff78058),
            contentColor = Color.White,
            disabledContentColor = Color.White
        )
    ) {
        Text(text = "Ineciar sesion")

    }
}

@Composable
fun ConsolidatePassword(modifier: Modifier) {
    Text(
        text = "Olvidaste la contraseña?",
        modifier = modifier.clickable { },
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xfffb9600)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PasswordField() {
    TextField(
        value = "", onValueChange = {},
        placeholder = { Text(text = "Contraseña") },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xff636262),
            backgroundColor = Color(0xffdedddd),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EmailField() {
    TextField(
        value = "", onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(text = "Email") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color(0xff636262),
            backgroundColor = Color(0xffdedddd),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )

}

@Composable
fun ImageSintia(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.sintia),
        contentDescription = "Header",
        modifier = modifier
    )
}






