package com;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.coronatracker.R;

public class DetailActivity extends AppCompatActivity {


    private int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvDeaths,tvTodayDeaths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.informationList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);

        tvCountry.setText(AffectedCountries.informationList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.informationList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountries.informationList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.informationList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.informationList.get(positionCountry).getActiveCases());
        tvTodayCases.setText(AffectedCountries.informationList.get(positionCountry).getTodayCases());
        tvDeaths.setText(AffectedCountries.informationList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.informationList.get(positionCountry).getTodayDeaths());








    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
