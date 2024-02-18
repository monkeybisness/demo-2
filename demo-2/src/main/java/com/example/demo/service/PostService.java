package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    public PostService(){
        posts.add(new Post("Hello world!!!", new Date()));
        posts.add(new Post("!!!", new Date()));
        posts.add(new Post("!!!", new Date()));
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
    public List<Post> listAllPosts(){
        return posts;
    }
}
