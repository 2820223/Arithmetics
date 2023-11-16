package shamsiddin.project.arithmetic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class RecordsActivity: ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFD5FAE5)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // "New Game" button
                Button(onClick = {
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5AE3AA)
                ),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Text(text = "New Game", color = Color(0xFF263539))
                }

                // Spacer to add some separation between buttons
                Spacer(modifier = Modifier.height(16.dp))

                // "Records" button
                Button(onClick = {



                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5AE3AA)
                ), shape = RoundedCornerShape(20.dp)
                ) {
                    Text(text = "Records", color = Color(0xFF1B3134))
                }


            }
        }
    }

}
