package sk.spse.musclepediav2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

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

public class ZoznamActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ArrayAdapter<String> mAdapter;
    ListView mListView;
    TextView mEmptyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoznam);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mListView = (ListView) findViewById(R.id.list);
        mEmptyView = (TextView) findViewById(R.id.emptyView);

        mAdapter = new ArrayAdapter<String>(ZoznamActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.muscles_array));
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(adapterView.getItemAtPosition(i).toString());
                switch (adapterView.getItemAtPosition(i).toString()) {
                    case "Abdominals":
                        startActivity(new Intent(ZoznamActivity.this, ActivityAbdominals.class));
                        break;
                    case "Biceps":
                        startActivity(new Intent(ZoznamActivity.this, ActivityBiceps.class));
                        break;
                    case "Calves":
                        startActivity(new Intent(ZoznamActivity.this, ActivityCalves.class));
                        break;
                    case "Chest":
                        startActivity(new Intent(ZoznamActivity.this, ActivityChest.class));
                        break;
                    case "Forearms":
                        startActivity(new Intent(ZoznamActivity.this, ActivityForearms.class));
                        break;
                    case "Glutes":
                        startActivity(new Intent(ZoznamActivity.this, ActivityGlutes.class));
                        break;
                    case "Hamstrings":
                        startActivity(new Intent(ZoznamActivity.this, ActivityHamstrings.class));
                        break;
                    case "Lats":
                        startActivity(new Intent(ZoznamActivity.this, ActivityLats.class));
                        break;
                    case "Lower Back":
                        startActivity(new Intent(ZoznamActivity.this, ActivityLowerBack.class));
                        break;
                    case "Quads":
                        startActivity(new Intent(ZoznamActivity.this, ActivityQuads.class));
                        break;
                    case "Shoulders":
                        startActivity(new Intent(ZoznamActivity.this, ActivityShoulders.class));
                        break;
                    case "Traps":
                        startActivity(new Intent(ZoznamActivity.this, ActivityTraps.class));
                        break;
                    case "Triceps":
                        startActivity(new Intent(ZoznamActivity.this, ActivityTriceps.class));
                        break;
                    case "Upper Back":
                        startActivity(new Intent(ZoznamActivity.this, ActivityUpperBack.class));
                        break;
                }
            }
        });
        mListView.setEmptyView(mEmptyView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        MenuItem mSearch = menu.findItem(R.id.action_search);
        SearchView mSearchView = (SearchView) mSearch.getActionView();
        mSearchView.setQueryHint("Hľadať..");

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
}
