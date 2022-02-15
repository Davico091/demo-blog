package com.example.blog.demo.blog.controller;


import com.example.blog.demo.blog.entity.Author;
import com.example.blog.demo.blog.entity.Blog;
import com.example.blog.demo.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public String prueba(){
        return "hola mundo";
    }

    @PostMapping
    public Author save(@RequestBody Author author){
        return this.blogService.saveAuthor(author);
    }

    @PostMapping("/blog")
    public String save(@RequestBody Blog blog){
        return this.blogService.saveBlog(blog);
    }

}
