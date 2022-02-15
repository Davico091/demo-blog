package com.example.blog.demo.blog.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(unique = true , nullable = false)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String url;

    @Column
    private String status;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "blog")
    private List<Post> posts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }



    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", status='" + status + '\'' +
                ", posts=" + posts +
                '}';
    }
}
