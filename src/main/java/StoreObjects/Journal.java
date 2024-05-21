package StoreObjects;

public class Journal extends StoredObject {
    public Journal(int inventoryNumber, String name) {
        super(inventoryNumber, name);
    }

    @Override
    public String getInfo() {
        return "Journal - " + "inventoryNumber=" + getInventoryNumber() + ", name='" + getName() + '\n';
    }
}
