package com.example.caleal.testaltran.model;

/**
 * Created by Carlos on 12/3/2017.
 */

public class Filter {


    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinage() {
        return Minage;
    }

    public void setMinage(int minage) {
        Minage = minage;
    }

    public int getMaxage() {
        return Maxage;
    }

    public void setMaxage(int maxage) {
        Maxage = maxage;
    }

    public Double getMinweight() {
        return Minweight;
    }

    public void setMinweight(Double minweight) {
        Minweight = minweight;
    }

    public Double getMaxweight() {
        return Maxweight;
    }

    public void setMaxweight(Double maxweight) {
        Maxweight = maxweight;
    }

    public Double getMinheight() {
        return Minheight;
    }

    public void setMinheight(Double minheight) {
        Minheight = minheight;
    }

    public Double getMaxheight() {
        return Maxheight;
    }

    public void setMaxheight(Double maxheight) {
        Maxheight = maxheight;
    }

    int Minage;
    int Maxage;
    Double Minweight;
    Double Maxweight;
    Double Minheight;
    Double Maxheight;
    //String haircolor;
    //List<String> professions;
    //List<String> friends;



    public Filter() {

        this.name = name;
        this.Minage = Minage;
        this.Maxage = Minage;
        this.Minweight = Minweight;
        this.Maxweight = Maxweight;
        this.Minheight = Minheight;
        this.Maxheight = Maxheight;
        //this.haircolor = hair_color;
        //this.professions = professions;
        //this.friendsNames = friendsNames;
        //this.friends = friends;
    }




}

