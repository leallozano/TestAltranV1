package com.example.caleal.testaltran.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.caleal.testaltran.Activities.Brastlewark_data_activity;
import com.example.caleal.testaltran.Activities.MainActivity;
import com.example.caleal.testaltran.R;
import com.example.caleal.testaltran.model.Brastlewark;
import com.example.caleal.testaltran.model.BrastlewarkModel;

import java.util.ArrayList;

/**
 * Created by CALEAL on 11/27/2017.
 */


public class BrastlewarkAdapter extends RecyclerView.Adapter<BrastlewarkAdapter.BrastlewarkAvilableViewHolder> {

    Context mContext;
    ArrayList<BrastlewarkModel> brastlewarkModelArrayList;

    public BrastlewarkAdapter(Context mContext, ArrayList<BrastlewarkModel> brastlewarModelArrayList) {
        this.mContext = mContext;
        this.brastlewarkModelArrayList = brastlewarModelArrayList;
    }

    public BrastlewarkAdapter(MainActivity mContext, ArrayList<Brastlewark> arrayListBrastlewark) {
    }

    @Override
    public BrastlewarkAvilableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view_brastlewark = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_brastlewark_adapter,parent,false);
        BrastlewarkAdapter.BrastlewarkAvilableViewHolder vh_brastlewark = new BrastlewarkAdapter.BrastlewarkAvilableViewHolder(view_brastlewark);
        return vh_brastlewark;
    }

    @Override
    public void onBindViewHolder(BrastlewarkAvilableViewHolder holder, final int position) {

        //holder.Id.setText(String.valueOf(brastlewarkModelArrayList.get(position).getId()));
        //holder.Id.setText(String.valueOf(brastlewarkModelArrayList.get(position).getBrastlewark().get(position).getId()));
        //holder.Id.setText(String.valueOf(brastlewarkModelArrayList.get(position).getBrastlewark().get(position).getId()));
        /*holder.name.setText(String.valueOf(brastlewarkModelArrayList.get(position).getName()));
        holder.age.setText(brastlewarkModelArrayList.get(position).getAge());
        holder.weight.setText(String.valueOf(brastlewarkModelArrayList.get(position).getWeight()));
        holder.height.setText(String.valueOf(brastlewarkModelArrayList.get(position).getHeight()));
        holder.hair_color.setText(brastlewarkModelArrayList.get(position).getHairColor());*/

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle =new Bundle();
                //bundle.putString("Id",String.valueOf(brastlewarkModelArrayList.get(position).getBrastlewark().get(position).getId()));
                /*bundle.putString("Name",String.valueOf(brastlewarkModelArrayList.get(position).getName()));
                bundle.putInt("Age", Integer.parseInt(String.valueOf(brastlewarkModelArrayList.get(position).getAge())));
                bundle.putString("Weight",String.valueOf(brastlewarkModelArrayList.get(position).getWeight()));
                bundle.putString("Height",String.valueOf(brastlewarkModelArrayList.get(position).getHeight()));
                bundle.putString("HairColor",brastlewarkModelArrayList.get(position).getHairColor());*/

                ((MainActivity) mContext).openActivity(Brastlewark_data_activity.class,bundle);
            }
        });
    }



    @Override
    public int getItemCount() {
        return brastlewarkModelArrayList.size();
    }

    public class BrastlewarkAvilableViewHolder extends RecyclerView.ViewHolder {



        TextView Id;
        TextView name;
        TextView age;
        TextView weight;
        TextView height;
        TextView hair_color;



        View itemView;
        public BrastlewarkAvilableViewHolder(View itemView) {

            super(itemView);
            // ButterKnife.bind(this, itemView);
            this.itemView = itemView;
            Id = itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            weight = itemView.findViewById(R.id.weight);
            height =itemView.findViewById(R.id.height);
            hair_color =itemView.findViewById(R.id.hair_color);

        }
    }



}
