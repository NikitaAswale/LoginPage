

package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginapp.ui.theme.LoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginAppTheme {
                LoginPage()
            }
        }
    }
}

@Composable
fun LoginPage(){
    var loginName by remember{ mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(painter = painterResource(id = R.drawable.ellipse), contentDescription = "Login Image",
            modifier = Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Welcome back",fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account", fontSize = 12.sp,
            fontWeight =FontWeight.Normal )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = loginName, onValueChange = {loginName=it}, label = {
            Text(text = "Login Name")
        })

        Spacer(modifier = Modifier.height(6.dp))

        OutlinedTextField(value = password, onValueChange = {password=it}, label ={
            Text(text ="Password")
        }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(6.dp))

        Button(onClick = {}, modifier = Modifier.width(120.dp).height(50.dp)) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Sign Up | Forgot Password ?", modifier = Modifier.clickable {  })
    }

}

@Preview(showBackground = true)
@Composable
fun LoginPagePreview() {
    LoginPage()
    }