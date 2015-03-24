package common;

import java.util.*;

public class Startup {

    public static void main(String[] args) {
        
        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
        
        Set set = new HashSet();
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        
        for(Object address : set) {
            System.out.println(address);
        }
        

        if (a1.equals(a1)) {
            System.out.println("The addresses are equal");
        } else {
            System.out.println("The addresses are NOT equal");
        }
        

    }
}
