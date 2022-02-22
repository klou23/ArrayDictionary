import java.util.ArrayList;
import java.util.Collection;

public class ArrayDictionary <E,T>{

    private ArrayList<E> keys;
    private ArrayList<T> values;
    private int size;

    public ArrayDictionary() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
        size = 0;
    }

    public void put(E key, T value){
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i) == null){
                keys.set(i, key);
                values.set(i, value);
                size++;
                return;
            }
        }
        keys.add(key);
        values.add(value);
    }

    public T get(E key){
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i).equals(key)) return values.get(i);
        }
        return null;
    }

    public T remove(E key){
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i).equals(key)){
                T ret = values.get(i);
                keys.set(i, null);
                values.set(i, null);
                size--;
                return ret;
            }
        }
        return null;
    }

    public boolean contains(E key){
        for(int i = 0; i < keys.size(); i++){
            if(keys.get(i).equals(key)) return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public Collection<E> keys(){
        Collection<E> ret = new ArrayList<>();
        for(var key : keys){
            if(key != null) ret.add(key);
        }
        return ret;
    }

    public Collection<T> values(){
        Collection<T> ret = new ArrayList<>();
        for(var val : values){
            if(val != null) ret.add(val);
        }
        return ret;
    }

}
