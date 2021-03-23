package linkedlist;

import java.util.LinkedList;

public class linkedlist {

	public static void main (String[]args ) {
		
		LinkedList<String> animalList = new LinkedList <String>();
		animalList.add("frog");
		animalList.add("cat");
		animalList.add("cow");
		animalList.add("deer");
		System.out.println(animalList);
		
		animalList.addFirst("shark");
		System.out.println(animalList);
		animalList.addLast("bear");
		System.out.println(animalList);
		animalList.add(3, "fish");
		
		animalList.remove(3);
		System.out.println(animalList);
		System.out.println(animalList.contains("shark"));
		System.out.println(animalList.size());
		System.out.println(animalList.get(3));
		
		
		
		
		
		}
}
