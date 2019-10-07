package com.example.compath.Data;

import java.util.ArrayList;

public class Tour {

    //date도 저장해야함. 어떤 Type으로 저장할지 고민해봐야함
    private String name, area, uploader, user;
    private int id;

    private ArrayList<ArrayList<Spot>> plan;

    public Tour(String name, String area, String uploader, String user, int id, ArrayList<ArrayList<Spot>> plan) {
        this.name = name;
        this.area = area;
        this.uploader = uploader;
        this.user = user;
        this.id = id;
        this.plan = plan;
    }

    public String getData(String key) {
        switch (key) {
            case "name":
                return name;
            case "area":
                return area;
            case "uploader":
                return uploader;
            case "user":
                return user;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public ArrayList<ArrayList<Spot>> getPlan() {
        return plan;
    }

    public int getSizeOfPlan(){
        return plan.size();
    }
}
