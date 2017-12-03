package com.example.caleal.testaltran.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.caleal.testaltran.R;
import com.example.caleal.testaltran.model.BrastlewarkModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;


/**
 * Created by CALEAL on 12/3/2017.
 */

public class BrastlewarkFilter extends AppCompatActivity {


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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brastlewark_filter);
    }




    public void clickButton(View vista) {

        BrastlewarkModel filter = new BrastlewarkModel();
        btFilter= this.findViewById(R.id.btFilter);
        etName= this.findViewById(R.id.etName);
        etMinAge= this.findViewById(R.id.etMinAge);
        etMaxAge= this.findViewById(R.id.etMaxAge);
        etMinWeight= this.findViewById(R.id.etMinWeight);
        etMaxWeight= this.findViewById(R.id.etMaxWeight);
        etMinHeight= this.findViewById(R.id.etMinHeight);
        etMaxHeight= this.findViewById(R.id.etMaxHeight);


        String name = null;
        if (!etName.getText().toString().equals("")) {
            name = etName.getText().toString();
        }

        Integer minAge = null;
        if (!etMinAge.getText().toString().equals("")) {
            minAge = Integer.parseInt(etMinAge.getText().toString());
        }

        Integer maxAge = null;
        if (!etMaxAge.getText().toString().equals("")) {
            maxAge = Integer.parseInt(etMaxAge.getText().toString());
        }

        Double minWeight = null;
        if (!etMinWeight.getText().toString().equals("")) {
            minWeight = Double.parseDouble(etMinWeight.getText().toString());
        }

        Double maxWeight = null;
        if (!etMaxWeight.getText().toString().equals("")) {
            maxWeight = Double.parseDouble(etMaxWeight.getText().toString());
        }

        Double minHeight = null;
        if (!etMinHeight.getText().toString().equals("")) {
            minHeight = Double.parseDouble(etMinHeight.getText().toString());
        }

        Double maxHeight = null;
        if (!etMaxHeight.getText().toString().equals("")) {
            maxHeight = Double.parseDouble(etMaxHeight.getText().toString());
        }

       /* String hairColor = null;
        if (spColor.getSelectedItemPosition() > 0) {
            hairColor = colorList.get(spColor.getSelectedItemPosition());
        }

        String profession = null;
        if (spProfession.getSelectedItemPosition() > 0) {
            profession = professionList.get(spProfession.getSelectedItemPosition());
        }

        filter.setName(name);
        filter.setMinAge(minAge);
        filter.setMaxAge(maxAge);
        filter.setMinWeight(minWeight);
        filter.setMaxWeight(maxWeight);
        filter.setMinHeight(minHeight);
        filter.setMaxHeight(maxHeight);
        filter.setHairColor(hairColor);
        filter.setProfession(profession);
        */
        clickFilter(filter);
    }

    public void clickFilter(BrastlewarkModel filter) {

        //Intent intent = new Intent(this, PersonListViewImpl.class);
        //intent.putExtra(Filter.FILTER_KEY, filter);
        //startActivity(intent);
    }
}
