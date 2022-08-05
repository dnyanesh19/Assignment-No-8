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


 import java.util.*;

public class Collection11 {
  public static void main(String[] args) {
       
     HashSet<String> h_set = new HashSet<String>();
 
          h_set.add("Violet");
          h_set.add("Lavender");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Green");
          h_set.add("Yellow");
    System.out.println("Original Hash Set: " + h_set);
    
    h_set.removeAll(h_set);
    System.out.println("Hash Set after removing all the elements "+h_set);   
   }
}
