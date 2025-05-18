package lt.javau12.BookApp.repositories;

import lt.javau12.BookApp.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.author.author_id = :authorId")
    List<Book> findAllByAuthorId(@Param("authorId") Long authorId);
//    List<Book> findAllByAuthor_AuthorId(Long author_id);

}
