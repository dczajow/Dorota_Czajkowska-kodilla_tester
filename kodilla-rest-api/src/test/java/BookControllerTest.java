import controller.BookController;
import domain.BookDto;
import org.junit.Test;
import service.BookService;

import java.util.ArrayList;
import java.util.List;


class BookControllerTest {

    @Test
    public void shouldFetchBooks(){
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController =  new BookController(bookServiceMock);

        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1","Author 1"));
        booksList.add(new BookDto("Title 2","Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        // when
        List<BookDto> result = bookController.getBooks();
        // then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shoudlAddBook(){
        // given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController =  new BookController(bookServiceMock);
        BookDto book = new BookDto("Title 1","Author 1");
        bookController.addBook(book);
        Mockito.verify(bookServiceMock).addBook(book);
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(book);

    }

}