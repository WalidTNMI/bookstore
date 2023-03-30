//package com.bookstore.bookstore;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.bookstore.bookstore.model.Book;
//import com.bookstore.bookstore.repository.BookRepository;
//@ExtendWith(SpringExtension.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureTestDatabase(replace = Replace.ANY)
//public class BookstoreApplicationTests {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @LocalServerPort
//    private int port;
//
//    @Test
//    public void testGetAllBooks() {
//        Book book1 = new Book();
//        book1.setTitle("Book 1");
//        book1.setDescription("Description 1");
//        book1.setAuthor("Author 1");
//        book1.setGenre("Genre 1");
//        book1.setFormat("Format 1");
//        book1.setVolumes(1);
//
//        Book book2 = new Book();
//        book2.setTitle("Book 2");
//        book2.setDescription("Description 2");
//        book2.setAuthor("Author 2");
//        book2.setGenre("Genre 2");
//        book2.setFormat("Format 2");
//        book2.setVolumes(2);
//
//        bookRepository.saveAll(Arrays.asList(book1, book2));
//
//        ResponseEntity<Book[]> response = restTemplate.getForEntity("/books", Book[].class);
//        List<Book> books = Arrays.asList(response.getBody());
//
//        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
//        assertThat(books.size()).isEqualTo(2);
//        assertThat(books.get(0).getTitle()).isEqualTo("Book 1");
//        assertThat(books.get(0).getDescription()).isEqualTo("Description 1");
//        assertThat(books.get(0).getAuthor()).isEqualTo("Author 1");
//        assertThat(books.get(0).getGenre()).isEqualTo("Genre 1");
//        assertThat(books.get(0).getFormat()).isEqualTo("Format 1");
//        assertThat(books.get(0).getVolumes()).isEqualTo(1);
//        assertThat(books.get(1).getTitle()).isEqualTo("Book 2");
//        assertThat(books.get(1).getDescription()).isEqualTo("Description 2");
//        assertThat(books.get(1).getAuthor()).isEqualTo("Author 2");
//        assertThat(books.get(1).getGenre()).isEqualTo("Genre 2");
//        assertThat(books.get(1).getFormat()).isEqualTo("Format 2");
//        assertThat(books.get(1).getVolumes()).isEqualTo(2);
//    }
//
//    // add more tests as needed
//
//}
