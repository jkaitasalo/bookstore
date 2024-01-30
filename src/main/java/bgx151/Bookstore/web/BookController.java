package bgx151.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import bgx151.Bookstore.domain.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

 @GetMapping("/index")
 public String index(Model model) {
     List<Book> books = getSampleBooks();
     model.addAttribute("books", books);
     return "index";
 }

 private List<Book> getSampleBooks() {
     List<Book> books = new ArrayList<>();
     books.add(new Book("Title 1", "Author 1", 2020, "ISBN1", 29.99));
     books.add(new Book("Title 2", "Author 2", 2018, "ISBN2", 19.99));
     return books;
 }
}
