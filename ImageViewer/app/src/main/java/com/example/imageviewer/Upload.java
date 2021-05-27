package com.example.imageviewer;

public class Upload {

    private String name;
    private String imageUrl;

    public Upload(){}

    public Upload(String name, String imageUrl) {
        if(name.trim().equals("")){
            this.name = "No name";
        }else {
            this.name = name;
        }
        this.imageUrl = imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
