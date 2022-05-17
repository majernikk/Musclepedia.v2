package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import sk.spse.musclepediav2.R;

public class ActivityLowerBack extends AppCompatActivity {

    private Toolbar toolbar2;
    private TextView cvik1;
    private TextView cvik2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        toolbar2 =(Toolbar)findViewById(R.id.toolbar2);
        TextView cvik1=(TextView)findViewById(R.id.cvik1);
        TextView cvik2=(TextView)findViewById(R.id.cvik2);
        toolbar2.setTitle("Lower Back");
        cvik1.setText("45 Degree Back Extension");
        cvik2.setText("Deadlift");
        Toast.makeText(getApplicationContext(), "We are moved to Lower Back Activity",Toast.LENGTH_LONG).show();

    }
}