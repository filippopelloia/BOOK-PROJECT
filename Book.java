import java.time.LocalDate;

class Book {
    public static void main(String[] args){
        User youngerUser = new User();

        youngerUser.name = "Gennaro Rossi";
        youngerUser.birthDay = LocalDate.parse("1995-01-31");

        System.out.printf("%s was born in %s", youngerUser.name, youngerUser.birthDay);
    }
}