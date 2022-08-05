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


import java.util.TreeSet;

public class Collection14 {
  public static void main(String[] args) {
  TreeSet<String> tree_set = new TreeSet<String>();
  tree_set.add("Violet");
  tree_set.add("Lavender");
  tree_set.add("Yellow");
  tree_set.add("White");
  tree_set.add("Black");
  
  for (String element : tree_set) {
    System.out.println(element);
    }
 }
}
