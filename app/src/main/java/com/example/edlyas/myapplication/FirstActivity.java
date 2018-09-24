package com.example.edlyas.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FirstActivity extends AppCompatActivity {

    private Button myButton;
    private TextView mytextField;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivitydesign);

        myButton = (Button) findViewById(R.id.button);
        mytextField = (TextView)findViewById(R.id.textfield);

        myButton.setOnClickListener(myButtonClick);
    }
    View.OnClickListener myButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mytextField.setText(mytextField.getText()+"\n"+"Next line");
        }
    };
}
