package com.example.blog.demo.blog.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;

    @Column
    private String title;

    @Column
    private String date;

    @Column
    private String status;

    @Column
    private String content;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "blog_id")
    private Blog blog;

    @OneToMany(targetEntity = Comment.class)
    private List<Comment> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
