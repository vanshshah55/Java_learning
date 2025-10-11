// Types of error:-
// 1. Complile - time error
// 2. Runtime error -> Exception handling
// 3. Logical error


// Error and Exception extends Throwable class.
// Throwable class is extended by Object class.

// Error is divided into :-
// 1. Thread Death
// 2. Virtual Machine error ( Out of memory)
// 3. IO Error

// Exception is divided into:-
// 1. Runtime Exception  (Unchecked Exception)
// 	- Arithmetic 
// 	- ArrayIndexOutOfBound
// 	- Null POinter
// - It is your choose to handle or not

// 2. SQL Exception   (Checked Exception)
// - It is necessary to handle

// 3. IO Exception  (Checked Exception)
// - It is necessary to handle



public class a58_exception {
    public static void main(String[] args) {
        
        int i =0;
        int j = 0;
        try{
            j = 10/i;
        }
        catch(Exception e){
            System.out.println("errorr");
        }
        System.out.println(j);
        System.out.println("done");

    }
}
