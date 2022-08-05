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

public class Collection27 {
    public static void main(String args[]){  
   
   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
  
  tree_map1.put("C1", "Violet");
  tree_map1.put("C2", "Lavender");
  tree_map1.put("C3", "Black");
  tree_map1.put("C4", "White"); 
    
 Set<String> keys = tree_map1.keySet();
        for(String key: keys){
            System.out.println(key);
        }
    }
}
