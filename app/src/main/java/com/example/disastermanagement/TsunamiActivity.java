package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class TsunamiActivity extends AppCompatActivity {
    TextView TsunamiTextView;
    String str="Tsunami – Top 5 DO’s\n" +
            "1. Remain calm\n" +
            "2. If there is an earthquake too, protect yourself from falling debris first.\n" +
            "3. Immediately head inland & to higher ground.\n" +
            "4. Know whether you are in a tsunami hazard zone or not.\n" +
            "5. Know where the nearest tsunami escape route is. \n" +
            "Top 5 DON’TS\n" +
            "1. Rush to the beach to see the Big wave.\n" +
            "2. Rush to the beach after the first wave to see what has washed up on shore.\n" +
            "3. Wait for a bus or car to take you to higher ground- (get out of the zone as quickly as possible, ideally by foot)\n" +
            "4. Stop to pack your valuables (you may not have time).\n" +
            "5. Wait for an official warning if you feel an earthquake that lasts a minute or more. (By the time the warning is issued, it may be too late) ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsunami);
        TsunamiTextView=(TextView)findViewById(R.id.tsunamiTxtView);
        printText();


    }
    void printText(){
        TsunamiTextView.setMovementMethod(new ScrollingMovementMethod());
        TsunamiTextView.setText(str);
    }
}