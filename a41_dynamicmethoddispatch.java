class A{
    public void show(){
        System.out.println("In 'A' show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In 'B' show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In 'C' show");
    }
}


class D
{
	
}


public class a41_dynamicmethoddispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        //obj=new D(); // will not work

    }
}
