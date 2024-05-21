import Storage.Registry;
import StoreObjects.Book;
import StoreObjects.Film;
import StoreObjects.Journal;

public class Main {
    public static void main(String[] args){
        Registry cityRegistry = new Registry();
        Book book = new Book(1,"Jungle Book");
        Film film = new Film(2,"Lion King");
        Journal journal = new Journal(3,"Rolling Stones");

        cityRegistry.addObject(book)
                    .addObject(film)
                    .addObject(journal);

        System.out.println(cityRegistry.getRegistryInfo());
    }
}
