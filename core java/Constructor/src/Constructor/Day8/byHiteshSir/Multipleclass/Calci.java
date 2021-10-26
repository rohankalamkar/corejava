package Constructor.Day8.byHiteshSir.Multipleclass;

public class Calci {
	float x;
	float y;
	int add;
	int sub ;
	int mul;
	float div;
	public Calci(float x, float y ){
	this.x=x;
	this.y=y;
	this.add = (int)(x+y);
	this.sub = (int)(x-y);
	this.mul = (int)(x*y);
	this.div = (x/y);
	}
	public void work(){
	System.out.println("Addition  :  "+add);
	System.out.println("Substraction  :  "+sub);
	System.out.println("Multiplication  :  "+mul);
	System.out.println("Division  :  "+div);

	}
	}

	class putvalue{
	public static void main(String args[]){
	Calci rk = new Calci(22,3);
	rk.work();

	Calci sk = new Calci(10,2);
	System.out.println("Addition  :  "+sk.add);
	System.out.println("Substraction  :  "+sk.sub);
	System.out.println("Multiplication  :  "+sk.mul);
	System.out.println("Division  :  "+sk.div);

	}

}
