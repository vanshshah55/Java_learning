class A{
    int age;
    public void show(){
        System.out.println("In show");
    }


// class B{
//     public void config(){
//         System.out.println("In config");
//     }
static class B{
    public void config(){
        System.out.println("In config");
    }
}
}
public class a46_innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // B obj2 = new B(); //wont work
        // obj2.config();


        // A.B obj1 = obj.new B();
        // obj1.config();


        A.B obj3 = new A.B();
        obj3.config();
    }
}
