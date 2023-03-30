package com.bookstore.bookstore.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String title;

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private String author;

    @Column(nullable = true)
    private String genre;

    @Column(nullable = true)
    private String format;

    @Column(nullable = true)
    private Integer volumes;
    
    @Column(nullable =  true)
    private LocalDateTime lastUpdate;

    @Column(nullable =  true)
    private LocalDateTime createdOn;

    // Costruttori	

    public Book() {};

    public Book(Long id, String title, String description, String author, String genre, String format, Integer volumes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.genre = genre;
        this.format = format;
        this.volumes = volumes;
        this.createdOn = LocalDateTime.now();
    }

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Integer getVolumes() {
		return volumes;
	}

	public void setVolumes(Integer volumes) {
		this.volumes = volumes;
	}

	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
    
}
