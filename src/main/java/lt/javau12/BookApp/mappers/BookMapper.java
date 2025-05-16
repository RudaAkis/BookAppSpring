package lt.javau12.BookApp.mappers;

import lt.javau12.BookApp.DTOs.AuthorDTO;
import lt.javau12.BookApp.DTOs.BookDTO;
import lt.javau12.BookApp.entities.Author;
import lt.javau12.BookApp.entities.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public Book toEntity(BookDTO dto, Author author){
        return new Book(
                dto.getTitle(),
                dto.getYear(),
                author
        );
    }

    public BookDTO toDTO(Book entity, AuthorDTO authorDTO){
        return new BookDTO(
                entity.getBook_id(),
                entity.getTitle(),
                entity.getYear(),
                authorDTO
        );
    }

}
