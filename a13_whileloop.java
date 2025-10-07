public class a13_whileloop {
    public static void main(String[] args)
    {
        int i = 1;
        while(i<=4){
            System.out.println(i);
            i++;
        }

        i = 1;
        while (i<=4){
            System.out.println("hi "+ (i));
            int j = 1;
            while(j<=2){
                System.out.println("hello "+ (j));
                j++;
            }
            i++;
        }
    }
}
