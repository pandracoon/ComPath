package com.example.compath.Data;

public class SimpleSpot {

    private String name, location, explanation, image;

    public SimpleSpot(String name, String location, String explanation, String image) {
        this.name = name;
        this.location = location;
        this.explanation = explanation;
        this.image = image;
    }

    public String getData(String key) {
        switch (key) {
            case "name":
                return name;
            case "location":
                return location;
            case "explanation":
                return explanation;
            case "image":
                return image;
        }
        return null;
    }

}
