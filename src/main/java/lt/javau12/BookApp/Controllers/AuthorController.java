package lt.javau12.BookApp.Controllers;

import lt.javau12.BookApp.DTOs.AuthorDTO;
import lt.javau12.BookApp.services.AuthorService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/authors")
@CrossOrigin
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @GetMapping
    public List<AuthorDTO> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> getAuthorById(@PathVariable Long id){
        return ResponseEntity.ok(authorService.getAuthorById(id));
    }

//    @GetMapping("/{id}/books")
//    public GetAllBooksByAuthorId(@PathVariable Long id){
//
//    }

    @PostMapping
    public ResponseEntity<AuthorDTO> createAuthor( @RequestBody AuthorDTO author ){
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(authorService.createAuthor(author));
    }

}
