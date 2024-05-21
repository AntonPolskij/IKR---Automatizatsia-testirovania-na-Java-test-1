package StoreObjects;

public abstract class StoredObject {
    private int inventoryNumber;
    private String name;

    public StoredObject(int inventoryNumber, String name) {
        this.inventoryNumber = inventoryNumber;
        this.name = name;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public String getName() {
        return name;
    }


    public abstract String getInfo();
}
