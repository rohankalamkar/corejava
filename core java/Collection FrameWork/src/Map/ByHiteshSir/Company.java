package Map.ByHiteshSir;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Company {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Map<Integer, Employee> eInfo = Admit_Department.getEmployeeInfo();
		Set<Integer> keySet = eInfo.keySet();
		
		for(int x:keySet) {
			System.out.println("Key : "+x + " : "+eInfo.get(x));
		}
		
		System.out.println("Enter Your Key : ");
		int k = sc.nextInt();
		
//		for(int i = 0;i<keySet.size();i++) {
//			if(keySet.g.equals(k)) {
//				System.out.println("Key : "+k+" : "+eInfo.get(k));
//			}
//			
//		}
		
	}

}
