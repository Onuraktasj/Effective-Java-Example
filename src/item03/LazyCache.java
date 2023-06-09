package item03;

import java.util.HashMap;

public class LazyCache implements  Cache{

    //Lazy denmesinin sebebi sadece cagrildigi zaman nesne uretmesi

    public static LazyCache instance;
     private HashMap<Object, Object> map;

    private LazyCache(){
        map  = new HashMap<Object, Object>();
    }

    public void put (Object key, Object value){
        map = new HashMap<Object, Object>();
    }

    public Object get(Object key){
        return map.get(key);
    }

    public static LazyCache getInstance(){
        //gelen instance null iste yeni br insatance yaratiyor eger null degil ise ayni nesneyi geri donuyor
        if(instance == null)
        {
            instance = new LazyCache();
        }

        return instance;
    }
}
