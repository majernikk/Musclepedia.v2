package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityForearms extends AppCompatActivity {

    private TextView cvik1;
    private TextView popis1;
    private TextView cvik2;
    private TextView popis2;
    private ImageView imageView;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        Toolbar toolbar2 =(Toolbar)findViewById(R.id.toolbar2);
        cvik1=(TextView)findViewById(R.id.cvik1);
        popis1=(TextView)findViewById(R.id.popis1);
        cvik2=(TextView)findViewById(R.id.cvik2);
        popis2=(TextView)findViewById(R.id.popis2);
        toolbar2.setTitle("Forearms");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Barbell Wrist Curl");
        popis1.setText("Grip the dumbbell with your palm facing upwards with your forearm rested against the bench. Slowly curl your wrist upwards in a semicircular motion. Return to starting position and repeat.");
        cvik2.setText("Wrist Curl");
        popis2.setText("Stand up straight with a kettlebell in both hands in front of your pelvis, with your forearms facing outwards. Flex your wrist towards your body until the kettlebell is level with your stomach. Lower to the starting position and repeat.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.forearmscvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.forearmscvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Forearms Activity",Toast.LENGTH_LONG).show();

    }
}