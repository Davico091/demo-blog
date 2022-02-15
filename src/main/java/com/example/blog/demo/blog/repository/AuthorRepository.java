package com.example.blog.demo.blog.repository;


import com.example.blog.demo.blog.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository  extends JpaRepository<Author, Long> {
}
