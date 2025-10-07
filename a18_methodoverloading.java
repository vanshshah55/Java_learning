class calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public double add(double n1,int n2){
        return n1+n2;
    }
}

public class a18_methodoverloading {
    public static void main(String[] args){
        calculator obj = new calculator();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));
        System.out.println(obj.add(1.34343,2));
    }
}
