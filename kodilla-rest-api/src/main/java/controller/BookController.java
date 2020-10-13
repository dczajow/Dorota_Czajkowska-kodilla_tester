package controller;

import domain.BookDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookDto bookDto){
        bookService.addBook(bookDto);
    }
    @DeleteMapping
    public void deleteBook(@RequestBody BookDto bookDto){
        bookService.deleteBook(bookDto);
    }
}