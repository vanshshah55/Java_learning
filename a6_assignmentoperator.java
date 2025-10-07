public class a6_assignmentoperator {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        int result = num1 + num2; // Using the addition operator
        System.out.println("Result of addition: " + result);
        
        int result2 = num2 - num1; // Using the subtraction operator
        System.out.println("Result of subtraction: " + result2);

        int result3 = num1 * num2; // Using the multiplication operator
        System.out.println("Result of multiplication: " + result3);

        int result4 = num2 / num1; // Using the division operator
        System.out.println("Result of division: " + result4);

        int result5 = num2 % num1; // Using the modulus operator
        System.out.println("Result of modulus: " + result5);

        int num = 7;
        num = num+2; // Using the assignment operator with addition
        System.out.println("Result of assignment: " + num);

        int num3 = 15;
        num3 += 2; // Using the compound assignment operator
        System.out.println("Result of compound assignment: " + num3);


        int num4 = 20;
        num4 -= 5; // Using the compound assignment operator
        System.out.println("Result after compound assignment: " + num4);
        num4 *= 2; // Using the compound assignment operator
        System.out.println("Result after multiple compound assignments: " + num4);

        int num5 = 30;
        num5++; // Using the post increment operator
        System.out.println("Result after increment: " + num5);
        num5--; // Using the post decrement operator
        System.out.println("Result after decrement: " + num5);

        ++num5; // Pre-increment
        System.out.println("Result after pre-increment: " + num5);
        --num5; // Pre-decrement
        System.out.println("Result after pre-decrement: " + num5);

        int result6 = ++num5; // first increment, then assign
        System.out.println("Result after pre-increment and assignment: " + result6);
        int result7 = num5++; // first assign, then increment
        System.out.println("Result after post-increment and assignment: " + result7);
        System.out.println("Current value of num5: " + num5);

    }
}
