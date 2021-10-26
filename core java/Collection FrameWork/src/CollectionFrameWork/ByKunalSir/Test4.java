package CollectionFrameWork.ByKunalSir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		// List Contains Class Data, How to retrive Class type data 
		
		Student4 s1 = new Student4();  
		s1.setRollno(1);
		s1.setName("xyz");
		System.out.println(s1);  // @15db9742
		
		Student4 s2 = new Student4();
		s2.setRollno(2);
		s2.setName("aaa");
		System.out.println(s2);  // @6d06d69c
		
		Student4 s3 = new Student4();
		s3.setRollno(3);
		s3.setName("ccc");
		System.out.println(s3);  // @7852e922
		
		
		List istu = new ArrayList();
		istu.add(s1);
		istu.add(s2);
		istu.add(s3);
		
		System.out.println(istu);  //[@15db9742, @6d06d69c, @7852e922]
		
		Iterator itr=istu.iterator();
		while(itr.hasNext()) {
			Student4 stu=(Student4)itr.next();
			
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			
		}
		
		
		
		
		
		
		
		
	}

}
