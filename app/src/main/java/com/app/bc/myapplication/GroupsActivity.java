package com.app.bc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;

public class GroupsActivity extends AppCompatActivity {

   // private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        Button button1 =(Button)findViewById(R.id.btnSubmit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),MessageActivity.class);

                startActivity(startIntent);
            }
        });
    }

}
