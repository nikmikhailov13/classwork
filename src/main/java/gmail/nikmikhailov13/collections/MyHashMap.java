package gmail.nikmikhailov13.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;

public class MyHashMap<K,V> extends LinkedHashMap<K,V> {
    @Override
    public String toString() {
        return "MyHashMap" + super.toString();
    }
}
