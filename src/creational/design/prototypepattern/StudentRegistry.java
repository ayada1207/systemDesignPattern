package creational.design.prototypepattern;

import java.util.HashMap;

// In Registry we ll create a prototype object then we will make a clone this prototype in Student class
public class StudentRegistry {

    HashMap<String, Student> map = new HashMap<>();

    public void register(String key, Student student){
        map.put(key,student);
    }

    public Student get(String key){
        return map.get(key);
    }

}
