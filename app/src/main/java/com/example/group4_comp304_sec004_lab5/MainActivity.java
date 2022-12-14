package com.example.group4_comp304_sec004_lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button btnstart;
    ListView l;
    String Cuisine[]
            = { "Italian", "Greek",
            "Indian", "Chinese",
             };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Cuisine);
        l.setAdapter(arr);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){Intent intent = new Intent(getBaseContext(),ItalianActivity.class);
                    startActivity(intent); }
                if (i == 1){Intent intent = new Intent(getBaseContext(),GreekActivity.class);
                    startActivity(intent); }
                if(i==2){Intent intent = new Intent(getBaseContext(),IndianActivity.class);
                    startActivity(intent); }
                if (i == 3){Intent intent = new Intent(getBaseContext(),ChineseActivity.class);
                    startActivity(intent); }
            }
        });





    }


}