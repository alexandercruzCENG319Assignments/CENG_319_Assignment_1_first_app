package com.example.firstapp;

import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment {



    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        final TextView tv = (TextView) view.findViewById(R.id.textexcuted);
        final String[] status = {"onCreate() excuted", "onStart() excuted",
                "onStop() excuted", "onDestroy() excuted"};

        StringBuilder builder = new StringBuilder();
        builder.append("Main Activity:\n");
        for (String s : status) {
            builder.append(s).append("\n");
            tv.setText(builder.toString());
            tv.setTextSize(30);
            tv.setX(250);
            tv.setY(1300);
            tv.setTextColor(Color.MAGENTA);
            tv.setBackgroundColor(Color.GRAY);
        }
            return view;
    }

}