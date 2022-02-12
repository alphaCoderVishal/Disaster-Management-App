package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Guideline extends AppCompatActivity {
    ImageButton TsunamiBtn;
    ImageButton VolcanoBtn;
    ImageButton LandSlideBtn;
    ImageButton EarthquakeBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
        TsunamiBtn=(ImageButton) findViewById(R.id.tsunamibutton);
        TsunamiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start Tsunami Activity
                Intent intent1 =new Intent(Guideline.this,TsunamiActivity.class);
                startActivity(intent1);
            }
        });
        EarthquakeBtn=(ImageButton) findViewById(R.id.earthquakeBtn);
        EarthquakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start Tsunami Activity
                Intent intent2 =new Intent(Guideline.this,EarthquakeActivity.class);
                startActivity(intent2);
            }
        });

        LandSlideBtn=(ImageButton) findViewById(R.id.landslideBtn);
        LandSlideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start Tsunami Activity
                Intent intent3 =new Intent(Guideline.this,LandslideActivity.class);
                startActivity(intent3);
            }
        });
        VolcanoBtn=(ImageButton) findViewById(R.id.volcanoBtn);
        VolcanoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //start Tsunami Activity
                Intent intent4 =new Intent(Guideline.this,VolcanoActivity.class);
                startActivity(intent4);
            }
        });
    }
}