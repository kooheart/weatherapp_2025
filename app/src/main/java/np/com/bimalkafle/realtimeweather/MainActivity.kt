package np.com.bimalkafle.realtimeweather

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import np.com.bimalkafle.realtimeweather.ui.theme.RealtimeWeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(this@MainActivity, "Login successful!", Toast.LENGTH_SHORT).show()

        super.onCreate(savedInstanceState)

        val weatherViewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")


        setContent {
            RealtimeWeatherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   WeatherPage(weatherViewModel)
                }
            }
        }
    }
}

