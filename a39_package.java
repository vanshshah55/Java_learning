import a39_pack.a39_advcalc;
import a39_pack.a39_calc;

public class a39_package {
    public static void main(String[] args) {
        a39_calc obj1 = new a39_calc();
        a39_advcalc obj2 = new a39_advcalc();

        int r1 = obj1.add(2,3);
        int r2 = obj2.sub(5,2);
        int r3 = obj2.multi(2,8);
        // int r4 = obj1.div(2,2);

        System.out.println(r1 + " - " + r2 + " - " + r3);
    }
}
