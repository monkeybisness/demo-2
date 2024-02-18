package com.example.demo.model;

public class Post {
    private String text;
    private Integer likes;

    public Post(String _text){
        text = _text;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }
}