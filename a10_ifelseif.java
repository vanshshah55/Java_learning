public class a10_ifelseif {
    public static void main(String[] args){
        int a = 10;

        if(a>0){
            System.out.println("a is a positive number");
        } else if (a<0) {
            System.out.println("a is a negative number");
        } else {
            System.out.println("a is zero");
        }

        if (a < 10){
            System.out.println(a);
            System.out.println("a is less than 10");
        } else if (a == 10) {
            System.out.println(a);
            System.out.println("a is equal to 10");
        } else {
            System.out.println(a);
            System.out.println("a is greater than 10");
        }
    }
}
