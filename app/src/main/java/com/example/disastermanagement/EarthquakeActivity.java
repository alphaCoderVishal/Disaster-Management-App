package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class EarthquakeActivity extends AppCompatActivity {
    TextView EarthquakeTextView;
    private String str="DO's\n" +
            "1. Drop, Cover, & hold on, moving as little as possible.\n" +
            "2. Be prepared- keep household fixtures locked down & know Evacuation plan.\n" +
            "3. Be aware of aftershocks, and each time. Drop and Cover.\n" +
            "4. If indoors, stay in bed- curl up & hold on protecting head with pillow.\n" +
            "5. If outdoors, find a clear spot & drop to ground until shaking stops.\n" +
            "If in a moving vehicle:\n" +
            "1. Stop as quickly as safety permits and stay in the vehicle. Avoid stopping under or near buildings,trees,overpasses and utility wires.\n" +
            "2. Proceed cautiously once the earthquake has stopped. Avoid roads, bridges, and ramps that might have been damaged by earthquake. \n" +
            "\n" +
            "DON'Ts\n" +
            "1. Think it’s over too soon. (Aftershocks, landslides & tsunamis are possible)\n" +
            "2. If outdoors, go by cliffs or slopes & if you are be alert of falling rock/debris.\n" +
            "3. If outdoors, get out of the vehicle.\n" +
            "4. Go outdoors- stay inside until you are sure it is safe to exit.\n" +
            "5. Go by windows- you may be injured by shattered glass. \n" +
            "6. If trapped under debris , do not light a\n" +
            " match.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        EarthquakeTextView=(TextView) findViewById(R.id.EarthquaketxtView);
        printText();

    }
    void printText(){
        EarthquakeTextView.setMovementMethod(new ScrollingMovementMethod());
        EarthquakeTextView.setText(str);

    }
}