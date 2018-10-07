package com.example.edlyas.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ThirdActivitys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activitys);

        TextView textView = findViewById(R.id.textView3);
        TextView textView1 = findViewById(R.id.textView4);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        student student = (student) bundle.getSerializable("object");
        textView.setText(student.getFname());
        textView1.setText(student.getSname());

    }
}
