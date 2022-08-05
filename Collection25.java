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

public class Collection25 {
     public static void main(String args[]){  
  
  // Create a tree map
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  // Put elements to the map 
  tree_map1.put("C1", "Violet");
  tree_map1.put("C2", "Lavender");
  tree_map1.put("C3", "Black");
  tree_map1.put("C4", "White");
  tree_map1.put("C5", "Green");
   System.out.println("Tree Map 1: "+tree_map1);
   TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
   tree_map2.put("A1", "Yellow");
   tree_map2.put("A2", "Blue");
   System.out.println("Tree Map 2: "+tree_map2);
   tree_map1.putAll(tree_map2);
   System.out.println("After coping map2 to map1: "+tree_map1);   
 }  
}
