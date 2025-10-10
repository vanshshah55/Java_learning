
// class A
// {
// 	public void show()
// 	{
// 		System.out.println("in A show");
// 	}
// 	public void config()
// 	{
// 		System.out.println("in A config");
// 	}
// }
// class B extends A
// {
// 	public void show()
// 	{
// 		System.out.println("in B show");
// 	}
// }



class Calc 
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}

class AdvCalc extends Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2+1;
	}
}


public class a38_methodoverriding {
    public static void main(String[] args) {


    //     B obj=new B();
    //     A obj1 = new A();
    //     obj1.show();
	// 	obj.show();
	// 	obj.config();
    

    AdvCalc obj2 = new AdvCalc();
    int r1 = obj2.add(2,3);
    System.out.println(r1); // GIVES RESULT + 1

    Calc obj4 = new Calc();
    int r2 = obj4.add(2,3);
    System.out.println(r2);



    }
}
