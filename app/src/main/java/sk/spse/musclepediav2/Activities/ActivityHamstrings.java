package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityHamstrings extends AppCompatActivity {

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
        toolbar2.setTitle("Hamstrings");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Hamstring Curl");
        popis1.setText("Lay down on the machine, placing your legs beneath the padded lever. Position your legs so that the padded lever is below your calve muscles. Support yourself by grabbing the side handles of the machine, and slowly raise the weight with your legs, toes pointed straight. Pause at the apex of the motion, then slowly return to starting position.");
        cvik2.setText("Stiff Leg Deadlifts");
        popis2.setText("Stand with a barbell at your shins with your feet shoulder width apart. Bend forward at your hips and keep your knees as fully extended as possible. Grab the barbell and then extend your hips while maintaining a straight back. From the standing position, lower the weight in a controlled manner. You can either lower the weight to the floor or before you touch the floor, depending on your mobility.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.hamcvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.hamcvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Hamstrings Activity",Toast.LENGTH_LONG).show();

    }
}