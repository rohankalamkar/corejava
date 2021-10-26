package Abstraction.Interface.Day1.ByHiteshSir;



public class Test2Dimensional implements Rectangle,Circle,Square{
	int[] Recresult;
	double[] CircResult;
	int[] SqrResult;

	@Override
	public  int[] setVariablesOfRectangle(int Length, int breadth) {
		this.Recresult = new int[4];
		this.Recresult[0]=Length;
		this.Recresult[1] = breadth;
		this.Recresult[2] = Length * breadth;
		this.Recresult[3] = 2*(Length+breadth);
		
		return Recresult;
	}
	

	@Override
	public void AreaofRectangle() {
		System.out.println("For Rectangle : ");
		System.out.println("Length : "+Recresult[0]);
		System.out.println("Breadth : "+Recresult[1]);
		System.out.println("Area of Rectangle is : "+Recresult[2]);
		
	}

	@Override
	public void PerimeterOfRectangle() {
		System.out.println("Perimeter Of Rectangle is : "+Recresult[3]);
		
		
	}
	public static void main(String[] args) {
		Test2Dimensional t = new Test2Dimensional();
		t.setVariablesOfRectangle(10, 20);
		t.AreaofRectangle();
		t.PerimeterOfRectangle();
		System.out.println("--------------------------------------------------------------------------");
		t.setVariableOfCircle(12);
		t.AreaOfCircle();
		t.PerimeterOfCircle();
		System.out.println("--------------------------------------------------------------------------");
		t.setVariableOfSquare(8);
		t.AreaSquare();
		t.PerimeterOfSquare();
		System.out.println("--------------------------------------------------------------------------");
		
		
	}





	@Override
	public void AreaOfCircle() {
		System.out.println("For Circle : ");
		System.out.println("Radius : "+CircResult[0]);
		System.out.println("Area of Circle is : "+CircResult[1]);
		
	}


	@Override
	public void PerimeterOfCircle() {
		System.out.println("Perimeter of Circle is : "+CircResult[2]);
		
	}


	@Override
	public double[] setVariableOfCircle(double radius) {
		this.CircResult = new double[3];
		this.CircResult[0] = radius;
		this.CircResult[1] = (Math.PI*radius*radius);
		this.CircResult[2] = (Math.PI*2*radius);
		return CircResult;
	}


	@Override
	public int[] setVariableOfSquare(int side) {
		this.SqrResult = new int[3];
		this.SqrResult[0]= side;
		this.SqrResult[1]= side*side;
		SqrResult[2] = side*4;
		return SqrResult;
	}


	@Override
	public void AreaSquare() {
		System.out.println("For Square : ");
		System.out.println("Side : "+SqrResult[0]);
		System.out.println("Area of Square is : "+SqrResult[1]);
		
	}


	@Override
	public void PerimeterOfSquare() {
		System.out.println("Perimeter of Square is : "+SqrResult[2]);
		
	}
   
}
