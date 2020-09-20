package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester5 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> aa = new ArrayList<>();
		
		for(int i=0;i<n;i++){
		
			int num = scan.nextInt();
			aa.add(num);
		}
		System.out.println(aa);
		
		int m = scan.nextInt();
		for(int i=0;i<m;i++){
			
			String action = scan.next();
			
			if(action.equals("insert")){
				int index=scan.nextInt();
				int value=scan.nextInt();
				aa.set(index, value);
				
			}
			else {
				int index = scan.nextInt();
				aa.remove(index);
			}
			
		}
		scan.close();
		
		for(Integer nn: aa){
			System.out.print(nn + " ");
		}
	}
}