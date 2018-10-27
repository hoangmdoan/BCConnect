package com.app.bc.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ClubsActivity extends ListActivity {
    static final String[] CLUBS = new String[] { "1. Sport", "2. Tech", "3. Cultures",
            "4. International Student", "5. Honor Student" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_clubs);
        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_clubs,CLUBS));
        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

//                Intent startIntent = new Intent(getApplicationContext(),MessageActivity.class);
//                startActivity(startIntent);
            }
        });
    }
}
