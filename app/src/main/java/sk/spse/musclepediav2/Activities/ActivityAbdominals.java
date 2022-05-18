package sk.spse.musclepediav2.Activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import sk.spse.musclepediav2.R;

public class ActivityAbdominals extends AppCompatActivity {

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
        toolbar2.setTitle("Abdominals");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Crunches");
        popis1.setText("Lay flat on your back with your knees bent and your feet flat on the ground, about a foot from your lower back. Place your fingertips on your temples with your palms facing out. Draw your belly into the base of your spine to engage the muscles, then raise your head and shoulders off the floor. Return to starting position and repeat.");
        cvik2.setText("Forearm Plank");
        popis2.setText("Place forearms on the ground with your elbows bent at a 90° angle aligned beneath your shoulders, with your arms parallel at shoulder-width. Your feet should be together, with only your toes touching the floor. Lift your belly off the floor and form a straight line from your heels to the crown of your head and hold.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.abscvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.abscvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Abdominals Activity",Toast.LENGTH_LONG).show();

    }
}