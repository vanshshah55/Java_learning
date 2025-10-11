class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show1(){
        System.out.println("in B show");
    }
}

public class a44_upcastinganddowncasting {
    public static void main(String[] args) {
        

        double d = 1.34;
        int i = (int) d;
        System.out.println(i);


        //A obj = new A();
        // A obj = (A) new B(); //UPCASTING
        // obj.show();

        A obj = new B();
        obj.show();

        B obj1 = (B) obj;
        obj1.show1();



    }
}
