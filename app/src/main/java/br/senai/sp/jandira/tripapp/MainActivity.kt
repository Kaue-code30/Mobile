package br.senai.sp.jandira.tripapp

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.tripapp.ui.theme.TripAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripAppTheme {

                TripAppScreen()
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable



fun TripAppScreen(){

    var emailState by rememberSaveable {
        mutableStateOf("")
    }


    Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),


                ) {

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        modifier = Modifier
                            .width(120.dp)
                            .height(50.dp),
                        backgroundColor = Color(207, 6, 240),
                        shape = RoundedCornerShape(bottomStart = 18.dp)

                    ) {}

                }

                Row(
                    Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(20.dp)
                        .padding(top = 50.dp),
                        verticalAlignment = Alignment.Top,
                        horizontalArrangement = Arrangement.Start
                ) {
                    Column() {
                        Text(
                            text = stringResource(id = R.string.Login_title),
                            fontSize = 40.sp, color = Color(207, 6, 240),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = stringResource(
                                id = R.string.sub_title),
                                color = Color(160, 156, 156)
                        )

                    }
                }

                Column(modifier = Modifier.fillMaxWidth()) {


                    OutlinedTextField(
                        modifier = Modifier
                            .padding(20.dp)
                            .fillMaxWidth(),
                        value = emailState,
                        onValueChange = {},
                        label = { Text(text = stringResource(id = R.string.e_mail))}
                    )
                    OutlinedTextField(
                        modifier = Modifier
                            .padding(20.dp)
                            .fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        label = { Text(text = stringResource(id = R.string.password))}
                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Column(
                        modifier = Modifier,
                        horizontalAlignment = Alignment.End
                    ) {
                        Button(
                            modifier = Modifier
                                .background(color = Color.White)
                                .width(100.dp)
                                .height(40.dp),

                            colors = ButtonDefaults . buttonColors ( backgroundColor = Color(207, 6, 240) ),
                            shape = RoundedCornerShape(13.dp),
                            onClick = {  }
                        ) {
                            Text(
                                modifier = Modifier, color = Color.White,
                                fontSize = 13.sp,
                                text = stringResource(id = R.string.sign_in))
                        }
                        Row(
                            modifier = Modifier.padding(10.dp),
                            horizontalArrangement = Arrangement.Center,
                            Alignment.CenterVertically
                        ) {
                            Text(
                                modifier = Modifier.padding(5.dp),
                                color = Color(160, 156, 156),
                                text = stringResource(id = R.string.dont_have))

                            val teste = "teste"
                            ClickableText(
                                modifier = Modifier,
                                text = AnnotatedString(stringResource(id = R.string.sing_up)),
                                onClick ={

                                },
                                style = TextStyle(
                                    color = Color(207, 6, 240),
                                    fontSize = 13.sp,

                                 ))
                        }

                    }
                }

                Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom) {
                    Card(
                        modifier = Modifier
                            .width(120.dp)
                            .height(50.dp),

                        backgroundColor = Color(207, 6, 240),
                        shape = RoundedCornerShape(topEnd = 18.dp)

                    ) {}
                    
                }
        }
    }
}
