package com.example.se2_9.restorankappl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class FirstActivity extends AppCompatActivity {

    public static final String KEY_SEND1="com.example.se2_9.restorankappl.pr1.send.x";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendMethod (View v){

        Intent bakasha1=new Intent(this,SecondActivity.class);
        int r1= (int)((RatingBar)findViewById(R.id.editText1)).getRating();
        bakasha1.putExtra(KEY_SEND1,r1);
startActivity(bakasha1);
    }
}
