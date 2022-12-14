package com.example.group4_comp304_sec004_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IndianActivity extends AppCompatActivity {
    ListView CL;
    String IndianResto [] = {"Leela", "Curry Twist", "Pukka","Aanch"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);

        CL = findViewById(R.id.IL);
        ArrayAdapter<String> CRA;
        CRA = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, IndianResto);
        CL.setAdapter(CRA);

        CL.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.67034304641853, -79.47213869340253
                    double lat = 43.67034304641853;
                    double lng = -79.47213869340253;
                    String name = "Leela";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent); }

                if (i == 1){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    // 43.66993854686764, -79.46948312125495
                    double lat = 43.66993854686764;
                    double lng = -79.46948312125495;
                    String name = "Curry Twist";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if(i==2){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.685470721529015, -79.4278703979918
                    double lat = 43.685470721529015;
                    double lng = -79.4278703979918;
                    String name = "Pukka";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if (i == 3){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.646058568265346, -79.39118391798306
                    double lat = 43.646058568265346;
                    double lng = -79.39118391798306;
                    String name = "Aanch";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }
            }
        });
    }
}