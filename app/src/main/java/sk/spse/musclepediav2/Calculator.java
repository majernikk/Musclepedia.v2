package sk.spse.musclepediav2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Objects;

public class Calculator extends AppCompatActivity {
    Button calc_btn;
    TextView a, b, c, d, e, f;
    EditText p, q, r, s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.calculatorxml);

        calc_btn = findViewById(R.id.calculate_btn);
        a = findViewById(R.id.cal_maintain);
        b = findViewById(R.id.cal_bulk);
        c = findViewById(R.id.cal_cut);
        d = findViewById(R.id.mac_protein);
        e = findViewById(R.id.mac_carb);
        f = findViewById(R.id.mac_fat);
        p=findViewById(R.id.editAge);
        q=findViewById(R.id.editHeight);
        r=findViewById(R.id.editWeight);
        s=findViewById(R.id.editGender);


        calc_btn.setOnClickListener(v -> {
            if (
                    !(p.getText().toString().isEmpty()) &&
                    !(q.getText().toString().isEmpty()) &&
                    !(r.getText().toString().isEmpty()) &&
                    !(s.getText().toString().isEmpty())
            ){
                decide();
            }
            else Toast.makeText(getApplicationContext(), "Enter all values", Toast.LENGTH_SHORT).show();
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("VEK",p.getText().toString());
        outState.putString("VYSKA",q.getText().toString());
        outState.putString("VAHA",r.getText().toString());
        outState.putString("POHLAVIE",s.getText().toString());
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        // get values from saved state
        p.setText(savedInstanceState.getString("VEK"));
        q.setText(savedInstanceState.getString("VYSKA"));
        r.setText(savedInstanceState.getString("VAHA"));
        s.setText(savedInstanceState.getString("POHLAVIE"));
        super.onRestoreInstanceState(savedInstanceState);
        decide();
    }
    private void decide(){
        if (
                !(p.getText().toString().isEmpty()) &&
                !(q.getText().toString().isEmpty()) &&
                !(r.getText().toString().isEmpty()) &&
                !(s.getText().toString().isEmpty())
        ){
            String gender = s.getText().toString();
            if (gender.equalsIgnoreCase("M")) {
                malecheck();
            } else if (gender.equalsIgnoreCase("F")) {
                femaleCheck();
            } else {
                noUse();
            }
        }
    }

    private void noUse()
    {
        Toast.makeText(getApplicationContext(),"Enter gender in correct form",Toast.LENGTH_SHORT).show();
        /*a.setText("-----------------");
        b.setText("-----------------");
        c.setText("-----------------");
        d.setText("-----------------");
        e.setText("-----------------");
        f.setText("-----------------");*/
    }

    private void femaleCheck() {
        double wt1 = Double.parseDouble(r.getText().toString());
        double ht1 = Double.parseDouble(q.getText().toString());
        double age1 = Double.parseDouble(p.getText().toString());
        double formula2, formula3, formula4, formula5,formula6, result, bulk, cut, protein, carbohydrates, fat;
        formula3 = 1.9 * ht1;
        formula5 = 4.7*age1;
        formula4 = formula3/formula5;
        formula6 = 9.6 * wt1;
        formula2 = 665.1 + formula6 + formula4;
        result = formula2 * 1.3;
        a.setText(String.valueOf(Math.round(result)));
        bulk = result + 400;
        b.setText(String.valueOf(Math.round(bulk)));
        cut = result - 400;
        c.setText(String.valueOf(Math.round(cut)));
        protein = (0.4 * result) / 4;
        d.setText(String.valueOf(Math.round(protein)));
        carbohydrates = (0.6 * result) / 4;
        e.setText(String.valueOf(Math.round(carbohydrates)));
        fat = (0.2 * result) / 9;
        f.setText(String.valueOf(Math.round(fat)));

    }

    private void malecheck()
    {
        double wt1 = Double.parseDouble(r.getText().toString());
        double ht1 = Double.parseDouble(q.getText().toString());
        double age1 = Double.parseDouble(p.getText().toString());
        double formula2, formula3, formula4, formula5,formula6, result, bulk, cut, protein, carbohydrates, fat;
        formula6 = 13.8 * wt1;
        formula4 = 6.8*age1;
        formula3 = 5*ht1;
        formula5 = formula3/formula4;
        formula2 = 66.5 + formula6 + formula5;
        result = formula2 * 1.3;
        a.setText(String.valueOf(Math.round(result)));
        bulk = result + 500;
        b.setText(String.valueOf(Math.round(bulk)));
        cut = result - 500;
        c.setText(String.valueOf(Math.round(cut)));
        protein = (0.4 * result) / 4;
        d.setText(String.valueOf(Math.round(protein)));
        carbohydrates = (0.6 * result) / 4;
        e.setText(String.valueOf(Math.round(carbohydrates)));
        fat = (0.2 * result) / 9;
        f.setText(String.valueOf(Math.round(fat)));
    }
}
