package sk.spse.musclepediav2.MuscleActivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityGlutes extends AppCompatActivity {

    private TextView cvik1;
    private TextView popis1;
    private TextView cvik2;
    private TextView popis2;
    private ImageView imageView;
    private ImageView imageView2;
    private TextView link1;
    private TextView link2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Toolbar toolbar2 =(Toolbar)findViewById(R.id.toolbar2);
        cvik1=(TextView)findViewById(R.id.cvik1);
        popis1=(TextView)findViewById(R.id.popis1);
        cvik2=(TextView)findViewById(R.id.cvik2);
        popis2=(TextView)findViewById(R.id.popis2);
        link1=(TextView)findViewById(R.id.link1);
        link2=(TextView)findViewById(R.id.link2);
        link1.setText("Video: https://youtu.be/Zp26q4BY5HE");
        link2.setText("Video: https://youtu.be/JCXUYuzwNrM");
        toolbar2.setTitle("Glutes");
        setSupportActionBar(toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        cvik1.setText("Barbell Hip Thrust");
        popis1.setText("Sit on the ground with a bench behind you. Have the barbell over your legs just above your hips. Lean back against the bench so that your shoulders are resting upon it, stretch your arms out to either side using the bench as support. Raise the weight by driving through your feet and extending your hips upwards. Support the weight with your shoulders and feet. Slowly extend as far as you can, and then slowly return to the starting position.");
        cvik2.setText("Romanian Deadlift");
        popis2.setText("Start with a straight bar or ez bar attachment set to the bottom of the machine. Squat the weight up into a standing position and walk a few steps back Push your butt back to initiate the movement and then push your butt forward until you're back in a standing position. To protect yourself from injury, always maintain a flat back on any exercise.");
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.glutescvik1);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.glutescvik2);
        Toast.makeText(getApplicationContext(), "We are moved to Glutes Activity",Toast.LENGTH_LONG).show();

    }
}