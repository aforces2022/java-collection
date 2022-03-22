package com.aforces.corejava.chapter.collection.demo.bean.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(1,"hello");
        System.out.println(map);
        map.put(1,"hi");
        System.out.println(map);
        map.put(2,"Ram");

        //System.out.println(map.get(1));
        //System.out.println(map.get(2));
        //System.out.println(map.get(3));

        //System.out.println(map.containsKey(1));

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"ram");
        map1.put(2,"shyam");
        map1.put(3,"hari");
        map1.put(4,"krishna");
        map1.put(5,"gopal");
        map1.put(3,"radhe");
        map1.put(6,"bishnu");
        map1.put(8,"shiva");
        map1.put(null,"ram");

        for(Map.Entry<Integer,String> entry:map1.entrySet()){
            System.out.println(entry.getKey() +"   "+entry.getValue());
        }

        Set<Integer> set = map1.keySet();
        System.out.println(set);


        Collection<String> value = map1.values();
        System.out.println(value);

        //Map<Integer,String> map1 = new HashMap<>();
    }
}
