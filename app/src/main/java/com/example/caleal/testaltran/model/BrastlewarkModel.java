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
    String hairColor;
    List<String>  professions;
    //List<String>  friendsNames;
    List<String> friends;

    public BrastlewarkModel() {


    }

    public BrastlewarkModel(int id, String name, String thumbnail, int age, Double weight, Double height, String hairColor, List<String> professions, List<String> friends) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
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
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
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

/*public BrastlewarkModel(int userId, int id, String title, String body) {
    this.userId = userId;
    this.id = id;
    this.title = title;
    this.body = body;
}

    public BrastlewarkModel() {
    }

    private int id;
    private int userId;
    private String title;
    private String body;

    public int getUserId() { return this.userId; }

    public void setUserId(int userId) { this.userId = userId; }

    public int getId() { return this.id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    public String getBody() { return this.body; }

    public void setBody(String body) { this.body = body; }*/


   /* String id;
    String name;
    String photo;
    String age;
    String weight;
    String height;
    String hairColor;
    List<String> professions;
    List<String> friendsNames;
    List<BrastlewarkModel> friends;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    public List<String> getFriendsNames() {
        return friendsNames;
    }

    public void setFriendsNames(List<String> friendsNames) {
        this.friendsNames = friendsNames;
    }

    public List<BrastlewarkModel> getFriends() {
        return friends;
    }

    public void setFriends(List<BrastlewarkModel> friends) {
        this.friends = friends;
    }*/


}
