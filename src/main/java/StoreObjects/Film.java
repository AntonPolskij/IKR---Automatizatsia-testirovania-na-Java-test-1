package StoreObjects;

public class Film extends StoredObject{
    public Film(int inventoryNumber, String name) {
        super(inventoryNumber, name);
    }

    @Override
    public String getInfo() {
        return "Film - " + "inventoryNumber=" + getInventoryNumber() + ", name='" + getName() + '\n';
    }
}
