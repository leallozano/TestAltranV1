package com.example.caleal.testaltran.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.caleal.testaltran.Activities.BrastlewarkFilter;
import com.example.caleal.testaltran.Activities.Brastlewark_data_activity;
import com.example.caleal.testaltran.Activities.MainActivity;
import com.example.caleal.testaltran.R;
import com.example.caleal.testaltran.model.Brastlewark;
import com.example.caleal.testaltran.model.BrastlewarkModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by CALEAL on 12/4/2017.
 */

public class FilterAdapter extends RecyclerView.Adapter<FilterAdapter.BrastlewarkAvilableViewHolder> {

    Context mContext;
    ArrayList<BrastlewarkModel> brastlewarkModelArrayList;

    public FilterAdapter(Context mContext, ArrayList<BrastlewarkModel> brastlewarModelArrayList) {
        this.mContext = mContext;
        this.brastlewarkModelArrayList = brastlewarModelArrayList;
    }

    public FilterAdapter(MainActivity mContext, ArrayList<Brastlewark> arrayListBrastlewark) {
    }

    @Override
    public FilterAdapter.BrastlewarkAvilableViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view_brastlewark = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_brastlewark_adapter,parent,false);
        FilterAdapter.BrastlewarkAvilableViewHolder vh_brastlewark = new FilterAdapter.BrastlewarkAvilableViewHolder(view_brastlewark);
        return vh_brastlewark;
    }

    @Override


    public void onBindViewHolder(BrastlewarkAvilableViewHolder holder, final int position) {

        holder.Id.setText("ID: " + String.valueOf(brastlewarkModelArrayList.get(position).getId()));
        holder.name.setText("Name: " +String.valueOf(brastlewarkModelArrayList.get(position).getName()));
        holder.age.setText("Age: " +String.valueOf(brastlewarkModelArrayList.get(position).getAge()));
        holder.weight.setText("Weight: " +String.valueOf(brastlewarkModelArrayList.get(position).getWeight()));
        holder.height.setText("Height: " +String.valueOf(brastlewarkModelArrayList.get(position).getHeight()));
        holder.hair_color.setText("Hair Color: " +String.valueOf(brastlewarkModelArrayList.get(position).getHairColor()));
        Picasso.with(mContext).load(brastlewarkModelArrayList.get(position).getThumbnail()).resize(150, 200).into(holder.Thumbnail);


        /*holder.itemView.setOnClickListener(new View.OnClickListener( ){
            @Override
            public void onClick(View v) {

                Bundle bundle =new Bundle();
                bundle.putString("Id",String.valueOf(brastlewarkModelArrayList.get(position).getId()));
                bundle.putString("Name",String.valueOf(brastlewarkModelArrayList.get(position).getName()));
                bundle.putInt("Age", Integer.parseInt(String.valueOf(brastlewarkModelArrayList.get(position).getAge())));
                bundle.putString("Weight",String.valueOf(brastlewarkModelArrayList.get(position).getWeight()));
                bundle.putString("Height",String.valueOf(brastlewarkModelArrayList.get(position).getHeight()));
                bundle.putString("HairColor",brastlewarkModelArrayList.get(position).getHairColor());
                bundle.putString("Thumbnail",brastlewarkModelArrayList.get(position).getThumbnail());
                bundle.putString("Professions", String.valueOf(brastlewarkModelArrayList.get(position).getProfessions()));
                bundle.putString("Friends", String.valueOf(brastlewarkModelArrayList.get(position).getFriends()));

                ((MainActivity) mContext).openActivity(Brastlewark_data_activity.class,bundle);
            }
        });*/
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
        ImageView Thumbnail;


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
            Thumbnail = (ImageView) itemView.findViewById(R.id.Photo);
        }
    }

}
