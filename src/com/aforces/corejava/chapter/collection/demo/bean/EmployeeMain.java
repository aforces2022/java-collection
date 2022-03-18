package com.aforces.corejava.chapter.collection.demo.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeMain {

    private final static String COMPANY ="amazon";

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();


        List<Employee> employees =employeeService.getALLEmployee();

        List<Employee> nepalEmpList = new ArrayList<>();


        for (Employee e:employees) {
            if(e != null){
                if(EmployeeConstant.NEPAL.equals(e.getCountry())){
                    nepalEmpList.add(e);
                }
            }

        }
        //System.out.println(nepalEmpList);

        double maxSalary = 0;
        for (Employee e : employees){
            if(e != null){
                if(maxSalary <=e.getSalary()){
                    maxSalary = e.getSalary();
                }
            }
        }

        //System.out.println("max salary is :"+ maxSalary);

        //find all the name

        List<String> names = new ArrayList<>();

        for (Employee e : employees){
            if(e != null){
                String name = e.getName();
                name = name.replace(" ","-");
                names.add(name);
            }
        }
        System.out.println(names);

        //who has y in thier  name


        List<String> YCharnames = new ArrayList<>();

        String s = "y";
        for (Employee e : employees){
            if(e != null){
                String name = e.getName();
                if(name.contains(s)){
                    YCharnames.add(name);
                }

            }
        }
        //System.out.println(YCharnames);

        int count =0;
        double sum =0;

        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if(e != null){
                sum = sum + e.getSalary();
                count++;
            }
        }

        System.out.println("avg salary of all emp is "+(sum/count));



    }


    public List<Video> getAllSongBySearch(String term){ //bollywood song

        List<Video> result = new ArrayList<>();

        List<Video> videos = getALLVideo();

        for(Video v :videos){
            if(v != null){
                if(v.getName()!= null && v.getName().contains(term)){
                    result.add(v);
                }
            }
        }


        return result;
    }

    private static List<Video> getALLVideo(){
        return new ArrayList<>();
    }



}
