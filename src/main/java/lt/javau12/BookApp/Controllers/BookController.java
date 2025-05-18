package lt.javau12.BookApp.Controllers;

import lt.javau12.BookApp.DTOs.BookDTO;
import lt.javau12.BookApp.DTOs.BookCreateRequestDTO;
import lt.javau12.BookApp.services.BookService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
@CrossOrigin
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookDTO>> getAllBooks(){
        return ResponseEntity.ok(bookService.getAllBooks() );
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDTO> getBookById(@PathVariable Long id){
        BookDTO book = bookService.getBookById(id);
        return  ResponseEntity.ok(book);
    }

    @GetMapping("/author/{id}")// TEST URL localhost:8080/api/books/author/1
    public ResponseEntity<List<BookDTO>> getAllBooksByAuthorId(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getAllBooksByAuthorId(id));
    }


    @PostMapping
    public ResponseEntity<BookDTO> createBook(@RequestBody BookCreateRequestDTO bookCreateRequest){
        BookDTO bookDTO = bookService.createBook(bookCreateRequest);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(bookDTO);
    }

}
