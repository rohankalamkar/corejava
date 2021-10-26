package Map.ByHiteshSir;

import java.util.HashMap;
import java.util.Map;







public class Admit_Department {
	public static Map<Integer,Employee> getEmployeeInfo() {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(1, new Employee(101, "Akash Chawhan", "LeadEngineer"));
		map.put(2, new Employee(202,"Nayan Sawai","Engineer"));
		map.put(3, new Employee(210,"Kapil Jawade","DesignEngineer"));
		map.put(4, new Employee(428,"Akhil Kalamkar","CEO"));
		
		return map;
	}

}
