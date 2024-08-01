package com.riva.androidviewgroup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editname, editage, editgender, editoccupation;
    Button buttonone, buttontwo, buttonthree, buttonfour;
    ArrayList<String> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize edittext and buttons
        editname = findViewById(R.id.et1);
        editage = findViewById(R.id.et2);
        editgender = findViewById(R.id.et3);
        editoccupation = findViewById(R.id.et4);

        buttonone = findViewById(R.id.bt1);
        buttontwo = findViewById(R.id.bt2);
        buttonthree = findViewById(R.id.bt3);
        buttonfour = findViewById(R.id.bt4);

        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editname.getText().toString();
                String age = editage.getText().toString();
                String gender = editgender.getText().toString();
                String occupation = editoccupation.getText().toString();

                String data = "Name: " + name + ", Age: " + age + " , Gender" + gender + "Occupation: " + occupation ;
                dataList.add(data);
            }
        });

        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                intent.putStringArrayListExtra("dataList", dataList);
                startActivity(intent);
            }
        });

        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridView.class);
                intent.putStringArrayListExtra("dataList", dataList);
                startActivity(intent);
            }
        });

        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                intent.putStringArrayListExtra("dataList", dataList);
                startActivity(intent);
            }
        });

    }

}
