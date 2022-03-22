package com.aforces.corejava.chapter.collection.demo.bean.set;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Integer[] arr = {10,20,30,40,10,50,30,70,90};

        List<Integer> l = Arrays.asList(arr);

        List<Integer> l1 = new ArrayList<>();

        for(Integer i:l){
            if(!l1.contains(i)){
                l1.add(i);
            }
        }
        System.out.println(l);
        System.out.println(l1);

        Set<Integer> s = new HashSet<>(l);
       /* for(Integer i:l){
            s.add(i);
        }
*/
        //System.out.println(s);

        Student s1 =  new Student(1,"john");
        Student s2 =  new Student(1,"john");

        System.out.println("hashcode of s1  "+s1.hashCode());
        System.out.println("hashcode of s2  "+s2.hashCode());


        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);

        System.out.println(students);

       /* String s1 = new String("hello");
        String s2 = new String("hello");
        Set<String> strings = new HashSet<>();
        strings.add(s1);
        strings.add(s2);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(strings);*/

        String string1 = new String("hello");
        String string2 = new String("hello");

       /* System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());*/













    }
}
