public class a8_logicaloperator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        boolean result1 = (a < b) && (c < d); // Logical AND operator
        System.out.println("Result of logical AND: " + result1);

        boolean result2 = (c<d) || (a>b); // Logical OR operator
        System.out.println("Result of logical OR: " + result2);

        boolean result3 = !(a<b); // Logical NOT operator
        System.out.println("Result of logical NOT: " + result3);

        boolean result4 = (a > b) && (c < d); // Logical AND operator with one false condition
        System.out.println("Result of logical AND with one false condition: " + result4);

        boolean result5 = (a > b) || (c < d); // Logical OR operator with one true condition
        System.out.println("Result of logical OR with one true condition: " + result5);

        boolean result6 = !(a > b); // Logical NOT operator with false condition
        System.out.println("Result of logical NOT with false condition: " + result6);

        boolean result7 = (a < b) && (c > d); // Logical AND operator with both false conditions
        System.out.println("Result of logical AND with both false conditions: " + result7);

        boolean result8 = (a > b) || (c > d); // Logical OR operator with both false conditions
        System.out.println("Result of logical OR with both false conditions: " + result8);

        boolean result9 = (a<b) || (c<d) && (a>d); // Mixed logical operators 
        System.out.println("Result of mixed logical operators: " + result9);

    }
}
