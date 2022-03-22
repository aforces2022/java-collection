package com.aforces.corejava.chapter.collection.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {


    public List<Employee> getALLEmployee(){
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee(1,"bidur bhusal","kathmandu",EmployeeConstant.NEPAL,150000,EmployeeConstant.MALE,EmployeeConstant.IT);
        Employee e2 = new Employee(2,"shyam Aryal","butwal",EmployeeConstant.NEPAL,160000,EmployeeConstant.MALE,EmployeeConstant.IT);
        Employee e3 = new Employee(3,"Astha pandey","pohora",EmployeeConstant.NEPAL,170000,EmployeeConstant.FEMALE,EmployeeConstant.IT);
        Employee e4 = new Employee(4,"Dependra bhattarai","Chi",EmployeeConstant.US,180000,EmployeeConstant.MALE,EmployeeConstant.IT);
        Employee e5 = new Employee(5,"Jevan Adhikari","COl",EmployeeConstant.US,190000,EmployeeConstant.MALE,EmployeeConstant.NON_IT);
        Employee e6 = new Employee(6,"Monica","texes",EmployeeConstant.US,200000,EmployeeConstant.FEMALE,EmployeeConstant.IT);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(null);
        return employees;
    }
}
