package com.example.shubham.sensors;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView tv;
private SensorManager msensormanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.sens1);
        msensormanager= (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> mList=msensormanager.getSensorList(Sensor.TYPE_ALL);

        for(int i=1;i<mList.size();i++)
        {
            tv.setVisibility(View.VISIBLE);
            tv.append("\n"+mList.get(i).getName()+"\n"+mList.get(i).getVendor()+"\n"+mList.get(i).getResolution());

        }

    }
}
