package com.example.edlyas.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FirstActivity extends AppCompatActivity {

    private Button myButton;
    private Button secondActivityButton;
    private Button myAdd;
    private Button myThirdactivityButton;
    private EditText myTitle;
    private EditText myDescription;



   // private TextView mytextField;

    EditText e1, e2;


    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivitydesign);

        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);

        myButton = (Button) findViewById(R.id.button);
        secondActivityButton = (Button) findViewById(R.id.secondActivityButton);
       // mytextField = (TextView)findViewById(R.id.textfield);
        myTitle = (EditText)findViewById(R.id.edittitle) ;
        myDescription = (EditText)findViewById(R.id.editdescription);
        myAdd = (Button)findViewById(R.id.add);
        myThirdactivityButton = (Button) findViewById(R.id.thirdactivityButton);

        myThirdactivityButton.setOnClickListener(ThirdButton);
        myAdd.setOnClickListener(AddClick);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this,ThirdActivitys.class);
                String fname = e1.getText().toString();
                String sname = e2.getText().toString();
                student student = new student(fname,sname);
                intent.putExtra("object",student);
                startActivity(intent);
            }
        });
        secondActivityButton.setOnClickListener(startSecondActivity);  //jei trumpai nuspaustas
        secondActivityButton.setOnLongClickListener(starSecondActivityLong);   //ilgas paspapaudimas

    }
   /* View.OnClickListener myButtonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mytextField.setText(mytextField.getText()+"\n"+"Next line");
        }
    };*/


   View.OnClickListener ThirdButton = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(FirstActivity.this, ForthActivity.class);
           FirstActivity.this.startActivity(intent);
       }
   };

   View.OnClickListener AddClick = new View.OnClickListener(){
       @Override
       public void onClick(View v)
       {

           myTitle.setText(myTitle.getText()+"\n");
           myDescription.setText(myDescription.getText()+"\n");
       }

   };

public void runSecondActivity(boolean b){
    Intent intent = new Intent(context, SecondActivity.class);
    intent.putExtra("flag", b);
    context.startActivity(intent);
}
View.OnClickListener startSecondActivity = new View.OnClickListener(){
    @Override
    public void onClick(View v){
        runSecondActivity(true);
    }
};
View.OnLongClickListener starSecondActivityLong = new View.OnLongClickListener(){
    @Override
    public boolean onLongClick(View v){
        runSecondActivity(false);
        return true;
    }
};
} //end of public class
