import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthDay;
    public ArrayList<Book> books = new ArrayList<Book>();


    //LETTERALMENTE "prendere in prestito 
    // 1 singolo elemento-oggetto Book
    // che chiameremo book".

    //AGGIUNGE IL LIBRO ALL'ARRAYLIST books
    public void borrow(Book book) {
        this.books.add(book);
    }

    //calcola l'età
    public int age(){
        long years = ChronoUnit.YEARS.between(this.birthDay, LocalDate.now());

        return (int) years;
    }
}
