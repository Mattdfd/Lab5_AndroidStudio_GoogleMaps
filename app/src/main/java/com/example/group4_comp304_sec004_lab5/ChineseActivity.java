package com.example.group4_comp304_sec004_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

public class ChineseActivity extends AppCompatActivity {
ListView CL;

String ChineseResto [] = {"Asian Legend", "R&D", "House Of Gourmet","Lai Wah Heen"};


   // LatLng C1 =new LatLng (43.651601715089, -79.39720471627695);
    //LatLng C2 =new LatLng (43.65332279762298, -79.39725930518165);
    //LatLng C3 =new LatLng (43.65491735426454, -79.38597793272783);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        CL = findViewById(R.id.CL);
        ArrayAdapter<String> CRA;
        CRA = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ChineseResto);
        CL.setAdapter(CRA);

        CL.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //LatLng C0 =new LatLng (43.65369204824444, -79.39511692333461);
                    double lat = 43.65369204824444;
                    double lng = -79.39511692333461;
                    String name = "Asian Legend";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent); }

                if (i == 1){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    // LatLng C1 =new LatLng (43.651601715089, -79.39720471627695);
                    double lat = 43.651601715089;
                    double lng = -79.39720471627695;
                    String name = "R&D";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if(i==2){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //LatLng C2 =new LatLng (43.65332279762298, -79.39725930518165);
                    double lat = 43.65332279762298;
                    double lng = -79.39725930518165;
                    String name = "House Of Gourmet";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if (i == 3){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //LatLng C3 =new LatLng (43.65491735426454, -79.38597793272783);
                    double lat = 43.65491735426454;
                    double lng = -79.38597793272783;
                    String name = "Lai Wah Heen";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }
            }
        });

    }
}