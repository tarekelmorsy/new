package com.example.challenge;

public class Book
{
    private String author;
    private String title;
    private String gener;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public Book(String author, String title, String gener) {
        this.author = author;
        this.title = title;
        this.gener = gener;
    }
}
