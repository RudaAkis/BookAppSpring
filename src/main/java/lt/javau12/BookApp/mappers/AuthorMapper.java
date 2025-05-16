package lt.javau12.BookApp.mappers;

import lt.javau12.BookApp.DTOs.AuthorDTO;
import lt.javau12.BookApp.entities.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public Author toEntity(AuthorDTO dto) {
        return new Author(
                dto.getAuthor_id(),
                dto.getFirstName(),
                dto.getLastName()
        );
    }
    //To entity used to update an entity by getting the Author by the ID
    public Author toEntity(AuthorDTO dto, Long id) {
        return new Author(
                id,
                dto.getFirstName(),
                dto.getLastName()
        );
    }

    public AuthorDTO toDTO(Author entity) {
        return new AuthorDTO(
                entity.getAuthor_id(),
                entity.getFirstName(),
                entity.getLastName()
        );
    }
}
