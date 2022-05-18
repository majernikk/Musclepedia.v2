package sk.spse.musclepediav2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import sk.spse.musclepediav2.Activities.ActivityAbdominals;
import sk.spse.musclepediav2.Activities.ActivityBiceps;
import sk.spse.musclepediav2.Activities.ActivityCalves;
import sk.spse.musclepediav2.Activities.ActivityChest;
import sk.spse.musclepediav2.Activities.ActivityForearms;
import sk.spse.musclepediav2.Activities.ActivityGlutes;
import sk.spse.musclepediav2.Activities.ActivityHamstrings;
import sk.spse.musclepediav2.Activities.ActivityLats;
import sk.spse.musclepediav2.Activities.ActivityLowerBack;
import sk.spse.musclepediav2.Activities.ActivityQuads;
import sk.spse.musclepediav2.Activities.ActivityShoulders;
import sk.spse.musclepediav2.Activities.ActivityTraps;
import sk.spse.musclepediav2.Activities.ActivityTriceps;
import sk.spse.musclepediav2.Activities.ActivityUpperBack;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ArrayAdapter<String> mAdapter;
    ListView mListView;
    TextView mEmptyView;
    ImageView fullbody;
   // ImageView IVtrapsleft;
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

        mListView = (ListView) findViewById(R.id.list);
        mEmptyView = (TextView) findViewById(R.id.emptyView);

        mAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.muscles_array));
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(adapterView.getItemAtPosition(i).toString());
                switch (adapterView.getItemAtPosition(i).toString()) {
                    case "Abdominals":
                        startActivity(new Intent(MainActivity.this, ActivityAbdominals.class)); break;
                    case "Biceps":
                        startActivity(new Intent(MainActivity.this, ActivityBiceps.class)); break;
                    case "Calves":
                        startActivity(new Intent(MainActivity.this, ActivityCalves.class)); break;
                    case "Chest":
                        startActivity(new Intent(MainActivity.this, ActivityChest.class)); break;
                    case "Forearms":
                        startActivity(new Intent(MainActivity.this, ActivityForearms.class)); break;
                    case "Glutes":
                        startActivity(new Intent(MainActivity.this, ActivityGlutes.class)); break;
                    case "Hamstrings":
                        startActivity(new Intent(MainActivity.this, ActivityHamstrings.class)); break;
                    case "Lats":
                        startActivity(new Intent(MainActivity.this, ActivityLats.class)); break;
                    case "Lower Back":
                        startActivity(new Intent(MainActivity.this, ActivityLowerBack.class));break;
                    case "Quads":
                        startActivity(new Intent(MainActivity.this, ActivityQuads.class)); break;
                    case "Shoulders":
                        startActivity(new Intent(MainActivity.this, ActivityShoulders.class)); break;
                    case "Traps":
                        startActivity(new Intent(MainActivity.this, ActivityTraps.class)); break;
                    case "Triceps":
                        startActivity(new Intent(MainActivity.this, ActivityTriceps.class)); break;
                    case "Upper Back":
                        startActivity(new Intent(MainActivity.this, ActivityUpperBack.class)); break;
                }
            }
        });

        mListView.setEmptyView(mEmptyView);
        fullbody.setImageDrawable(img1);
       // IVtrapsleft.setImageDrawable(trapsLeft);
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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);

        MenuItem mSearch = menu.findItem(R.id.action_search);

        SearchView mSearchView = (SearchView) mSearch.getActionView();
        mSearchView.setQueryHint("Search");

        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter().filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    public void lupa(View view) {
        fullbody.setVisibility(View.GONE);
        System.out.println("lupa");

    }
}