@FunctionalInterface
interface a{
    void show();
    //void run();
}


// class b implements a{
//     public void show(){
//         System.out.println("in show");
//     }
// }

public class a56_functionalinterface {
    public static void main(String[] args) {
        
        a obj = new a(){
            public void show(){
                System.out.println("in showww");
            }
        };

         //obj=new A();
 //   	A obj=new B();

        obj.show();

    }
}
