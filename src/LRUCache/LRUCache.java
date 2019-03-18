package LRUCache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LRUCache {

    private int capacity ;
    private int count = 0;
    private HashMap<Integer,Integer> map =  null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if (map == null){
            return -1;
        }
        if (!map.containsKey(key)){
            return -1;
        }else {
            //TODO put the key into the first place
            return map.get(key);
        }

    }

    public void put(int key, int value) {
        // no empyt ;put the first  and remove the last one
        if (count >= map.size()){
            removeEldestOne(map);
            map.put(key,value);
            count++;
        }else {
            map.put(key,value);
        }

    }

    private HashMap removeEldestOne(HashMap<Integer,Integer> map){
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()){
            it.next();
            Iterator<Integer> cur = it;
            if (!cur.hasNext()){
                it.remove();
            }
        }
        return map;
    }
}
