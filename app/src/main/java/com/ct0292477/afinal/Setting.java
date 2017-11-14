package com.ct0292477.afinal;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    Button btnLocation, btnReminder;
    Context context;
    Intent intent1, intent2;
    TextView textview;
    LocationManager locationManager ;
    boolean GpsStatus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // Location Service
        Button btnLocation = (Button)findViewById(R.id.buttonLocationService);
        context = getApplicationContext();

        btnLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                intent1 = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent1);
            }
        });


        // Customize category
        Button btnCategory = (Button)findViewById(R.id.btnCategory);
        btnCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Setting.this, Icon.class);
                startActivity(i);

            }
        });

        Button btnReminder = (Button)findViewById(R.id.btnReminder);
        btnReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Setting.this, Alarm.class);
                startActivity(i);

            }
        });

        // logout
        Button btnLogOut = (Button)findViewById(R.id.btnLogOut);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Setting.this, MainPageApp.class);
                startActivity(i);

            }
        });

    }

}
