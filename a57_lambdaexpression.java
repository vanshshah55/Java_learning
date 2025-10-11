@FunctionalInterface
interface a{
    //void show();
    void show(int i);
}

public class a57_lambdaexpression {
    public static void main(String[] args) {
        // a obj=() -> System.out.println("in show");
        // obj.show();

        // a obj = new a(){
        //     public void show(int i){
        //         System.out.println("in show " + i);
        //     }
        // };

        // obj.show(5);


        // a obj = (int i) -> System.out.println("in show "+ i);
        // obj.show(2);

        a obj = i -> System.out.println("in show " + i);
        obj.show(3);
    }
}
