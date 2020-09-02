package basic;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
	 
	 public static void main(String[] args) {
		
		 HashMap<String, Integer> happy = new HashMap<String, Integer>();
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 for(int i = 0;i<n;i++){
			 
			 String name = sc.next();
			 int phone = sc.nextInt();
			 happy.put(name, phone);
			 
		 }
		 
		 
		 while(sc.hasNext()){
	            String s = sc.next();
	            if(happy.get(s) == null)
	                System.out.println("Not found");
	            else {
	                System.out.println(s + "=" + happy.get(s));
	            }
	        }
		 
		 /*for(int i =0;i<happy.size();i++){
			 String name = sc.next();
			if(happy.containsKey(name)){
			 System.out.println(name + " = " + happy.get(name));
			}
			else {
				System.out.println("Not Found");
			}
		 }*/
		
			 
			 
		 
		 
	}
	 
 }