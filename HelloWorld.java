import java.time.LocalDate;

class HelloWorld {
    public static void main(String[] args){




        //=========== DATI DI USER ===========

        User user = new User();

        user.name = "Gennaro Rossi";
        user.birthDay = LocalDate.parse("1995-01-31");


        
        //=========== DATI DI BOOK ===========

        Book book = new Book();

        book.title = "Il Problema dei Tre Corpi";
        book.author = "Cixin Liu";

        //LO USER PRENDE IN PRESTITO QUESTO book.
        user.borrow(book);



        //STAMPA USER E I SUOI DATI
        System.out.printf("%s was born in %s and he is %d years old", 
            user.name, user.birthDay.toString(), user.age());

        //STAMPA BOOK E I SUOI DATI
        System.out.printf("%s has borrowed these books: %s \n",
            user.name, user.books.toString());

        System.out.printf("%s è un bellissimo libro \n",
            book.toString());

    }
}