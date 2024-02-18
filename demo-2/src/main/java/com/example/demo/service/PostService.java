package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();
    private Long index = 0L;

    public void create(String text) {
        posts.add(new Post(index++,text, new Date()));
    }
    public List<Post> listAllPosts(){
        return posts;
    }
}
