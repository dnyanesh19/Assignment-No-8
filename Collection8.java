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


import java.util.Iterator;
import java.util.LinkedList;


public class Collection8 {
   
	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		
		
		linkedList.add("Perfect");
		linkedList.add("To Be");
		linkedList.add("Trying");
		linkedList.add("Am");
		linkedList.add("I");

		
		Iterator<String> iterator = linkedList.descendingIterator();

		
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
