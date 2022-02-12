package com.example.disastermanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {
    private Button Call;
    private EditText PhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Call =(Button)findViewById(R.id.callbtn);
        PhoneNumber=(EditText) findViewById(R.id.editTextPhone);
        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent=new Intent(Intent.ACTION_CALL);
                String phone=PhoneNumber.getText().toString();
                if(phone.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please enter  Number", Toast.LENGTH_SHORT).show();
                }else {
                    String s="tel:"+phone;
                    callIntent.setData(Uri.parse(s));
                    if (ActivityCompat.checkSelfPermission(CallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        return;
                    }
                    startActivity(callIntent);
                }
            }
        });

    }
}