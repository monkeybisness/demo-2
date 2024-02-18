package com.example.demo.model;

import java.sql.Date;

public class Post {
    private String text;
    private Integer likes;

    private Date creationDate;

    public Post(String _text, Date _creationDate){
        creationDate = _creationDate;
        text = _text;
    }

    public Date getCreationDate(){
        return creationDate;
    }
    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }
}