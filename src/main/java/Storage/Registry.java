package Storage;

import StoreObjects.StoredObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Registry implements Iterable<StoredObject>{
    private List<StoredObject> storedObjects;

    public Registry() {
        this.storedObjects = new ArrayList<>();
    }

    public String getRegistryInfo() {
        StringBuilder sb = new StringBuilder();
        for (StoredObject storedObject : storedObjects) {
            sb.append(storedObject.getInfo());
        }
        return sb.toString();
    }

    public Registry addObject(StoredObject storedObject) {
        if (storedObject == null) throw new NullPointerException("Объект не может быть null");
        storedObjects.add(storedObject);
        return this;
    }

    @Override
    public Iterator<StoredObject> iterator() {
        return new RegistryIterator();
    }
}
