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
/**
 *Write a Java program to remove all of the mappings from a map.  
 * @author SHUBHAM
 */
public class Collection24 {
      public static void main(String args[]) {
  HashMap <Integer,String> hash_map = new HashMap <Integer,String> ();
  hash_map.put(1, "Violet");
  hash_map.put(2, "Lavender");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Green");
  
  System.out.println("The Original linked map: " + hash_map);
  
  hash_map.clear();
  System.out.println("The New map: " + hash_map);
 }
}

