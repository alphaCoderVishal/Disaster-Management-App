package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class VolcanoActivity extends AppCompatActivity {
    TextView Earthquake;
    String str="DO's\n" +
            "1. Bring in anything outside that can be picked up by wind.\n" +
            "2. Close and reinforce windows, & doors\n" +
            "3. Turn refrigerators & freezers to coldest setting, so food last longer.\n" +
            "4. Turn off propane tanks & unplug small appliances.\n" +
            "5. Fill your cars with gas. \n" +
            "Top 5 \n" +
            "DON'TS\n" +
            "1. Play outside.\n" +
            "2. Use your phone to talk to friends. (Available phone lines are dedicated to 1st responders)\n" +
            "3. Stock up on supplies the day of the hurricane.\n" +
            "4. Stay on a boat.\n" +
            "5. Drive. (There may be too many hazards on the road.) ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volcano);
        Earthquake=(TextView) findViewById(R.id.textViewVolcano);
        loadText();
    }
    public void loadText(){
        Earthquake.setMovementMethod(new ScrollingMovementMethod());
        Earthquake.setText(str);
    }
}