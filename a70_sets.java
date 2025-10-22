import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class a70_sets {

    public static void main(String[] args) {
        // Set <Integer> nums = new HashSet<Integer>();
        // Set <Integer> nums = new TreeSet<Integer>();

        Collection <Integer> nums = new TreeSet<Integer>();
        nums.add(22);
        nums.add(11);
        nums.add(33);
        nums.add(55);

        Iterator <Integer> values = nums.iterator();
        //SORTED
        while (values.hasNext()) {
            System.out.println(values.next());            
        }

        for (int n: nums){
            System.out.println(n);
        }
    }
}