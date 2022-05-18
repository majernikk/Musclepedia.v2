package sk.spse.musclepediav2.MuscleActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityLats extends AppCompatActivity {

    private TextView cvik1;
    private TextView popis1;
    private TextView cvik2;
    private TextView popis2;
    private ImageView imageView;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Toolbar toolbar2 =(Toolbar)findViewById(R.id.toolbar2);
        cvik1=(TextView)findViewById(R.id.cvik1);
        popis1=(TextView)findViewById(R.id.popis1);
        cvik2=(TextView)findViewById(R.id.cvik2);
        popis2=(TextView)findViewById(R.id.popis2);
        toolbar2.setTitle("Lats");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Bent Over Barbell Row");
        popis1.setText("Grab a barbell with a shoulder width pronated or supinated grip. Bend forward at your hips while maintaining a flat back. Pull the weight toward your upper abdomen. Lower the weight in a controlled manner and repeat.");
        cvik2.setText("Pull Ups");
        popis2.setText("Grasp the bar with an overhand grip, arms and shoulders fully extended. Pull your body up until your chin is above the bar. Lower your body back to starting position.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.latscvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.latscvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Lats Activity",Toast.LENGTH_LONG).show();

    }
}