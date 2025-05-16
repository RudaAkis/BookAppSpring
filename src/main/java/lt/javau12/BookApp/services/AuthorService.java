package lt.javau12.BookApp.services;

import lt.javau12.BookApp.DTOs.AuthorDTO;
import lt.javau12.BookApp.DTOs.BookDTO;
import lt.javau12.BookApp.entities.Author;
import lt.javau12.BookApp.mappers.AuthorMapper;
import lt.javau12.BookApp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.Collectors;

@Service
public class AuthorService {


    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    public AuthorService(AuthorRepository authorRepository,
                         AuthorMapper authorMapper){
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
    }

    public List<AuthorDTO> getAllAuthors(){
        return authorRepository.findAll().stream()
                .map(authorMapper::toDTO)
                .collect(Collectors.toList());
    }

    public AuthorDTO createAuthor(AuthorDTO authorDTO){
        Author author = authorMapper.toEntity(authorDTO);//Create entity of author
        return authorMapper.toDTO(authorRepository.save(author));//Save entity to DB and map the returned entity to DTO

    }

    public AuthorDTO getAuthorById(Long id){
        Author author = authorRepository.findById(id).orElseThrow( () -> new RuntimeException("Author not found by Id" + id));
        return authorMapper.toDTO(author);
    }
}
