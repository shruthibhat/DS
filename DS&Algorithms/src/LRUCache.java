import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	
	LinkedHashMap<Integer, Integer> cache;
	
	public LRUCache(int capacity) {
		this.cache = new LinkedHashMap<Integer,Integer>(capacity, 1.0f, true) {
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {
				 return this.size() > capacity;
			 }
		};
	}
	
	public Integer lookUp(Integer key) {
		return cache.getOrDefault(key, -1);
	}
	
	public void insert(Integer key, Integer value) {	
		cache.putIfAbsent(key, value);
		//cache.put(key,value);
	}
	
	public Boolean erase(Object key) {
		return cache.remove(key) != null ;
	}

}
