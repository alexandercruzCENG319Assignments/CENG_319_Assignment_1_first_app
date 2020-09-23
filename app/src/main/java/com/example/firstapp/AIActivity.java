package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

        final TextView tv = findViewById(R.id.changetext);
        final String[] firstMethodsCalled = {"onCreate() excuted", "onStart() excuted",
                                            "onStop() excuted", "onDestroy() excuted"};
        final String[] secondMethodsCalled = {};
        StringBuilder builder = new StringBuilder();
        builder.append("AI Activity:\n ");
        for (String s : firstMethodsCalled) {
            builder.append(s).append("\n");
            tv.setText(builder.toString());
            tv.setTextSize(30);
            tv.setTextColor(Color.MAGENTA);
        }

    }
}