package com.example.caleal.testaltran.Activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.caleal.testaltran.R;
import com.squareup.picasso.Picasso;

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
    ImageView Thumbnail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brastlewark_data);
        Context mContext = null;

        Bundle datos = this.getIntent().getExtras();

        Id = findViewById(R.id.id);
        Name = findViewById(R.id.name);
        Age = findViewById(R.id.age);
        Weight = findViewById(R.id.weight);
        Height = findViewById(R.id.height);
        HairColor = findViewById(R.id.hair_color);
        Thumbnail = findViewById(R.id.Photo);

        //Id.setText(datos.getString("Id"));
        Name.setText(datos.getString("Name"));

        Age.setText(datos.getInt("Age"));
        Weight.setText(datos.getString("Weight"));
        Height.setText(datos.getString("Height"));
        HairColor.setText(datos.getString("HairColor"));
        //Thumbnail.setText(datos.getString("Thumbnail"));

        Picasso.with(this).load(datos.getString("Thumbnail")).resize(150, 200).into(Thumbnail);




    }
}

