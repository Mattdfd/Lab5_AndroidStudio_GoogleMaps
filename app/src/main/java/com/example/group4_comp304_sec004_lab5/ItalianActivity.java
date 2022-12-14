package com.example.group4_comp304_sec004_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ItalianActivity extends AppCompatActivity {
    ListView CL;

    String ItalianResto [] = {"Sugo", "Gusto 101", "Enoteca Sociale","Giulietta"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);


        CL = findViewById(R.id.LiL);
        ArrayAdapter<String> CRA;
        CRA = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ItalianResto);
        CL.setAdapter(CRA);

        CL.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==0){
                    Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.658906598903236, -79.44215143765992
                    double lat = 43.658906598903236;
                    double lng = -79.44215143765992;
                    String name = "Sugo";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent); }

                if (i == 1){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    // 43.64651878931956, -79.39968439066133
                    double lat = 43.64651878931956;
                    double lng = -79.39968439066133;
                    String name = "Gusto 101";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if(i==2){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.651415749724904, -79.42622894060398
                    double lat = 43.651415749724904;
                    double lng = -79.42622894060398;
                    String name = "Enoteca Sociale";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }

                if (i == 3){Intent intent = new Intent(getBaseContext(),MapsActivity.class);
                    //43.65709956170261, -79.42836133533356
                    double lat = 43.65709956170261;
                    double lng = -79.42836133533356;
                    String name = "Giulietta";
                    intent.putExtra("lat",lat);
                    intent.putExtra("lng",lng);
                    intent.putExtra("name",name);
                    startActivity(intent);  }
            }
        });
    }
}