package com.example.BookApplication;

public class Book {
    private String Bname;
    private  String authorName;
    private  int pages;

    public Book(String Bname, String authorName, int pages) {
        this.Bname = Bname;
        this.authorName = authorName;
        this.pages = pages;
    }

    public Book() {
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String Bname) {
        this.Bname = Bname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
