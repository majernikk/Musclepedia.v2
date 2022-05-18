package sk.spse.musclepediav2.MuscleActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityUpperBack extends AppCompatActivity {

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
        toolbar2.setTitle("Upper Back");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Dumbbell Row");
        popis1.setText("Place your right leg on the top end of the bench so that your knee and shin rest flat on the bench, your foot hanging off the end. Bend your torso towards the floor and support yourself with your right arm by placing your palm flat against the bench. Grip the weight with your left and, and pull it straight up to the side of your chest. Repeat the motion. Switch the supporting leg and arm to work the other side.");
        cvik2.setText("Seated Cable Row");
        popis2.setText("Sit with your back straight on the machine and grip the handles. Pull the handles back using your arms. Your legs and torso should be at a 90° angle. Push out your chest. Pull the handles towards your body until your hands are beside your abdomen.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.upperbackcvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.upperbackcvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Upper Back Activity",Toast.LENGTH_LONG).show();

    }
}