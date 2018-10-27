package com.app.bc.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
public class HomeworkActivity extends ListActivity {

    static final String[] SUBJECTS = new String[] { "Mathematics", "History", "Art",
            "Programming", "Accounting", "Statistics", "Speech", "Literature",
            "Linguistics", "Physics", "Chemistry", "Biology", "Economics" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_homework);

        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_homework,SUBJECTS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

                Intent startIntent = new Intent(getApplicationContext(),MessageActivity.class);
                startActivity(startIntent);
            }
        });
    }

}
