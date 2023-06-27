public class Book {

    private String title;
    private String author;

    //COSTRUTTORE
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }


    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }
    

    //QUESTO IMPOSTA L'ASPETTO DELL'OGGETTO BOOK
    public String toString(){
        return String.format("%s by %s", this.title, this.author);
    }
}