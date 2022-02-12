package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OptionsActivity extends AppCompatActivity {
    private ImageButton Guideline;
    private ImageButton callHelpline;
    private ImageButton ListStranded;
    private ImageButton showStrandedLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Guideline=(ImageButton) findViewById(R.id.guideline);
        Guideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start guideline activity
                Intent intent1=new Intent(OptionsActivity.this,Guideline.class);
                startActivity(intent1);
            }
        });
        callHelpline=(ImageButton) findViewById(R.id.callHelpline);
        callHelpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start guideline activity
                Intent intent2=new Intent(OptionsActivity.this,CallActivity.class);
                startActivity(intent2);
            }
        });

    }
}