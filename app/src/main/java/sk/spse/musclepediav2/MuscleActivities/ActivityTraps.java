package sk.spse.musclepediav2.MuscleActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityTraps extends AppCompatActivity {

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
        toolbar2.setTitle("Traps");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("30 Degree Shrug");
        popis1.setText("Use a handle attachment on both sides of crossover. With cable attachment set all the way to the bottom. Grab both handles and make sure you are centered in the machine. Let your arms hang freely. Pull your shoulder blades up and in towards your ears. Let your shoulder blades depress back to the starting position.");
        cvik2.setText("Seated DB Shrugs");
        popis2.setText("Sit on a bench with dumbbells in both hands, palms facing your body, back straight. Elevate your shoulders and hold the contracted position at the apex of the motion. Slowly lower your shoulders back to starting position.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.trapscvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.trapscvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Traps Activity",Toast.LENGTH_LONG).show();

    }
}