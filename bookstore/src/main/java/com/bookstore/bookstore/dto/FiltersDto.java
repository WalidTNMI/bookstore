package com.bookstore.bookstore.dto;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FiltersDto {

    private List<Long> id;

    private List<String> title;

    private List<String> description;

    private List<String> author;

    private List<String> genre;

    private List<String> format;

    private List<Integer> volumes;

    public FiltersDto() {
    }

    public List<Long> getId() {
        return id;
    }

    public void setId(List<Long> id) {
        this.id = id;
    }

    public List<String> getTitle() {
        return title;
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getFormat() {
        return format;
    }

    public void setFormat(List<String> format) {
        this.format = format;
    }

    public List<Integer> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Integer> volumes) {
        this.volumes = volumes;
    }
}
