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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.model.content.CircleShape
import shamsiddin.project.arithmetic.navigation.NavGraph
import shamsiddin.project.arithmetic.navigation.Screens
import shamsiddin.project.arithmetic.ui.theme.ArithmeticTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            val navController = rememberNavController()
            NavGraph(navController = navController)
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFD5FAE5)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // "New Game" button
                Button(onClick = {
                   navController.navigate(Screens.NewActivity.route) },
                    colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF263539)
                ),
                    shape = RoundedCornerShape(20.dp)) {
                    Text(text = "New Game", color = Color(0xFF5AE3AA))
                }

                // Spacer to add some separation between buttons
                Spacer(modifier = Modifier.height(16.dp))

                // "Records" button
                Button(onClick = {

                    navController.navigate(Screens.Records.route)

                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1B3134)
                ), shape = RoundedCornerShape(20.dp)) {
                    Text(text = "Records", color = Color(0xFF5AE3AA))
                }



            }
        }
    }
}