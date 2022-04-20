package sk.spse.musclepediav2.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import sk.spse.musclepediav2.R;

public class ActivityTriceps extends AppCompatActivity {

    private TextView nazov;
    private TextView cvik1;
    private TextView cvik2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        TextView nazov=(TextView)findViewById(R.id.nazov);
        TextView cvik1=(TextView)findViewById(R.id.cvik1);
        TextView cvik2=(TextView)findViewById(R.id.cvik2);
        nazov.setText("Triceps");
        cvik1.setText("Cable Push Downs");
        cvik2.setText("Dips");
        Toast.makeText(getApplicationContext(), "We are moved to Triceps Activity",Toast.LENGTH_LONG).show();

    }
}