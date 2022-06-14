package sk.spse.musclepediav2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;

import sk.spse.musclepediav2.MuscleActivities.ActivityAbdominals;
import sk.spse.musclepediav2.MuscleActivities.ActivityBiceps;
import sk.spse.musclepediav2.MuscleActivities.ActivityCalves;
import sk.spse.musclepediav2.MuscleActivities.ActivityChest;
import sk.spse.musclepediav2.MuscleActivities.ActivityForearms;
import sk.spse.musclepediav2.MuscleActivities.ActivityGlutes;
import sk.spse.musclepediav2.MuscleActivities.ActivityHamstrings;
import sk.spse.musclepediav2.MuscleActivities.ActivityLats;
import sk.spse.musclepediav2.MuscleActivities.ActivityLowerBack;
import sk.spse.musclepediav2.MuscleActivities.ActivityQuads;
import sk.spse.musclepediav2.MuscleActivities.ActivityShoulders;
import sk.spse.musclepediav2.MuscleActivities.ActivityTraps;
import sk.spse.musclepediav2.MuscleActivities.ActivityTriceps;
import sk.spse.musclepediav2.MuscleActivities.ActivityUpperBack;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ImageView fullbody;
    //ImageView IVtrapsleft;
    Drawable img1 ,trapsLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullbody = findViewById(R.id.fullbody);
       // IVtrapsleft=findViewById(R.id.trapsLeft);
        img1 = getResources().getDrawable(R.drawable.fullbody2);
        //trapsLeft = getResources().getDrawable(R.drawable.trapsleft);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
       // getSupportActionBar().setLogo(R.drawable.dumbbell_24_v2);
        fullbody.setImageDrawable(img1);
    }
    public void traps(View view){
        startActivity(new Intent(MainActivity.this, ActivityTraps.class));
    }
    public void pecs(View view){
        startActivity(new Intent(MainActivity.this, ActivityChest.class));
    }
    public void deltoids(View view){
        startActivity(new Intent(MainActivity.this, ActivityShoulders.class));
    }
    public void biceps(View view){
        startActivity(new Intent(MainActivity.this, ActivityBiceps.class));
    }
    public void obliques(View view){
        startActivity(new Intent(MainActivity.this, ActivityAbdominals.class));
    }
    public void forearms(View view){
        startActivity(new Intent(MainActivity.this, ActivityForearms.class));
    }
    public void quads(View view){
        startActivity(new Intent(MainActivity.this, ActivityQuads.class));
    }
    public void calves(View view){
        startActivity(new Intent(MainActivity.this, ActivityCalves.class));
    }
    public void upperBack(View view){
        startActivity(new Intent(MainActivity.this, ActivityUpperBack.class));
    }
    public void triceps(View view){
        startActivity(new Intent(MainActivity.this, ActivityTriceps.class));
    }
    public void lats(View view){
        startActivity(new Intent(MainActivity.this, ActivityLats.class));
    }
    public void lowerBack(View view){
        startActivity(new Intent(MainActivity.this, ActivityLowerBack.class));
    }
    public void glutes(View view){
        startActivity(new Intent(MainActivity.this, ActivityGlutes.class));
    }
    public void hamstrings(View view){
        startActivity(new Intent(MainActivity.this, ActivityHamstrings.class));
    }
    public void calculator(View view){
        startActivity(new Intent(MainActivity.this, Calculator.class));
    }

    public void zoznamOnClick(View view) {
        System.out.println("zoznam clicked");
        startActivity(new Intent(MainActivity.this, ZoznamActivity.class));
        System.out.println("zoznam running");
    }
}