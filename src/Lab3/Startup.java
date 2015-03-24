/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

import java.util.*;
import common.Dog;
import common.Employee;
/**
 *
 * @author bhanson5
 */

public class Startup {
    
    
    public static void main(String[] args) {
        
        List employeeList = new ArrayList();
        List dogList = new ArrayList();
        
        employeeList.add(new Employee("Smith", "Jones", "555-555-5551"));
        employeeList.add(new Employee("Smith", "Sally", "555-555-5552"));
        employeeList.add(new Employee("Smith", "Jack", "555-555-5553"));
        
        dogList.add(new Dog());
        dogList.add(new Dog());
        
        for (Object e : employeeList) {
            System.out.println("");
        }
    }
    
}
