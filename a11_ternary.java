public class a11_ternary {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);

        // Using ternary operator to check if a number is even or odd
        int num = 15;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is an " + result);

        // Nested ternary operator to find the largest of three numbers
        int x = 30, y = 20, z = 10;
        int largest = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("Largest of " + x + ", " + y + ", and " + z + " is: " + largest);
    }
}
