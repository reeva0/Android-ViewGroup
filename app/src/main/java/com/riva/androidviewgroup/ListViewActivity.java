// ListViewActivity.java
package com.riva.androidviewgroup;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView listView = findViewById(R.id.listView);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");
        ViewAdapter adapter = new ViewAdapter(this, dataList);
        listView.setAdapter(adapter);
    }

}
