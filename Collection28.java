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

public class Collection28 {
    public static void main(String args[]) {

  
  TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

  
  tree_map1.put("C2", "Violet");
  tree_map1.put("C1", "Lavender");
  tree_map1.put("C4", "Black");
  tree_map1.put("C3", "White");

  System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("first(lowest): " + tree_map1.firstKey());
  System.out.println("last(highest): " + tree_map1.lastKey());
 } 
}
