package Abstraction.Interface.Day2.ByHiteshSir;

public class TestRect implements Rectangle {
	int l;
	int b;
	@Override
	public void setVariableOfRectangle(int Length, int Breadth) {
		this.l=Length;
		this.b=Breadth;
		
	}

	@Override
	public void AreaOfRectangle() {
		System.out.println("Length : "+l);
		System.out.println("Breadth : "+b);
		int area = l*b;
		System.out.println("Area of Rectangle is : "+area);
	}

	@Override
	public void PerimeterOfRectangle() {
		int perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle is : "+perimeter);
		
		
	}
	public static void main(String[] args) {
		TestRect t = new TestRect();
		t.setVariableOfRectangle(10, 20);
		t.AreaOfRectangle();
		t.PerimeterOfRectangle();
		
		
	}
	

}
