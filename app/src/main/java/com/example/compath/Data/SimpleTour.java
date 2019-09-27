package com.example.compath.Data;

import java.util.ArrayList;

public class SimpleTour {

    private String name, area, uploader;
    private int id;
    private ArrayList<ArrayList<Spot>> plan;

    public SimpleTour(String name, String area, String uploader, int id, ArrayList<ArrayList<Spot>> plan) {
        this.name = name;
        this.area = area;
        this.uploader = uploader;
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
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public ArrayList<ArrayList<Spot>> getPlan() {
        return plan;
    }
}
