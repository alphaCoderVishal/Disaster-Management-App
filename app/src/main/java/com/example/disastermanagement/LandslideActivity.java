package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class LandslideActivity extends AppCompatActivity {
    TextView Earthquake;
    String str="LANDSLIDES\n" +
            "DO'S\n" +
            "1. Maintain drainage system (pipes, ditches, etc., on your property and  keep street drains free of leaves and debris).\n" +
            "2. Direct stormwater away from steep slopes, if possible.\n" +
            "3. Perform periodic inspections of property before winter and during  storms keeping safety as the #1 concern.\n" +
            "4. Check weep holes on walls and keep them open.\n" +
            "5. Be alert during and following storms.\n" +
            "6. If you have an irrigation system, shut it off and check it out seasonally.\n" +
            "7. Keep fill and yard waste off slopes.\n" +
            "8. Leave stumps in the ground on slopes.\n" +
            "9. Call a professional, if you have questions or a problem!\n" +
            "\n" +
            "DONT'S\n" +
            "1. Don’t direct storm or other water onto a slope.\n" +
            "2. Don’t denude vegetation on slope without a re-vegetation plan.\n" +
            "3. Don’t cut into the toe (or bottom) of a slope.\n" +
            "4. Don’t remove tree stumps from slopes.\n" +
            "5. Don’t install a permanent irrigation system in landslide-prone  areas.\n" +
            "6. Don’t put fill or yard debris on a steep slope.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landslide);
        Earthquake=(TextView) findViewById(R.id.txtviewlLandslide);
        loadText();

    }
    public void loadText(){
        Earthquake.setMovementMethod(new ScrollingMovementMethod());
        Earthquake.setText(str);
    }
}