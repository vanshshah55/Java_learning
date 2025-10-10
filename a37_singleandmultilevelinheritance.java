
class calc{
    public int add(int n1,int n2){
        return n1 + n2;
    }
}

class advcalc extends calc{
    public int mult(int n1,int n2){
        return n1*n2;
    }
}

class veryadvcalc extends advcalc{
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    }
}

public class a37_singleandmultilevelinheritance {

    public static void main(String[] args) {
        //advcalc obj1 = new advcalc();
        // int r1 = obj1.add(9,2);
        // int r2 = obj1.mult(9,4);
        // System.out.println(r1 + " and " + r2);

        //calc obj2 = new calc();
        //int r3 = obj2.mult(7,2); //   WONT WORK
        // int r3 = obj2.add(2,3);
        // System.out.println(r3);

        veryadvcalc obj4 = new veryadvcalc();
        double r4 = obj4.power(2,3);
        System.out.println(r4);
        int r5=obj4.add(4, 5);
		
		int r6=obj4.mult(5,3);
		

        System.out.println(r5 + " and " + r6);
    }
}



