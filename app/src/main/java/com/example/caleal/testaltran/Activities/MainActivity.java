package com.example.caleal.testaltran.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.caleal.testaltran.Adapters.BrastlewarkAdapter;
import com.example.caleal.testaltran.R;
import com.example.caleal.testaltran.model.BrastlewarkModel;
import com.example.caleal.testaltran.service.ServiceManager;
import com.example.caleal.testaltran.service.callback.CallBackGetBrastlewark;
import com.example.caleal.testaltran.service.constans.ClassConstans;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    Context mContext;

    RecyclerView view_reciler;
   //String Json;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(toolbar);
        this.mContext = mContext;
        view_reciler =(RecyclerView) findViewById(R.id.Brastlewark_recycler);
        LinearLayoutManager my_lienarlayout = new LinearLayoutManager(this);
        my_lienarlayout.setOrientation(LinearLayoutManager.VERTICAL);
        view_reciler.setLayoutManager(my_lienarlayout);


        ServiceManager.getPost(new CallBackGetBrastlewark() {

            public void onSuccess(JsonObject brastlewarkModel) {
                ClassConstans.Json=String.valueOf(brastlewarkModel);
                ArrayList<BrastlewarkModel> arrayListBrastlewark = new ArrayList<>();
                Gson mGson = new Gson();
                JsonArray jsonArray = (brastlewarkModel.getAsJsonArray("Brastlewark"));
                //Brastlewark B = null;
               // JsonArray jsonArray = (brastlewarkModel.getAsJsonArray(B.getBrastlewark().toString()));
                for(int i = 0; i< jsonArray.size();i++){
                    BrastlewarkModel Bw =  mGson.fromJson(jsonArray.get(i).toString(), BrastlewarkModel.class);
                    arrayListBrastlewark.add(Bw);

                }
                BrastlewarkAdapter mAdapter= new BrastlewarkAdapter(MainActivity.this,arrayListBrastlewark);
                view_reciler.setAdapter(mAdapter);

            }

            @Override
            public void onError(String msgError, int indError) {

                Toast.makeText(MainActivity.this,msgError,Toast.LENGTH_LONG).show();

            }
        });




    /*   ServiceManager.getPeople(new CallBackGetPeople() {
           @Override
           public void onSuccess(List<PeopleModel> ListPeople) {
               PeopleAdapter peopleAdapter = new PeopleAdapter(getApplicationContext(),ListPeople);
               view_reciler.setAdapter(peopleAdapter);
           }

           @Override
           public void onError(String msgError, int indError) {
               Toast.makeText(MainActivity.this,msgError,Toast.LENGTH_LONG).show();

           }
       });*/




    }




    public void clickFilter() {
        Intent intent = new Intent(mContext, BrastlewarkFilter.class);
       // intent.putExtra("Json",Json);
        //Bundle bundle =new Bundle();
        //bundle.putString("Json", Json);
        //((MainActivity) mContext).openActivity(BrastlewarkFilter.class,bundle);
        //((MainActivity) this).openActivity(BrastlewarkFilter.class,bundle);
        //((MainActivity) mContext).openActivity(Brastlewark_data_activity.class,bundle);
        startActivity(intent);

        /*Intent activity = new Intent(this, BrastlewarkFilter.class);
        activity.putExtra("myObject", new Gson().toJson(brastlewarkMode));
        startActivity(activity);*/

    }

    @Override
    public boolean  onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_example_activity,menu);
        return  true;


    }

    public void ejecutar_class_inf(){

        /*Intent intenInf = new Intent(this,BrastlewarkFilter.class);
        startActivity(intenInf);*/
        ((MainActivity) this).openActivity(BrastlewarkFilter.class);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem option_item) {

        startActivity(new Intent(this, BrastlewarkFilter.class));

        return false;
    }
}
