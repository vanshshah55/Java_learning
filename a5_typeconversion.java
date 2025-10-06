public class a5_typeconversion{
    public static void main(String[] args){
        byte b = 127;
        int i = b; // Implicit conversion from byte to int  
        System.out.println(b);
        System.out.println(i);

        byte b1=125;
		int a0=b1; // Implicit conversion from byte to int
        //b1=a0; // Error: incompatible types: possible lossy conversion from int to byte
		System.out.println(b1);
		System.out.println(a0);

        int aa = 1000;
        byte bb = (byte) aa; // Explicit conversion from int to byte
        System.out.println(aa);
        System.out.println(bb);

        float f = 10.5f;
        int ii = (int) f; // Explicit conversion from float to int
        System.out.println(f);
        System.out.println(ii);

        byte a3=10;
		byte b4=20;
		int t= a3 * b4; // Implicit conversion from byte to int during multiplication
		System.out.println(t);
    }
}