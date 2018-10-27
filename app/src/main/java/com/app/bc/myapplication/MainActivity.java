package com.app.bc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =(Button)findViewById(R.id.button2);
        final EditText editText1 = (EditText)findViewById(R.id.editText4);
        final EditText editText2 = (EditText)findViewById(R.id.editText5);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),MenuPage.class);
                Editable username = editText1.getText();//startIntent.putExtra("org.mentorschools.quicklauncher.SOMETHING","HELLO WORLD!");
                startActivity(startIntent);
            }
        });


    }
    //Ting have comment here kkk6545final
}
