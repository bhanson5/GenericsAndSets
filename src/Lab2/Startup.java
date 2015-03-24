/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;


import java.util.*;
import common.Employee;
/**
 *
 * @author bhanson5
 */
public class Startup {
    
    public static void main(String[] args) {
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Smith", "Jones", "555-555-5551"));
        employeeList.add(new Employee("Smith", "Sally", "555-555-5552"));
        employeeList.add(new Employee("Smith", "Jack", "555-555-5553"));
        
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
