import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookService;

    @Test
    public void shouldFetchBooks() throws Exception {
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("title 1","author 1"));
        booksList.add(new BookDto("title 2","author 2"));
        Mockito.when(bookService.getBooks()).thenReturn(booksList);

        mockMvc.perform(MockMvcRequestBuilders.get("/books").contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(2)));
    }

    @Test
    public void shoudlAddNewBook() throws Exception {
        Gson gson = new Gson();
        String bookJsonCode  = "{\"title\":\"Na marginesie zycia\",\"author\":\"Stanislaw Grzesiuk\"}";
        BookDto book = gson.fromJson(bookJsonCode, BookDto.class);

        mockMvc.perform(MockMvcRequestBuilders.post("/books").contentType(MediaType.APPLICATION_JSON)
                .content(bookJsonCode))
                .andExpect(MockMvcResultMatchers.status().is(200));

    }
}