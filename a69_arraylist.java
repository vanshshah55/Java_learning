import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class a69_arraylist {
    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // Collection nums = new ArrayList<>();
        List <Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(5);

        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(2));

        // for (int n : nums){
        //     System.out.println(nums);
        // }

        for (Object n : nums){
            int num = (Integer)n;
            System.out.println(num);
            System.out.println(num+2);
        }
    }
}
