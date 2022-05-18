package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityChest extends AppCompatActivity {

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
        toolbar2.setTitle("Chest");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Barbell Bench Press");
        popis1.setText("Lay flat on the bench with your feet on the ground. With straight arms unrack the bar. Lower the bar to your mid chest. Raise the bar until you've locked your elbows.");
        cvik2.setText("Dumbbell Flys");
        popis2.setText("Lay flat on the bench and place your feet on the ground. Begin the exercise with the dumbbells held together above your chest, elbows slightly bent. Simultaneously lower the weights to either side. Pause when the weights are parallel to the bench, then raise your arms to the starting position.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.chestcvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.chestcvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Chest Activity",Toast.LENGTH_LONG).show();

    }
}