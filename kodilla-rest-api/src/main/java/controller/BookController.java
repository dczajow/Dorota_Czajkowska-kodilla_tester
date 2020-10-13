package controller;

import java.util.List;

@RestController
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