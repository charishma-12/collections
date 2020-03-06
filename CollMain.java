package com.epam.collection;
import java.io.*;
import java.lang.*;
import java.util.*;
public class CollMain {
	/*static int search(List<Integer> a,int key) {
		for(int i=0;i<a.size();i++) {
			if(key==a.get(i)) {
				return i;
			}
		}
		return -1;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			l.add(i);
		}
		System.out.println("Select the operation you want to perform on list elements :");
		System.out.println("1.add element\n2.remove element\n3.fetch element");
		int option=in.nextInt();
		if(option==1) {
			System.out.println("Enter the element to be added to the list");
			int element=in.nextInt();
			l.add(element);
			System.out.println("ELement "+element+" inserted into the list");
		}
		else if(option==2) {
			System.out.println("Enter the element to be removed from the list");
			int element=in.nextInt();
			if(!l.isEmpty()) {
				if(l.contains(element)) {
					l.remove(new Integer(element));
					System.out.println("ELement "+element+" removed from the list");
				}
				else {
					System.out.println("Element is not found in the list");
				}
			}
			else {
				System.out.println("List is empty");
			}
		}
		else {
			System.out.println("Enter the element to be searched");
			int element=in.nextInt();
			boolean ans=l.contains(element);
			System.out.println(ans==true?"element found":"ELement not found");
		}
	}
}
