package com.example.caleal.testaltran.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.caleal.testaltran.Adapters.BrastlewarkAdapter;
import com.example.caleal.testaltran.R;
import com.example.caleal.testaltran.model.BrastlewarkModel;
import com.example.caleal.testaltran.service.constans.ClassConstans;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;


/**
 * Created by CALEAL on 12/3/2017.
 */

public class BrastlewarkFilter extends AppCompatActivity {

    RecyclerView view_reciler;
    private Toolbar toolbar;
    EditText etName;
    EditText etMinAge;
    EditText etMaxAge;
    EditText etMinWeight;
    EditText etMaxWeight;
    EditText etMinHeight;
    EditText etMaxHeight;
    Spinner spColor;
    Spinner spProfession;
    Button btFilter;
    //btFilter
    Context mContext;
    String name = null;
    Integer minAge = null;
    Integer maxAge = null;
    Double minWeight = null;
    Double maxWeight = null;
    Double minHeight = null;
    Double maxHeight = null;
    String Json;

   // Bundle datos = this.getIntent().getExtras();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brastlewark_filter);

    }


    @Override
    public boolean  onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_example_activity,menu);
        return  true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem option_item) {

        startActivity(new Intent(this, BrastlewarkFilter.class));

        return false;
    }

    public void clickButton(View vista) {


            btFilter= this.findViewById(R.id.btFilter);
            etName= this.findViewById(R.id.etName);
            etMinAge= this.findViewById(R.id.etMinAge);
            etMaxAge= this.findViewById(R.id.etMaxAge);
            etMinWeight= this.findViewById(R.id.etMinWeight);
            etMaxWeight= this.findViewById(R.id.etMaxWeight);
            etMinHeight= this.findViewById(R.id.etMinHeight);
            etMaxHeight= this.findViewById(R.id.etMaxHeight);

            if (!etName.getText().toString().equals("")) {
                name = etName.getText().toString();
            }


            if (!etMinAge.getText().toString().equals("")) {
                minAge = Integer.parseInt(etMinAge.getText().toString());
            }
            else {
                maxAge=0;
            }

            if (!etMaxAge.getText().toString().equals("")) {
                maxAge = Integer.parseInt(etMaxAge.getText().toString());
            }
            else {
             minAge =0;
            }

            if (!etMinWeight.getText().toString().equals("")) {
                minWeight = Double.parseDouble(etMinWeight.getText().toString());
            }
            else {
                maxWeight =0.0;
            }



            if (!etMaxWeight.getText().toString().equals("")) {
                maxWeight = Double.parseDouble(etMaxWeight.getText().toString());
            }
            else {
                minWeight =0.0;
            }

            if (!etMinHeight.getText().toString().equals("")) {
                minHeight = Double.parseDouble(etMinHeight.getText().toString());
            }
            else {
                maxHeight=0.0;
            }

            if (!etMaxHeight.getText().toString().equals("")) {
                maxHeight = Double.parseDouble(etMaxHeight.getText().toString());
            }
            else {
                minHeight =0.0;
            }

        if (minAge > 0 || maxAge > 0 || minHeight > 0 || maxHeight > 0 || minWeight > 0 || maxWeight > 0) {

                setContentView(R.layout.activity_main);
                toolbar = (Toolbar) findViewById(R.id.tool_bar);
                //setSupportActionBar(toolbar);

                view_reciler =(RecyclerView) findViewById(R.id.Brastlewark_recycler);
                LinearLayoutManager my_lienarlayout = new LinearLayoutManager(this);
                my_lienarlayout.setOrientation(LinearLayoutManager.VERTICAL);
                view_reciler.setLayoutManager(my_lienarlayout);

                JsonParser parser = new JsonParser();
                JsonObject brastlewarkModel = parser.parse(ClassConstans.Json).getAsJsonObject();

                // JsonObject brastlewarkModel ;
                ArrayList<BrastlewarkModel> arrayListBrastlewark = new ArrayList<>();
                Gson mGson = new Gson();
                JsonArray jsonArray = (brastlewarkModel.getAsJsonArray("Brastlewark"));

                for(int i = 0; i< jsonArray.size();i++){
                    BrastlewarkModel Bw =  mGson.fromJson(jsonArray.get(i).toString(), BrastlewarkModel.class);
                    if (String.valueOf(Bw.getAge()).toString()!="" && Bw.getAge() >= minAge && Bw.getAge() <= maxAge  ) {
                        arrayListBrastlewark.add(Bw);
                    }
                    if (String.valueOf(Bw.getHeight()).toString()!=""   && Bw.getHeight() >= Double.parseDouble(String.valueOf(minHeight)) && Bw.getHeight() <= Double.parseDouble(String.valueOf(maxHeight))) {
                        arrayListBrastlewark.add(Bw);
                    }
                    if (String.valueOf(Bw.getWeight()).toString()!="" && Bw.getWeight() >= Double.parseDouble(String.valueOf(minWeight)) && Bw.getAge() <= Double.parseDouble(String.valueOf(maxWeight))) {
                        arrayListBrastlewark.add(Bw);
                    }


                }
                MainActivity a= new MainActivity();
                BrastlewarkAdapter mAdapter= new BrastlewarkAdapter(a.mContext,arrayListBrastlewark);
                view_reciler.setAdapter(mAdapter);
            }
        else {
            Toast.makeText(this,"Debe ingresar un valor",Toast.LENGTH_LONG).show();
        }





    }


}
