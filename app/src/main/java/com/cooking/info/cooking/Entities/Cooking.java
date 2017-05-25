package com.cooking.info.cooking.Entities;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Naser on 5/24/2017.
 */

public class Cooking {

    public Cooking() {
    }



    public int Id;
    public String Name;
    public String Author;
    public String Description;
    public String ImageUrl;
    public String VideoUrl;
    public int Seen;
    public int Type;
    public double VideoSize;
    public String VideoLenght;
    public String CreateDate;

    public Cooking(int id, String name, String author, String description, String imageUrl, String videoUrl, int seen, int type, double videoSize, String videoLenght, String createDate) {
        Id = id;
        Name = name;
        Author = author;
        Description = description;
        ImageUrl = imageUrl;
        VideoUrl = videoUrl;
        Seen = seen;
        Type = type;
        VideoSize = videoSize;
        VideoLenght = videoLenght;
        CreateDate = createDate;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return VideoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        VideoUrl = videoUrl;
    }

    public int getSeen() {
        return Seen;
    }

    public void setSeen(int seen) {
        Seen = seen;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public double getVideoSize() {
        return VideoSize;
    }

    public void setVideoSize(double videoSize) {
        VideoSize = videoSize;
    }

    public String getVideoLenght() {
        return VideoLenght;
    }

    public void setVideoLenght(String videoLenght) {
        VideoLenght = videoLenght;
    }

}
