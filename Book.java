public class Book {

    public String title;
    public String author;

    //QUESTO IMPOSTA L'ASPETTO DELL'OGGETTO BOOK
    public String toString(){
        return String.format("%s by %s", this.title, this.author);
    }
}