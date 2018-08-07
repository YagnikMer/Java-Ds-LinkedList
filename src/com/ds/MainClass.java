package com.ds;

 
public class MainClass {
	
	public static void main(String[] args)
	{
		LinkedList  list = new LinkedList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.printNodes();
		System.out.println("Total Element : " +list.size());
		list.remove();
		list.printNodes();
		System.out.println("Total Element : " +list.size());
 	}
}