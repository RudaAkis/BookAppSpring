package lt.javau12.BookApp.DTOs;

import lt.javau12.BookApp.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorDTO {

    private Long author_id;
    private String firstName;
    private String lastName;
    private List<BookDTO> authorBooks = new ArrayList<>();

    public AuthorDTO() {
    }

    public AuthorDTO(Long author_id, String firstName, String lastName) {
        this.author_id = author_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AuthorDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AuthorDTO(Long authorId, String firstName, String lastName, List<BookDTO> authorBooks) {
        this.author_id = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.authorBooks = authorBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id='" + author_id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

//package lt.javau12.BookApp.DTOs;
//
//import lt.javau12.BookApp.entities.Book;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AuthorDTO {
//
//    private Long author_id;
//    private String firstName;
//    private String lastName;
//
//    public AuthorDTO() {
//    }
//
//    public AuthorDTO(Long author_id, String firstName, String lastName) {
//        this.author_id = author_id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public AuthorDTO(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    @Override
//    public String toString() {
//        return "Author{" +
//                "auhtor_id='" + author_id + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//
//    public Long getAuhtor_id() {
//        return author_id;
//    }
//
//    public void setAuhtor_id(Long author_id) {
//        this.author_id = author_id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//
//}
