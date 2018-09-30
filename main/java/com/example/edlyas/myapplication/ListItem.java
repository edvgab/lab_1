package com.example.edlyas.myapplication;

public class ListItem {

    private String title;
    private  int imageId;
    private String description;

    public ListItem(String title, int ImageId, String description){
        this.title = title;
        this.imageId = imageId;
        this.description = description;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getImageId(){
        return imageId;
    }

    public void setImageId(int imageId){
        this.imageId = imageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
