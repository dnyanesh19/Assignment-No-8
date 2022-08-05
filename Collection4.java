/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_java_assignment;

/**
 *
 * @author SHARDUL
 */



import java.util.ArrayList;
  

public class Collection4 {
  
    
    public static void main(String[] args)
    {
        
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
  
        
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
  
        // Printing elements of list
        System.out.println("List: " + arr);
  
        // Getting element at index 2
        int element = arr.get(2);
  
        
        System.out.println("the element at index 2 is "
                           + element);
    }
}
