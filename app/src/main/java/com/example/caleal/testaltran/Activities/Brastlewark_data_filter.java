package com.example.caleal.testaltran.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.caleal.testaltran.R;
import com.squareup.picasso.Picasso;

/**
 * Created by CALEAL on 12/4/2017.
 */

public class Brastlewark_data_filter extends AppCompatActivity {

    TextView Id;
    TextView Name;
    TextView Age;
    TextView Weight;
    TextView Height;
    TextView HairColor;
    ImageView Thumbnail;
    TextView Professions;
    TextView Friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brastlewark_data);
        Context mContext = null;

        Intent datos = getIntent ();

        Id = findViewById(R.id.id);
        Name = findViewById(R.id.name);
        Age = findViewById(R.id.age);
        Weight = findViewById(R.id.weight);
        Height = findViewById(R.id.height);
        HairColor = findViewById(R.id.hair_color);
        Thumbnail = findViewById(R.id.Photo);
        Professions = findViewById(R.id.professions);
        Friends = findViewById(R.id.friends);


        //Id.setText(datos.getString("Id"));
        Name.setText(datos.getStringExtra("Name"));

        Age.setText(String.valueOf(datos.getStringExtra("Age")));
        Weight.setText(datos.getStringExtra("Weight"));
        Height.setText(datos.getStringExtra("Height"));
        HairColor.setText(datos.getStringExtra("HairColor"));
        HairColor.setText(datos.getStringExtra("HairColor"));
        HairColor.setText(datos.getStringExtra("HairColor"));
        Professions.setText(datos.getStringExtra("Professions"));
        Friends.setText(datos.getStringExtra("Friends"));

        Picasso.with(this).load(datos.getStringExtra("Thumbnail")).resize(150, 200).into(Thumbnail);




    }

}
