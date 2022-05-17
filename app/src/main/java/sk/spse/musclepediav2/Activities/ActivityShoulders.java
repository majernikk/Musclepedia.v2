package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityShoulders extends AppCompatActivity {

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
        toolbar2.setTitle("Shoulders");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Barbell Overhead Press");
        popis1.setText("Start the barbell across your upper chest below your chin. Raise the barbell upwards and pause at the contracted position above your head. Lower the weights back to starting position.");
        cvik2.setText("Side Lateral Raises");
        popis2.setText("Stand up straight with dumbbells at either side, palms facing your hips. Raise your arms on either side with a slight bend in your elbow until they are parallel with the floor. Pause at the top of the motion. Slowly return your arms down to starting position.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.chestcvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.chestcvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Shoulders Activity",Toast.LENGTH_LONG).show();

    }
}