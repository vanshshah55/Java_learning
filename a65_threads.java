// Threads:-
// Multiple threads run at same time in a code.
// This is known as Multithreading.

// - A thread is a smallest unit to work with. (individual task)
// - They can run parallely.
// - Multiple threads can share resources.




// MULTIPLE THREADS 

class a extends Thread{
    public void run(){

        for(int i=1;i<=100;i++){
            System.out.println("Vansh");
        }
    }
}

class b extends Thread{

public void run(){

        for(int i=1;i<=100;i++){
            System.out.println("****");
        }
    }}

public class a65_threads {
    public static void main(String[] args){
        a obj1 = new a();
        b obj2 = new b();

        // obj1.show();
        // obj2.show();

        obj1.start();
        obj2.start();
    }
}
