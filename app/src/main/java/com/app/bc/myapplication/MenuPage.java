package com.app.bc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.EditText;

public class MenuPage extends AppCompatActivity {

    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        Button button1 =(Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),HomeworkActivity.class);
                startActivity(startIntent);
            }
        });
        Button button2 =(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),GroupsActivity.class);
                startActivity(startIntent);
            }
        });
        Button button3 =(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),AskInstructorActivity.class);
                startActivity(startIntent);
            }
        });
        Button button4 =(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),ClubsActivity.class);
                startActivity(startIntent);
            }
        });
        Button button5 =(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),ScholarshipActivity.class);
                startActivity(startIntent);
            }
        });

        mWebView = (WebView) findViewById(R.id.activity_menu_webview);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //mWebView.loadUrl("https://bconline.broward.edu/content/Courses/CompSci/Announcements/CSIT/newsannouncement.html");
        mWebView.loadUrl("file:///android_asset/ad.html");
    }
}
