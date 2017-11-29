package com.example.caleal.testaltran.Activities;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.caleal.testaltran.R;
import static com.example.caleal.testaltran.R.layout.activity_brastlewark_data;

/**
 * Created by CALEAL on 11/27/2017.
 */

public class Brastlewark_data_activity extends AppCompatActivity {

    TextView Id;
    TextView Name;
    TextView Age;
    TextView Weight;
    TextView Height;
    TextView HairColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_brastlewark_data);


        Bundle datos = this.getIntent().getExtras();

        Id = (TextView)findViewById(R.id.id);
        Name = (TextView)findViewById(R.id.name);
        Age = (TextView)findViewById(R.id.age);
        Weight = (TextView)findViewById(R.id.weight);
        Height = (TextView)findViewById(R.id.height);
        HairColor = (TextView)findViewById(R.id.hair_color);

        Id.setText(datos.getString("Id"));
        Name.setText(datos.getString("name"));

        Age.setText(datos.getString("age"));
        Weight.setText(datos.getString("weight"));
        Height.setText(datos.getString("height"));
        HairColor.setText(datos.getString("hair_color"));



    }
}

