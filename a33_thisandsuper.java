

//this() 
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		//super();
        this();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super(5);//call default constructor of super class
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class

        //super();
		System.out.println("in B int");
	}
}

public class a33_thisandsuper {
	public static void main(String[] args) 
	{
		
		B obj1=new B();
        System.out.println("************");
		B obj=new B(5);//prints all for above code/
        System.out.println("************");
        A obj3 = new A(3);
	}
}