package com.example.group4_comp304_sec004_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GreekActivity extends AppCompatActivity {
    ListView CL;
    String GreekResto [] = {"The Greek Grill", "Mezes", "Myth","Karbouzi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greek);

        CL = findViewById(R.id.GL);
        ArrayAdapter<String> CRA;
        CRA = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, GreekResto);
        CL.setAdapter(CRA);

        CL.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.69746849390139, -79.35012688348287
                    double lat = 43.69746849390139;
                    double lng = -79.35012688348287;
                    String name = "The Greek Grill";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent); }

                if (i == 1){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    // 43.68238874484958, -79.35026668902987
                    double lat = 43.68238874484958;
                    double lng = -79.35026668902987;
                    String name = "Mezes";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if(i==2){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.646183215241344, -79.39759618522133
                    double lat = 43.646183215241344;
                    double lng = -79.39759618522133;
                    String name = "Myth";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if (i == 3){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.74126965525318, -79.42106403251161
                    double lat = 43.74126965525318;
                    double lng = -79.42106403251161;
                    String name = "Karbouzi";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }
            }
        });
    }
}