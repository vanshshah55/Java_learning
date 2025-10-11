// Types of error:-
// 1. Complile - time error
// 2. Runtime error -> Exception handling
// 3. Logical error




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
