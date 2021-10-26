package Abstraction.Interface.Day1.ByHiteshSir;

public class TestRectangle implements Rectanglenew {
	public int l;
	public int b;
	

	@Override
	public void setVariableofRectangle(int length, int Breadth) {
		this.l=length;
		this.b = Breadth;
		
	}

	@Override
	public void AreaOfRectangle() {
		int area = l*b;
		System.out.println(area);
		
	}
	public static void main(String[] args) {
		
		TestRectangle t = new TestRectangle();
		t.setVariableofRectangle(20, 30);
		t.AreaOfRectangle();
		
	}



}
