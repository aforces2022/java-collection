package com.aforces.corejava.chapter.collection.demo.bean.Map;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String name = "aditya pradhan";

        char[] chars = name.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();

        for (char c: chars) {

            if(charMap.containsKey(c)){
                int newValue = charMap.get(c)+1;
                charMap.put(c,newValue);
            }else{
                charMap.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> e:charMap.entrySet()){
            System.out.println( e.getKey() +"   ----   "+e.getValue());
        }


    }
}
