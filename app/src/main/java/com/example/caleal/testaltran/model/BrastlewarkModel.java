package com.example.caleal.testaltran.model;

import java.util.List;

/**
 * Created by CALEAL on 11/27/2017.
 */

public class BrastlewarkModel {


    //public static String ID_KEY = "id";

    int id;
    String name;
    String thumbnail;
    int age;
    Double weight;
    Double height;
    String hair_color;
    List<String>  professions;
    //List<String>  friendsNames;
    List<String> friends;

    public BrastlewarkModel() {


    }

    public BrastlewarkModel(int id, String name, String thumbnail, int age, Double weight, Double height, String hair_color, List<String> professions, List<String> friends) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hair_color = hair_color;
        this.professions = professions;
        //this.friendsNames = friendsNames;
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getHairColor() {
        return hair_color;
    }

    public void setHairColor(String hair_color) {
        this.hair_color = hair_color;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }


}
