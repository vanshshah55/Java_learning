class A extends Object{
    int num = 1;
}

class B extends A{
    int num = 2;
    public int getValue(){
        int num = 3;
        //return this.num;
        //return super.num;
        return num;
    }
}

public class a34_this_vs_super {
    public static void main(String[] a){
        B obj = new B();
        System.out.println(obj.num);
        System.out.println(obj.getValue());
        
        
    }
}
