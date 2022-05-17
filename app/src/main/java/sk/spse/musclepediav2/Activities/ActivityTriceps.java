package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityTriceps extends AppCompatActivity {

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
        toolbar2.setTitle("Triceps");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Cable Push Downs");
        popis1.setText("Grip the pulley bar with palms facing down at shoulder width. Stand straight with a small forward incline. Keep your upper arms close to your body, and slowly bring the pulley bar down until your arms are fully extended. Pause when you are at the contracted position of the motion, then slowly raise the pulley bar back to the starting point.");
        cvik2.setText("Dips");
        popis2.setText("Hold your body with arms locked above the equipment Lower your body slowly while leaning forward, flare out your elbows Raise your body above the bars until your arms are locked.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.chestcvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.chestcvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Triceps Activity",Toast.LENGTH_LONG).show();

    }
}