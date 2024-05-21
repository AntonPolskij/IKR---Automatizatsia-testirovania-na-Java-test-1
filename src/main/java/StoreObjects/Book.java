package StoreObjects;

public class Book extends StoredObject{
    public Book(int inventoryNumber, String name) {
        super(inventoryNumber, name);
    }

    @Override
    public String getInfo() {
        return "Book - " + "inventoryNumber=" + getInventoryNumber() + ", name='" + getName() + '\n';
    }
}
