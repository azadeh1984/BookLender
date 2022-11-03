package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person1 = new Person(1, "azadeh", "noamani");
        Book book1= new Book("java","azadeh",true);

        book1.setBorrower(person1);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getPersonalId());
        System.out.println(book1.getTitle());

        






    }

}
