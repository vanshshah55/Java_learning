public class a7_relationaloperator {
    public static void main(String[] args){
        int x = 10;
        int y = 20;

        boolean result1 = (x == y); // Equal to operator
        System.out.println("x == y: " + result1);
        boolean result2 = (x != y); // Not equal to operator
        System.out.println("x != y: " + result2);
        boolean result3 = (x > y); // Greater than operator
        System.out.println("x > y: " + result3);
        boolean result4 = (x < y); // Less than operator
        System.out.println("x < y: " + result4);
        boolean result5 = (x >= y); // Greater than or equal to operator
        System.out.println("x >= y: " + result5);
        boolean result6 = (x <= y); // Less than or equal to operator
        System.out.println("x <= y: " + result6);

        double a = 15.5;
        double b = 10.5;

        boolean res = a>=b; // Greater than or equal to operator
        System.out.println("a >= b: " + res);
        boolean res2 = a<=b; // Less than or equal to operator
        System.out.println("a <= b: " + res2);
    }
}