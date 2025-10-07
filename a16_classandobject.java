class calculator{
    
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
}

public class a16_classandobject {
    public static void main(String[] args){
        calculator obj = new calculator();
        int result = obj.add(1, 2);
        System.out.println(result);
    }
}
