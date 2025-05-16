package lt.javau12.BookApp.DTOs;

public class BookDTO {

    private Long id;
    private String title;
    private int year;
    private AuthorDTO author;

    public BookDTO() {
    }

    public BookDTO(Long id, String title, int year, AuthorDTO author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public BookDTO(String title, int year, AuthorDTO author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", author=" + author +
                '}';
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
