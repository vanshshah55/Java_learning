public class a4_literals{
    public static void main(String[] args){
        int num1=0b1010; // Binary literal (base 2)
        int num2 = 0xA; // Hexadecimal literal (base 16)
        int num3 = 012; // Octal literal (base 8)
        int num4 = 0x7e; // Hexadecimal literal (base 16)
        float num5 = 1.5e3f; // Scientific notation (1.5 * 10^3)
        double num6 = 2.5e2d; // Scientific notation (2.5 * 10^2)
        float num7 = 56;
        double num8 = 56;
        double num9 = 12e10; // Scientific notation (12 * 10^10)
        //boolean num10 = 7; // Invalid: boolean can only be true or false
        //char num11 = 'AB'; // Invalid: char can only hold a single character
        char num12 = 'A'; // Valid: char holds a single character
        
        System.out.println(num1); // Output: 10 
        System.out.println(num2); // Output: 10
        System.out.println(num3); // Output: 10
        System.out.println(num4); // Output: 126
        System.out.println(num5); // Output: 1500.0
        System.out.println(num6); // Output: 250.0
        System.out.println(num7); // Output: 56.0
        System.out.println(num8); // Output: 56.0
        System.out.println(num9); // Output: 1.2E11
        //System.out.println(num10); // Error: incompatible types: int cannot be converted to boolean
        //System.out.println(num11); // Error: unclosed character literal
        System.out.println(num12); // Output: A
        num12++; // Valid: increments char to next Unicode character
        System.out.println(num12); // Output: B



    }
}
