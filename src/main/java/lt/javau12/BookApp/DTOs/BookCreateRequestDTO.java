package lt.javau12.BookApp.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lt.javau12.BookApp.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCreateRequestDTO {
    private String title;
    private int year;
    @JsonProperty("author_id")
    private Long author_id;
    private String authorFirstname;
    private String authorLastname;
    private AuthorDTO author;
    private Boolean isInStock;

//    public Long getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Long bookId) {
//        this.bookId = bookId;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Long getAuthorId() {
        return author_id;
    }

    public void setAuthorId(Long author_id) {
        this.author_id = author_id;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public Boolean getIsInStock() {
        return isInStock;
    }

    public void setIsInStock(Boolean isInStock) {
        this.isInStock = isInStock;
    }
}


//package lt.javau12.BookApp.DTOs;
//
//public class BookCreateRequestDTO {
//    private Long bookId;
//    private String title;
//    private int year;
//    private Long authorId;
//    private String authorFirstname;
//    private String authorLastname;
//
//    public Long getBookId() {
//        return bookId;
//    }
//
//    public void setBookId(Long bookId) {
//        this.bookId = bookId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public Long getAuthorId() {
//        return authorId;
//    }
//
//    public void setAuthorId(Long authorId) {
//        this.authorId = authorId;
//    }
//
//    public String getAuthorFirstname() {
//        return authorFirstname;
//    }
//
//    public void setAuthorFirstname(String authorFirstname) {
//        this.authorFirstname = authorFirstname;
//    }
//
//    public String getAuthorLastname() {
//        return authorLastname;
//    }
//
//    public void setAuthorLastname(String authorLastname) {
//        this.authorLastname = authorLastname;
//    }
//}
