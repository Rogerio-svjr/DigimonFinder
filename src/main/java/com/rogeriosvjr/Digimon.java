package com.rogeriosvjr;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Digimon {
    @JsonProperty("name")
    private String name;
    @JsonProperty("img")
    private String img;
    @JsonProperty("level")
    private String level;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Digimon name: " + name + ", img: " + img + ", level: " + level;
    }
}
