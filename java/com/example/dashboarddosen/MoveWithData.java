package com.example.dashboarddosen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

    public class MoveWithData extends AppCompatActivity {
        public static String EXTRA_AGE = "extra_age";
        public static String EXTRA_NAME = "extra_name";
        public TextView tvDataReceived;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_move_with_data);
            tvDataReceived = (TextView)findViewById(R.id.tv_data_received);
            String name = getIntent().getStringExtra(EXTRA_NAME);
            int age = getIntent().getIntExtra(EXTRA_AGE, 0);
            String text = "Name : "+name+", Your Age: "+age;
            tvDataReceived.setText(text);
        }
    }

