package com.aforces.corejava.chapter.collection.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student s1 = new Student(1,"abc","abc");
        Student s2 = new Student(2,"abc2","abc");
        Student s3 = new Student(3,"abc3","abc");
        Student s4 = new Student(4,"abc4","abc");
        Student s5 = new Student(5,"abc5","abc");
        Student s6 = new Student(6,"abc6","abc");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.toString());

        }

        for(Student s :students){
            System.out.println(s);
        }





/*        System.out.println(list);

        for(Object o:list){
            System.out.println(o);
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        List list1 = new ArrayList();
        list.add("hello");
        list.add("good");
        list.add("morning");
        list.add(10);

        List<String> list2 = new ArrayList<String>();
        list2.add("hello");*/



        //remove
        System.out.println("hello");
        System.out.println("world");
        System.out.println("Edited file");
        int a = 30;
        int b = 20;
        int c = a + b;
        System.out.println(c);


    }

    private static List getlist() {
        List list = new ArrayList();

        list.add(10);
        list.add("hello");
        list.add(10l);
        list.add(true);
        list.add(105);
        list.add('c');
        list.add(null);
        list.add(10);

        list.remove(10l);
        list.remove( 2);

        return list;

    }
}
