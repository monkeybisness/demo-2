package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes = 0;
    private Long id;
    private Date creationDate;

    public Post(Long _id, String _text, Date _creationDate){
        id = _id;
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

    public Long getId(){
        return id;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }
}