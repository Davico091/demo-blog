package com.example.blog.demo.blog.service;

import com.example.blog.demo.blog.entity.Author;
import com.example.blog.demo.blog.entity.Blog;
import com.example.blog.demo.blog.entity.Post;
import com.example.blog.demo.blog.repository.AuthorRepository;
import com.example.blog.demo.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Author saveAuthor(Author author) {

        return authorRepository.save(author);
    }

    @Override
    public Post savePost(Post post) {
        return null;
    }

    @Override
    public String saveBlog(Blog blog) {

        Author author =  authorRepository.getById(blog.getAuthor().getId());
        
        String fecha1 = author.getBirthDate();

        Date date1 = null;
        LocalDate fechaNac = null ;
        try {

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             fechaNac = LocalDate.parse(fecha1, fmt);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Period periodo = Period.between(fechaNac, LocalDate.now());

        if(periodo.getYears()>=18){
            if (author.getBlogs().size()>=3){
                return "Un autor no puede tener mas de 3 blogs";
            }
            else{
                blogRepository.save(blog);
                return "blog registrado con exito";
            }
        }
        else {
            return "Solo autores nayores de edad pueden tener un blog";
        }




    }
}
