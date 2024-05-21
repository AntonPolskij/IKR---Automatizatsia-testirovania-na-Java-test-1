package Storage;

import StoreObjects.StoredObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RegistryIterator implements Iterator {
    private List<StoredObject> storedObjects;
    private  int index;

    public RegistryIterator() {
        this.storedObjects = new ArrayList<>();
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < storedObjects.size();
    }

    @Override
    public Object next() {
        return storedObjects.get(index++);
    }
}
