class A{
    public void show(){
        System.out.println("in  A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B show");
    }
}

public class a47_anonymousinnerclass {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        A obj1 = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj1.show();
        
    }
}