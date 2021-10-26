package CollectionFrameWork.ByHiteshSir;

public class Test {
	public static Object[] m1() {
		Object [] ar= {10,"ABC",50,"PQR",'C', 100,"XYZ"};
		
		return ar ;
	}
	
	
	public static void main(String[] args) {
		
		Object o=m1();
		System.out.println(o);    // @15db9742
		
		Object o1[]=m1();
		for(int i =0;i<o1.length;i++) {
		if(o1[i] instanceof Integer) {
			int x = (int)o1[i];
			System.out.println(x);
		}
		else if(o1[i] instanceof String) {
			String s = (String)o1[i];
			System.out.println(s);
		}
		else if(o1[i] instanceof Character) {
			char ch=(char)o1[i];
			System.out.println(ch);
		}
		}
	}
}
