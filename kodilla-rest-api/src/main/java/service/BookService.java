package service;

import domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks(){
        return books;
    }

    public void addBook(BookDto bookDto){
        books.add(bookDto);
    }
    public void deleteBook(BookDto bookDto){
        books.remove(bookDto);
    }
}