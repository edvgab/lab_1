package com.example.edlyas.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity{

    private ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivitydesign);
        mylist = (ListView) findViewById(R.id.listView);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("flag",true)){
            /*
            *case 1
             */
        }else{
            /*
            *case 2
             */
        }
    }
}
