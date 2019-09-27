package com.example.compath.Data;

import java.util.ArrayList;

public class Spot {

    private String name, location;
    private ArrayList<String> explanation;

    public Spot(String name, String location, ArrayList<String> explanation) {
        this.name = name;
        this.location = location;
        this.explanation = explanation;
    }

    public String getData(String key) {
        switch (key) {
            case "name":
                return name;
            case "location":
                return location;
        }
        return null;
    }

    public ArrayList<String> getExplanation(){
        return explanation;
    }

}
