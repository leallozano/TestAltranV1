package com.example.caleal.testaltran.Activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.caleal.testaltran.Adapters.BrastlewarkAdapter;
import com.example.caleal.testaltran.R;
import com.example.caleal.testaltran.model.BrastlewarkModel;
import com.example.caleal.testaltran.service.ServiceManager;
import com.example.caleal.testaltran.service.callback.CallBackGetBrastlewark;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    RecyclerView view_reciler;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(toolbar);

        view_reciler =(RecyclerView) findViewById(R.id.Brastlewark_recycler);
        LinearLayoutManager my_lienarlayout = new LinearLayoutManager(this);
        my_lienarlayout.setOrientation(LinearLayoutManager.VERTICAL);
        view_reciler.setLayoutManager(my_lienarlayout);


        ServiceManager.getPost(new CallBackGetBrastlewark() {

            public void onSuccess(JsonObject brastlewarkModel) {

                ArrayList<BrastlewarkModel> arrayListBrastlewark = new ArrayList<>();
                Gson mGson = new Gson();
                //JSONArray jsonArray = new JSONArray(jsonMessage);//
                JsonArray jsonArray = (brastlewarkModel.getAsJsonArray("Brastlewark"));
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

    @Override
    public boolean  onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_example_activity,menu);
        return  true;


    }

    public void ejecutar_class_inf(View v){

        //  Intent intenInf = new Intent(this,Inflate_Menu.class);
        //  startActivity(intenInf);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem option_item) {

        int opcionMenu = option_item.getItemId();

      /*  if (opcionMenu == R.id.tool_bar)
        {
            return  true;

        }

        if(opcionMenu == R.id.){

           // ejecutar_class_inf(null);
            return true;
        }

        return super.onOptionsItemSelected(option_item);*/
        return true;
    }
}
