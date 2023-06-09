package item03;

import java.util.HashMap;

public enum CacheSingleton implements Cache {
    //burada hicbir private constructora ve baska metoda gerek duymadan isimzi halletik
    INSTANCE;

    private HashMap<Object, Object> map = new HashMap<Object, Object>();

    public void put(Object key, Object value){
        map = new HashMap<Object,Object>();
    }

    public Object get(Object key){
        return map.get(key);
    }
}
