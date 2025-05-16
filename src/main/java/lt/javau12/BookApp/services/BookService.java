package lt.javau12.BookApp.services;

import lt.javau12.BookApp.DTOs.AuthorDTO;
import lt.javau12.BookApp.DTOs.BookDTO;
import lt.javau12.BookApp.DTOs.BookCreateRequestDTO;
import lt.javau12.BookApp.entities.Author;
import lt.javau12.BookApp.entities.Book;
import lt.javau12.BookApp.mappers.AuthorMapper;
import lt.javau12.BookApp.mappers.BookMapper;
import lt.javau12.BookApp.repositories.BookRepository;
import lt.javau12.BookApp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    List<BookDTO> books = new ArrayList<>();
    private final AuthorService authorService;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;
    private final AuthorMapper authorMapper;

    public BookService(AuthorService authorService,
                       AuthorRepository authorRepository,
                       BookRepository bookRepository,
                       BookMapper bookMapper,
                       AuthorMapper authorMapper){
        this.authorService = authorService;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
        this.authorMapper = authorMapper;
    }

    public List<BookDTO> getAllBooks(){
        return bookRepository.findAll().stream()
                .map(book -> bookMapper.toDTO(book, authorMapper.toDTO(book.getAuthor())))
                .collect(Collectors.toList());
    }


    public BookDTO createBook(BookCreateRequestDTO bookCreateRequest){

        Author authorEntity = getAuthorEntityForBook(bookCreateRequest);

        AuthorDTO authorDTO = authorMapper.toDTO(authorEntity);
        BookDTO bookDTO = new BookDTO(bookCreateRequest.getTitle(), bookCreateRequest.getYear(), authorDTO);

        Book bookEntity = bookMapper.toEntity(bookDTO, authorEntity);
        bookRepository.save(bookEntity);

        AuthorDTO updatedAuthorDTO = authorMapper.toDTO(bookEntity.getAuthor());
        return bookMapper.toDTO(bookEntity, updatedAuthorDTO);
    }


    private Author getAuthorEntityForBook(BookCreateRequestDTO bookCreateRequest) {
        //Return author if ID is not null in db
        return authorRepository.findById(bookCreateRequest.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found with id: " + bookCreateRequest.getAuthorId()));

    }

    public BookDTO getBookById(Long id){
        Book book = bookRepository.findById(id).orElseThrow( () -> new RuntimeException("No book was found by id" + id) );
        return bookMapper.toDTO(book, authorMapper.toDTO(book.getAuthor()));
    }
}

