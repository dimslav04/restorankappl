package com.example.se2_9.restorankappl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_SEND2="com.example.se2_9.restorankappl.pr1.send.y";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public static final String KEY_SEND="com.example.se2_9.restorankappl.pr1.send.x";



    public void sendMethod (View v){
        Intent bakasha2=new Intent(this,LastActivity.class);
        int r2= (int)((RatingBar)findViewById(R.id.editText2)).getRating();
        bakasha2.putExtra(KEY_SEND2,r2);
       int r1=getIntent().getIntExtra(FirstActivity.KEY_SEND1,2);
        bakasha2.putExtra(KEY_SEND,r1);
        startActivity(bakasha2);
    }
}
