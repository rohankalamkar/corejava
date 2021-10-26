package Map.ByHiteshSir;

import java.util.HashMap;
import java.util.Map;

public class College {
	public static Map<String,Student> getStudInfo() {
		
		Map<String ,Student > s = new HashMap<String, Student>();
		s.put("amit", new Student(101,"Amit Patil"));
		s.put("rahul", new Student(110,"Rahul Thakre"));
		s.put("rohan", new Student(115,"Rohan Kalamkar"));
		s.put("ashish", new Student(120,"Ashish Golhane"));
		s.put("kapil", new Student(125,"Kapil Jawade"));
		return s;
	}

}
