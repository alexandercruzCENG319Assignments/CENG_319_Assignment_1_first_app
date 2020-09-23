package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_r);


        final TextView tv = findViewById(R.id.changetext);
        final String[] status = {"onCreate() excuted", "onStart() excuted",
                                "onStop() excuted", "onDestroy() excuted"};

        StringBuilder builder = new StringBuilder();
        builder.append("VR Activity:\n");
        for (String s : status) {
            builder.append(s).append("\n");
            tv.setText(builder.toString());
            tv.setTextSize(30);
            tv.setTextColor(Color.MAGENTA);
        }
    }
}