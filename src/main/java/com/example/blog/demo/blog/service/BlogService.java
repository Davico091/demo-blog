package com.example.blog.demo.blog.service;


import com.example.blog.demo.blog.entity.Author;
import com.example.blog.demo.blog.entity.Blog;
import com.example.blog.demo.blog.entity.Post;

public interface BlogService {
    Author saveAuthor(Author author);

    Post savePost(Post post);

    String saveBlog(Blog blog);
}
