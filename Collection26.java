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

public class Collection26 {
   public static void main(String args[]){  
  
  
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  
  tree_map1.put("C1", "Violet");
  tree_map1.put("C2", "Lavender");
  tree_map1.put("C3", "Black");
  tree_map1.put("C4", "White"); 
    
  System.out.println(tree_map1);
        if(tree_map1.containsKey("C1")){
            System.out.println("The Tree Map contains key C1");
        } else {
            System.out.println("The Tree Map does not contain key C1");
        }
        if(tree_map1.containsKey("C5")){
            System.out.println("The Tree Map contains key C5");
        } else {
            System.out.println("The TreeMap does not contain key C5");
        }
    } 
    
}
