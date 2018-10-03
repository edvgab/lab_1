package com.example.edlyas.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity{

    private ListView mylist;
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivitydesign);
        mylist = (ListView) findViewById(R.id.listView);

        List<ListItem> items = new ArrayList<ListItem>();

        Intent intent = getIntent();
        if (intent.getBooleanExtra("flag",true)){

            items.add(new ListItem("Jack", R.drawable.ic_3d_rotation_black_48dp, "Mathematics, Chemistry"));
            items.add(new ListItem("Jane", R.drawable.ic_announcment_black_48dp, "Physics, Informatics"));
            items.add(new ListItem("Bob", R.drawable.ic_alarm_black_48dp, "Mathematics, Informatics"));
            items.add(new ListItem("Clara", R.drawable.ic_account_box_black_48dp, "Geography, Chemistry"));
            items.add(new ListItem("Sam", R.drawable.ic_globe_black_48dp, "Mathematics, Physics"));

        }else{

            items.add(new ListItem("Mathematics",  R.drawable.ic_3d_rotation_black_48dp, "Mathematics is the sturdy of topics such as quantity, structure," +
            "space and change"));
            items.add(new ListItem("Physics", R.drawable.ic_announcment_black_48dp, "Physics is the natural science that involves the study of matter " +
            "and its motion throut space and time along related " +
            "concepts such energy and force"));
            items.add(new ListItem("Chemistry", R.drawable.ic_alarm_black_48dp, "Chemistry" +
            "is a branch of physical science that studies the composition, structure" +
            "properties and changes of matter"));
            items.add(new ListItem("Informatics", R.drawable.ic_account_box_black_48dp,
            "Informatics is the science of information and computer information system"));
            items.add(new ListItem("Geography", R.drawable.ic_globe_black_48dp,
                    "Geography is a field of science devoted to the study of lands " +
            "the features, the inhabitats, and the phenomena of Earth."));


        }

        adapter = new ListAdapter(this, items);
        mylist.setAdapter(adapter);
    }
}
