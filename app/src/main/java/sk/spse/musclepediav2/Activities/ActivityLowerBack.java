package sk.spse.musclepediav2.Activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import sk.spse.musclepediav2.R;

public class ActivityLowerBack extends AppCompatActivity {

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
        toolbar2.setTitle("Lower Back");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("45 Degree Back Extension");
        popis1.setText("Position your thighs on the padding and hook your feet on the platform supports. Keeping your back straight, slowly bend at your waist until your legs and back are at a 45° angle. Slowly raise your body to the starting position.");
        cvik2.setText("Deadlift");
        popis2.setText("Stand with your mid-foot under the bar and grip the bar with your hands, about a shoulder width apart. Bend your knees, then lift the bar by straightening your back. It is important to keep your back straight. Stand to your full height and hold. Lower the bar to the floor by bending your knees and keeping your back straight.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.chestcvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.chestcvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Lower Back Activity",Toast.LENGTH_LONG).show();

    }
}